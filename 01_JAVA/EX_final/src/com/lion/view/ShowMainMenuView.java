package com.lion.view;

public class ShowMainMenuView extends ViewClass{
    @Override
    public void doshow() {
        System.out.println();
        System.out.println("메뉴를 선택해주세요");
        System.out.println("1. 동물 정보 입력");
        System.out.println("2. 동물 이름으로 검색");
        System.out.println("3. 동물 정보 전체 보기");
        System.out.println("4. 동물 정보 삭제 하기");
        System.out.println("5. 프로그램 종료");
        System.out.println("메뉴 선택 : ");
    }

    public void inputMenuNumber(){

    }
}
