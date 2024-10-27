package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.model.BaseBallStudentModel
import com.lion.model.BasketBallStudentModel
import com.lion.model.SoccerStudentModel
import com.lion.model.StudentModel
import com.lion.repository.StudentRepository
import com.lion.util.ProgramState
import com.lion.util.StudentType

import java.util.Scanner

class InputStudentInfoView(private val controllerClass: ControllerClass) : ViewClass() {
    override fun show() {
        val studentType = inputStudentType()
        inputStudentInfo(studentType)
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }

    // 운동부를 선택하기 위한 화면을 출력
    private fun showStudentType(){
        println()
        println("소속 운동부를 선택해주세요")
        println("1. 축구부")
        println("2. 야구부")
        println("3. 농구부")
        print("소속 운동부 : ")
    }

    // 소속 운동부를 입력받는 기능
    private fun inputStudentType():Int{
        showStudentType()
        val scanner = Scanner(System.`in`)
        return scanner.nextInt()
    }

    // 학생 정보를 입력받는 기능
    private fun inputStudentInfo(studentType:Int){
        val studentModel:StudentModel
        studentModel = when(studentType) {
            StudentType.STUDENT_TYPE_SOCCER.number -> SoccerStudentModel()
            StudentType.STUDENT_TYPE_BASEBALL.number -> BaseBallStudentModel()
            StudentType.STUDENT_TYPE_BASKETBALL.number -> BasketBallStudentModel()  // 농구부 모델이 존재한다고 가정
            else -> throw IllegalArgumentException("잘못된 운동부 유형입니다.")
        }

        val scanner = Scanner(System.`in`)
        studentModel.inputStudentInfo(scanner)
        StudentRepository.addStudentInfo(studentModel)
    }
}