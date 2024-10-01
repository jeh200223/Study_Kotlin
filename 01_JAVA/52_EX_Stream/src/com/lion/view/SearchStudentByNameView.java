package com.lion.view;

import com.lion.controller.ControllerClass;
import com.lion.model.StudentClass;
import com.lion.repository.StudentRepository;
import com.lion.util.Values;

import java.util.Scanner;

public class SearchStudentByNameView extends ViewClass{
    ControllerClass controllerClass;

    public SearchStudentByNameView(ControllerClass controllerClass) {
        this.controllerClass = controllerClass;
    }

    @Override
    public void doShow() {
        System.out.println();
        // 저장된 데이터가 있는지 확인한다.
        boolean chk1 = StudentRepository.checkStudentExistAll();
        // 저장된 데이터가 없다면
        if(chk1 == false) {
            System.out.println("저장된 학생 정보가 없습니다");
        } else {
            // 학생 이름을 입력받는다.
            System.out.print("검색할 학생의 이름 : ");
            String inputName = inputSearchStudentName();
            // 입력한 이름의 학생이 있는지 확인한다.
            boolean chk2 = StudentRepository.checkStudentExistByName(inputName);
            // 학생이 없다면
            if(chk2 == false){
                System.out.println("입력하신 학생의 정보는 존재하지 않습니다");
            }  else {
                // 검색한 학생 객체를 가져온다.
                StudentClass studentClass = StudentRepository.searchStudentInfoByName(inputName);
                // 출력한다.
                studentClass.showStudentInfo();
                studentClass.showAction();
            }
        }

        // 프로그램 상태를 메인메뉴 상태로 변경한다.
        controllerClass.setProgramState(Values.STATE_SHOW_MAIN_MENU);
    }

    // 학생 이름을 입력받는 메서드
    public String inputSearchStudentName(){
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.next();
        return inputName;
    }
}
