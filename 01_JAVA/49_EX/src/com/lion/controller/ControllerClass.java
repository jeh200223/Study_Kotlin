package com.lion.controller;

import com.lion.model.StudentClass;
import com.lion.util.Values;
import com.lion.view.*;

import java.util.ArrayList;

public class ControllerClass {

    // 프로그램의 상태값을 담을 변수
    private int programState;
    // 메인메뉴 상태인지 여부값
    private boolean isMainMenu;
    // View 객체의 정보를 담을 변수
    private ViewClass viewClass;
    // 학생 객체를 담을 리스트
    private ArrayList<StudentClass> studentList;

    public ControllerClass(){
        studentList = new ArrayList<>();

        // 프로그램의 초기 상태를 설정한다.
        programState = Values.STATE_SHOW_MAIN_MENU;
        isMainMenu = true;
    }

    // 각 상태별로 분기해서 처리하는 메서드
    // 일단은 반복을 하지 않을 겁니다. 나중에 무한 반복되게 만들어주겠습니다.
    public void runController(){
        // 반복을 제어하기 위한 변수
        boolean running = true;

        while(running){

            // 프로그램의 상태값 별로 분기한다.
            switch (programState){
                // 메인메뉴를 보여주는 상태
                case Values.STATE_SHOW_MAIN_MENU :
                    viewClass = new MainMenuView(this);
                    isMainMenu = true;
                    break;
                // 학생 정보를 입력하는 상태
                case Values.STATE_INPUT_STUDENT_INFO :
                    viewClass = new InputStudentInfoView(this);
                    isMainMenu = false;
                    break;
                // 학생 검색을 하는 상태
                case Values.STATE_SEARCH_STUDENT_INFO :
                    viewClass = new SearchStudentInfoView(this);
                    isMainMenu = false;
                    break;
                // 학생 정보 전체를 보여주는 상태
                case Values.STATE_SHOW_STUDENT_INFO_ALL :
                    viewClass = new ShowStudentInfoAllView(this);
                    isMainMenu = false;
                    break;
                // 학생 정보 삭제를 하는 상태
                case Values.STATE_DELETE_STUDENT_INFO :
                    viewClass = new DeleteStudentView(this);
                    isMainMenu = false;
                    break;
                // 프로그램 종료 상태
                case Values.STATE_EXIT_PROGRAM :
                    // 프로그램을 종료한다.
                    // 0 : 정상적으로 모두 수행되어 끝났을 때
                    // 1 : 비정상적인 상황이 벌어져 종료를 시킬 때
                    System.exit(0);
                    break;
            }
            // 출력하는 메서드 호출
            viewClass.show();

            // 메인메뉴 상태가 아니라면 메인메뉴 상태로 변경해준다.
            if(isMainMenu == false){
                programState = Values.STATE_SHOW_MAIN_MENU;
            }
        }
    }

    // 프로그램의 상태를 변경하는 메서드를 만들어준다.
    public void setProgramState(int programState){
        this.programState = programState;
    }

    // 리스트에 학생 객체를 추가하는 메서드
    public void addStudentClass(StudentClass studentClass){
        studentList.add(studentClass);
    }

    // 저장되어 있는 학생 객체의 수를 반환하는 메서드
    public int getStudentCount(){
        return studentList.size();
    }

    // 학생이름으로 객체를 검색한다.
    public StudentClass searchStudentByName(String studentName){
        // 학생의 수 만큼 반복한다.
        for(StudentClass studentClass : studentList){
            // 현재 학생의 이름과 검색 이름이 같다면..
            if(studentClass.getStudentName().equals(studentName)){
                return studentClass;
            }
        }
        return null;
    }

    // 학생 정보를 담고있는 리스트를 반환한다.
    public ArrayList<StudentClass> getStudentList(){
        return studentList;
    }

    // 매개변수로 받은 객체를 제거한다.
    public void deleteStudentClass(StudentClass studentClass){
        studentList.remove(studentClass);
    }
}