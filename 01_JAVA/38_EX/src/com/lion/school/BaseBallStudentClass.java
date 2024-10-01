package com.lion.school;

import java.util.Scanner;

public class BaseBallStudentClass extends StudentClass{

    // 안타 개수
    private int HitCount;

    // 생성자
    public BaseBallStudentClass(int studentType){
        // 부모의 생성자를 명시적으로 호출한다.
        super(studentType);
    }

    // 학생정보를 입력받는 메서드
    // 부모의 메서드를 재구현한다.
    @Override
    public void inputStudentInfoBase(Scanner scanner) {
        System.out.println();
        System.out.println("축구부 학생 정보 입력");
        // 부모의 메서드를 호출한다.
        super.inputStudentInfoBase(scanner);
        // 나머지 부분을 입력 받는다.
        System.out.print("안타 개수 : ");
        HitCount = scanner.nextInt();
    }

    // 학생 정보를 출력하는 메서드
    // 부모의 메서드를 재구현한다.
    @Override
    public void showStudentInfoBase() {
        System.out.println();
        // 부모의 매서드를 호출한다.
        super.showStudentInfoBase();
        // 나머지를 출력한다.
        System.out.printf("안타 개수 : %d\n", HitCount);
    }

    @Override
    public void run() {
        System.out.println("야구선수가 달립니다.");
    }

    // 공을 치는 기능
    public void HitBall(){
        System.out.println("안타를 친다");
    }

    // 기타 행동을 하는 메서드
    // 부모의 메서드를 재구현 한다.
    @Override
    public void doAction() {
        HitBall();
    }
}
