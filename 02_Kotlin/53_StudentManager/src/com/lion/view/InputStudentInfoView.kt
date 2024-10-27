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

class InputStudentInfoView(val controllerClass: ControllerClass) : ViewClass() {
    override fun show() {

        // 운동부 선택 메뉴를 출력한다.
        showStudentType()

        // 운동부 번호를 입력받는다.
        val typeNumber = inputStudentType()

        // 학생 정보를 입력받는다.
        inputStudentInfo(typeNumber)

        // 프로그램의 상태를 메인 메뉴 상태로 변경한다.
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
        val scanner = Scanner(System.`in`)
        val typeNumber = scanner.nextInt()
        return typeNumber
    }

    // 학생 정보를 입력받는 기능
    private fun inputStudentInfo(studentType:Int){
        // 입력받은 학생 타입별로 분기하여 객체를 생성한다.
        val studentModel = when(studentType){
            // 축구부
            StudentType.STUDENT_TYPE_SOCCER.number -> SoccerStudentModel()
            // 야구부
            StudentType.STUDENT_TYPE_BASEBALL.number -> BaseBallStudentModel()
            // 농구부
            StudentType.STUDENT_TYPE_BASKETBALL.number -> BasketBallStudentModel()
            else -> SoccerStudentModel()
        }
        // 학생 정보를 입력받는다.
        val scanner = Scanner(System.`in`)
        studentModel.inputStudentInfo(scanner)

        // 학생 정보를 파일에 저장한다.
        StudentRepository.addStudentInfo(studentModel)
    }
}