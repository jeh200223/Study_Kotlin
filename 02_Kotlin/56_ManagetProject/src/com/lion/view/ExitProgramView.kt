package com.lion.view

class ExitProgramView:ViewClass() {
    override fun show() {
        exitProgram()
    }

    private fun exitProgram(){
        println()
        println("프로그램이 종료됩니다.")
        System.exit(0)
    }
}