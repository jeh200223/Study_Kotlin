package com.lion.school

import java.util.Scanner

abstract class StudentClass(var studentName:String = "", var studentAge:Int = 0) {

    // 학생 정보를 입력받는 메서드
    open fun inputStudentInfo(scanner: Scanner){
        print("이름 : ")
        studentName = scanner.next()
        print("나이 : ")
        studentAge = scanner.nextInt()
    }
    // 학생 정보를 출력하는 메서드
    open fun printStudentInfo(){
        println("이름 : $studentName")
        println("나이 : ${studentAge}살")
    }

    // 달리는 메서드
    abstract fun run()
}