package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.model.AnimalModel
import com.lion.repository.AnimalReporitory
import com.lion.util.ProgramState
import com.lion.util.ToolClass
import java.util.Scanner

class InputAnimalInfoView(val controllerClass: ControllerClass) : ViewClass() {
    // 동물 종류 정보를 가져온다.
    val kindmap = AnimalReporitory.getAnimalKind()
    val scanner = Scanner(System.`in`)
    override fun show() {
        // 동물 종류가 저장되어 있는지 확인한다.
        var chk1 = ToolClass.checkKindExist()
        // 동물 종류가 없다면
        if (chk1 == false){
            println()
            println("등록된 동물의 종류가 없습니다.")
        }
        // 동물 종류가 있다면
        else{
            // 동물 종류를 출력한다.
            showAnimalKind()
            // 동물 종류를 입력받는다.
            val animalKind = inputAnimalType(scanner)
            // 동물 정보를 입력받는다.
            inputAnimalInfo(animalKind)
        }
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }

    // 동물 종류를 출력하는 기능
    private fun showAnimalKind(){
        println()
        println("동물 종류를 선택해주세요.")
        // 동물 종류만큼 반복한다.
        kindmap.forEach { (index, kind) ->
            println("${index} : ${kind}")
        }
        print("동물 종류 : ")
    }

    // 동물 종류를 입력받는 기능
    private fun inputAnimalType(scanner: Scanner):Int{
        val inputType:Int = scanner.nextInt()
        return inputType
    }

    // 동물 정보를 입력받는 기능
    private fun inputAnimalInfo(inputType: Int) {
        // 동물 종류의 키값과 입력받은 값이 일치한다면
        if (kindmap.containsKey(inputType)) {
            // kindmap의 키값에 있는 정보를 가져온다.
            val selectedKind = kindmap[inputType]
            println()
            println("${selectedKind}에 대한 정보를 입력해주세요.")

            // 동물 정보를 입력받는다.
            val animalModel = AnimalModel(inputType)
            animalModel.inputAnimalInfo(scanner)

            // 동물 정보를 파일에 저장한다.
            AnimalReporitory.addAnimalInfo(animalModel)
        }
        // 일치하지 않다면
        else {
            println("잘못된 동물 종류 번호입니다. 다시 선택해주세요.")
        }
    }
}