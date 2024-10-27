package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.repository.StudentRepository
import com.lion.util.ProgramState
import com.lion.util.ToolClass
import java.util.Scanner

class DeleteStudentInfoView(val controllerClass: ControllerClass) : ViewClass() {
    override fun show() {
        // 학생 정보가 저장되어 있는지 확인한다.
        val check1 = ToolClass.checkStudentExist()

        // 학생 정보가 없다면
        if(check1 == false){
            println()
            println("등록된 학생 정보가 없습니다")
        }
        // 학생 정보가 있다면
        else {
            // 삭제할 학생의 이름을 입력받는다.
            val inputName = inputDeleteStudentName()
            // 삭제할 학생이 있는지 확인한다
            val check2 = checkInputStudentExist(inputName)
            // 학생이 없다면
            if(check2 == false){
                println()
                println("입력한 학생은 없습니다")
            }
            // 학생이 있다면
            else {
                // 삭제한다.
                deleteStudentInfo(inputName)
            }
        }

        // 메인 메뉴 상태로 변경한다.
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }

    // 삭제할 학생의 이름을 입력받는 기능
    fun inputDeleteStudentName():String{
        println()
        print("삭제할 학생의 이름을 입력해주세요 : ")
        val scanner = Scanner(System.`in`)
        val inputName = scanner.next()
        return inputName
    }

    // 입력한 학생이 있는지 검사하는 기능
    fun checkInputStudentExist(inputName:String):Boolean{
        // 반환할 값
        var check1 = false
        // 모든 학생의 정보를 가져온다.
        val studentList = StudentRepository.getStudentInfo()
        // 학생의 수 만큼 반복한다.
        studentList.forEach {
            // 입력한 학생의 이름과 현재 학생의 이름이 같은지.
            if(inputName == it.studentName){
                // 반환할 값에 true를 넣어주고 forEach를 중단한다.
                check1 = true
                return@forEach
            }
        }
        // 반환한다.
        return check1
    }

    // 학생 정보를 삭제하는 기능
    fun deleteStudentInfo(inputName: String){
        // 학생데이터를 삭제한다.
        StudentRepository.deleteStudentInfo(inputName)
        println()
        println("${inputName}학생의 정보를 삭제하였습니다")
    }
}