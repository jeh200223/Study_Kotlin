package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.util.MainMenuNumber
import com.lion.util.ProgramState
import java.util.Scanner

class ShowMainMenuView(private val controllerClass: ControllerClass) : ViewClass() {
    override fun show() {
        val menuNumber = inputMainMenuNumber()
        setProgramState(menuNumber)
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
        print("메뉴 입력 : ")
    }

    // 사용자에게 메뉴 번호를 입력받는 기능
    private fun inputMainMenuNumber():Int{
        showMainMenu()
        val scanner = Scanner(System.`in`)
        return scanner.nextInt()
    }

    // 사용자가 입력한 메뉴 번호에 따라 상태를 변경시키는 기능
    private fun setProgramState(menuNumber: Int) {
        controllerClass.programState = when(menuNumber) {
            MainMenuNumber.MAIN_MENU_INPUT_STUDENT_INFO.number -> ProgramState.STATE_INPUT_STUDENT_INFO
            MainMenuNumber.MAIN_MENU_SEARCH_STUDENT_INFO.number -> ProgramState.STATE_SEARCH_STUDENT_INFO
            MainMenuNumber.MAIN_MENU_SHOW_STUDENT_INFO_ALL.number -> ProgramState.STATE_SHOW_STUDENT_INFO_ALL
            MainMenuNumber.MAIN_MENU_DELETE_STUDENT_INFO.number -> ProgramState.STATE_DELETE_STUDENT_INFO
            MainMenuNumber.MAIN_MENU_EXIT_PROGRAM.number -> ProgramState.STATE_EXIT_PROGRAM
            else -> throw IllegalArgumentException("잘못된 메뉴 유형입니다.")
        }
    }
}