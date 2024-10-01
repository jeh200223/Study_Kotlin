package com.lion.model;

import java.io.Serializable;
import java.util.Scanner;

public abstract class StudentClass implements Serializable {
    // 소속 운동부 번호
    int type;
    // 학생 이름
    String studentName;
    // 학생 나이
    int studentAge;

    // 학생의 정보를 입력받는 메서드
    public void inputStudentInfo(Scanner scanner){
        System.out.print("이름 : ");
        studentName = scanner.next();
        System.out.print("나이 : ");
        studentAge = scanner.nextInt();
    }
    // 학생의 정보를 출력하는 메서드
    public void showStudentInfo(){
        System.out.printf("이름 : %s\n", studentName);
        System.out.printf("나이 : %d살\n", studentAge);
    }
    // 학생의 특기를 출력하는 메서드
    public abstract void showAction();

    // 학생의 이름을 반환하는 메서드
    public String getStudentName(){
        return studentName;
    }
    // 학생의 타입을 반환하는 메서드
    public int getType(){
        return type;
    }
}