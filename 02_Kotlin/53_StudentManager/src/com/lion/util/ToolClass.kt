package com.lion.util

import com.lion.repository.StudentRepository

class ToolClass {
    companion object{
        // 등록되어 있는 학생이 있는지 확인하는 메서드
        fun checkStudentExist():Boolean{
            // 학생 정보를 가져온다.
            val studentList = StudentRepository.getStudentInfo()
            // 관리하는 객체의 수가 0이면 false를 반환한다.
            if(studentList.size == 0){
                return false
            }
            // 관리하는 객체의 수가 0이 아니면 true를 반환한다.
            else {
                return true
            }
        }
    }
}