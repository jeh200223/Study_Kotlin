package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.model.MemberModel
import com.lion.repository.MemberRepository
import com.lion.util.ProgramState
import com.lion.util.ToolClass

class ShowMemberAllView(val controllerClass: ControllerClass):ViewClass() {
    val memberList = MemberRepository.getMemberInfo()
    override fun show() {
        val chk1 = ToolClass.checkMemberExist()

        if (chk1 == false){
            println()
            println("등록된 회원이 없습니다.")
        } else {
            showMemberInfoAll()
            val memberCount = getMemberAllData()
            showMemberAllData(memberCount)
        }
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }

    private fun showMemberInfoAll(){
        memberList.forEach { mutableMap ->
            MemberModel().showMemberInfo(mutableMap)
        }
    }

    private fun getMemberAllData():Int{
        return memberList.size
    }

    private fun showMemberAllData(memberCount:Int){
        println()
        println("총 회원 수 : ${memberCount}명")
    }
}