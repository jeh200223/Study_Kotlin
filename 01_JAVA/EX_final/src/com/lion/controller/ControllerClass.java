package com.lion.controller;

import com.lion.util.Values;
import com.lion.view.*;

import java.util.Scanner;

public class ControllerClass {
    int programState;


    public ControllerClass() {
        // 프로그램의 초기상태를 설정한다.
        programState = Values.State_Delete_Animal_Info;
    }

    public void doController() {
        boolean isRunning = true;

        ViewClass viewClass = null;

        while (isRunning) {

            isRunning = false;

            switch (programState) {
                case Values.State_Show_Main_Menu:
                    viewClass = new ShowMainMenuView();
                    break;
                case Values.State_Input_Animal_Info:
                    viewClass = new InputAnimalInfoView();
                    break;
                case Values.State_Search_Animal_Info:
                    viewClass = new SearchAnimalView();
                    break;
                case Values.State_Show_Animal_Info_All:
                    viewClass = new ShowAnimalAllInfoView();
                    break;
                case Values.State_Delete_Animal_Info:
                    viewClass = new DeleteAnimalInfoView();
                    break;
                case Values.State_Exit_Program:
                    System.out.println("프로그램을 종료합니다");
                    System.exit(0);
                    break;
            }
            viewClass.doshow();
        }
    }
}
