package com.lion.controller

import com.lion.repository.AnimalReporitory
import com.lion.util.ProgramState
import com.lion.util.ProgramState.*
import com.lion.view.*

class ControllerClass {
    // 프로그램 상태값을 담을 변수
    var programState:ProgramState = STATE_SHOW_MAIN_MENU
    // cycleCount의 값을 가져옵니다.
    // kindMap의 정보를 가져옵니다.
    val kindMap: MutableMap<Int, String> = AnimalReporitory.getAnimalKind()
    // 각 상태별로 출력하는 객체를 담을 변수
    lateinit var viewClass: ViewClass

    // 각 상태별로 분기해서 처리하는 메서드
    // 일단은 반복을 하지 않을 겁니다. 나중에 무한 반복되게 만들어주겠습니다.
    fun doController(){
        var isRunning = true

        while (isRunning){

            viewClass = when(programState){
                // 메인 메뉴를 보여주는 상태
                STATE_SHOW_MAIN_MENU -> ShowMainMenuView(this)
                // 동물 종류를 입력받는 상태
                STATE_INPUT_ANIMAL_KIND -> {
                    InputAnimalKindView(this)
                }
                // 동물 종류를 삭제하는 상태
                STATE_DELETE_ANIMAL_KIND -> DeleteAnimalKindView(this)
                // 동물 정보를 입력하는 상태
                STATE_INPUT_ANIMAL_INFO -> InputAnimalInfoView(this)
                // 동물 전체를 보는 상태
                STATE_SHOW_ANIMAL_INFO_ALL -> ShowAnimalAllView(this)
                // 동물 정보를 검색하는 상태
                STATE_SEARCH_ANIMAL_NAME -> SearchAnimalByNameView(this)
                // 동물 정보를 삭제하는 상태
                STATE_DELETE_ANIMAL_INFO -> DeleteAnimalInfoView(this)
                // 프로그램을 종료하는 상태
                STATE_EXIT_PROGRAM -> ExitProgramView()
            }
            // ViewClass의 show 메서드를 호출해준다.
            viewClass.show()
        }
    }
}