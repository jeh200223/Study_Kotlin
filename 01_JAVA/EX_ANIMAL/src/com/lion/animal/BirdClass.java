package com.lion.animal;

import java.util.Scanner;

public class BirdClass extends AnimalClass{
    Integer wordCount;
    public BirdClass(int animalType) {
        super(animalType);
    }

    @Override
    public void inputAnimalInfoBase(Scanner scanner) {
        super.inputAnimalInfoBase(scanner);
        System.out.print("단어의 개수 : ");
        wordCount = scanner.nextInt();
    }

    @Override
    public void showAnimalInfoBase() {
        super.showAnimalInfoBase();
        System.out.printf("단어의 개수 : %d개\n", wordCount);
    }

    @Override
    public void doAction() {
        fly();
    }

    public void fly () {
        System.out.println("앵무새가 하늘을 납니다.");
    }
}
