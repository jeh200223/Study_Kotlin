package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.model.AnimalModel
import com.lion.repository.AnimalReporitory
import com.lion.util.ProgramState
import com.lion.util.ToolClass
import java.util.Scanner

class SearchAnimalByNameView(val controllerClass: ControllerClass) : ViewClass() {
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
            // 동물 이름을 검색한다.
            val inputName = inputSearchAnimalName()
            // 입력한 동물이 있는지 검사한다.
            val chk2 = checkSearchAnimalExist(inputName)
            // 입력한 동물이 없다면
            if(chk2 == false) {
                println()
                println("등록된 동물의 정보가 없습니다.")
            }
            // 입력한 동물이 있다면
            else {
                // 검색한 동물의 정보를 가져온다.
                val searchAnimalList = getSearchAnimalInfo(inputName)
                // 가져온 동물의 수 만큼 반복한다.
                searchAnimalList.forEach {
                    it.showAnimalInfo()
                }
            }
        }
        // 프로그램 상태를 메인 메뉴로 변경한다.
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }

    // 동물 이름을 입력받는 기능
    fun inputSearchAnimalName():String{
        println()
        print("검색할 동물의 이름을 입력해주세요 : ")
        val scanner = Scanner(System.`in`)
        val inputName = scanner.next()
        return inputName
    }

    // 입력한 동물 정보가 있는지 확인하는 기능
    fun checkSearchAnimalExist(inputName:String):Boolean{
        // 동물이 있는지 여부 값
        var isExistAnimalName = false
        // 동물 데이터를 가져온다.
        val animalList = AnimalReporitory.getAnimalInfo()
        // 동물의 수 만큼 반복한다.
        animalList.forEach {
            // 검색한 동물의 이름과 현재 동물 객체의 이름이 같은지 확인한다.
            if(inputName == it.AnimalName){
                // 변수에 true를 담아준다.
                isExistAnimalName = true
                return@forEach
            }
        }
        return isExistAnimalName
    }

    // 입력한 동물 정보를 가져오는 기능
    fun getSearchAnimalInfo(inputName:String):MutableList<AnimalModel>{
        // 검색된 동물 정보를 담을 리스트
        val searchAnimalList = mutableListOf<AnimalModel>()
        // 동물 전체데이터를 가져온다.
        val animalList = AnimalReporitory.getAnimalInfo()

        // 동물의 수 만큼 반복한다.
        animalList.forEach {
            // 입력한 동물의 이름과 현재 동물의 이름이 같다면..
            if (inputName == it.AnimalName){
                // 담아준다.
                searchAnimalList.add(it)
            }
        }
        // 반환한다.
        return  searchAnimalList
    }
}