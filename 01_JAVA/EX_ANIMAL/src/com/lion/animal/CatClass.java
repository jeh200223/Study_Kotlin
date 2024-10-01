package com.lion.animal;

import java.util.Scanner;

public class CatClass extends AnimalClass{
    Integer beardCount;
    public CatClass(int animalType) {
        super(animalType);
    }

    @Override
    public void inputAnimalInfoBase(Scanner scanner) {
        super.inputAnimalInfoBase(scanner);
        System.out.print("수염의 개수 : ");
        beardCount = scanner.nextInt();
    }

    @Override
    public void showAnimalInfoBase() {
        super.showAnimalInfoBase();
        System.out.printf("수염의 개수 : %d개\n", beardCount);
    }

    @Override
    public void doAction() {
        climb();
    }

    public void climb() {
        System.out.println("고양이가 벽을 탑니다.");
    }
}
