package com.lion.manage;

import com.lion.values.MenuValues;

import java.util.Scanner;

public class MenuClass {
    Integer menuType;

    public void inputMenuCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("메뉴를 선택해주세요.");
        System.out.println("1. 동물정보 추가");
        System.out.println("2. 동물 이름 검색");
        System.out.println("3. 동물 전체 정보 보기");
        System.out.println("4. 동물 정보 삭제");
        System.out.println("5. 종료");
        System.out.print("메뉴 선택 : ");

        menuType = scanner.nextInt();

        switch (menuType){
            case MenuValues.TYPE_ADD:
                AddClass addClass = new AddClass();
                addClass.inputAnimalType();
                break;
            case MenuValues.TYPE_SEARCH:
                SearchClass searchClass = new SearchClass();
                break;
            case MenuValues.TYPE_VIEW:
                ViewClass viewClass = new ViewClass();
                viewClass.showAnimalAll();
                break;
            case MenuValues.TYPE_DELETE:
                DeleteClass deleteClass = new DeleteClass();
                break;
            case MenuValues.TYPE_EXIT:
                ExitClass exitClass = new ExitClass();
                exitClass.programExit();
                break;
        }
    }
}
