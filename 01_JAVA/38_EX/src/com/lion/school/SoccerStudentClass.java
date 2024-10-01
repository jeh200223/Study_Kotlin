package com.lion.school;

import java.util.Scanner;

public class SoccerStudentClass extends StudentClass{

    // 골 넣은 횟수
    private int goalCount;

    // 생성자
    public SoccerStudentClass(int studentType){
        // 부모의 생성자를 명시적으로 호출한다.
        super(studentType);
    }

    public void inputStudentInfoBase(Scanner scanner) {
        System.out.println();
        System.out.println("축구부 학생 정보 입력");
        // 부모의 메서드를 호출한다.
        super.inputStudentInfoBase(scanner);
        // 나머지 부분을 입력 받는다.
        System.out.print("넣은 골 개수 : ");
        goalCount = scanner.nextInt();
    }

    @Override
    public void showStudentInfoBase() {
        System.out.println();
        // 부모의 매서드를 호출한다.
        super.showStudentInfoBase();
        // 나머지를 출력한다.
        System.out.printf("넣은 골 개수 : %d\n", goalCount);
    }

    @Override
    public void run() {
        System.out.println("축구선수가 달립니다.");
    }

    // 태클하는 메서드
    public void takkle(){
        System.out.println("태클 한다");
    }

    @Override
    public void doAction() {
        takkle();
    }
}
