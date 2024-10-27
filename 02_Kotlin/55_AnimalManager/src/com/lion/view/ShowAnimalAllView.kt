package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.repository.AnimalReporitory
import com.lion.util.ProgramState
import com.lion.util.ToolClass

class ShowAnimalAllView(val controllerClass: ControllerClass) : ViewClass() {
    override fun show() {
        // 동물 종류가 저장되어 있는지 확인한다.
        val chk1 = ToolClass.checkKindExist()
        // 동물 정보가 저장되어 있는지 확인한다.
        val chk2 = ToolClass.checkInfoExist()

        // 동물 종류가 없다면
        if (chk1 == false) {
            println()
            println("등록된 동물 종류가 없습니다.")
        }
        // 동물 종류가 있다면
        else {
            // 동물 정보가 없다면
            if (chk2 == false) {
                println()
                println("등록된 동물 정보가 없습니다.")
            }
            // 동물 정보가 있다면
            else {
                // 동물 정보들을 출력한다.
                showAnimalInfoAll()
                // 동물 전체에 관련된 정보를 구한다.
                val dataMap = getAnimalAlldata()
                // 동물 전체관련 데이터를 출력한다.
                showAnimalAlldata(dataMap)
            }
        }
        // 프로그램의 상태를 변경한다.
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }

    // 동물 정보를 출력하는 메서드
    private fun showAnimalInfoAll() {
        // 동물 정보를 가져온다.
        val animalList = AnimalReporitory.getAnimalInfo()
        // 동물 종류를 가져온다.
        val kindMap = AnimalReporitory.getAnimalKind()

        // 동물 종류별로 정보를 출력한다.
        for ((key, kind) in kindMap) {
            // 해당 종류의 동물만 필터링 한다.
            val animalsOfKind = animalList.filter { it.animalType == key }

            // 해당 종류의 동물이 있다면
            if (animalsOfKind.isNotEmpty()) {
                println()
                println("동물 종류 : $kind")
                // 각 동물의 정보를 출력
                animalsOfKind.forEach { animal ->
                    println("이름 : ${animal.AnimalName}")
                    println("나이 : ${animal.AnimalAge}살")
                    println("다리의 개수 : ${animal.AnimalLegs}개")
                }
            }
        }
    }

    // 전체적인 동물들의 데이터를 구하는 메서드
    private fun getAnimalAlldata(): MutableMap<String, Int> {
        // 데이터를 담을 맵을 생성한다.
        val dataMap = mutableMapOf<String, Int>()
        // 동물 종류를 가져온다.
        val kindMap = AnimalReporitory.getAnimalKind()
        // 동물 정보를 가져온다.
        val animalList = AnimalReporitory.getAnimalInfo()

        // 전체 동물 수를 계산한다.
        val animalCount = animalList.size
        // 전체 동물 다리의 수를 계산한다.
        val legCount = animalList.sumOf { it.AnimalLegs }

        // 동물 종류별로 개수를 계산한다.
        kindMap.forEach { (type, kind) ->
            val kindCount = animalList.count { it.animalType == type }
            dataMap[kind] = kindCount
        }

        // 전체 동물 수와 다리 수를 저장한다.
        dataMap["animalCount"] = animalCount
        dataMap["legCount"] = legCount

        return dataMap
    }

    // 동물 전체 관련 데이터를 출력하는 메서드
    private fun showAnimalAlldata(dataMap: MutableMap<String, Int>) {
        // 동물 종류를 가져온다.
        val kindMap = AnimalReporitory.getAnimalKind()
        println()
        // 전체 동물 수 출력한다.
        println("전체 동물의 수 : ${dataMap["animalCount"]}마리")
        // 종류별 동물 수를 출력한다.
        kindMap.values.forEach { kind ->
            println("$kind : ${dataMap[kind]}마리")
        }
        // 전체 다리의 수를 출력 한다.
        println("전체 다리의 수 : ${dataMap["legCount"]}마리")
    }
}
