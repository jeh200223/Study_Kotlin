package com.lion.view;

import com.lion.controller.ControllerClass;
import com.lion.model.SoccerStudentClass;
import com.lion.model.StudentClass;
import com.lion.service.SearchStudentService;

import java.util.Scanner;

public class SearchStudentInfoView extends ViewClass{
    ControllerClass controllerClass;
    SearchStudentService searchStudentService;

    public SearchStudentInfoView(ControllerClass controllerClass){
        this.controllerClass = controllerClass;
        searchStudentService = new SearchStudentService();

/*        // 테스트용 데이터
        SoccerStudentClass soccerStudentClass1 = new SoccerStudentClass();
        soccerStudentClass1.inputStudentInfo();

        SoccerStudentClass soccerStudentClass2 = new SoccerStudentClass();
        soccerStudentClass2.inputStudentInfo();

        controllerClass.addStudentClass(soccerStudentClass1);
        controllerClass.addStudentClass(soccerStudentClass2);*/
    }

    @Override
    public void show() {
        System.out.println();

        // 리스트에 담겨져 있는 학생의 수를 가져온다.
        int stucentCount = controllerClass.getStudentCount();

        if(stucentCount == 0) {
            System.out.println("등록된 학생이 없습니다");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("학생의 이름을 입력해주세요 : ");
            String searchStudentName = scanner.next();
            // 해당 이름의 학생이 있는지 검색한다.
            StudentClass studentClass = controllerClass.searchStudentByName(searchStudentName);
            // 학생이 없다면
            if(studentClass == null){
                System.out.println();
                System.out.println("검색된 학생이 없습니다");
            } else {
                studentClass.showStudentInfo();
            }
        }
    }
}
