package com.lion.util

enum class ProgramState(var number:Int, var str:String) {
    // 메인메뉴를 보여주는 상태
    STATE_SHOW_MAIN_MENU(1, "메인메뉴"),
    // 동물 종류를 입력하는 상태
    STATE_INPUT_ANIMAL_KIND(2, "동물 종류 입력"),
    // 동물 종류를 삭제 하는 상태
    STATE_DELETE_ANIMAL_KIND(3, "동물 종류 삭제"),
    // 동물 정보를 입력하는 상태
    STATE_INPUT_ANIMAL_INFO(4, "동물 정보 등록"),
    // 동물 정보를 전체 출력하는 상태
    STATE_SHOW_ANIMAL_INFO_ALL(5, "동물 정보 전체 보기"),
    // 동물 이름으로 검색하는 상태
    STATE_SEARCH_ANIMAL_NAME(6, "동물 이름 검색"),
    // 동물 정보 삭제하는 상태
    STATE_DELETE_ANIMAL_INFO(7, "동물 정보 삭제"),
    // 프로그램 종료 상태
    STATE_EXIT_PROGRAM(8, "프로그램 종료")
}

enum class MenuState(var number:Int, var str:String) {
    MENU_INPUT_ANIMAL_KIND(1, "동물 종류 입력"),
    // 동물 종류를 삭제 하는 상태
    MENU_DELETE_ANIMAL_KIND(2, "동물 종류 삭제"),
    // 동물 정보를 입력하는 상태
    MENU_INPUT_ANIMAL_INFO(3, "동물 정보 등록"),
    // 동물 정보를 전체 출력하는 상태
    MENU_SHOW_ANIMAL_INFO_ALL(4, "동물 정보 전체 보기"),
    // 동물 이름으로 검색하는 상태
    MENU_SEARCH_ANIMAL_NAME(5, "동물 이름 검색"),
    // 동물 정보 삭제하는 상태
    MENU_DELETE_ANIMAL_INFO(6, "동물 정보 삭제"),
    // 프로그램 종료 상태
    MENU_EXIT_PROGRAM(7, "프로그램 종료")
}

class Values {
    companion object{
        // 동물 종류 관리 파일
        val fileName = "animalKind.dat"
        // 종류에 따른 키값 관리 파일
        val cycleFile = "cyclecount.dat"
        // 동물 정보 관리 파일
        val infoName = "animalInfo.dat"
    }
}