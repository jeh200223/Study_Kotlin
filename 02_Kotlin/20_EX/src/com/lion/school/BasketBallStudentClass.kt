package com.lion.school

import java.util.*

class BasketBallStudentClass(var reboundCount:Int = 0) : StudentClass() {

    // 학생 정보를 입력받는 메서드
    override fun inputStudentInfo(scanner: Scanner) {
        println()
        println("농구부 학생 정보를 입력해주세요")
        super.inputStudentInfo(scanner)
        print("리바운드 개수 : ")
        reboundCount = scanner.nextInt()
    }

    // 학생 정보를 출력하는 메서드
    override fun printStudentInfo() {
        println()
        println("농구부 학생 정보")
        super.printStudentInfo()
        println("리바운드 개수 : ${reboundCount}개")
    }

    // 달리는 메서드
    override fun run() {
        println("농구 선수가 달립니다")
    }

    // 블록킹 하는 기능
    fun blocking(){
        println("블록킹을 합니다")
    }
}