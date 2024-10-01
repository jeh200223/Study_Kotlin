package com.lion.model;

import java.util.Scanner;

public class StudentClass {
    // 운동부 타입
    int studentType;
    // 이름
    String studentName;
    // 나이
    int studentAge;

    // 학생의 정보를 출력하는 기능
    public void showStudentInfo(){
        System.out.printf("이름 : %s\n", studentName);
        System.out.printf("나이 : %d\n", studentAge);
    }

    // 학생 정보를 입력받는 기능
    public void inputStudentInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("이름 : ");
        studentName = scanner.next();
        System.out.print("나이 : ");
        studentAge = scanner.nextInt();
    }

    // 학생의 이름을 반환하는 메서드
    public String getStudentName(){
        return studentName;
    }

    // 운동부 타입을 반환하는 메서드
    public int getStudentType(){
        return studentType;
    }
}