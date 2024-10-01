package com.lion.animal;

import java.util.Scanner;

public class DogClass extends AnimalClass{
    Integer Counts;

    public DogClass(int animalType) {
        super(animalType);
    }

    @Override
    public void inputAnimalInfoBase(Scanner scanner) {
        super.inputAnimalInfoBase(scanner);
        System.out.print("개인기 개수 : ");
        Counts = scanner.nextInt();
    }

    @Override
    public void showAnimalInfoBase() {
        super.showAnimalInfoBase();
        System.out.printf("개인기 개수 : %d개\n", Counts);
    }

    @Override
    public void doAction() {
        run();
    }

    public void run () {
        System.out.println("강아지가 달립니다.");
    }
}
