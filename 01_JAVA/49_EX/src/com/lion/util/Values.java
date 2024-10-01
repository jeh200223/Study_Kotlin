package com.lion.util;

public interface Values {

    // 메인메뉴를 보여주는 상태
    int STATE_SHOW_MAIN_MENU = 1;
    // 학생 정보를 입력하는 상태
    int STATE_INPUT_STUDENT_INFO = 2;
    // 학생 검색을 하는 상태
    int STATE_SEARCH_STUDENT_INFO = 3;
    // 학생 정보 전체를 보여주는 상태
    int STATE_SHOW_STUDENT_INFO_ALL = 4;
    // 학생 정보 삭제를 하는 상태
    int STATE_DELETE_STUDENT_INFO = 5;
    // 프로그램 종료 상태
    int STATE_EXIT_PROGRAM = 6;

    // 메인 메뉴의 항목을 나타내는 값
    int MAIN_MENU_INPUT_STUDENT_INFO = 1;
    int MAIN_MENU_SEARCH_STUDENT_INFO = 2;
    int MAIN_MENU_SHOW_STUDENT_INFO_ALL = 3;
    int MAIN_MENU_DELETE_STUDENT_INFO = 4;
    int MAIN_MENU_EXIT_PROGRAM = 5;

    // 각 운동부를 나타내는 값
    int TYPE_SOCCER = 1;
    int TYPE_BASEBALL = 2;
    int TYPE_BASKETBALL = 3;
}