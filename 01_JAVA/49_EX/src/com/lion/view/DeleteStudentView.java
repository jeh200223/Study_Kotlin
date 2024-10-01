package com.lion.view;

import com.lion.controller.ControllerClass;
import com.lion.model.SoccerStudentClass;
import com.lion.model.StudentClass;
import com.lion.service.DeleteStudentService;

public class DeleteStudentView extends ViewClass{

    ControllerClass controllerClass;
    DeleteStudentService deleteStudentService;

    public DeleteStudentView(ControllerClass controllerClass){
        this.controllerClass = controllerClass;
        deleteStudentService = new DeleteStudentService();

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
        // 학생의 수를 가져온다.
        int studentCount = controllerClass.getStudentCount();
        // 학생이 없다면
        if(studentCount == 0) {
            System.out.println("등록된 학생이 없습니다.");
        } else{
            System.out.print("삭제할 학생의 이름 입력 : ");
            String searchName = deleteStudentService.inputDeleteStudentName();
            // 이름에 해당하는 학생 객체를 가져온다.
            StudentClass studentClass = controllerClass.searchStudentByName(searchName);
            // 해당하는 학생이 없다면
            if(studentClass == null){
                System.out.println("입력한 학생은 없습니다");
            } else {
                controllerClass.deleteStudentClass(studentClass);
                System.out.println("삭제하였습니다");
            }
        }
    }
}