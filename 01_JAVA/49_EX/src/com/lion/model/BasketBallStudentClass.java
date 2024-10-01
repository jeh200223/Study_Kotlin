package com.lion.model;

import com.lion.util.Values;

import java.util.Scanner;

public class BasketBallStudentClass extends StudentClass{
    // 골 넣은 개수
    int goalCount;

    public BasketBallStudentClass() {
        studentType = Values.TYPE_BASKETBALL;
    }

    // 리바운드하는 기능
    public void rebound(){
        System.out.println("농구부 학생이 리바운드를 합니다.");
    }

    @Override
    public void inputStudentInfo() {
        super.inputStudentInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("골 넣은 개수 :");
        goalCount = scanner.nextInt();
    }

    @Override
    public void showStudentInfo() {
        System.out.println();
        System.out.println("농구부 선수 정보");
        super.showStudentInfo();
        System.out.printf("골 넣은 개수 : %d\n", goalCount);
        rebound();
    }
}