package com.lion.util

import com.lion.model.StudentModel
import com.lion.repository.StudentRepository

class ToolClass {
    companion object{
        // 등록되어 있는 학생이 있는지 확인하는 메서드
        fun checkStudentExist():Boolean{
            var result:Boolean = true
            var studentList = StudentRepository.getStudentInfo()
            if(studentList == null || studentList.size == 0) {
                result = false
            }
            return result
        }
    }
}