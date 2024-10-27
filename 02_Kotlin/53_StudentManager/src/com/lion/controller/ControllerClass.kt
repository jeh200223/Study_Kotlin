package com.lion.controller

import com.lion.util.ProgramState
import com.lion.util.ProgramState.*
import com.lion.view.*

class ControllerClass {
    // 프로그램의 상태값을 담을 변수
    var programState:ProgramState = STATE_SHOW_MAIN_MENU
    // 각 상태별로 출력하는 객체를 담을 변수
    lateinit var viewClass:ViewClass

    // 각 상태별로 분기해서 처리하는 메서드
    // 일단은 반복을 하지 않을 겁니다. 나중에 무한 반복되게 만들어주겠습니다.
    fun runController(){
        var isRunning = true

        while(isRunning){

            // isRunning = false

            viewClass = when(programState){
                // 메인 메뉴를 보여주는 상태
                STATE_SHOW_MAIN_MENU -> {
                    // 메인메뉴를 보여주기 위한 클래스의 객체를 생성해서 반환한다.
                    ShowMainMenuView(this)
                }
                // 학생 정보를 입력받는 상태
                STATE_INPUT_STUDENT_INFO -> {
                    // 학생 정보를 입력 받기 위한 객체를 생성하여 반환한다.
                    InputStudentInfoView(this)
                }
                // 학생 정보를 검색하는 생태
                STATE_SEARCH_STUDENT_INFO -> {
                    // 학생 정보 검색을 위한 객체를 생성하여 반환한다.
                    SearchStudentInfoView(this)
                }
                // 학생 정보 전체를 보는 상태
                STATE_SHOW_STUDENT_INFO_ALL -> {
                    // 학생 정보 전체를 보기 위한 객체를 생성하여 반환한다.
                    ShowStudentInfoAllView(this)
                }
                // 학생 정보를 삭제하는 상태
                STATE_DELETE_STUDENT_INFO -> {
                    // 학생 정보를 삭제하기 위한 객체를 생성하여 반환한다.
                    DeleteStudentInfoView(this)
                }
                // 프로그램을 종료하는 상태
                STATE_EXIT_PROGRAM -> {
                    // 프로그램 종료를 위한 객체를 생성하여 반환한다
                    ExitProgramView()
                }
            }

            // ViewClass의 show 메서드를 호출해준다.
            viewClass.show()
        }
    }
}