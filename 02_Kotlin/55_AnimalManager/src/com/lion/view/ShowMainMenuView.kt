package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.util.MenuState
import com.lion.util.ProgramState
import java.util.Scanner

class ShowMainMenuView(val controllerClass: ControllerClass) : ViewClass() {
    override fun show() {
        // 메뉴 번호를 입력받는다
        val inputNumber = inputMenuNumber()
        // 메뉴 번호에라 프로그램의 상태를 변경한다.
        setState(inputNumber)
    }

    // 메인 메뉴를 보여주는 메서드
    private fun ShowMainMenu(){
        println()
        println("1. 동물 종류 등록")
        println("2. 동물 종류 삭제")
        println("3. 동물 정보 등록")
        println("4. 동물 정보 전체 보기")
        println("5. 동물 이름 검색")
        println("6. 동물 정보 삭제")
        println("7. 프로그램 종료")
        print("메뉴 입력 : ")
    }

    // 사용자에게 메뉴 번호를 입력받는 기능
    private fun inputMenuNumber():Int{
        // 메뉴를 출력한다.
        ShowMainMenu()
        val scanner = Scanner(System.`in`)
        val inputNumber:Int
        inputNumber = scanner.nextInt()
        return inputNumber
    }

    // 사용자가 입력한 메뉴 번호에 따라 상태를 변경시키는 기능
    private fun setState(menuNumber: Int){
        // 사용자가 입력한 메뉴 번호에 따라 프로그램의 상태를 변경한다.
        when(menuNumber){
            // 동물 종류 입력
            MenuState.MENU_INPUT_ANIMAL_KIND.number ->
                controllerClass.programState = ProgramState.STATE_INPUT_ANIMAL_KIND
            // 동물 종류 삭제
            MenuState.MENU_DELETE_ANIMAL_KIND.number ->
                controllerClass.programState = ProgramState.STATE_DELETE_ANIMAL_KIND
            // 동물 정보 입력
            MenuState.MENU_INPUT_ANIMAL_INFO.number ->
                controllerClass.programState = ProgramState.STATE_INPUT_ANIMAL_INFO
            // 동물 정보 전체 보기
            MenuState.MENU_SHOW_ANIMAL_INFO_ALL.number ->
                controllerClass.programState = ProgramState.STATE_SHOW_ANIMAL_INFO_ALL
            // 동물 정보 검색
            MenuState.MENU_SEARCH_ANIMAL_NAME.number ->
                controllerClass.programState = ProgramState.STATE_SEARCH_ANIMAL_NAME
            // 동물 정보 삭제 하기
            MenuState.MENU_DELETE_ANIMAL_INFO.number ->
                controllerClass.programState = ProgramState.STATE_DELETE_ANIMAL_INFO
            // 프로그램 종료
            MenuState.MENU_EXIT_PROGRAM.number ->
                controllerClass.programState = ProgramState.STATE_EXIT_PROGRAM
        }
    }
}