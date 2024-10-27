package com.lion.view

import com.lion.controller.ControllerClass
import com.lion.model.MemberModel
import com.lion.repository.MemberRepository
import com.lion.util.ProgramState
import com.lion.util.ToolClass
import java.util.Scanner

class UpdateGradeMemberView(val controllerClass: ControllerClass):ViewClass() {
    val memberList = MemberRepository.getMemberInfo()
    override fun show() {
        val chk1 = ToolClass.checkMemberExist()

        if (chk1 == false){
            println()
            println("등록되어 있는 회원정보가 없습니다.")
        } else {
            val inputName = inputMemberName()
            val chk2 = checkSearchMemberExist(inputName)

            val nameCount = memberList.count { it["memberName"] == inputName}
            if (nameCount > 1) {
                if (chk2 == false) {
                    println()
                    println("입력하신 회원의 정보가 존재하지 않습니다.")
                } else {
                    val searcMemberListByName = getMemberInfoByName(inputName)
                    searcMemberListByName.forEach { mutableMap ->
                        MemberModel().showMemberInfo(mutableMap)
                    }

                    val inputEmail = inputMemberEmail()
                    val chk3 = checkInputMemberExistEmail(inputEmail)

                    if (chk3 == false) {
                        println()
                        println("입력하신 회원의 이메일이 유효하지 않습니다.")
                    } else {
                        val searcMemberListByEmail = getMemberInfoByEmail(inputEmail)
                        searcMemberListByEmail.forEach { mutableMap ->
                            MemberModel().showMemberInfo(mutableMap)
                        }
                        val updateGrade = inputUpdateGrade()
                        updateGradeByEmail(inputName, inputEmail, updateGrade)
                    }
                }
            } else {
                if (chk2 == false) {
                    println()
                    println("입력하신 회원의 정보가 존재하지 않습니다.")
                } else {
                    val searcMemberListByName = getMemberInfoByName(inputMemberName())
                    searcMemberListByName.forEach { mutableMap ->
                        MemberModel().showMemberInfo(mutableMap)
                    }
                    val updateGrade = inputUpdateGrade()
                    updateGradeByName(inputName, updateGrade)
                }
            }
            controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
        }
    }

    private fun inputMemberName():String{
        val scanner = Scanner(System.`in`)
        println()
        print("등급을 수정할 회원의 이름을 입력해주세요 : ")
        return scanner.next()
    }

    private fun inputMemberEmail():String{
        val scanner = Scanner(System.`in`)
        println()
        print("등급을 수정할 회원의 이메일을 입력해주세요 : ")
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

    private fun getMemberInfoByName(inputName:String):MutableList<MutableMap<String,Any>>{
        val searcMemberListByName = mutableListOf<MutableMap<String,Any>>()
        val memberList = MemberRepository.getMemberInfo()

        memberList.forEach { mutableMap ->
            if (inputName == mutableMap["memberName"]) {
                searcMemberListByName.add(mutableMap)
            }
        }
        return searcMemberListByName
    }

    private fun getMemberInfoByEmail(inputEmail:String):MutableList<MutableMap<String,Any>>{
        val searcMemberListByEmail = mutableListOf<MutableMap<String,Any>>()
        val memberList = MemberRepository.getMemberInfo()

        memberList.forEach { mutableMap ->
            if (inputEmail == mutableMap["memberEmail"]) {
                searcMemberListByEmail.add(mutableMap)
            }
        }
        return searcMemberListByEmail
    }

    private fun inputUpdateGrade():String{
        val scanner = Scanner(System.`in`)
        println()
        print("수정할 등급을 입력해주세요 : ")
        return scanner.next()
    }

    private fun updateGradeByName(inputName: String, inputGrade:String){
        MemberRepository.updateGradeByName(inputName, inputGrade)
        println()
        println("${inputName}의 등급을 ${inputGrade}등급으로 수정하였습니다.")
    }

    private fun updateGradeByEmail(inputName: String, inputEmail: String, inputGrade:String){
        MemberRepository.updateGradeByEmail(inputEmail, inputGrade)
        println()
        println("${inputName}의 등급을 ${inputGrade}등급으로 수정하였습니다.")
    }
}