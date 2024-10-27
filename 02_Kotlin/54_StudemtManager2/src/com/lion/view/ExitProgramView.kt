package com.lion.view

import kotlin.system.exitProcess

class ExitProgramView : ViewClass() {
    override fun show() {
        exitProgram()
    }

    // 프로그램을 종료하는 기능
    private fun exitProgram(){
        println()
        println("프로그램을 종료합니다")
        exitProcess(0)
    }
}