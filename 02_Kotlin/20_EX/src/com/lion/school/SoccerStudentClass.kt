package com.lion.school

import java.util.*

class SoccerStudentClass(var goalCount:Int = 0) : StudentClass() {

    // 학생 정보를 입력받는 메서드
    override fun inputStudentInfo(scanner: Scanner) {
        println()
        println("축구부 학생 정보를 입력해주세요")
        super.inputStudentInfo(scanner)
        print("골 넣은 개수 : ")
        goalCount = scanner.nextInt()
    }

    // 학생 정보를 출력하는 메서드
    override fun printStudentInfo() {
        println()
        println("축구부 학생 정보")
        super.printStudentInfo()
        println("골 넣은 개수 : ${goalCount}골")
    }

    // 달리는 메서드
    override fun run() {
        println("축구 선수가 달립니다")
    }

    // 태클하는 기능
    fun takkle(){
        println("태클을 합니다")
    }
}