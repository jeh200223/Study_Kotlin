package com.lion.view;

import com.lion.controller.ControllerClass;
import com.lion.model.StudentClass;
import com.lion.repository.StudentRepository;
import com.lion.util.Values;

import java.util.ArrayList;
import java.util.HashMap;

public class ShowStudentInfoAllView extends ViewClass{
    ControllerClass controllerClass;

    public ShowStudentInfoAllView(ControllerClass controllerClass) {
        this.controllerClass = controllerClass;
    }

    @Override
    public void doShow() {
        System.out.println();
        // 저장된 정보가 있는지 확인한다.
        boolean chk1 = StudentRepository.checkStudentExistAll();
        // 저장된 정보가 없다면
        if(chk1 == false) {
            System.out.println("등록된 학생 정보가 없습니다");
        } else {
            // 학생수를 구한다.
            int studentCount = StudentRepository.getStudentCountAll();
            System.out.printf("총 학생 수 : %d명\n", studentCount);

            // 전체 학생의 데이터를 가져온다.
            ArrayList<StudentClass> studentList = StudentRepository.getStudentInfoAll();

            // 학생의 수 만큼 반복한다.
            for(StudentClass item : studentList){
                // 학생 정보를 출력한다.
                item.showStudentInfo();
                item.showAction();
            }

            // 각 운동부 별 학생 수를 구한다.
            HashMap<String, Integer> map1 = StudentRepository.getStudentCountByType();
            System.out.println();
            System.out.printf("축구부 : %d명\n", map1.get("soccerCount"));
            System.out.printf("야구부 : %d명\n", map1.get("baseBallCount"));
            System.out.printf("농구부 : %d명\n", map1.get("basketBallCount"));
        }

        // 프로그램의 상태를 메인 메뉴 상태로 변경한다.
        controllerClass.setProgramState(Values.STATE_SHOW_MAIN_MENU);
    }
}
