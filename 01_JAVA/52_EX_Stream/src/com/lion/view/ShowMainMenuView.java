package com.lion.view;

import com.lion.controller.ControllerClass;
import com.lion.util.Values;

import java.util.Scanner;

public class ShowMainMenuView extends ViewClass {
    ControllerClass controllerClass;

    public ShowMainMenuView(ControllerClass controllerClass) {
        this.controllerClass = controllerClass;
    }

    @Override
    public void doShow() {
        System.out.println();
        System.out.println("메뉴를 선택해주세요");
        System.out.println("1. 학생 정보 입력");
        System.out.println("2. 학생 이름으로 검색");
        System.out.println("3. 학생 정보 전체 보기");
        System.out.println("4. 학생 정보 삭제 하기");
        System.out.println("5. 프로그램 종료");
        System.out.print("메뉴 입력 : ");
        // 메뉴 번호를 입력받는다.
        int inputNumber = inputMenuNumber();
        // 메뉴 번호로 분기하여 프로그램의 상태를 변경한다.
        switch (inputNumber) {
            case Values.MAIN_MENU_INPUT_STUDENT_INFO:
                controllerClass.setProgramState(Values.STATE_INPUT_STUDENT_INFO);
                break;
            case Values.MAIN_MENU_SEARCH_STUDENT_INFO_BY_NAME:
                controllerClass.setProgramState(Values.STATE_SEARCH_STUDENT_BY_NAME);
                break;
            case Values.MAIN_MENU_SHOW_STUDENT_INFO_ALL:
                controllerClass.setProgramState(Values.STATE_SHOW_STUDENT_INFO_ALL);
                break;
            case Values.MAIN_MENU_DELETE_STUDENT_INFO:
                controllerClass.setProgramState(Values.STATE_DELETE_STUDENT_INFO);
                break;
            case Values.MAIN_MENU_EXIT_PROGRAM:
                controllerClass.setProgramState(Values.STATE_EXIT_PROGRAM);
                break;
        }
    }

    // 메뉴 번호를 입력받는 메서드
    public int inputMenuNumber() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        return inputNumber;
    }
}
