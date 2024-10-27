package com.lion.repository

import com.lion.model.MemberModel
import com.lion.util.Value
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

class MemberRepository {
    companion object{
        fun saveMemberInfo(memberList: MutableList<MutableMap<String, Any>>){
            val fileOutputStream = FileOutputStream(Value().file_name1)
            val objectOutputStream = ObjectOutputStream(fileOutputStream)

            objectOutputStream.writeObject(memberList)

            objectOutputStream.flush()
            objectOutputStream.close()
            fileOutputStream.close()
        }

        fun getMemberInfo():MutableList<MutableMap<String, Any>>{
            var memberList = mutableListOf<MutableMap<String, Any>>()

            val file = File(Value().file_name1)

            if (file.exists()){
                val fileInputStream = FileInputStream(Value().file_name1)
                val objectInputStream = ObjectInputStream(fileInputStream)

                memberList = objectInputStream.readObject() as MutableList<MutableMap<String, Any>>

                objectInputStream.close()
                fileInputStream.close()
            }
            return memberList
        }

        fun deleteMemberInfoByName(inputName:String){
            val memberList = getMemberInfo()
            memberList.removeAll {
                if (inputName == it["memberName"]){
                    true
                } else {
                    false
                }
            }
            saveMemberInfo(memberList)
        }

        fun deleteMemberInfoByEmail(inputEmail:String){
            val memberList = getMemberInfo()
            memberList.removeAll {
                if (inputEmail == it["memberEmail"]){
                    true
                } else {
                    false
                }
            }
            saveMemberInfo(memberList)
        }

        fun updateGradeByName(inputName: String, inputGrade:String){
            val memberList = getMemberInfo()
            memberList.forEach { member ->
                if (inputName == member["memberName"]){
                    member["memberGrade"] = inputGrade
                }
            }
            saveMemberInfo(memberList)
        }

        fun updateGradeByEmail(inputEmail: String, inputGrade:String){
            val memberList = getMemberInfo()
            memberList.forEach { member ->
                if (inputEmail == member["memberEmail"]){
                    member["memberGrade"] = inputGrade
                }
            }
            saveMemberInfo(memberList)
        }
    }
}