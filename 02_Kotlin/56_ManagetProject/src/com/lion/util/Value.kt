package com.lion.util

class Value {
    val file_name1 = "Member.dat"
    val file_name2 = "Product.dat"
}

enum class ProgramState(var number: Int, var str:String){
    // 메인메뉴 상태
    STATE_SHOW_MAIN_MENU(1, "메인메뉴 상태"),
    // 회원등록 상태
    STATE_INPUT_MEMBER_INFO(2, "회원등록 상태"),
    // 회원삭제 상태
    STATE_DELETE_MEMBER_INFO(3, "회원삭제 상태"),
    // 회원전체보기 상태
    STATE_SHOW_MEMBER_INFO_ALL(4, "회원전체보기 상태"),
    // 회원검색 상태
    STATE_SEARCH_MEMBER_INFO(5, "회원검색 상태"),
    // 회원별 등급 조정 상태
    STATE_UPDATE_MEMBER_GRADE(6, "회원별 등급 조정 상태"),
    // 상품등록 상태
    STATE_INPUT_PRODUCT_INFO(7, "상품등록 상태"),
    // 상품삭제 상태
    STATE_DELETE_PRODUCT_INFO(8, "상품삭제 상태"),
    // 상품전체보기 상태
    STATE_SHOW_PRODUCT_INFO_ALL(9, "상품전체보기 상태"),
    // 상품검색 상태
    STATE_SEARCH_PRODUCT_INFO(10, "상품검색 상태"),
    // 회원별 상품할인률 계산 상태
    STATE_CALCULATE_MEMBER_PRODUCT(11, "회원별 상품할인률 계산 상태"),
    // 프로그램 종료
    STATE_EXIT_PROGRAM(12, "프로그램 종료")
}

enum class MenuState(var number: Int, var str:String){
    // 회원등록 상태
    MENU_INPUT_MEMBER_INFO(1, "회원등록 상태"),
    // 회원삭제 상태
    MENU_DELETE_MEMBER_INFO(2, "회원삭제 상태"),
    // 회원전체보기 상태
    MENU_SHOW_MEMBER_INFO_ALL(3, "회원전체보기 상태"),
    // 회원검색 상태
    MENU_SEARCH_MEMBER_INFO(4, "회원검색 상태"),
    // 회원별 등급 조정 상태
    MENU_UPDATE_MEMBER_GRADE(5, "회원별 등급 조정 상태"),
    // 상품등록 상태
    MENU_INPUT_PRODUCT_INFO(6, "상품등록 상태"),
    // 상품삭제 상태
    MENU_DELETE_PRODUCT_INFO(7, "상품삭제 상태"),
    // 상품전체보기 상태
    MENU_SHOW_PRODUCT_INFO_ALL(8, "상품전체보기 상태"),
    // 상품검색 상태
    MENU_SEARCH_PRODUCT_INFO(9, "상품검색 상태"),
    // 회원별 상품할인률 계산 상태
    MENU_CALCULATE_MEMBER_PRODUCT(10, "회원별 상품할인률 계산 상태"),
    // 프로그램 종료
    MENU_EXIT_PROGRAM(11, "프로그램 종료")
}

enum class MemberGrade(var number: Int, var str:String){
    // 브론즈
    BRONZE(1, "브론즈"),
    // 실버
    SILVER(2, "실버"),
    // 골드
    GOLD(3, "골드"),
    // 플래티넘
    PLATINUM(4, "플래티넘"),
    // 다이아
    DIAMOND(5, "다이아"),
}

enum class CalculateMenu(var number: Int, var str:String){
    // 회원선택
    SELECTED_MEMBER(1, "회원선택"),
    // 상품선택
    SELECTED_PRODUCT(2, "상품선택"),
}