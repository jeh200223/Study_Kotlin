package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.model.StudentModel
import com.lion.repository.StudentRepository
import com.lion.util.ProgramState
import com.lion.util.ToolClass
import java.util.Scanner

class SearchStudentInfoView(val controllerClass: ControllerClass) : ViewClass() {
    override fun show() {
        val scanner = Scanner(System.`in`)
        val inputName = inputSearchStudentName(scanner)
        checkSearchStudentExist(inputName)
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }

    // 학생 이름을 입력받는 기능
    fun inputSearchStudentName(scanner: Scanner):String{
        var inputName:String
        println()
        println("검색할 학생의 이름을 입력해주세요 : ")
        inputName = scanner.next()
        return inputName
    }

    // 입력한 학생 정보가 있는지 확인하는 기능
    fun checkSearchStudentExist(inputName:String){
        val chk1 = ToolClass.checkStudentExist()
        val chk2 = StudentRepository().checkStudentExistByName(inputName)

        if(chk1 == false) {
            println("저장된 학생 정보가 없습니다")
        } else if (chk2 == false) {
            println("입력하신 학생의 정보는 존재하지 않습니다")
        } else {
            getSearchStudentInfo(inputName)
        }
    }

    // 입력한 학생 정보를 가져오는 기능
    fun getSearchStudentInfo(inputName:String){
        val studentModel = StudentRepository.searchStudentInfoByName(inputName)
        studentModel?.showStudentInfo()
        studentModel?.showAction()
    }
}