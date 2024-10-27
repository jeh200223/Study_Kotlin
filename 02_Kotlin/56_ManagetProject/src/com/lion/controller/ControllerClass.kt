package com.lion.controller

import com.lion.util.ProgramState.*
import com.lion.view.*

class ControllerClass {
    var programState = STATE_SHOW_MAIN_MENU
    lateinit var viewClass: ViewClass
    fun doController(){
        var isRunning = true
        while (isRunning){
            viewClass = when(programState){
                STATE_SHOW_MAIN_MENU -> ShowMainMenuView(this)
                STATE_INPUT_MEMBER_INFO -> InputMemberView(this)
                STATE_DELETE_MEMBER_INFO -> DeleteMemberView(this)
                STATE_SHOW_MEMBER_INFO_ALL -> ShowMemberAllView(this)
                STATE_SEARCH_MEMBER_INFO -> SearchMemberView(this)
                STATE_UPDATE_MEMBER_GRADE -> UpdateGradeMemberView(this)
                STATE_INPUT_PRODUCT_INFO -> InputProductView(this)
                STATE_DELETE_PRODUCT_INFO -> DeleteProductView(this)
                STATE_SHOW_PRODUCT_INFO_ALL -> ShowProductAllView(this)
                STATE_SEARCH_PRODUCT_INFO -> SearchProductView(this)
                STATE_CALCULATE_MEMBER_PRODUCT -> CalculateMemberView(this)
                STATE_EXIT_PROGRAM -> ExitProgramView()
            }
            viewClass.show()
        }
    }
}