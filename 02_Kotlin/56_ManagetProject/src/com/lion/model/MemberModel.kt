package com.lion.model

import com.lion.util.MemberGrade
import com.lion.util.Value
import java.io.Serializable
import java.util.Scanner

class MemberModel:Serializable {
    var memberName = ""
    var memberEmail = ""
    var memberGrade = ""
    fun inputMemberInfo(scanner: Scanner): MutableMap<String, Any> {
        var memberMap: MutableMap<String, Any>
        while (true) {
            println()
            println("*공지사항* : 등급은 브론즈, 실버, 골드, 플래티넘, 다이아까지 있습니다.")
            print("이름: ")
            memberName = scanner.next()
            print("이메일: ")
            memberEmail = scanner.next()
            print("등급: ")
            memberGrade = scanner.next()

            // 입력된 등급이 올바른지 확인
            if (memberGrade in listOf(
                    MemberGrade.BRONZE.str,
                    MemberGrade.SILVER.str,
                    MemberGrade.GOLD.str,
                    MemberGrade.PLATINUM.str,
                    MemberGrade.DIAMOND.str)) {

                // 등급이 유효한 경우 멤버 정보를 맵에 저장
                memberMap = mutableMapOf(
                    "memberName" to memberName,
                    "memberEmail" to memberEmail,
                    "memberGrade" to memberGrade
                )
                break
            } else {
                println("유효하지 않은 등급입니다. 다시 입력해주세요.")
            }
        }

        return memberMap
    }


    fun showMemberInfo(memberMap:MutableMap<String,Any>){
        println()
        println("이름 : ${memberMap["memberName"]}")
        println("이메일 : ${memberMap["memberEmail"]}")
        println("등급 : ${memberMap["memberGrade"]}등급")
    }
}