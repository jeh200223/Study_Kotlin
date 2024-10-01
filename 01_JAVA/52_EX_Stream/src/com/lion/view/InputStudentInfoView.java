package com.lion.view;

import com.lion.controller.ControllerClass;
import com.lion.model.BaseBallStudentClass;
import com.lion.model.BasketBallStudentClass;
import com.lion.model.SoccerStudentClass;
import com.lion.model.StudentClass;
import com.lion.repository.StudentRepository;
import com.lion.util.Values;

import java.util.Scanner;

public class InputStudentInfoView extends ViewClass {

    ControllerClass controllerClass;

    public InputStudentInfoView(ControllerClass controllerClass) {
        this.controllerClass = controllerClass;
    }

    @Override
    public void doShow() {
        System.out.println();
        System.out.println("소속 운동부 선택");
        System.out.println("1. 축구부");
        System.out.println("2. 야구부");
        System.out.println("3. 농구부");
        System.out.print("소속 운동부 : ");
        // 운동부 번호를 입력받는다.
        int inputType = inputStudentType();

        // 학생 객체를 담을 변수
        StudentClass studentClass = null;
        // 운동부로 분기한다.
        switch (inputType) {
            case Values.TYPE_SOCCER:
                studentClass = new SoccerStudentClass();
                break;
            case Values.TYPE_BASEBALL:
                studentClass = new BaseBallStudentClass();
                break;
            case Values.TYPE_BASKETBALL:
                studentClass = new BasketBallStudentClass();
                break;
        }

        // 학생 정보를 입력받는다.
        Scanner scanner = new Scanner(System.in);
        studentClass.inputStudentInfo(scanner);

        // 학생 정보를 저장한다.
        StudentRepository.saveStudentInfo(studentClass);

        // 프로그램 상태를 메인메뉴 상태로 변경한다.
        controllerClass.setProgramState(Values.STATE_SHOW_MAIN_MENU);
    }

    // 소속 운동부 번호를 입력받는 메서드
    public int inputStudentType() {
        Scanner scanner = new Scanner(System.in);
        int inputType = scanner.nextInt();
        return inputType;
    }
}