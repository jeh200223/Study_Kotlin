package com.lion.view;

import com.lion.controller.ControllerClass;
import com.lion.model.BaseBallStudentClass;
import com.lion.model.BasketBallStudentClass;
import com.lion.model.SoccerStudentClass;
import com.lion.model.StudentClass;
import com.lion.service.InputStudentService;
import com.lion.util.Values;

public class InputStudentInfoView extends ViewClass {
    // 컨트롤러
    ControllerClass controllerClass;
    // 서비스
    InputStudentService inputStudentService;

    public InputStudentInfoView(ControllerClass controllerClass){
        this.controllerClass = controllerClass;
        inputStudentService = new InputStudentService();
    }

    @Override
    public void show() {
        System.out.println();
        System.out.println("학생 운동부 종류 선택");
        System.out.println("1. 축구부");
        System.out.println("2. 야구부");
        System.out.println("3. 농구부");
        System.out.print("운동부 종류 선택 : ");

        int type = inputStudentService.inputStudentTypeNumber();

        // 운동부 종류별로 분기한다.
        // 학생 객체를 담을 변수
        StudentClass studentClass = null;
        // 운동부 타입에 따라 분기한다.
        switch (type){
            case Values.TYPE_SOCCER :
                studentClass = new SoccerStudentClass();
                break;
            case Values.TYPE_BASEBALL:
                studentClass = new BaseBallStudentClass();
                break;
            case Values.TYPE_BASKETBALL:
                studentClass = new BasketBallStudentClass();
                break;
        }
        // 학생 정보를 입력받는 메서드를 호출한다.
        studentClass.inputStudentInfo();
        // 학생 객체를 담아준다.
        controllerClass.addStudentClass(studentClass);
    }
}