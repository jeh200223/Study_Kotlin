package com.lion.model

import java.util.*

class BaseBallStudentModel : StudentModel() {
    companion object {
        private const val serialVersionUID: Long = 3L
    }
    // 홈런 개수
    var homeRunCount:Int = 0

    // 학생 정보를 입력받는 메서드
    override fun inputStudentInfo(scanner: Scanner) {
        println()
        println("야구부 학생 정보를 입력해주세요")
        super.inputStudentInfo(scanner)
        print("홈런 개수 : ")
        homeRunCount = scanner.nextInt()
    }

    // 학생 정보를 출력하는 메서드
    override fun showStudentInfo() {
        println()
        println("야구부 학생의 정보")
        super.showStudentInfo()
        println("홈런 개수 : ${homeRunCount}개")
    }

    // 달리는 기능
    override fun actionRun() {
        println("야구부 학생이 달립니다")
    }

    override fun showAction() {
        actionStellBase()
    }

    // 도루하는 기능
    fun actionStellBase(){
        println("야구부 학생이 도루를 합니다")
    }
}