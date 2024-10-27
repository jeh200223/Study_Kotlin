package com.lion.util

import com.lion.repository.AnimalReporitory

class ToolClass {
    companion object{

        // 등록되어 있는 동물 종류가 있는지 확인하는 메서드
        fun checkKindExist():Boolean{
            // 동물 종류 정보를 가져온다.
            val kindmap = AnimalReporitory.getAnimalKind()

            // 관리하는 객체의 수가 0이면 false를 반환한다.
            if(kindmap.size == 0) {
                return false
            }
            // 관리하는 객체의 수가 0이 아니면 true를 반환한다.
            else {
                return true
            }
        }

        // 등록되어 있는 동물 정보가 있는지 확인하는 메서드
        fun checkInfoExist():Boolean{
            // 동물 정보를 가져온다.
            val animalList = AnimalReporitory.getAnimalInfo()

            // 관리하는 객체의 수가 0이면 false를 반환한다.
            if(animalList.size == 0){
                return false
            }
            // 관리하는 객체의 수가 0이 아니면 true를 반환한다.
            else {
                return true
            }
        }
    }
}