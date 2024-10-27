package com.lion.model

import java.io.Serializable
import java.util.Scanner

abstract class StudentModel : Serializable {
    companion object {
        private const val serialVersionUID: Long = -640675898523869477L
    }
    // 운동부 번호
    var studentType:Int = 0
    // 학생 이름
    var studentName:String = ""
    // 학생의 나이
    var studentAge:Int = 0

    // 학생 정보를 입력받는 기능
    open fun inputStudentInfo(scanner: Scanner){
        print("이름 : ")
        studentName = scanner.next()
        print("나이 : ")
        studentAge = scanner.nextInt()
    }
    // 학생 정보를 출력하는 기능
    open fun showStudentInfo(){
        println("이름 : ${studentName}")
        println("나이 : ${studentAge}살")
    }
    // 달리는 기능
    abstract fun actionRun()

    abstract fun showAction()
}