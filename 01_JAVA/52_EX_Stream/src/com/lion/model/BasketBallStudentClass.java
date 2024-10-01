package com.lion.model;

import com.lion.util.Values;

import java.util.Scanner;

public class BasketBallStudentClass extends StudentClass{
    // 리바운드 개수
    int reboundCount;

    @Override
    public void inputStudentInfo(Scanner scanner) {
        type = Values.TYPE_BASKETBALL;
        System.out.println();
        System.out.println("농구부 학생 정보 입력");
        super.inputStudentInfo(scanner);
        System.out.print("리바운드 개수 : ");
        reboundCount = scanner.nextInt();
    }

    @Override
    public void showStudentInfo() {
        System.out.println();
        System.out.println("소속 운동부 : 농구부");
        super.showStudentInfo();
        System.out.printf("리바운드 개수 : %d개\n", reboundCount);
    }

    @Override
    public void showAction() {
        System.out.println("농구 선수가 블로킹을 합니다");
    }
}