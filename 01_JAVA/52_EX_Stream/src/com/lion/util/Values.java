package com.lion.util;

public interface Values {
    // 프로그램의 상태를 정의하는 값
    // 메인 메뉴를 보여주는 상태
    int STATE_SHOW_MAIN_MENU = 1;
    // 학생 정보를 입력받는 상태
    int STATE_INPUT_STUDENT_INFO = 2;
    // 학생 이름을 통해 검색하여 보여는 상태
    int STATE_SEARCH_STUDENT_BY_NAME = 3;
    // 학생 정보 전체를 보여주는 상태
    int STATE_SHOW_STUDENT_INFO_ALL = 4;
    // 학생 정보를 삭제하는 상태
    int STATE_DELETE_STUDENT_INFO = 5;
    // 프로그램 종료 상태
    int STATE_EXIT_PROGRAM = 6;

    // 저장 파일 이름
    String FILE_NAME = "student.dat";

    // 각 운동부를 나타내는 값
    int TYPE_SOCCER = 1;
    int TYPE_BASEBALL = 2;
    int TYPE_BASKETBALL = 3;

    // 메인 메뉴 항목을 나타내는 값
    int MAIN_MENU_INPUT_STUDENT_INFO = 1;
    int MAIN_MENU_SEARCH_STUDENT_INFO_BY_NAME = 2;
    int MAIN_MENU_SHOW_STUDENT_INFO_ALL = 3;
    int MAIN_MENU_DELETE_STUDENT_INFO = 4;
    int MAIN_MENU_EXIT_PROGRAM = 5;
}