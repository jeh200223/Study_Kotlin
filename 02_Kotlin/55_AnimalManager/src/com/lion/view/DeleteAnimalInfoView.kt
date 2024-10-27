package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.repository.AnimalReporitory
import com.lion.util.ProgramState
import com.lion.util.ToolClass
import java.util.Scanner

class DeleteAnimalInfoView(val controllerClass: ControllerClass) : ViewClass() {
    override fun show() {
        // 동물 정보가 저장되어 있는지 확인한다.
        val chk1 = ToolClass.checkInfoExist()

        // 동물 정보가 없다면
        if (chk1 == false){
            println()
            println("등록된 동물 정보가 없습니다.")
        }
        // 동물 정보가 있다면
        else {
            // 삭제할 동물의 이름을 입력받는다.
            val inputName = inputDeleteAnimalName()
            // 삭제할 동물이 있는지 확인한다
            val chk2 = checkInputAnimalExist(inputName)
            // 동물이 없다면
            if (chk2 == false){
                println()
                println("입력하신 동물의 정보가 없습니다.")
            }
            // 동물이 있다면
            else {
                // 삭제한다.
                deleteAnimalInfo(inputName)
            }
        }
        // 메인 메뉴 상태로 변경한다.
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }

    // 삭제할 동물의 이름을 입력받는 기능
    fun inputDeleteAnimalName():String{
        println()
        print("삭제할 동물의 이름을 입력해주세요 : ")
        val scanner = Scanner(System.`in`)
        val inputName = scanner.next()
        return inputName
    }

    // 입력한 동물이 있는지 검사하는 기능
    fun checkInputAnimalExist(inputName:String):Boolean{
        // 반환할 값
        var chk1 = false
        // 모든 동물의 정보를 가져온다.
        val animalList = AnimalReporitory.getAnimalInfo()
        // 동물의 수 만큼 반복한다.
        animalList.forEach {
            // 입력한 동물의 이름과 현재 동물의 이름이 같은지.
            if (inputName == it.AnimalName) {
                // 반환할 값에 true를 넣어주고 forEach를 중단한다.
                chk1 = true
                return@forEach
            }
        }
        // 반환한다.
        return chk1
    }

    // 동물 정보를 삭제하는 기능
    fun deleteAnimalInfo(inputName:String){
        // 동물데이터를 삭제한다.
        AnimalReporitory.deleteAnimalInfo(inputName)
        println()
        println("${inputName}동물의 정보를 삭제하였습니다.")
    }
}