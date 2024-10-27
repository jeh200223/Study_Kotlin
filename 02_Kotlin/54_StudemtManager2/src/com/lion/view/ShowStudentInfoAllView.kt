package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.model.BaseBallStudentModel
import com.lion.model.BasketBallStudentModel
import com.lion.model.SoccerStudentModel
import com.lion.repository.StudentRepository
import com.lion.util.ProgramState
import com.lion.util.ToolClass

class ShowStudentInfoAllView(val controllerClass: ControllerClass) : ViewClass() {
    override fun show() {
        // 등록되어 있는 학생이 있는지 확인한다.
        val check1 = ToolClass.checkStudentExist()

        // 등록되어 있는 학생이 없다면
        if(check1 == false) {
            println()
            println("등록된 학생 정보가 없습니다")
        }
        // 등록되어 있는 학생이 있다면
        else {
            // 학생 정보들을 출력한다.
            showStudentInfoAll()
            // 학생 전체에 관련된 정보를 구한다.
            val dataMap = getStudentAllData()
            // 학생 전체관련 데이터를 출력한다.
            showStudentAllData(dataMap)
        }

        // 프로그램의 상태를 변경한다.
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }

    // 학생 정보를 출력하는 메서드
    private fun showStudentInfoAll(){
        // 학생 전체의 정보를 가져온다.
        val studentList = StudentRepository.getStudentInfo()
        // 반복한다.
        studentList.forEach {
            // 공통 부분
            it.showStudentInfo()
            it.actionRun()
            // 분기한다.
            when(it){
                is SoccerStudentModel -> {
                    it.actionTakkle()
                }
                is BaseBallStudentModel ->{
                    it.actionStellBase()
                }
                is BasketBallStudentModel -> {
                    it.actionShutThreePoint()
                }
            }
        }
    }

    // 전체적인 학생들의 데이터를 구하는 메서드
    private fun getStudentAllData():MutableMap<String, Int>{
        // 데이터를 담을 맵을 생성한다.
        val dataMap = mutableMapOf<String, Int>()
        // 학생 데이터를 가져온다.
        val studentList = StudentRepository.getStudentInfo()

        // 데이터를 담을 변수들
        var totalCount = studentList.size
        var totalSoccerCount = 0
        var totalBaseBallCount = 0
        var totalBasketBallCount = 0
        var totalGoalCount = 0
        var totalHomeRunCount = 0
        var totalReboundCount = 0

        // 학생 수 만큼 반복한다.
        studentList.forEach {
            // 학생의 타입에 따라 분기한다.
            when(it){
                is SoccerStudentModel -> {
                    // 학생 수를 증가시킨다
                    totalSoccerCount++
                    // 골 넣은 수를 누적한다.
                    totalGoalCount += it.goalCount
                }
                is BaseBallStudentModel -> {
                    // 학생 수를 증가시킨다
                    totalBaseBallCount++
                    // 홈런 개수를 누적한다.
                    totalHomeRunCount += it.homeRunCount
                }
                is BasketBallStudentModel ->{
                    // 학생 수를 증가시킨다.
                    totalBasketBallCount++
                    // 리바운드 개수를 누적한다.
                    totalReboundCount += it.reboundCount
                }
            }
        }
        // 구한 데이터를 맵에 담는다.
        dataMap["totalCount"] = totalCount
        dataMap["totalSoccerCount"] = totalSoccerCount
        dataMap["totalBaseBallCount"] = totalBaseBallCount
        dataMap["totalBasketBallCount"] = totalBasketBallCount
        dataMap["totalGoalCount"] = totalGoalCount
        dataMap["totalHomeRunCount"] = totalHomeRunCount
        dataMap["totalReboundCount"] = totalReboundCount

        return dataMap
    }

    // 전체적인 학생들의 데이터를 출력하는 메서드
    private fun showStudentAllData(dataMap:MutableMap<String, Int>){
        println()
        println("전체 학생의 수 : ${dataMap["totalCount"]}명")
        println("축구부 학생의 수 : ${dataMap["totalSoccerCount"]}명")
        println("야구부 학생의 수 : ${dataMap["totalBaseBallCount"]}명")
        println("농구부 학생의 수 : ${dataMap["totalBasketBallCount"]}명")
        println("축구부 학생들이 넣은 골의 총 합 : ${dataMap["totalGoalCount"]}개")
        println("야구부 학생들이 친 홈런의 총 합 : ${dataMap["totalHomeRunCount"]}개")
        println("농구부 학생들이 한 리바운드의 총 합 : ${dataMap["totalReboundCount"]}개")
    }
}