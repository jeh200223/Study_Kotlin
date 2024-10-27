package com.lion.model

import java.util.*

class SoccerStudentModel : StudentModel(){
    companion object {
        private const val serialVersionUID: Long = -3606048598368215708
    }
    // 골 넣은 개수
    var goalCount:Int = 0

    // 학생 정보를 입력받는 메서드
    override fun inputStudentInfo(scanner: Scanner) {
        println()
        println("축구부 학생 정보를 입력해주세요")
        super.inputStudentInfo(scanner)
        print("골 넣은 개수 : ")
        goalCount = scanner.nextInt()
    }

    // 학생 정보를 출력하는 메서드
    override fun showStudentInfo() {
        println()
        println("축구부 학생의 정보")
        super.showStudentInfo()
        println("골 넣은 개수 : ${goalCount}개")
    }

    // 달리는 기능
    override fun actionRun() {
        println("축구부 학생이 달립니다.")
    }

    override fun showAction() {
        actionTakkle()
    }

    // 태클하는 기능
    fun actionTakkle(){
        println("축구부 학생이 태클을 합니다.")
    }
}