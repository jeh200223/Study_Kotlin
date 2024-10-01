package com.lion.view;

public class SearchAnimalView extends ViewClass{
    @Override
    public void doshow() {
        System.out.println();
        System.out.println("저장된 동물 정보가 없습니다.");
        System.out.println("검색할 동물의 이름 : ");

        System.out.println();
        System.out.println("이름 : 묭이");
        System.out.println("나이 : 5");
        System.out.println("개인기 개수 : 10개");
        System.out.println("강아지가 달립니다.");

        System.out.println();
        System.out.println("이름 : 가루");
        System.out.println("나이 : 4");
        System.out.println("수염의 개수 : 5개");
        System.out.println("고양이가 벽을 탑니다.");

        System.out.println();
        System.out.println("이름 : 단어");
        System.out.println("나이 : 5");
        System.out.println("단어의 개수 : 10개");
        System.out.println("앵무새가 말을 합니다.");
    }

    public void inputAnimalName() {

    }

    public void showSearchAnimalInfo() {

    }
}
