package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.util.MenuState
import com.lion.util.ProgramState
import java.util.Scanner

class ShowMainMenuView(val controllerClass: ControllerClass):ViewClass() {
    override fun show() {
        showMainMenu()
        val inputNumber = inputMainMenu()
        setMainState(inputNumber)
    }

    private fun showMainMenu(){
        println()
        println("메뉴를 선택해주세요.")
        println("1. 회원등록")
        println("2. 회원삭제")
        println("3. 회원전체보기")
        println("4. 회원검색")
        println("5. 회원별 등급 조정")
        println("6. 상품등록")
        println("7. 상품삭제")
        println("8. 상품전체보기")
        println("9. 상품검색")
        println("10. 회원별 상품할인률 계산")
        println("11. 프로그램종료")
        print("메뉴 선택 : ")
    }

    private fun inputMainMenu():Int{
        val scanner = Scanner(System.`in`)
        return scanner.nextInt()
    }

    private fun setMainState(inputNumber: Int){
        when(inputNumber){
            MenuState.MENU_INPUT_MEMBER_INFO.number ->
                controllerClass.programState = ProgramState.STATE_INPUT_MEMBER_INFO
            MenuState.MENU_DELETE_MEMBER_INFO.number ->
                controllerClass.programState = ProgramState.STATE_DELETE_MEMBER_INFO
            MenuState.MENU_SHOW_MEMBER_INFO_ALL.number ->
                controllerClass.programState = ProgramState.STATE_SHOW_MEMBER_INFO_ALL
            MenuState.MENU_SEARCH_MEMBER_INFO.number ->
                controllerClass.programState = ProgramState.STATE_SEARCH_MEMBER_INFO
            MenuState.MENU_UPDATE_MEMBER_GRADE.number ->
                controllerClass.programState = ProgramState.STATE_UPDATE_MEMBER_GRADE
            MenuState.MENU_INPUT_PRODUCT_INFO.number ->
                controllerClass.programState = ProgramState.STATE_INPUT_PRODUCT_INFO
            MenuState.MENU_DELETE_PRODUCT_INFO.number ->
                controllerClass.programState = ProgramState.STATE_DELETE_PRODUCT_INFO
            MenuState.MENU_SHOW_PRODUCT_INFO_ALL.number ->
                controllerClass.programState = ProgramState.STATE_SHOW_PRODUCT_INFO_ALL
            MenuState.MENU_SEARCH_PRODUCT_INFO.number ->
                controllerClass.programState = ProgramState.STATE_SEARCH_PRODUCT_INFO
            MenuState.MENU_CALCULATE_MEMBER_PRODUCT.number ->
                controllerClass.programState = ProgramState.STATE_CALCULATE_MEMBER_PRODUCT
            MenuState.MENU_EXIT_PROGRAM.number ->
                controllerClass.programState = ProgramState.STATE_EXIT_PROGRAM
        }
    }
}