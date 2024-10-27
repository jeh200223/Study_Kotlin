package com.lion.main

import com.lion.school.BaseBallStudentClass
import com.lion.school.BasketBallStudentClass
import com.lion.school.SoccerStudentClass
import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    val soccerStudentClass = SoccerStudentClass()
    val baseBallStudentClass = BaseBallStudentClass()
    val basketBallStudentClass = BasketBallStudentClass()

    // 학생 정보를 입력받는다.
    soccerStudentClass.inputStudentInfo(scanner)
    baseBallStudentClass.inputStudentInfo(scanner)
    basketBallStudentClass.inputStudentInfo(scanner)

    // 학생 정보를 출력한다.
    soccerStudentClass.printStudentInfo()
    soccerStudentClass.run()
    soccerStudentClass.takkle()

    baseBallStudentClass.printStudentInfo()
    baseBallStudentClass.run()
    baseBallStudentClass.homeStill()

    basketBallStudentClass.printStudentInfo()
    basketBallStudentClass.run()
    basketBallStudentClass.blocking()

}