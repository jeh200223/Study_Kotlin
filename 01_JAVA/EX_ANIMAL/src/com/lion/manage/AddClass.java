package com.lion.manage;

import com.lion.animal.AnimalClass;
import com.lion.animal.BirdClass;
import com.lion.animal.CatClass;
import com.lion.animal.DogClass;
import com.lion.values.AnimalValues;

import java.util.ArrayList;
import java.util.Scanner;

public class AddClass extends MenuClass{
    int animalType;
    ArrayList<AnimalClass> arrayList = new ArrayList<>();

    public void inputAnimalType(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("동물 종류를 선택해주세요.");
        System.out.println("1. 강아지");
        System.out.println("2. 고양이");
        System.out.println("3. 앵무새");

        System.out.print("동물 종류 선택 : ");

        animalType = scanner.nextInt();

        AnimalClass animalClass = null;

        switch (animalType) {
            case AnimalValues.TYPE_DOG:
                animalClass = new DogClass(AnimalValues.TYPE_DOG);
                break;
            case AnimalValues.TYPE_CAT:
                animalClass = new CatClass(AnimalValues.TYPE_CAT);
                break;
            case AnimalValues.TYPE_BIRD:
                animalClass = new BirdClass(AnimalValues.TYPE_BIRD);
                break;
        }

        animalClass.inputAnimalInfoBase(scanner);
        arrayList.add(animalClass);
    }
}
