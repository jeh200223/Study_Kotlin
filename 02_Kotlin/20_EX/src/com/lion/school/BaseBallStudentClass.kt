package com.lion.school

import java.util.*

class BaseBallStudentClass(var homeCount:Int = 0) : StudentClass() {

    // 학생 정보를 입력받는 메서드
    override fun inputStudentInfo(scanner: Scanner) {
        println()
        println("야구부 학생 정보를 입력해주세요")
        super.inputStudentInfo(scanner)
        print("홈런 개수 : ")
        homeCount = scanner.nextInt()
    }

    // 학생 정보를 출력하는 메서드
    override fun printStudentInfo() {
        println()
        println("야구부 학생 정보")
        super.printStudentInfo()
        println("홈런 개수 : ${homeCount}개")
    }

    // 달리는 메서드
    override fun run() {
        println("야구 선수가 달립니다")
    }
    
    // 도루하는 기능
    fun homeStill(){
        println("도루를 합니다")
    }
}