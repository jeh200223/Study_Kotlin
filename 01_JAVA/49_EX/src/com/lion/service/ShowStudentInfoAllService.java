package com.lion.service;

import com.lion.model.StudentClass;

import java.util.ArrayList;

public class ShowStudentInfoAllService {
    // 등록된 학생이 있는지 확인하는 기능
    void checkStudentCount(){

    }
    // 전체 학생의 수를 구하는 기능
    void getStudentCount(){

    }
    // 축구부, 야구부, 농구부 학생들의 수를 구하는 기능
    public int getStudentTypeCount(int type, ArrayList<StudentClass> studentList){
        // 학생수를 담을 변수
        int studentCount = 0;
        // 학생의 수 만큼 반복한다.
        for(StudentClass studentClass : studentList){
            // 현재 학생의 타입이 매개변수로 전달된 타입과 같은지
            if(studentClass.getStudentType() == type){
                // 학생 수를 증가시킨다.
                studentCount++;
            }
        }
        return studentCount;
    }
}