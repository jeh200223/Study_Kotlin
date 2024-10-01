package com.lion.animal;

import java.util.Scanner;

public class AnimalClass {
    int animalType;
    String names;
    Integer ages;

    public AnimalClass(int animalType) {
        this.animalType = animalType;
    }

    public void inputAnimalInfoBase(Scanner scanner){
        System.out.print("이름 : ");
        names = scanner.next();
        System.out.print("나이 : ");
        ages = scanner.nextInt();
    }

    public void showAnimalInfoBase(){
        System.out.printf("이름 : %s\n", names);
        System.out.printf("나이 : %d살\n", ages);
    }

    public void doAction(){

    }
}
