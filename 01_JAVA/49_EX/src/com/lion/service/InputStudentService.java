package com.lion.service;

import com.lion.model.StudentClass;

import java.util.Scanner;

public class InputStudentService {
    // 운동부 종류 번호를 입력받는 기능
    public int inputStudentTypeNumber(){
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        return type;
    }
}