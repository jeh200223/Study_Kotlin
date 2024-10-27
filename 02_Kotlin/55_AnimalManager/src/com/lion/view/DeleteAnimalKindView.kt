package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.model.AnimalModel
import com.lion.repository.AnimalReporitory
import com.lion.repository.AnimalReporitory.Companion.removeAnimalsByType
import com.lion.util.ProgramState
import com.lion.util.ToolClass
import java.util.*

class DeleteAnimalKindView(val controllerClass: ControllerClass) : ViewClass() {
    override fun show() {
        val scanner = Scanner(System.`in`)

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
            // 삭제할 동물 종류를 입력받는다.
            val inputNumber = inputDeleteAnimalKind(scanner)
            // 동물 종류가 있는지 확인한다.
            val chk2 = checkInputKindExist(inputNumber)

            // 동물 종류가 없다면
            if (chk2 == false) {
                println("입력한 동물의 종류가 없습니다.")
            }
            // 동물 종류가 있다면
            else {
                // 삭제한다.
                deleteAnimalKind(inputNumber)

            }
        }
        // 메인 메뉴 상태로 변경한다.
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }

    // 동물 종류를 출력하는 기능
    private fun showAnimalKind(){
        // 동물 종류를 가져온다.
        val kindmap = AnimalReporitory.getAnimalKind()
        println()
        println("삭제할 동물 종류 번호를 선택해주세요")
        // 동물 종류만큼 반복한다.
        kindmap.forEach { (index, kind) ->
            println("${index} : ${kind}")
        }
        print("동물 종류 번호 : ")
    }

    // 삭제할 동물 종류를 입력받는 기능
    private fun inputDeleteAnimalKind(scanner: Scanner):Int{
        return scanner.nextInt()
    }

    // 입력한 동물 종류가 있는지 검사하는 기능
    private fun checkInputKindExist(inputNumber:Int):Boolean{
        val kindMap = AnimalReporitory.getAnimalKind()
        return kindMap.containsKey(inputNumber)
    }

    // 물 종류를 삭제하는 기능
    private fun deleteAnimalKind(inputNumber: Int) {
        // 동물 종류를 삭제한다.
        AnimalReporitory.deleteAnimalKind(inputNumber)

        // 삭제된 동물 종류에 해당하는 동물 정보를 제거한다.
        removeAnimalsByType(inputNumber)

        // 삭제 후 kindMap을 업데이트하여 저장소에 반영한다.
        val updatedKindMap = AnimalReporitory.getAnimalKind()
        AnimalReporitory.saveAnimalKind(updatedKindMap)

        // 키 업데이트
        AnimalReporitory.updateKindKey(inputNumber)

        // 동물 정보 키 업데이트한다.
        updateAnimalInfoKeys(inputNumber)

        println()
        println("${inputNumber}번 동물의 종류를 삭제하였습니다")
    }

    // 동물 정보의 키를 업데이트하는 기능
    private fun updateAnimalInfoKeys(deletedKey: Int) {
        // 동물 정보를 가져온다.
        val animalInfoList = AnimalReporitory.getAnimalInfo()
        // 동물 정보를 기반으로 새로운 리스트를 생성한다.
        val updatedAnimalInfoList = animalInfoList.map { animal ->
            // 동물 종류가 삭제된 키보다 큰 경우
            if (animal.animalType > deletedKey) {
                // animalType을 1 감소시켜 새 객체를 만들어준다.
                AnimalModel(animal.animalType - 1).apply {
                    // 기존 정보를 유지해준다.
                    AnimalName = animal.AnimalName
                    AnimalAge = animal.AnimalAge
                    AnimalLegs = animal.AnimalLegs
                }
            } else {
                // 삭제된 키보다 작거나 같은 경우 그대로 반환한다.
                animal
            }
        }
        // 변경된 리스트를 저장한다.
        AnimalReporitory.saveAnimalInfo(updatedAnimalInfoList as MutableList<AnimalModel>) // 변경된 리스트 저장
    }
}