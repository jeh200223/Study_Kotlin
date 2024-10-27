package com.lion.util

enum class ProgramState(var number:Int, var str:String) {
    // 메인메뉴를 보여주는 상태
    STATE_SHOW_MAIN_MENU(1, "메인메뉴"),
    // 학생 정보를 입력하는 상태
    STATE_INPUT_STUDENT_INFO(2, "학생 정보 입력"),
    // 학생 검색을 하는 상태
    STATE_SEARCH_STUDENT_INFO(3, "학생 검색"),
    // 학생 정보 전체를 보여주는 상태
    STATE_SHOW_STUDENT_INFO_ALL(4, "학생 정보 전체 보기"),
    // 학생 정보 삭제를 하는 상태
    STATE_DELETE_STUDENT_INFO(5, "학생 정보 삭제"),
    // 프로그램 종료 상태
    STATE_EXIT_PROGRAM(6, "프로그램 종료")
}

class Values{
    companion object{
        // 파일 이름
        val fileName = "student.dat"
    }
}

// 메인 메뉴 번호
enum class MainMenuNumber(var number:Int, var str:String){
    // 학생 정보 입력
    MAIN_MENU_INPUT_STUDENT_INFO(1, "학생 정보 입력"),
    // 학생 이름으로 검색
    MAIN_MENU_SEARCH_STUDENT_INFO(2, "학생 이름으로 검색"),
    // 학생 정보 전체 보기
    MAIN_MENU_SHOW_STUDENT_INFO_ALL(3, "학생 정보 전체 보기"),
    // 학생 정보 삭제 하기
    MAIN_MENU_DELETE_STUDENT_INFO(4, "학생 정보 삭제 하기"),
    // 프로그램 종료
    MAIN_MENU_EXIT_PROGRAM(5, "프로그램 종료 하기")
}

// 운동부 타입
enum class StudentType(var number:Int, var str:String){
    // 축구부
    STUDENT_TYPE_SOCCER(1, "축구부"),
    // 야구부
    STUDENT_TYPE_BASEBALL(2, "야구부"),
    // 농구부
    STUDENT_TYPE_BASKETBALL(3, "농구부"),
}