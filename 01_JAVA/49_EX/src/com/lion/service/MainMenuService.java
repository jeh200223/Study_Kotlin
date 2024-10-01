package com.lion.service;

import java.util.Scanner;

public class MainMenuService {
    // 사용자에게 메뉴 번호를 입력받는 기능
    public int inputMainMenuNumber() throws Exception{
        Scanner scanner = new Scanner(System.in);
        int menuNumber = scanner.nextInt();
        return menuNumber;
    }
}