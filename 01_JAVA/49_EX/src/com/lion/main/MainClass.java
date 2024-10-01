package com.lion.main;

import com.lion.controller.ControllerClass;

public class MainClass {
    public static void main(String[] args) {
        // Controller의 객체를 생성한다.
        ControllerClass controllerClass = new ControllerClass();
        controllerClass.runController();
    }
}
