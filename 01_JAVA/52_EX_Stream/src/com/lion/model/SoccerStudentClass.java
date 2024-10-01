package com.lion.model;

import com.lion.util.Values;

import java.util.Scanner;

public class SoccerStudentClass extends StudentClass{
    // 골 넣은 개수
    int goalCount;

    @Override
    public void inputStudentInfo(Scanner scanner) {
        type = Values.TYPE_SOCCER;
        System.out.println();
        System.out.println("축구부 학생 정보 입력");
        super.inputStudentInfo(scanner);
        System.out.print("골 넣은 개수 : ");
        goalCount = scanner.nextInt();
    }

    @Override
    public void showStudentInfo() {
        System.out.println();
        System.out.println("소속 운동부 : 축구부");
        super.showStudentInfo();
        System.out.printf("골 넣은 개수 : %d골\n", goalCount);
    }

    @Override
    public void showAction() {
        System.out.println("축구 선수가 태클을 합니다");
    }
}