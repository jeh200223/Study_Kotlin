package com.lion.model;

import com.lion.util.Values;

import java.util.Scanner;

public class BaseBallStudentClass extends StudentClass{
    // 홈런 개수
    int homeRunCount;

    public BaseBallStudentClass(){
        studentType = Values.TYPE_BASEBALL;
    }

    // 도루하는 기능
    public void baseSteel(){
        System.out.println("야구부 학생이 도루를 합니다.");
    }

    // 학생 정보를 입력받는 메서드
    @Override
    public void inputStudentInfo() {
        super.inputStudentInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("홈런 개수 :");
        homeRunCount = scanner.nextInt();
    }

    @Override
    public void showStudentInfo() {
        System.out.println();
        System.out.println("야구부 선수 정보");
        super.showStudentInfo();
        System.out.printf("홈런 개수 : %d\n", homeRunCount);
        baseSteel();
    }
}