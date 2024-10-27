package com.lion.model

import java.util.*

class BasketBallStudentModel : StudentModel(){
    companion object {
        private const val serialVersionUID: Long = 4L
    }
    // 리바운드 개수
    var reboundCount:Int = 0

    // 학생 정보를 입력받는 메서드
    override fun inputStudentInfo(scanner: Scanner) {
        println()
        println("농구부 학생 정보를 입력해주세요")
        super.inputStudentInfo(scanner)
        print("리바운드 개수 : ")
        reboundCount = scanner.nextInt()
    }

    // 학생 정보를 출력하는 메서드
    override fun showStudentInfo() {
        println()
        println("농구부 학생의 정보")
        super.showStudentInfo()
        println("리바운드 개수 : ${reboundCount}개")
    }

    // 달리는 기능
    override fun actionRun() {
        println("농구부 학생이 달립니다.")
    }

    override fun showAction() {
        actionShutThreePoint()
    }

    // 3점슛을 쏘는 기능
    fun actionShutThreePoint(){
        println("농구부 학생이 3점 슛을 쏩니다.")
    }
}