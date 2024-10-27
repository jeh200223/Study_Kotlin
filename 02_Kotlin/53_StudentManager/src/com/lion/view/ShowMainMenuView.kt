package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.util.MainMenuNumber
import com.lion.util.ProgramState
import java.util.Scanner

class ShowMainMenuView(val controllerClass: ControllerClass) : ViewClass() {
    override fun show() {
        // 메뉴를 출력한다.
        showMainMenu()
        // 메뉴 번호를 입력받는다
        val inputMenuNumber = inputMainMenuNumber()
        // 메뉴 번호에라 프로그램의 상태를 변경한다.
        setProgramState(inputMenuNumber)
    }

    // 메인 메뉴를 보여주는 메서드
    private fun showMainMenu(){
        println()
        println("메뉴를 선택해주세요")
        println("1. 학생 정보 입력")
        println("2. 학생 이름으로 검색")
        println("3. 학생 정보 전체 보기")
        println("4. 학생 정보 삭제 하기")
        println("5. 프로그램 종료")
        print("메뉴 입력 :")
    }

    // 사용자에게 메뉴 번호를 입력받는 기능
    private fun inputMainMenuNumber():Int{
        val scanner = Scanner(System.`in`)
        val inputNumber = scanner.nextInt()
        return inputNumber
    }

    // 사용자가 입력한 메뉴 번호에 따라 상태를 변경시키는 기능
    private fun setProgramState(inputMenuNumber:Int){
        // 사용자가 입력한 메뉴 번호에 따라 프로그램의 상태를 변경한다.
        when(inputMenuNumber){
            // 학생 정보 입력
            MainMenuNumber.MAIN_MENU_INPUT_STUDENT_INFO.number ->{
                controllerClass.programState = ProgramState.STATE_INPUT_STUDENT_INFO
            }
            // 학생 정보 검색
            MainMenuNumber.MAIN_MENU_SEARCH_STUDENT_INFO.number ->{
                controllerClass.programState = ProgramState.STATE_SEARCH_STUDENT_INFO
            }
            // 학생 정보 전체 보기
            MainMenuNumber.MAIN_MENU_SHOW_STUDENT_INFO_ALL.number -> {
                controllerClass.programState = ProgramState.STATE_SHOW_STUDENT_INFO_ALL
            }
            // 학생 정보 삭제 하기
            MainMenuNumber.MAIN_MENU_DELETE_STUDENT_INFO.number -> {
                controllerClass.programState = ProgramState.STATE_DELETE_STUDENT_INFO
            }
            // 프로그램 종료
            MainMenuNumber.MAIN_MENU_EXIT_PROGRAM.number -> {
                controllerClass.programState = ProgramState.STATE_EXIT_PROGRAM
            }
        }
    }
}