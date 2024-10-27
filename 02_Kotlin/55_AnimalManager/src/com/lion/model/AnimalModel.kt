package com.lion.model

import com.lion.repository.AnimalReporitory
import java.io.Serializable
import java.util.Scanner

class AnimalModel(val inputType: Int):Serializable {
    companion object {
        private const val serialVersionUID: Long = 4819362774382109300L
    }
    // 동물 종류
    val animalType = inputType
    // 동물 이름
    var AnimalName:String = ""
    // 동물 나이
    var AnimalAge:Int = 0
    // 동물 다리의 개수
    var AnimalLegs:Int = 0


    // 동물 정보를 입력받는 기능
    fun inputAnimalInfo(scanner: Scanner){
        print("이름 : ")
        AnimalName = scanner.next()
        print("나이 : ")
        AnimalAge = scanner.nextInt()
        print("다리의 개수 : ")
        AnimalLegs = scanner.nextInt()
    }

    // 동물 정보를 출력하는 기능
    fun showAnimalInfo(){
        val kindMap = AnimalReporitory.getAnimalKind()
        if (kindMap.containsKey(inputType)) {
            val selectedKind = kindMap[inputType]
            println()
            println("동물 종류 : ${selectedKind}")
        }
        println("이름 : ${AnimalName}")
        println("나이 : ${AnimalAge}살")
        println("다리의 개수 : ${AnimalLegs}개")
    }
}