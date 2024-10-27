package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.model.MemberModel
import com.lion.repository.MemberRepository
import com.lion.util.ProgramState
import com.lion.util.ToolClass
import java.util.Scanner

class SearchMemberView(val controllerClass: ControllerClass):ViewClass() {
    override fun show() {
        val chk1 = ToolClass.checkMemberExist()

        if (chk1 == false){
            println()
            println("등록된 회원이 없습니다.")
        } else {
            val inputName = inputSearchMemberName()
            val chk2 = checkSearchMemberExist(inputName)

            if (chk2 == false){
                println()
                println("입력하신 회원이 존재하지 않습니다.")
            } else {
                val searchMemberList = getSearchMemberInfo(inputName)
                searchMemberList.forEach { mutableMap ->
                    MemberModel().showMemberInfo(mutableMap)
                }
            }
        }
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }

    private fun inputSearchMemberName():String{
        val scanner = Scanner(System.`in`)
        println()
        print("검색할 회원의 이름을 입력해주세요 : ")
        return scanner.next()
    }

    private fun checkSearchMemberExist(inputName:String):Boolean{
        var isExistMemberName = false
        val memberList = MemberRepository.getMemberInfo()

        memberList.forEach { mutableMap ->
            if (inputName == mutableMap["memberName"]) {
                isExistMemberName = true
                return@forEach
            }
        }
        return isExistMemberName
    }

    private fun getSearchMemberInfo(inputName:String):MutableList<MutableMap<String,Any>>{
        val searcMemberList = mutableListOf<MutableMap<String,Any>>()
        val memberList = MemberRepository.getMemberInfo()

        memberList.forEach { mutableMap ->
            if (inputName == mutableMap["memberName"]) {
                searcMemberList.add(mutableMap)
            }
        }
        return searcMemberList
    }
}