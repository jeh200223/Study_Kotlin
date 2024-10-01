package com.lion.util;

public interface Values {
    // 메인 메뉴를 보여주는 상태
    int State_Show_Main_Menu = 1;
    // 동물 정보를 입력받는 상태
    int State_Input_Animal_Info = 2;
    // 동물 이름을 통해 검색하여 보이는 상태
    int State_Search_Animal_Info = 3;
    // 동물 정보 전체를 보여주는 상태
    int State_Show_Animal_Info_All = 4;
    // 동물 정보를 삭제하는 상태
    int State_Delete_Animal_Info = 5;
    // 프로그램 종료 상태
    int State_Exit_Program = 6;

    String FILE_NAME = "Animal.dat";
}
