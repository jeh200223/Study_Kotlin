package com.lion.repository

import com.lion.model.StudentModel
import com.lion.util.Values
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

class StudentRepository {

    companion object{
        // 학생들의 정보를 읽어오는 메서드
        fun getStudentInfo():MutableList<StudentModel>{
            // 반환할 리스트
            var studentList = mutableListOf<StudentModel>()

            // 파일이 있는지 확인한다.
            val file = File(Values.fileName)
            if(file.exists()){
                // 파일과 연결되는 스트림을 생성한다.
                val fileInputStream = FileInputStream(Values.fileName)
                val objectInputStream = ObjectInputStream(fileInputStream)
                // 읽어온다.
                studentList = objectInputStream.readObject() as MutableList<StudentModel>
                // 파일을 닫아준다.
                objectInputStream.close()
                fileInputStream.close()
            }


            return studentList
        }

        // 학생 정보를 삭제하는 기능
        fun deleteStudentInfo(inputName:String){
            // 학생 정보를 가져온다.
            val studentList = getStudentInfo()

            // 이름이 같은 객체를 제거한다.
            studentList.removeAll {
                if(inputName == it.studentName){
                    // 이름이 같으면 true를 반환하여 삭제하게 한다.
                    true
                } else {
                    // 이름이 다르면 false를 반환하여 삭제되지 않게 한다.
                    false
                }
            }

            // 학생 정보를 저장한다.
            saveStudentInfo(studentList)
        }

        // 학생 정보를 저장하는 기능
        fun addStudentInfo(studentModel: StudentModel){
            // 학생 정보를 불러온다.
            val studentList = getStudentInfo()
            // 학생 객체를 리스트에 담는다.
            studentList.add(studentModel)
            // 저장한다.
            saveStudentInfo(studentList)
        }

        // 학생 객체가 담긴 리스를 파일에 저장한다.
        fun saveStudentInfo(studentList:MutableList<StudentModel>){
            // 파일과 연결된 스트림을 생성한다.
            val fileOutputStream = FileOutputStream(Values.fileName)
            val objectOutputStream = ObjectOutputStream(fileOutputStream)
            // 객체를 쓴다.
            objectOutputStream.writeObject(studentList)
            // 파일을 닫아운다.
            objectOutputStream.flush()
            objectOutputStream.close()
            fileOutputStream.close()
        }
    }
}