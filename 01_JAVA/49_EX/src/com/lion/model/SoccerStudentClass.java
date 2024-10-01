package com.lion.model;

import com.lion.util.Values;

import java.util.Scanner;

public class SoccerStudentClass extends StudentClass{
    // 골 넣은 개수
    int goalCount;

    public SoccerStudentClass() {
        studentType = Values.TYPE_SOCCER;
    }

    // 태클하는 기능
    public void takkle(){
        System.out.println("축구선수가 태클을 합니다.");
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
        System.out.println("축구부 선수 정보");
        super.showStudentInfo();
        System.out.printf("골 넣은 개수 : %d\n", goalCount);
        takkle();
    }
}