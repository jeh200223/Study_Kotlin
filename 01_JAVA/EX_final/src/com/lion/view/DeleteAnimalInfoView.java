package com.lion.view;

public class DeleteAnimalInfoView extends ViewClass{
    @Override
    public void doshow() {
        System.out.println();
        System.out.println("저장된 동물 정보가 없습니다.");
        System.out.println("삭제할 동물의 이름 : ");
        System.out.println("입력하신 동물은 존재하지 않습니다.");
        System.out.println("묭이의 정보를 삭제하였습니다.");
    }

    public void inputDeleteAnimal() {

    }
}
