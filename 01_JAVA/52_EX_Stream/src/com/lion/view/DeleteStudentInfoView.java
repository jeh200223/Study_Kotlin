package com.lion.view;

import com.lion.controller.ControllerClass;
import com.lion.repository.StudentRepository;
import com.lion.util.Values;

import java.util.Scanner;

public class DeleteStudentInfoView extends ViewClass{

    ControllerClass controllerClass;

    public DeleteStudentInfoView(ControllerClass controllerClass){
        this.controllerClass = controllerClass;
    }

    @Override
    public void doShow() {
        System.out.println();
        // 저장된 학생 정보가 있는지 확인한다.
        boolean chk = StudentRepository.checkStudentExistAll();
        if(chk == false) {
            System.out.println("저장된 학생 정보가 없습니다");
        } else {
            // 삭제할 학생의 이름을 입력받는다.
            System.out.print("삭제할 학생 이름 : ");
            String inputName = inputDeleteStudentName();
            // 학생이 있는지 확인한다.
            boolean chk2 = StudentRepository.checkStudentExistByName(inputName);
            if(chk2 == false) {
                System.out.println("입력하신 학생은 존재하지 않습니다");
            } else {
                // 학생 정보를 삭제한다.
                StudentRepository.deleteStudentInfoByName(inputName);
                System.out.printf("%s 학생의 정보를 삭제하였습니다\n", inputName);
            }
        }
        // 프로그램의 상태를 메인 메뉴 상태로 변경한다.
        controllerClass.setProgramState(Values.STATE_SHOW_MAIN_MENU);
    }

    // 삭제할 학생 이름을 입력받는 메서드
    public String inputDeleteStudentName(){
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.next();
        return inputName;
    }
}