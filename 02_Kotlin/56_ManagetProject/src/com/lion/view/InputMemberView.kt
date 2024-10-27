package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.model.MemberModel
import com.lion.repository.MemberRepository
import com.lion.util.ProgramState
import java.util.Scanner

class InputMemberView(val controllerClass: ControllerClass):ViewClass() {
    override fun show() {
        showInputMember()
        val memberInfo = inputMemberInfo()
        saveMemberInfo(memberInfo)
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }

    private fun showInputMember(){
        println()
        println("회원정보를 입력해주세요")
    }

    private fun inputMemberInfo():MutableMap<String,Any>{
        val scanner = Scanner(System.`in`)
        val memberModel = MemberModel().inputMemberInfo(scanner)
        return memberModel
    }

    private fun saveMemberInfo(memberMap:MutableMap<String,Any>){
        val memberList = MemberRepository.getMemberInfo()
        memberList.forEach { mutableMap ->
            if(memberMap.getValue("memberEmail") == mutableMap["memberEmail"]) {
                println("이미 등록된 이메일입니다.")
                return
            }
        }
        memberList.add(memberMap)
        MemberRepository.saveMemberInfo(memberList)
        println("회원이 성공적으로 등록되었습니다.")
    }
}