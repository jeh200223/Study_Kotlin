package com.lion.view;

import com.lion.controller.ControllerClass;
import com.lion.service.MainMenuService;
import com.lion.util.Values;

public class MainMenuView extends ViewClass{
    // Controller 클래스
    ControllerClass controllerClass;
    // 서비스 클래스
    MainMenuService mainMenuService;

    public MainMenuView(ControllerClass controllerClass){
        this.controllerClass = controllerClass;
        mainMenuService = new MainMenuService();
    }

    @Override
    public void show() {
        // 반복을 제어하는 변수
        boolean isRunning = true;

        // 제대로 입력할 때 까지 반복한다.
        while(isRunning) {
            try {
                System.out.println();
                System.out.println("1. 학생 정보 추가");
                System.out.println("2. 학생 이름 검색");
                System.out.println("3. 학생 전체 정보 보기");
                System.out.println("4. 학생 정보 삭제");
                System.out.println("5. 종료");
                System.out.print("메뉴 선택 : ");
                // 메뉴를 입력받는다.
                int menuNumber = mainMenuService.inputMainMenuNumber();
                // 만약 잘못 입력하였다면
                if(menuNumber < 1 || menuNumber > 5){
                    System.out.println("잘못 입력 하였습니다");
                } else {
                    //  사용자가 입력한 메뉴 번호별로 분기한다.
                    // 각 메뉴에 따른 프로그램의 상태를 설정해준다.
                    switch (menuNumber){
                        case Values.MAIN_MENU_INPUT_STUDENT_INFO :
                            controllerClass.setProgramState(Values.STATE_INPUT_STUDENT_INFO);
                            break;
                        case Values.MAIN_MENU_SEARCH_STUDENT_INFO :
                            controllerClass.setProgramState(Values.STATE_SEARCH_STUDENT_INFO);
                            break;
                        case Values.MAIN_MENU_SHOW_STUDENT_INFO_ALL :
                            controllerClass.setProgramState(Values.STATE_SHOW_STUDENT_INFO_ALL);
                            break;
                        case Values.MAIN_MENU_DELETE_STUDENT_INFO :
                            controllerClass.setProgramState(Values.STATE_DELETE_STUDENT_INFO);
                            break;
                        case Values.MAIN_MENU_EXIT_PROGRAM :
                            controllerClass.setProgramState(Values.STATE_EXIT_PROGRAM);
                            break;
                    }
                    // 반복문을 종료한다.
                    isRunning = false;
                }
            }catch(Exception e){
                System.out.println("잘못 입력 하였습니다");
            }
        }
    }
}