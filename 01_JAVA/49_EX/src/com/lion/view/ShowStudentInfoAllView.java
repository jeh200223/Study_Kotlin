package com.lion.view;

import com.lion.controller.ControllerClass;
import com.lion.model.SoccerStudentClass;
import com.lion.model.StudentClass;
import com.lion.service.ShowStudentInfoAllService;
import com.lion.util.Values;

import java.util.ArrayList;

public class ShowStudentInfoAllView extends ViewClass {
    ControllerClass controllerClass;
    ShowStudentInfoAllService showStudentInfoAllService;

    public ShowStudentInfoAllView(ControllerClass controllerClass) {
        this.controllerClass = controllerClass;
        showStudentInfoAllService = new ShowStudentInfoAllService();

        /*SoccerStudentClass soccerStudentClass1 = new SoccerStudentClass();
        soccerStudentClass1.inputStudentInfo();

        SoccerStudentClass soccerStudentClass2 = new SoccerStudentClass();
        soccerStudentClass2.inputStudentInfo();

        controllerClass.addStudentClass(soccerStudentClass1);
        controllerClass.addStudentClass(soccerStudentClass2);*/
    }

    @Override
    public void show() {
        System.out.println();

        // 학생 수를 가져온다.
        int studentCount = controllerClass.getStudentCount();
        // 학생이 없다면
        if (studentCount == 0) {
            System.out.println("등록된 학생이 없습니다");
        } else {
            System.out.printf("전체 학생의 수 : %d명\n", studentCount);
            // 학생 객체가 담겨져 있는 리스트를 받아온다.
            ArrayList<StudentClass> studentList = controllerClass.getStudentList();
            // 학생의 수 만큼 반복하면서 출력한다.
            for (StudentClass studentClass : studentList) {
                studentClass.showStudentInfo();
            }

            // 각 운동부 별 학생 수를 구한다.
            int cnt1 = showStudentInfoAllService.getStudentTypeCount(Values.TYPE_SOCCER, studentList);
            int cnt2 = showStudentInfoAllService.getStudentTypeCount(Values.TYPE_BASEBALL, studentList);
            int cnt3 = showStudentInfoAllService.getStudentTypeCount(Values.TYPE_BASKETBALL, studentList);

            System.out.println();
            System.out.printf("축구부 : %d명\n", cnt1);
            System.out.printf("야구부 : %d명\n", cnt2);
            System.out.printf("농구부 : %d명\n", cnt3);
        }
    }
}