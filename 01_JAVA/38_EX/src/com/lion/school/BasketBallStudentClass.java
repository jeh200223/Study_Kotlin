package com.lion.school;

import java.util.Scanner;

public class BasketBallStudentClass extends StudentClass{

    // 키
    private int height;

    // 생성자
    public BasketBallStudentClass(int studentType){
        // 부모의 생성자를 명시적으로 호출한다.
        super(studentType);
    }

    @Override
    public void inputStudentInfoBase(Scanner scanner) {
        System.out.println();
        System.out.println("농구부 학생 정보 입력");
        // 부모의 메서드를 호출한다.
        super.inputStudentInfoBase(scanner);
        // 나머지 부분을 입력 받는다.
        System.out.print("키: ");
        height = scanner.nextInt();
    }

    @Override
    public void showStudentInfoBase() {
        System.out.println();
        // 부모의 매서드를 호출한다.
        super.showStudentInfoBase();
        // 나머지를 출력한다.
        System.out.printf("키 : %d\n", height);
    }

    @Override
    public void run() {
        System.out.println("농구선수가 달립니다.");
    }

    // 리바운드를 하는 기능
    public void rebound() {
        System.out.println("라바운드 한다");
    }

    @Override
    public void doAction() {
        rebound();
    }
}
