package com.lion.controller;

import com.lion.util.Values;
import com.lion.view.*;

public class ControllerClass {

    // 프로그램 상태값을 담을 변수
    private int programState;

    // 생성자
    public ControllerClass() {
        // 프로그램의 초기 상태를 설정한다.
        programState = Values.STATE_SHOW_MAIN_MENU;
    }

    // 상태별로 분기하면서 필요한 처리를 하는 메서드
    public void doController() {

        // 반복을 제어하기 위한 변수
        boolean isRunning = true;

        // 화면 처리를 하기 위한 객체를 담을 변수
        ViewClass viewClass = null;

        // 반복한다.
        while (isRunning) {
            /*// 테스트용으로 한번만 반복되게 한다.
            isRunning = false;*/
            // 프로그램 상태에 따라 분기한다.
            switch (programState) {
                // 메인 메뉴를 보여주는 상태
                case Values.STATE_SHOW_MAIN_MENU:
                    viewClass = new ShowMainMenuView(this);
                    break;
                // 학생 정보를 입력받는 상태
                case Values.STATE_INPUT_STUDENT_INFO:
                    viewClass = new InputStudentInfoView(this);
                    break;
                // 학생 이름을 통해 검색하여 보여는 상태
                case Values.STATE_SEARCH_STUDENT_BY_NAME:
                    viewClass = new SearchStudentByNameView(this);
                    break;
                // 학생 정보 전체를 보여주는 상태
                case Values.STATE_SHOW_STUDENT_INFO_ALL:
                    viewClass = new ShowStudentInfoAllView(this);
                    break;
                // 학생 정보를 삭제하는 상태
                case Values.STATE_DELETE_STUDENT_INFO:
                    viewClass = new DeleteStudentInfoView(this);
                    break;
                // 프로그램 종료 상태
                case Values.STATE_EXIT_PROGRAM:
                    System.out.println("프로그램을 종료합니다");
                    System.exit(0);
                    break;
            }
            // 화면 출력 메서드를 호출한다.
            viewClass.doShow();
        }
    }
    // 상태값을 변경하는 메서드
    public void setProgramState(int programState) {
        this.programState = programState;
    }
}