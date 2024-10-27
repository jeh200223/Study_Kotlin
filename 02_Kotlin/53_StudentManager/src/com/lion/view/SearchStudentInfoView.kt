package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.model.BaseBallStudentModel
import com.lion.model.BasketBallStudentModel
import com.lion.model.SoccerStudentModel
import com.lion.model.StudentModel
import com.lion.repository.StudentRepository
import com.lion.util.ProgramState
import com.lion.util.ToolClass
import java.util.Scanner

class SearchStudentInfoView(val controllerClass: ControllerClass) : ViewClass() {
    override fun show() {

        // 등록된 학생이 있는지 확인한다.
        val check1 = ToolClass.checkStudentExist()

        // 만약 학생이 없다면
        if(check1 == false){
            println()
            println("등록된 학생 정보가 없습니다.")
        }
        // 학생이 있다면
        else {
            // 학생 이름을 검색한다.
            val inputName = inputSearchStudentName()
            // 입력한 학생이 있는지 검사한다.
            val check2 = checkSearchStudentExist(inputName)
            // 입력한 학생이 없다면
            if(check2 == false){
                println()
                println("입력한 학생의 정보가 없습니다")
            }
            // 입력한 학생이 있다면
            else {
                // 검색한 학생의 정보를 가져온다.
                val searchStudentList = getSearchStudentInfo(inputName)
                // 가져온 학생의 수 만큼 반복한다.
                searchStudentList.forEach{
                    // 공통 부분 호출
                    it.showStudentInfo()
                    it.actionRun()
                    // 각각 다른 부분 호출
                    when(it){
                        // 축구라면
                        is SoccerStudentModel ->{
                            it.actionTakkle()
                        }
                        // 야구부라면
                        is BaseBallStudentModel -> {
                            it.actionStellBase()
                        }
                        // 농구부라면
                        is BasketBallStudentModel ->{
                            it.actionShutThreePoint()
                        }
                    }
                }
            }
        }

        // 프로그램 상태를 메인 메뉴로 변경한다.
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }

    // 학생 이름을 입력받는 기능
    private fun inputSearchStudentName():String{
        println()
        print("검색할 학생의 이름을 입력해주세요 : ")
        val scanner = Scanner(System.`in`)
        val inputName = scanner.next()
        return inputName
    }

    // 입력한 학생 정보가 있는지 확인하는 기능
    fun checkSearchStudentExist(inputName:String):Boolean{
        // 학생이 있는지 여부 값
        var isExistStudentName = false
        // 학생 데이터를 가져온다.
        val studentList = StudentRepository.getStudentInfo()
        // 학생의 수 만큼 반복한다.
        studentList.forEach {
            // 검색한 학생의 이름과 현재 학생 객체의 이름이 같은지 확인한다.
            if(inputName == it.studentName){
                // 변수에 true를 담아준다.
                isExistStudentName = true
                return@forEach
            }
        }
        return isExistStudentName
    }

    // 입력한 학생 정보를 가져오는 기능
    private fun getSearchStudentInfo(inputName:String):MutableList<StudentModel>{
        // 검색된 학생 정보를 담을 리스트
        val searchStudentList = mutableListOf<StudentModel>()
        // 학생 전체데이터를 가져온다.
        val studentList = StudentRepository.getStudentInfo()
        // 학생의 수 만큼 반복한다.
        studentList.forEach {
            // 입력한 학생의 이름과 현재 학생의 이름이 같다면..
            if(inputName == it.studentName){
                // 담아준다.
                searchStudentList.add(it)
            }
        }
        // 반환한다.
        return searchStudentList
    }
}







