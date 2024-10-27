package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.repository.AnimalReporitory
import com.lion.util.ProgramState
import java.util.Scanner

class InputAnimalKindView(
    val controllerClass: ControllerClass,
) : ViewClass() {
    override fun show() {

        // 동물 종류 입력 화면 출력
        inputKindShow()
        // 동물 종류를 입력받는다.
        val inputKind = InputAnimalKind()
        // 동물 종류를 저장한다.
        saveAnimalKind(inputKind)
        // 메인 메뉴 상태로 변경한다.
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }

    // 동물 종류를 입력하기 위한 화면을 출력
    private fun inputKindShow(){
        println()
        println("동물의 종류를 등록해주세요")
        print("동물의 종류 : ")
    }

    // 동물 종류를 입력받는 기능
    private fun InputAnimalKind(): String {
        val scanner = Scanner(System.`in`)
        return scanner.next()
    }

    // 동물 종류를 저장하는 기능
    private fun saveAnimalKind(animalKind: String) {
        // kindMap의 정보를 가져온다.
        val kindMap = AnimalReporitory.getAnimalKind()

        // kindMap의 정보값과 animalKind의 값이 같은지 확인한다.
        if (kindMap.containsValue(animalKind)) {
            // 값이 같다면 출력을 해준다.
            println("이미 등록된 동물 종류입니다: $animalKind")
            return
        }

        // 현재 키 중 최대 값에 1을 더함으로 다음 키를 결정한다.
        val nextKey = (1..(kindMap.keys.maxOrNull() ?: 0) + 1)
            .firstOrNull { it !in kindMap.keys } ?: (kindMap.size + 1)

        // 새로운 동물 종류를 kindMap에 추가한다.
        kindMap[nextKey] = animalKind

        // 변경된 kindMap 저장
        AnimalReporitory.saveAnimalKind(kindMap)

        println("동물 종류가 성공적으로 등록되었습니다: $animalKind")
    }
}
