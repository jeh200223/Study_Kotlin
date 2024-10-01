package com.lion.model;

import com.lion.util.Values;

import java.util.Scanner;

public class BaseBallStudentClass extends StudentClass{
    // 홈런 친 개수
    int homeRunCount;

    // 학생 정보를 입력받는 메서드
    @Override
    public void inputStudentInfo(Scanner scanner) {
        type = Values.TYPE_BASEBALL;
        System.out.println();
        System.out.println("야구부 학생 정보 입력");
        super.inputStudentInfo(scanner);
        System.out.print("홈런 친 개수 : ");
        homeRunCount = scanner.nextInt();
    }

    @Override
    public void showStudentInfo() {
        System.out.println();
        System.out.println("소속 운동부 : 야구부");
        super.showStudentInfo();
        System.out.printf("홈런 친 개수 : %d개\n", homeRunCount);
    }

    @Override
    public void showAction() {
        System.out.println("야구 선수가 도루를 합니다");
    }
}