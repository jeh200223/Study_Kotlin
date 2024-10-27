package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.repository.MemberRepository
import com.lion.util.ProgramState
import com.lion.util.ToolClass
import java.util.Scanner

class DeleteMemberView(val controllerClass: ControllerClass):ViewClass() {
    val memberList = MemberRepository.getMemberInfo()
    override fun show() {
        val chk1 = ToolClass.checkMemberExist()

        if (chk1 == false){
            println()
            println("등록된 회원이 없습니다.")
        } else {
            val inputName = inputDeleteMemberName()
            val chk2 = checkInputMemberExistName(inputName)

            val nameCount = memberList.count { it["memberName"] == inputName}
            if (nameCount > 1){
                if (chk2 == false){
                    println()
                    println("입력하신 회원이 없습니다.")
                } else {
                    val inputEmail = inputDeleteMemberEmail()
                    val chk3 = checkInputMemberExistEmail(inputEmail)

                    if (chk3 == false) {
                        println()
                        println("입력하신 이메일이 유효하지 않습니다.")
                    } else {
                        deleteMemberInfoByEmail(inputName, inputEmail)
                    }
                }
            } else {
                if (chk2 == false) {
                    println()
                    println("입력하신 회원이 없습니다.")
                } else {
                    deleteMemberInfoByName(inputName)
                }
            }
        }
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }

    private fun inputDeleteMemberName():String{
        val scanner = Scanner(System.`in`)
        println()
        print("삭제할 회원의 이름을 입력해주세요 : ")
        return scanner.next()
    }

    private fun inputDeleteMemberEmail():String{
        val scanner = Scanner(System.`in`)
        println()
        print("삭제할 회원의 이메일을 입력해주세요 : ")
        return scanner.next()
    }

    private fun checkInputMemberExistName(inputName : String):Boolean{
        var chk1 = false

        memberList.forEach { mutableMap ->
            if (inputName == mutableMap["memberName"]) {
                chk1 = true
                return@forEach
            }
        }
        return chk1
    }

    private fun checkInputMemberExistEmail(inputEmail : String):Boolean{
        var chk1 = false

        memberList.forEach { mutableMap ->
            if (inputEmail == mutableMap["memberEmail"]) {
                chk1 = true
                return@forEach
            }
        }
        return chk1
    }

    private fun deleteMemberInfoByName(inputName : String){
        MemberRepository.deleteMemberInfoByName(inputName)
        println()
        println("${inputName}님의 정보를 삭제하였습니다.")
    }

    private fun deleteMemberInfoByEmail(inputName : String, inputEmail : String){
        MemberRepository.deleteMemberInfoByEmail(inputEmail)
        println()
        println("${inputName}님의 정보를 삭제하였습니다.")
    }
}