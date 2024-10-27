# 학생정보 관리 프로그램

### 메인 메뉴

메뉴를 선택해주세요
1. 학생 정보 입력
2. 학생 이름으로 검색
3. 학생 정보 전체 보기
4. 학생 정보 삭제 하기
5. 프로그램 종료
   메뉴 입력 :

### 학생 정보 입력
- 메인 메뉴에서 1번 메뉴를 선택했을 때

소속 운동부를 선택해주세요
1. 축구부
2. 야구부
3. 농구부
   소속 운동부 :

- 축구부를 선택했다면
  축구부 학생 정보를 입력해주세요
  이름 :
  나이 :
  골 넣은 개수 :

- 야구부를 선택했다면
  야구부 학생 정보를 입력해주세요
  이름 :
  나이 :
  홈런 개수 :

- 농구부를 선택했다면
  농구부 학생 정보를 입력해주세요
  이름 :
  나이 :
  리바운드 개수 :

입력이 완료되면 메인 메뉴를 보여준다.

### 학생 이름으로 검색
- 메인 메뉴에서 학생 이름으로 검색을 선택했을 경우

- 만약 등록된 학생 정보가 없다면

등록된 학생 정보가 없습니다.

- 를 출력하고 메인 메뉴를 보여준다.

- 만약 등록된 학생 정보가 있다면
  검색할 학생의 이름을 입력해주세요 :

- 입력한 학생의 정보가 없다면
  입력한 학생의 정보가 없습니다

- 를 보여주고 메윤 메뉴를 보여준다.

- 입력한 학생의 정보가 있다면 학생의 정보를 출력해준다.
- 축구부라면
  축구부 학생의 정보
  이름 : 0000
  나이 : 000살
  골 넣은 개수 : 000개
  축구부 학생이 달립니다
  축구부 학생이 태클을 합니다

- 야구부라면
  야구부 학생의 정보
  이름 : 0000
  나이 : 000살
  홈런 개수 : 000개
  야구부 학생이 달립니다
  야구부 학생이 도루를 합니다.

- 농구부라면
  농구부 학생의 정보
  이름 : 0000
  나이 : 000살
  리바운드 개수 : 000개
  농구부 학생이 달립니다
  농구부 학생이 3점 슛을 쏩니다

- 검색된 학생의 정보를 출력하고 메인 메뉴를 보여준다.

### 학생 정보 전체 보기
- 메인 메뉴에서 학생 정보 전체 보기 메뉴를 선택했을 때
- 만약 등록되어 있는 학생의 정보가 없다면
  등록된 학생 정보가 없습니다.
- 를 출력한다.

- 만약 등록되어 있는 학생의 정보가 있다면
- 모든 학생들의 정보를 출력한다.
- 축구부라면
  축구부 학생의 정보
  이름 : 0000
  나이 : 000살
  골 넣은 개수 : 000개
  축구부 학생이 달립니다
  축구부 학생이 태클을 합니다

- 야구부라면
  야구부 학생의 정보
  이름 : 0000
  나이 : 000살
  홈런 개수 : 000개
  야구부 학생이 달립니다
  야구부 학생이 도루를 합니다.

- 농구부라면
  농구부 학생의 정보
  이름 : 0000
  나이 : 000살
  리바운드 개수 : 000개
  농구부 학생이 달립니다
  농구부 학생이 3점 슛을 쏩니다

- 모든 학생의 정보를 출력한 후 다음 정보를 출력한다.
  전체 학생의 수 : 00명
  축구부 학생의 수 : 00명
  야구부 학생의 수 : 00명
  농구부 학생의 수 : 00명
  축구부 학생들이 넣은 골의 총 합 : 000개
  야구부 학생들이 친 홈런의 총 합 : 000개
  농구부 학생들이 한 리바운드의 총 합 : 000개

- 학생들의 정보를 출력한 후 메인 메뉴를 보여준다.

### 학생 정보 삭제 하기
- 메인 메뉴에서 "학생 정보 삭제 하기" 를 선택한 경우
- 등록한 학생의 정보가 없다면
  등록된 학생 정보가 없습니다.
- 를 출력한다.
- 등록한 학생의 정보가 있다면
  삭제할 학생의 이름을 입력해주세요 :
- 를 출력하고 학생 이름을 입력받는다.
- 만약 입력한 학생이 없을 경우
  입력한 학생은 없습니다
- 를 출력하고 메인 메뉴를 보여준다
- 만약 입력한 학생이 없을 경우
  000학생의 정보를 삭제하였습니다
- 를 보여주고 메인 메뉴를 보여준다.

### 프로그램 종료
- 메인 메뉴에서 "프로그램 종료" 를 선택하면
  프로그램을 종료합니다
- 를 출력하고 프로그램을 종료한다.

-------------------------------------------------

실습 팀별로 디스코드의 팀 실습방에 모여서 작업을 해주세요
프로그램의 패키지 구조, 상속 관계, 클래스가 가지는 맴버들 등등을
논의하셔서 각자 구현해주시면 됩니다.

데이터는 파일에 저장을 한다.
자바 52번 예제를 참고해서 작업해주시되 코틀린의 문법을 적극적으로 활용해주시기 바랍니다

실습팀장을 뽑아주세요~ 희망자가 없다면 사다리타세요~

오늘 하루종일 작업을 진행해주세요~

만약 모두 끝났다고 한다면 팀별 코틀린 프로젝트때 무엇을 할건지 주제를 정해주세요~

---

### 패키지를 만들어준다.
- com.lion.main
- com.lion.controller
- com.lion.view
- com.lion.model
- com.lion.util

---

### 프로그램의 상태를 정의
- 메인 메뉴 상태
- 학생 정보 입력 상태
- 학생 이름으로 검색하는 상태
- 학생 정보 전체 보기
- 학생 정보 삭제 하기
- 프로그램 종료

---

# 클래스 설계를 위한 요소 선별
1. 메인 메뉴
- 사용자가 입력하는 메인 메뉴의 번호

2. 학생 정보 입력
- 사용자가 입력하는 학생의 소속 운동부 번호
- 학생의 이름
- 학생의 나이
- 골 넣은 개수
- 홈런 친 개수
- 리바운드 개수

3. 학생 정보 검색
- 사용자가 입력한 학생의 이름
- 소속 운동부
- 학생의 이름
- 학생의 나이
- 골 넣은 개수
- 홈런 친 개수
- 리바운드 개수

4. 학생 정보 전체 보기
- 총 학생 수
- 소속 운동부
- 학생의 이름
- 학생의 나이
- 골 넣은 개수
- 홈런 친 개수
- 리바운드 개수
- 전체 학생의 수
- 축구부 학생 수
- 야구부 학생 수
- 농구부 학생 수
- 축구부 학생들이 넣은 골의 총 합
- 야구부 학생들이 친 홈런의 총 합
- 농구부 학생들이 한 리바운드의 총 합

5. 학생 정보 삭제
- 사용자가 입력한 삭제할 학생 이름

### 각 상태별로 필요한 기능
1. 메인 메뉴
- 메뉴 번호를 입력받는 기능

2. 학생 정보 입력
- 소속 운동부 번호를 입력받는 기능
- 학생 정보를 입력받는 기능
- 학생 정보 저장

3. 학생 정보 검색
- 저장된 학생 정보가 있는지 확인하는 기능
- 학생 이름을 입력받는 기능
- 이름을 통해 학생 정보를 검색하는 기능
- 검색된 학생의 정보를 출력하는 기능
- 축구부 특기를 출력하는 기능
- 야구부 특기를 출력하는 기능
- 농구부 특기를 출력하는 기능

4. 학생 정보 전체 보기
- 저장된 학생 정보가 있는지 확인하는 기능
- 총 학생수를 구하는 기능
- 전체 학생 정보를 가져오는 기능
- 전체 학생 정보를 출력하는 기능
- 각 운동부별 학생 수를 구하는 기능
- 각 운동부별 학생 수를 출력하는 기능
- 각 운동부별 모두 넣은 골을 구하는 기능
- 각 운동부별 모두 넣은 골을 출력하는 기능
- 축구부 특기를 출력하는 기능
- 야구부 특기를 출력하는 기능
- 농구부 특기를 출력하는 기능

5. 학생 정보 삭제
- 저장된 학생 정보가 있는지 확인하는 기능
- 삭제할 학생 이름을 입력받는 기능
- 입력한 학생이 있는지 검사하는 기능
- 입력한 학생의 정보를 삭제하는 기능

### 뽑아낸 데이터를 선별
1. 메인 메뉴
- 사용자가 입력하는 메인 메뉴의 번호

2. 학생 정보 입력
- 사용자가 입력하는 학생의 소속 운동부 번호 -> 축구부, 야구부, 농구부
- 학생의 이름 -> 축구부, 야구부, 농구부
- 학생의 나이 -> 축구부, 야구부, 농구부
- 골 넣은 개수 -> 축구부
- 홈런 친 개수 -> 야구부
- 리바운드 개수 -> 농구부

3. 학생 정보 검색
- 사용자가 입력한 학생의 이름
- 소속 운동부 -> 축구부, 야구부, 농구부
- 학생의 이름 -> 축구부, 야구부, 농구부
- 학생의 나이 -> 축구부, 야구부, 농구부
- 골 넣은 개수 -> 축구부
- 홈런 친 개수 -> 야구부
- 리바운드 개수 -> 농구부

4. 학생 정보 전체 보기
- 총 학생 수
- 소속 운동부 -> 축구부, 야구부, 농구부
- 학생의 이름 -> 축구부, 야구부, 농구부
- 학생의 나이 -> 축구부, 야구부, 농구부
- 골 넣은 개수 -> 축구부
- 홈런 친 개수 -> 야구부
- 리바운드 개수 -> 농구부
- 축구부 학생 수
- 야구부 학생 수
- 농구부 학생 수
- 축구부 학생들이 넣은 골의 총 합
- 야구부 학생들이 친 홈런의 총 합
- 농구부 학생들이 한 리바운드의 총 합

5. 학생 정보 삭제
- 사용자가 입력한 삭제할 학생 이름

### 뽑아낸 기능 선별
1. 메인 메뉴
- 메뉴 번호를 입력받는 기능 -> View

2. 학생 정보 입력
- 소속 운동부 번호를 입력받는 기능 -> View
- 학생 정보를 입력받는 기능 -> View
- 학생 정보 저장 -> Repository

3. 학생 정보 검색
- 저장된 학생 정보가 있는지 확인하는 기능 -> Repository
- 학생 이름을 입력받는 기능 -> View
- 이름을 통해 학생 정보를 검색하는 기능 -> Repository
- 검색된 학생의 정보를 출력하는 기능 -> View
- 축구부 특기를 출력하는 기능 -> 축구부
- 야구부 특기를 출력하는 기능 -> 야구부
- 농구부 특기를 출력하는 기능 -> 농구부

4. 학생 정보 전체 보기
- 저장된 학생 정보가 있는지 확인하는 기능 -> Repository
- 총 학생수를 구하는 기능 -> Repository
- 전체 학생 정보를 가져오는 기능 -> Repository
- 전체 학생 정보를 출력하는 기능 -> View
- 각 운동부별 학생 수를 구하는 기능 -> Repository
- 각 운동부별 학생 수를 출력하는 기능 -> View
- 축구부 특기를 출력하는 기능 -> 축구부
- 야구부 특기를 출력하는 기능 -> 야구부
- 농구부 특기를 출력하는 기능 -> 농구부
- 각 운동부별 모두 넣은 골을 구하는 기능 -> Repository
- 각 운동부별 모두 넣은 골을 출력하는 기능 -> View

5. 학생 정보 삭제
- 저장된 학생 정보가 있는지 확인하는 기능 -> Repository
- 삭제할 학생 이름을 입력받는 기능 -> View
- 입력한 학생이 있는지 검사하는 기능 -> Repository
- 입력한 학생의 정보를 삭제하는 기능 -> Repository

### main 패키지에 Main.kt 파일을 만들어준다

```kt
package com.lion.main

fun main(){

}
```

### controller 패키지에 ControllerClass를 만들어준다.
- Controller는 프로그램의 각 상태에 맞는 메서드를 호출하는 역할을 수행해준다.

---

### com.lion.util 패키지를 만들어주고 Values.kt 파일을 만들어준다.

---

### Values.kt 파일에 ProgramState enum class를 만들어주고 각 상태를 의미하는 값을 정의한다.

```kt
enum class ProgramState(var number:Int, var str:String) {
    // 메인메뉴를 보여주는 상태
    STATE_SHOW_MAIN_MENU(1, "메인메뉴"),
    // 학생 정보를 입력하는 상태
    STATE_INPUT_STUDENT_INFO(2, "학생 정보 입력"),
    // 학생 검색을 하는 상태
    STATE_SEARCH_STUDENT_INFO(3, "학생 검색"),
    // 학생 정보 전체를 보여주는 상태
    STATE_SHOW_STUDENT_INFO_ALL(4, "학생 정보 전체 보기"),
    // 학생 정보 삭제를 하는 상태
    STATE_DELETE_STUDENT_INFO(5, "학생 정보 삭제"),
    // 프로그램 종료 상태
    STATE_EXIT_PROGRAM(6, "프로그램 종료")
}
```

---

### Controller에 각 상태별로 분기하는 코드를 작성한다.

```kt
package com.lion.controller

import com.lion.util.ProgramState
import com.lion.util.ProgramState.*

class ControllerClass {
    // 프로그램의 상태값을 담을 변수
    var programState:ProgramState = STATE_SHOW_MAIN_MENU

    // 각 상태별로 분기해서 처리하는 메서드
    // 일단은 반복을 하지 않을 겁니다. 나중에 무한 반복되게 만들어주겠습니다.
    fun runController(){
        var isRunning = true

        while(isRunning){

            isRunning = false

            when(programState){
                // 메인 메뉴를 보여주는 상태
                STATE_SHOW_MAIN_MENU -> {}
                // 학생 정보를 입력받는 상태
                STATE_INPUT_STUDENT_INFO -> {}
                // 학생 정보를 검색하는 생태
                STATE_SEARCH_STUDENT_INFO -> {}
                // 학생 정보 전체를 보는 상태
                STATE_SHOW_STUDENT_INFO_ALL -> {}
                // 학생 정보를 삭제하는 상태
                STATE_DELETE_STUDENT_INFO -> {}
                // 프로그램을 종료하는 상태
                STATE_EXIT_PROGRAM -> {}
            }
        }
    }
}
```

---

### Main.kt의 main 함수에서 Controller 객체를 생성하고 runController 메서드를 호출해준다.

```kt
package com.lion.main

import com.lion.controller.ControllerClass

fun main(){
    val controllerClass = ControllerClass()
    controllerClass.runController()
}
```

---

### view 패키지에 다른 클래스들이 상속을 받기 위한 ViewClass를 만들어준다.

```kt

package com.lion.view

abstract class ViewClass {

    abstract fun show()
}

```

---

### Controller 클래스에서 각 상태별 생성하는 객체를 담을 변수를 선언해준다.
```kt
    // 각 상태별로 출력하는 객체를 담을 변수
    lateinit var viewClass:ViewClass
```

### Contorller 클래스에서 각 상태별로 분기하는 부분을 변수에 담는 코드로 변경한다.

```kt
            viewClass = when(programState){
                // 메인 메뉴를 보여주는 상태
                STATE_SHOW_MAIN_MENU -> {}
                // 학생 정보를 입력받는 상태
                STATE_INPUT_STUDENT_INFO -> {}
                // 학생 정보를 검색하는 생태
                STATE_SEARCH_STUDENT_INFO -> {}
                // 학생 정보 전체를 보는 상태
                STATE_SHOW_STUDENT_INFO_ALL -> {}
                // 학생 정보를 삭제하는 상태
                STATE_DELETE_STUDENT_INFO -> {}
                // 프로그램을 종료하는 상태
                STATE_EXIT_PROGRAM -> {}
            }
```

---

# 각 상태별로 출력하는 부분 구현하기

### view 패키지에 ShowMainMenuView 클래스를 만들고 출력하는 부분을 구현해준다.
```kt
class ShowMainMenuView : ViewClass() {
    override fun show() {
        println()
        println("메뉴를 선택해주세요")
        println("1. 학생 정보 입력")
        println("2. 학생 이름으로 검색")
        println("3. 학생 정보 전체 보기")
        println("4. 학생 정보 삭제 하기")
        println("5. 프로그램 종료")
        println("메뉴 입력 :")
    }
}
```

### Controller에서 객체를 생성해 반환한다.
- 일단 오류를 없애기 위해 모든 상태에서 ShowMainMenuView 객체를 생성해 반환하는 것으로 해둔다.

```kt
            viewClass = when(programState){
                // 메인 메뉴를 보여주는 상태
                STATE_SHOW_MAIN_MENU -> {
                    // 메인메뉴를 보여주기 위한 클래스의 객체를 생성해서 반환한다.
                    ShowMainMenuView()
                }
                // 학생 정보를 입력받는 상태
                STATE_INPUT_STUDENT_INFO -> {
                    ShowMainMenuView()
                }
                // 학생 정보를 검색하는 생태
                STATE_SEARCH_STUDENT_INFO -> {
                    ShowMainMenuView()
                }
                // 학생 정보 전체를 보는 상태
                STATE_SHOW_STUDENT_INFO_ALL -> {
                    ShowMainMenuView()
                }
                // 학생 정보를 삭제하는 상태
                STATE_DELETE_STUDENT_INFO -> {
                    ShowMainMenuView()
                }
                // 프로그램을 종료하는 상태
                STATE_EXIT_PROGRAM -> {
                    ShowMainMenuView()
                }
            }
```

### Controller의 분기 부분 밖에서 show 메서드를 호출해준다.
```kt
            
            // ViewClass의 show 메서드를 호출해준다.
            viewClass.show()
```

### 프로그램 상태값을 학생정보입력 상태로 설정한다.
```kt
    var programState:ProgramState = STATE_INPUT_STUDENT_INFO
```
### view 패키지에 InputStudentInfoView 클래스를 만들어준다.

### InputStudentInfoView 에 출력하는 부분을 구현한다.

```kt
package com.lion.view

class InputStudentInfoView : ViewClass() {
    override fun show() {
        println()
        println("소속 운동부를 선택해주세요")
        println("1. 축구부")
        println("2. 야구부")
        println("3. 농구부")
        println("소속 운동부 : ")

        println()
        println("축구부 학생 정보를 입력해주세요")
        println("이름 : ")
        println("나이 : ")
        println("골 넣은 개수 : ")

        println()
        println("야구부 학생 정보를 입력해주세요")
        println("이름 : ")
        println("나이 : ")
        println("홈런 개수 : ")

        println()
        println("농구부 학생 정보를 입력해주세요")
        println("이름 : ")
        println("나이 : ")
        println("리바운드 개수 : ")
    }
}
```

### 컨트롤러에서 학생 정보 입력상태일때 객체 생성해서 반환하는 부분을 수정한다.
```kt
                // 학생 정보를 입력받는 상태
                STATE_INPUT_STUDENT_INFO -> {
                    // 학생 정보를 입력 받기 위한 객체를 생성하여 반환한다.
                    InputStudentInfoView()
                }
```

### 학생 정보 검색 상태를 위한 SearchStudentInfoView 클래스를 view 패키지에 만들어준다.

### SearchStudentInfoView 클래스를 구현해준다.

```kt
package com.lion.view

class SearchStudentInfoView : ViewClass() {
    override fun show() {
        println()
        println("등록된 학생 정보가 없습니다.")

        println()
        println("검색할 학생의 이름을 입력해주세요 : ")

        println()
        println("입력한 학생의 정보가 없습니다")

        println()
        println("축구부 학생의 정보")
        println("이름 : 0000")
        println("나이 : 000살")
        println("골 넣은 개수 : 000개")
        println("축구부 학생이 달립니다")
        println("축구부 학생이 태클을 합니다")

        println()
        println("야구부 학생의 정보")
        println("이름 : 0000")
        println("나이 : 000살")
        println("홈런 개수 : 000개")
        println("야구부 학생이 달립니다")
        println("야구부 학생이 도루를 합니다")

        println()
        println("농구부 학생의 정보")
        println("이름 : 0000")
        println("나이 : 000살")
        println("리바운드 개수 : 000개")
        println("농구부 학생이 달립니다")
        println("농구부 학생이 3점 슛을 쏩니다")
    }
}
```

### Controller에서 프로그램의 상태를 변경해준다.
```kt
    // 프로그램의 상태값을 담을 변수
    var programState:ProgramState = STATE_SEARCH_STUDENT_INFO
```

### Controller에 객체를 생성해서 반환하는 부분을 구현해준다.
```kt
                // 학생 정보를 검색하는 생태
                STATE_SEARCH_STUDENT_INFO -> {
                    // 학생 정보 검색을 위한 객체를 생성하여 반환한다.
                    SearchStudentInfoView()
                }
```

### view 패키지에 학생정보 전체보기를 위한 ShowStudentInfoAllView 클래스를 만들어준다.

### ShowSutdentInfoAll 코드를 구현한다.
```kt
package com.lion.view

class ShowStudentInfoAllView : ViewClass() {
    override fun show() {
        println()
        println("등록된 학생 정보가 없습니다")

        println()
        println("축구부 학생의 정보")
        println("이름 : 0000")
        println("나이 : 000살")
        println("골 넣은 개수 : 000개")
        println("축구부 학생이 달립니다")
        println("축구부 학생이 태클을 합니다")

        println()
        println("야구부 학생의 정보")
        println("이름 : 0000")
        println("나이 : 000살")
        println("홈런 개수 : 000개")
        println("야구부 학생이 달립니다")
        println("야구부 학생이 도루를 합니다")

        println()
        println("농구부 학생의 정보")
        println("이름 : 0000")
        println("나이 : 000살")
        println("리바운드 개수 : 000개")
        println("농구부 학생이 달립니다")
        println("농구부 학생이 3점 슛을 쏩니다")

        println()
        println("전체 학생의 수 : 00명")
        println("축구부 학생의 수 : 00명")
        println("야구부 학생의 수 : 00명")
        println("농구부 학생의 수 : 00명")
        println("축구부 학생들이 넣은 골의 총 합 : 000개")
        println("야구부 학생들이 친 홈런의 총 합 : 000개")
        println("농구부 학생들이 한 리바운드의 총 합 : 000개")

    }
}
```

### Controller에서 프로그램의 상태를 변경한다.
```kt
    // 프로그램의 상태값을 담을 변수
    var programState:ProgramState = STATE_SHOW_STUDENT_INFO_ALL
```

### Controller에서 학생 정보 전체 보기 상태에서 객체를 생성하는 부분을 구현해준다.
```kt
                // 학생 정보 전체를 보는 상태
                STATE_SHOW_STUDENT_INFO_ALL -> {
                    // 학생 정보 전체를 보기 위한 객체를 생성하여 반환한다.
                    ShowStudentInfoAllView()
                }
```

### view 패키지에 학생 정보 삭제 상태를 위한 DeleteStudentInfoView 클래스를 만들어준다.

### DeleteStudentInfoView 클래스를 구현해준다.
```kt
package com.lion.view

class DeleteStudentInfoView : ViewClass() {
    override fun show() {

        println()
        println("등록된 학생 정보가 없습니다")

        println()
        println("삭제할 학생의 이름을 입력해주세요 : ")

        println()
        println("입력한 학생은 없습니다")

        println()
        println("000학생의 정보를 삭제하였습니다")
    }
}
```

### Controller 클래스에서 프로그램의 상태를 변경해준다.
```kt
    // 프로그램의 상태값을 담을 변수
    var programState:ProgramState = STATE_DELETE_STUDENT_INFO
```

### Controller에서 학생 정보 삭제 상태일때를 위한 객체를 생성해 반환한다.
```kt
                // 학생 정보를 삭제하는 상태
                STATE_DELETE_STUDENT_INFO -> {
                    // 학생 정보를 삭제하기 위한 객체를 생성하여 반환한다.
                    DeleteStudentInfoView()
                }
```

### view 패키지에 프로그램 종료 상태를 위한 ExitProgramView 클래스를 만들어준다.

### ExitProgramView 를 구현해준다.
```kt
package com.lion.view

class ExitProgramView : ViewClass() {
    override fun show() {
        println()
        println("프로그램을 종료합니다")
    }
}
```

### Controller 에서 프로그램의 상태를 변경해준다.
```kt
    // 프로그램의 상태값을 담을 변수
    var programState:ProgramState = STATE_EXIT_PROGRAM
```

### Controller에서 종료 상태일때의 객체를 생성해 반환한다.
```kt
                // 프로그램을 종료하는 상태
                STATE_EXIT_PROGRAM -> {
                    // 프로그램 종료를 위한 객체를 생성하여 반환한다
                    ExitProgramView()
                }
```

---

# 각 화면별 필요한 데이터와 기능을 선별한다.

### 각 화면별 데이터를 뽑아낸다.

- 메인 메뉴
- 사용자가 입력하는 메뉴 번호

- 학생정보 입력
- 사용자가 입력하는 운동부 번호
- 학생의 이름
- 학생의 나이
- 골 넣은 개수
- 홈런 개수
- 리바운드 개수

- 학생정보 검색
- 학생 정보가 등록되어 있는지 확인하는 값
- 사용자가 입력하는 학생의 이름
- 운동부를 구분하는 값
- 학생의 이름
- 학생의 나이
- 골 넣은 개수
- 홈런 개수
- 리바운드 개수

- 전제 학생 정보 보기
- 등록된 학생이 있는지 확인하는 값
- 운동부를 구분하는 값
- 학생 이름
- 학생 나이
- 골 넣은 개수
- 홈런 개수
- 리바운드 개수
- 전체 학생 수
- 축구부 학생의 수
- 야구부 학생의 수
- 농구부 학생의 수
- 골의 총합
- 홈런의 총합
- 리바운드의 총합

- 학생 정보 삭제
- 등록된 학생이 있는지 여부 값
- 삭제할 학생의 이름
- 학생의 이름

### 각 화면별 기능을 뽑아낸다.
- 메인 메뉴
- 사용자에게 입력받는 기능
- 사용자가 입력한 메뉴 번호에 따라 상태를 변경시키는 기능

- 학생정보 입력
- 운동부를 선택하기 위한 화면을 출력
- 소속 운동부를 입력받는 기능
- 축구부 학생의 정보를 입력받는 기능
- 야구부 학생의 정보를 입력받는 기능
- 농구부 학생의 정보를 입력받는 기능

- 학생정보를 검색
- 등록된 학생 정보가 있는지 확인하는 기능
- 학생 이름을 입력받는 기능
- 입력한 학생 정보가 있는지 확인하는 기능
- 축구부 학생 정보를 출력하는 기능
- 축구부 학생이 달리는 기능
- 축구부 학생이 태클하는 기능
- 야구부 학생 정보를 출력하는 기능
- 야구부 학생이 달리는 기능
- 야구부 학생이 도루를 하는 기능
- 농구부 학생 정보를 출력하는 기능
- 농구부 학생이 달리는 기능
- 농구부 학생이 3점 슛을 쏘는 기능

- 전제 학생 정보 보기
- 등록된 학생이 있는지 검사하는 기능
- 축구부 학생 정보를 출력하는 기능
- 축구부 학생이 달리는 기능
- 축구부 학생이 태클하는 기능
- 야구부 학생 정보를 출력하는 기능
- 야구부 학생이 달리는 기능
- 야구부 학생이 도루를 하는 기능
- 농구부 학생 정보를 출력하는 기능
- 농구부 학생이 달리는 기능
- 농구부 학생이 3점 슛을 쏘는 기능
- 전체적인 정보를 출력하기 위한 데이터를 구하는 기능
- 전체적인 정보를 출력하는 기능

- 학생 정보 삭제
- 등록된 학생 정보가 있는지 확인하는 기능
- 학생의 이름을 입력받는 기능
- 입력받은 학생이 있는지 검사하는 기능
- 학생 정보를 삭제하는 기능

- 프로그램 종료
- 프로그램을 종료하는 기능


### 뽑아낸 데이터를 선별한다.
- 메인 메뉴
- 사용자가 입력하는 메뉴 번호

- 학생정보 입력
- 사용자가 입력하는 운동부 번호 -> 축구부 학생, 야구부 학생, 농구부 학생
- 학생의 이름 -> 축구부 학생, 야구부 학생, 농구부 학생
- 학생의 나이 -> 축구부 학생, 야구부 학생, 농구부 학생
- 골 넣은 개수 -> 축구부 학생
- 홈런 개수 -> 야구부 학생
- 리바운드 개수 -> 농구부 학생

- 학생정보 검색
- 학생 정보가 등록되어 있는지 확인하는 값
- 사용자가 입력하는 학생의 이름
- 운동부를 구분하는 값 -> 축구부 학생, 야구부 학생, 농구부 학생
- 학생의 이름 -> 축구부 학생, 야구부 학생, 농구부 학생
- 학생의 나이 -> 축구부 학생, 야구부 학생, 농구부 학생
- 골 넣은 개수 -> 축구부 학생
- 홈런 개수 -> 야구부 학생
- 리바운드 개수 -> 농구부 학생

- 전제 학생 정보 보기
- 등록된 학생이 있는지 확인하는 값
- 운동부를 구분하는 값 -> 축구부 학생, 야구부 학생, 농구부 학생
- 학생 이름 -> 축구부 학생, 야구부 학생, 농구부 학생
- 학생 나이 -> 축구부 학생, 야구부 학생, 농구부 학생
- 골 넣은 개수 -> 축구부 학생
- 홈런 개수 -> 야구부 학생
- 리바운드 개수 -> 농구부 학생
- 전체 학생 수
- 축구부 학생의 수
- 야구부 학생의 수
- 농구부 학생의 수
- 골의 총합
- 홈런의 총합
- 리바운드의 총합

- 학생 정보 삭제
- 등록된 학생이 있는지 여부 값
- 삭제할 학생의 이름
- 학생의 이름 -> 축구부 학생, 야구부 학생, 농구부 학생

### 뽑아낸 기능을 선별한다.
- 메인 메뉴
- 사용자에게 입력받는 기능 -> 메인 메뉴
- 사용자가 입력한 메뉴 번호에 따라 상태를 변경시키는 기능 -> 메인 메뉴

- 학생정보 입력
- 운동부를 선택하기 위한 화면을 출력 -> 학생정보 입력
- 소속 운동부를 입력받는 기능 -> 학생정보 입력
- 축구부 학생의 정보를 입력받는 기능 -> 축구부 학생
- 야구부 학생의 정보를 입력받는 기능 -> 야구부 학생
- 농구부 학생의 정보를 입력받는 기능 -> 농구부 학생

- 학생정보를 검색
- 등록된 학생 정보가 있는지 확인하는 기능 ->학생정보 검색
- 학생 이름을 입력받는 기능 -> 학생정보 검색
- 입력한 학생 정보가 있는지 확인하는 기능 -> 학생정보 검색
- 축구부 학생 정보를 출력하는 기능 -> 축구부 학생
- 축구부 학생이 달리는 기능 -> 축구부 학생
- 축구부 학생이 태클하는 기능 -> 축구부 학생
- 야구부 학생 정보를 출력하는 기능 -> 야구부 학생
- 야구부 학생이 달리는 기능 -> 야구부 학생
- 야구부 학생이 도루를 하는 기능 -> 야구부 학생
- 농구부 학생 정보를 출력하는 기능 -> 농구부 학생
- 농구부 학생이 달리는 기능 -> 농구부 학생
- 농구부 학생이 3점 슛을 쏘는 기능 -> 농구부 학생

- 전제 학생 정보 보기
- 등록된 학생이 있는지 검사하는 기능 -> 전체 학생 정보 보기
- 축구부 학생 정보를 출력하는 기능 -> 축구부 학생
- 축구부 학생이 달리는 기능 -> 축구부 학생
- 축구부 학생이 태클하는 기능 -> 축구부 학생
- 야구부 학생 정보를 출력하는 기능 -> 야구부 학생
- 야구부 학생이 달리는 기능 -> 야구부 학생
- 야구부 학생이 도루를 하는 기능 -> 야구부 학생
- 농구부 학생 정보를 출력하는 기능 -> 농구부 학생
- 농구부 학생이 달리는 기능 -> 농구부 학생
- 농구부 학생이 3점 슛을 쏘는 기능 -> 농구부 학생
- 전체적인 정보를 출력하기 위한 데이터를 구하는 기능 -> 전체 학생 정보 보기
- 전체적인 정보를 출력하는 기능 -> 전체 학생 정보 보기


- 학생 정보 삭제
- 등록된 학생 정보가 있는지 확인하는 기능 -> 학생 정보 삭제
- 학생의 이름을 입력받는 기능 -> 학생 정보 삭제
- 입력받은 학생이 있는지 검사하는 기능 -> 학생 정보 삭제
- 학생 정보를 삭제하는 기능 -> 학생 정보 삭제

- 프로그램 종료
- 프로그램을 종료하는 기능 -> 프로그램 종료

### 클래스 설계
- view 패키지
- DeleteStudentInfoView
  checkStudentExist() - 등록되어 있는 학생이 있는지 확인하는 메서드
  inputDeleteStudentName() - 삭제할 학생의 이름을 입력받는 기능
  checkInputStudentExist() - 입력한 학생이 있는지 검사하는 기능
  deleteStudentInfo() - 학생 정보를 삭제하는 기능
- ExitProgramView
  exitProgram() - 프로그램을 종료하는 기능
- InputStudentInfoView
  showStudentType() - 운동부를 선택하기 위한 화면을 출력
  inputStudentType() - 소속 운동부를 입력받는 기능
  inputStudentInfo() - 학생 정보를 입력받는 기능
- SearchStudentInfoView
  checkStudentExist() - 등록되어 있는 학생이 있는지 확인하는 메서드
  inputSearchStudentName() - 학생 이름을 입력받는 기능
  checkSearchStudentExist() - 입력한 학생 정보가 있는지 확인하는 기능
  getSearchStudentInfo() - 입력한 학생 정보를 가져오는 기능
- ShowMainMenuView
  showMainMenu() - 메인 메뉴를 보여주는 메서드
  inputMainMenuNumber() - 사용자에게 메뉴 번호를 입력받는 기능
  setProgramState() -  사용자가 입력한 메뉴 번호에 따라 상태를 변경시키는 기능
- ShowStudentInfoAllView
  checkStudentExist() - 등록되어 있는 학생이 있는지 확인하는 메서드
  getStudentAllData() - 전체적인 학생들의 데이터를 구하는 메서드
  showStudentAllData() - 전체적인 학생들의 데이터를 출력하는 메서드

- repository 패키지
- StudentRepository
  getStudentInfo() : 학생들의 정보를 읽어오는 메서드
  deleteStudentInfo() : 학생 정보를 삭제하는 기능
  addStudentInfo() : 학생 정보를 저장하는 기능

- model 패키지
- SoccerStudentModel
  studentType:Int - 운동부 번호
  studentName:String - 학생 이름
  studentAge:Int - 학생의 나이
  goalCount:Int - 골 넣은 개수
  inputStudentInfo() - 학생 정보를 입력받는 기능
  showStudentInfo() - 학생 정보를 출력하는 기능
  actionRun() - 달리는 기능
  actionTakkle() - 태클하는 기능
- BaseBallStudentModel
  studentType:Int - 운동부 번호
  studentName:String - 학생 이름
  studentAge:Int - 학생의 나이
  homeRunCount:Int - 홈런 개수
  inputStudentInfo() - 학생 정보를 입력받는 기능
  showStudentInfo() - 학생 정보를 출력하는 기능
  actionRun() - 달리는 기능
  actionStellBase() - 도루하는 기능
- BasketBallStudentModel
  studentType:Int - 운동부 번호
  studentName:String - 학생 이름
  studentAge:Int - 학생의 나이
  reboundCount:Int - 리바운드 개수
  inputStudentInfo() - 학생 정보를 입력받는 기능
  showStudentInfo() - 학생 정보를 출력하는 기능
  actionRun() - 달리는 기능
  actionShutThreePoint() - 3점슛을 쏘는 기능

### 클래스 설계(상속 및 공통 부분 반영)
- view 패키지
- DeleteStudentInfoView
  checkStudentExist() - 등록되어 있는 학생이 있는지 확인하는 메서드
  inputDeleteStudentName() - 삭제할 학생의 이름을 입력받는 기능
  checkInputStudentExist() - 입력한 학생이 있는지 검사하는 기능
  deleteStudentInfo() - 학생 정보를 삭제하는 기능
- ExitProgramView
  exitProgram() - 프로그램을 종료하는 기능
- InputStudentInfoView
  showStudentType() - 운동부를 선택하기 위한 화면을 출력
  inputStudentType() - 소속 운동부를 입력받는 기능
  inputStudentInfo() - 학생 정보를 입력받는 기능
- SearchStudentInfoView
  checkStudentExist() - 등록되어 있는 학생이 있는지 확인하는 메서드
  inputSearchStudentName() - 학생 이름을 입력받는 기능
  checkSearchStudentExist() - 입력한 학생 정보가 있는지 확인하는 기능
  getSearchStudentInfo() - 입력한 학생 정보를 가져오는 기능
- ShowMainMenuView
  showMainMenu() - 메인 메뉴를 보여주는 메서드
  inputMainMenuNumber() - 사용자에게 메뉴 번호를 입력받는 기능
  setProgramState() -  사용자가 입력한 메뉴 번호에 따라 상태를 변경시키는 기능
- ShowStudentInfoAllView
  checkStudentExist() - 등록되어 있는 학생이 있는지 확인하는 메서드
  getStudentAllData() - 전체적인 학생들의 데이터를 구하는 메서드
  showStudentAllData() - 전체적인 학생들의 데이터를 출력하는 메서드

- repository 패키지
- StudentRepository
  getStudentInfo() : 학생들의 정보를 읽어오는 메서드
  deleteStudentInfo() : 학생 정보를 삭제하는 기능
  addStudentInfo() : 학생 정보를 저장하는 기능

- model 패키지
- StudentModel
  studentType:Int - 운동부 번호
  studentName:String - 학생 이름
  studentAge:Int - 학생의 나이
  inputStudentInfo() - 학생 정보를 입력받는 기능
  showStudentInfo() - 학생 정보를 출력하는 기능
  actionRun() - 달리는 기능
- SoccerStudentModel : StudentModel()
  goalCount:Int - 골 넣은 개수
  actionTakkle() - 태클하는 기능
- BaseBallStudentModel : StudentModel()
  homeRunCount:Int - 홈런 개수
  actionStellBase() - 도루하는 기능
- BasketBallStudentModel : StudentModel()
  reboundCount:Int - 리바운드 개수
  actionShutThreePoint() - 3점슛을 쏘는 기능

- util 패키지
- ToolClass
  checkStudentExist() - 등록되어 있는 학생이 있는지 확인하는 메서드

---

# 클래스 기본 구현

### 필요한 클래스들을 만들어준다.
- repository 패키지
- StudentRepository

- model 패키지
- StudentModel
- SoccerStudentModel
- BaseBallStudentModel
- BasketBallStudentModel

- util 패키지
- ToolClass

---

# 각 클래스 별로 맴버 변수와 맴버 메서드들을 구현한다.

### view/DeleteStudentInfoView 구현

```kt
package com.lion.view

class DeleteStudentInfoView : ViewClass() {
    override fun show() {

        println()
        println("등록된 학생 정보가 없습니다")

        println()
        println("삭제할 학생의 이름을 입력해주세요 : ")

        println()
        println("입력한 학생은 없습니다")

        println()
        println("000학생의 정보를 삭제하였습니다")
    }

    // 등록되어 있는 학생이 있는지 확인하는 메서드
    fun checkStudentExist(){

    }

    // 삭제할 학생의 이름을 입력받는 기능
    fun inputDeleteStudentName(){

    }

    // 입력한 학생이 있는지 검사하는 기능
    fun checkInputStudentExist(){

    }

    // 학생 정보를 삭제하는 기능
    fun deleteStudentInfo(){

    }
}
```

### view/ExitProgramView 구현

```kt
package com.lion.view

class ExitProgramView : ViewClass() {
    override fun show() {
        println()
        println("프로그램을 종료합니다")
    }

    // 프로그램을 종료하는 기능
    fun exitProgram(){

    }
}
```

### view/InputStudentInfoView 구현

```kt
package com.lion.view

class InputStudentInfoView : ViewClass() {
    override fun show() {
        println()
        println("소속 운동부를 선택해주세요")
        println("1. 축구부")
        println("2. 야구부")
        println("3. 농구부")
        println("소속 운동부 : ")

        println()
        println("축구부 학생 정보를 입력해주세요")
        println("이름 : ")
        println("나이 : ")
        println("골 넣은 개수 : ")

        println()
        println("야구부 학생 정보를 입력해주세요")
        println("이름 : ")
        println("나이 : ")
        println("홈런 개수 : ")

        println()
        println("농구부 학생 정보를 입력해주세요")
        println("이름 : ")
        println("나이 : ")
        println("리바운드 개수 : ")
    }

    // 운동부를 선택하기 위한 화면을 출력
    fun showStudentType(){

    }

    // 소속 운동부를 입력받는 기능
    fun inputStudentType(){

    }

    // 학생 정보를 입력받는 기능
    fun inputStudentInfo(){

    }
}

```

### view/SearchStudentInfoView 구현
```kt
package com.lion.view

class SearchStudentInfoView : ViewClass() {
    override fun show() {
        println()
        println("등록된 학생 정보가 없습니다.")

        println()
        println("검색할 학생의 이름을 입력해주세요 : ")

        println()
        println("입력한 학생의 정보가 없습니다")

        println()
        println("축구부 학생의 정보")
        println("이름 : 0000")
        println("나이 : 000살")
        println("골 넣은 개수 : 000개")
        println("축구부 학생이 달립니다")
        println("축구부 학생이 태클을 합니다")

        println()
        println("야구부 학생의 정보")
        println("이름 : 0000")
        println("나이 : 000살")
        println("홈런 개수 : 000개")
        println("야구부 학생이 달립니다")
        println("야구부 학생이 도루를 합니다")

        println()
        println("농구부 학생의 정보")
        println("이름 : 0000")
        println("나이 : 000살")
        println("리바운드 개수 : 000개")
        println("농구부 학생이 달립니다")
        println("농구부 학생이 3점 슛을 쏩니다")
    }

    // 등록되어 있는 학생이 있는지 확인하는 메서드
    fun checkStudentExist(){

    }

    // 학생 이름을 입력받는 기능
    fun inputSearchStudentName(){

    }

    // 입력한 학생 정보가 있는지 확인하는 기능
    fun checkSearchStudentExist(){

    }

    // 입력한 학생 정보를 가져오는 기능
    fun getSearchStudentInfo(){

    }
}
```

### view/ShowMainMenuView 구현

```kt
package com.lion.view

class ShowMainMenuView : ViewClass() {
    override fun show() {
        println()
        println("메뉴를 선택해주세요")
        println("1. 학생 정보 입력")
        println("2. 학생 이름으로 검색")
        println("3. 학생 정보 전체 보기")
        println("4. 학생 정보 삭제 하기")
        println("5. 프로그램 종료")
        println("메뉴 입력 :")
    }

    // 메인 메뉴를 보여주는 메서드
    fun showMainMenu(){

    }

    // 사용자에게 메뉴 번호를 입력받는 기능
    fun inputMainMenuNumber(){

    }

    // 사용자가 입력한 메뉴 번호에 따라 상태를 변경시키는 기능
    fun setProgramState(){

    }
}
```

### view/ShowStudentInfoAllView 구현

```kt
package com.lion.view

class ShowStudentInfoAllView : ViewClass() {
    override fun show() {
        println()
        println("등록된 학생 정보가 없습니다")

        println()
        println("축구부 학생의 정보")
        println("이름 : 0000")
        println("나이 : 000살")
        println("골 넣은 개수 : 000개")
        println("축구부 학생이 달립니다")
        println("축구부 학생이 태클을 합니다")

        println()
        println("야구부 학생의 정보")
        println("이름 : 0000")
        println("나이 : 000살")
        println("홈런 개수 : 000개")
        println("야구부 학생이 달립니다")
        println("야구부 학생이 도루를 합니다")

        println()
        println("농구부 학생의 정보")
        println("이름 : 0000")
        println("나이 : 000살")
        println("리바운드 개수 : 000개")
        println("농구부 학생이 달립니다")
        println("농구부 학생이 3점 슛을 쏩니다")

        println()
        println("전체 학생의 수 : 00명")
        println("축구부 학생의 수 : 00명")
        println("야구부 학생의 수 : 00명")
        println("농구부 학생의 수 : 00명")
        println("축구부 학생들이 넣은 골의 총 합 : 000개")
        println("야구부 학생들이 친 홈런의 총 합 : 000개")
        println("농구부 학생들이 한 리바운드의 총 합 : 000개")

    }

    // 등록되어 있는 학생이 있는지 확인하는 메서드
    fun checkStudentExist(){

    }

    // 전체적인 학생들의 데이터를 구하는 메서드
    fun getStudentAllData(){

    }

    // 전체적인 학생들의 데이터를 출력하는 메서드

    fun showStudentAllData(){

    }
}
```

### repository/StudentRepository 구현

```kt
package com.lion.repository

class StudentRepository {

    // 학생들의 정보를 읽어오는 메서드
    fun getStudentInfo(){

    }

    // 학생 정보를 삭제하는 기능
    fun deleteStudentInfo(){

    }

    // 학생 정보를 저장하는 기능
    fun addStudentInfo(){

    }
}
```

### model/StudentModel 구현

```kt

package com.lion.model

abstract class StudentModel {
    // 운동부 번호
    var studentType:Int = 0
    // 학생 이름
    var studentName:String = ""
    // 학생의 나이
    var studentAge:Int = 0

    // 학생 정보를 입력받는 기능
    fun inputStudentInfo(){

    }
    // 학생 정보를 출력하는 기능
    fun showStudentInfo(){

    }
    // 달리는 기능
    abstract fun actionRun()
}
```

### model/SoccerStudentModel 구현
```kt
package com.lion.model

class SoccerStudentModel : StudentModel(){
    // 골 넣은 개수
    var goalCount:Int = 0

    // 달리는 기능
    override fun actionRun() {

    }

    // 태클하는 기능
    fun actionTakkle(){
        
    }
}
```

### model/BaseBallStudentModel 구현

```kt
package com.lion.model

class BaseBallStudentModel : StudentModel() {
    // 홈런 개수
    var homeRunCount:Int = 0

    // 달리는 기능
    override fun actionRun() {

    }

    // 도루하는 기능
    fun actionStellBase(){

    }
}
```

### view/BasketBallStudentModel

```kt
package com.lion.model

class BasketBallStudentModel : StudentModel(){
    // 리바운드 개수
    var reboundCount:Int = 0

    // 달리는 기능
    override fun actionRun() {

    }

    // 3점슛을 쏘는 기능
    fun actionShutThreePoint(){

    }
}
```

### util 패키지에 ToolClass를 만들고 구현해준다.
```kt
package com.lion.util

class ToolClass {
    // 등록되어 있는 학생이 있는지 확인하는 메서드
    fun checkStudentExist(){

    }
}
```

---

# Repository 구현

### 객체 저장을 위해 StudentModel에 Serializable 인터페이스를 구현한다.

```kt
abstract class StudentModel : Serializable{
```

### Values.kt 에 Values 클래스를 만들고 파일 이름을 정의해준다.

```kt
class Values{
    companion object{
        // 파일 이름
        val fileName = "student.dat"
    }
}
```

### repository\StudentRepository에 companion object를 정의한다.

```kt
    companion object {

    }
```

### 학생 데이터를 불러오는 메서드를 구현한다.

```kt
        // 학생들의 정보를 읽어오는 메서드
        fun getStudentInfo():MutableList<StudentModel>{
            // 반환할 리스트
            var studentList = mutableListOf<StudentModel>()

            // 파일이 있는지 확인한다.
            val file = File(Values.fileName)
            if(file.exists()){
                // 파일과 연결되는 스트림을 생성한다.
                val fileInputStream = FileInputStream(Values.fileName)
                val objectInputStream = ObjectInputStream(fileInputStream)
                // 읽어온다.
                studentList = objectInputStream.readObject() as MutableList<StudentModel>
                // 파일을 닫아준다.
                objectInputStream.close()
                fileInputStream.close()
            }


            return studentList
        }
```

### 학생 정보를 저장하는 메서드를 만들어준다.

```kt
        // 학생 객체가 담긴 리스를 파일에 저장한다.
        fun saveStudentInfo(studentList:MutableList<StudentModel>){
            // 파일과 연결된 스트림을 생성한다.
            val fileOutputStream = FileOutputStream(Values.fileName)
            val objectOutputStream = ObjectOutputStream(fileOutputStream)
            // 객체를 쓴다.
            objectOutputStream.writeObject(studentList)
            // 파일을 닫아운다.
            objectOutputStream.flush()
            objectOutputStream.close()
            fileOutputStream.close()
        }

```

### 학생 정보를 삭제하는 메서드를 구현한다.

```kt
        // 학생 정보를 삭제하는 기능
        fun deleteStudentInfo(inputName:String){
            // 학생 정보를 가져온다.
            val studentList = getStudentInfo()

            // 이름이 같은 객체를 제거한다.
            studentList.removeAll {
                if(inputName == it.studentName){
                    // 이름이 같으면 true를 반환하여 삭제하게 한다.
                    true
                } else {
                    // 이름이 다르면 false를 반환하여 삭제되지 않게 한다.
                    false
                }
            }
            // 학생 정보를 저장한다.
            saveStudentInfo(studentList)
        }
```

### 학생 정보를 추가하는 메서드를 구현한다.

```kt
        // 학생 정보를 저장하는 기능
        fun addStudentInfo(studentModel: StudentModel){
            // 학생 정보를 불러온다.
            val studentList = getStudentInfo()
            // 학생 객체를 리스트에 담는다.
            studentList.add(studentModel)
            // 저장한다.
            saveStudentInfo(studentList)
        }
```

---

# Model 구현

### StudentModel 에서 학생 정보를 입력받는 메서드를 구현한다.

```kt
    // 학생 정보를 입력받는 기능
    open fun inputStudentInfo(scanner: Scanner){
        print("이름 : ")
        studentName = scanner.next()
        print("나이 : ")
        studentAge = scanner.nextInt()
    }
```

### StudentModel 에서 학생 정보를 출력하는 메서드를 구현한다.
```kt
    // 학생 정보를 출력하는 기능
    open fun showStudentInfo(){
        println("이름 : $studentName")
        println("나이 : ${studentAge}살")
    }
```

### BaseBallStudentModel 에 학생 정보를 입력받는 메서드를 구현해준다.
```kt
    // 학생 정보를 입력받는 메서드
    override fun inputStudentInfo(scanner: Scanner) {
        println()
        println("야구부 학생 정보를 입력해주세요")
        super.inputStudentInfo(scanner)
        print("홈런 개수 : ")
        homeRunCount = scanner.nextInt()
    }
```

### BaseBallStudentModel에 학생 정보를 출력하는 메서드를 구현한다.
```kt
    // 학생 정보를 출력하는 메서드
    override fun showStudentInfo() {
        println()
        println("야구부 학생의 정보")
        super.showStudentInfo()
        println("홈런 개수 : ${homeRunCount}개")
    }
```

### BaseBallStudentModel에 달리는 메서드를 구현한다.
```kt
    // 달리는 기능
    override fun actionRun() {
        println("야구부 학생이 달립니다")
    }
```

### BaseBallStudentModel 에 도루하는 메서드를 구현한다.
```kt
    // 도루하는 기능
    fun actionStellBase(){
        println("야구부 학생이 도루를 합니다")
    }
```

### BasketBallStudentModel에 학생 정보를 입력받는 메서드를 구현한다.
```kt
    // 학생 정보를 입력받는 메서드
    override fun inputStudentInfo(scanner: Scanner) {
        println()
        println("농구부 학생 정보를 입력해주세요")
        super.inputStudentInfo(scanner)
        print("리바운드 개수 : ")
        reboundCount = scanner.nextInt()
    }
```

### BasektBallStudentModel에 학생 정보를 출력하는 메서드를 구현한다.

```kt
    // 학생 정보를 출력하는 메서드
    override fun showStudentInfo() {
        println()
        println("농구부 학생의 정보")
        super.showStudentInfo()
        println("리바운드 개수 : ${reboundCount}개")
    }
```

### BasektBallStudentModel에 달리는 메서드를 구현해준다.

```kt
    // 달리는 기능
    override fun actionRun() {
        println("농구부 학생이 달립니다")
    }
```

### BasketBallStudentModel에 3점슛을 쏘는 메서드를 구현한다.
```kt
    // 3점슛을 쏘는 기능
    fun actionShutThreePoint(){
        println("농구부 학생이 3점 슛을 쏩니다")
    }
```

### SoccerStudentModel에 학생 정보를 입력받는 메서드를 구현한다.
```kt
    // 학생 정보를 입력받는 메서드
    override fun inputStudentInfo(scanner: Scanner) {
        println()
        println("축구부 학생 정보를 입력해주세요")
        super.inputStudentInfo(scanner)
        print("골 넣은 개수 : ")
        goalCount = scanner.nextInt()
    }
```

### SoccerStudentModel에 학생 정보를 출력하는 메서드를 구현한다.
```kt
    // 학생 정보를 출력하는 메서드
    override fun showStudentInfo() {
        println()
        println("축구부 학생의 정보")
        super.showStudentInfo()
        println("골 넣은 개수 : ${goalCount}개")
    }
```

### SoccerStudentModel에 달리는 메서드를 구현한다.
```kt
    // 달리는 기능
    override fun actionRun() {
        println("축구부 학생이 달립니다")
    }
```

### SoccerStudentModel에 태클하는 메서드를 구현한다.
```kt

    // 태클하는 기능
    fun actionTakkle(){
        println("축구부 학생이 태클을 합니다")
    }
```

---

# 메인 메뉴 상태일때를 구현한다. (파일명이 없으면 ShowMainMenuView.kt)

### Controller로 가서 프로그램의 상태를 메인 메뉴 상태로 설정한다.

```kt
    var programState:ProgramState = STATE_SHOW_MAIN_MENU
```

### ShowMainMenuView 에서 메인 메뉴를 보여주는 메서드를 구현한다.

```kt
    // 메인 메뉴를 보여주는 메서드
    fun showMainMenu(){
        println()
        println("메뉴를 선택해주세요")
        println("1. 학생 정보 입력")
        println("2. 학생 이름으로 검색")
        println("3. 학생 정보 전체 보기")
        println("4. 학생 정보 삭제 하기")
        println("5. 프로그램 종료")
        print("메뉴 입력 :")
    }
```

### 사용자에게 메뉴 번호를 입력 받는 메서드를 구현한다.
```kt
    // 사용자에게 메뉴 번호를 입력받는 기능
    fun inputMainMenuNumber():Int{
        val scanner = Scanner(System.`in`)
        val inputNumber = scanner.nextInt()
        return inputNumber
    }
```

### Values에 메인 메뉴 번호를 나타내는 enum class를 정의한다.
```kt
// 메인 메뉴 번호
enum class MainMenuNumber(var number:Int, var str:String){
    // 학생 정보 입력
    MAIN_MENU_INPUT_STUDENT_INFO(1, "학생 정보 입력"),
    // 학생 이름으로 검색
    MAIN_MENU_SEARCH_STUDENT_INFO(2, "학생 이름으로 검색"),
    // 학생 정보 전체 보기
    MAIN_MENU_SHOW_STUDENT_INFO_ALL(3, "학생 정보 전체 보기"),
    // 학생 정보 삭제 하기
    MAIN_MENU_DELETE_STUDENT_INFO(4, "학생 정보 삭제 하기"),
    // 프로그램 종료
    MAIN_MENU_EXIT_PROGRAM(5, "프로그램 종료 하기")
}
```

### Controller에서 메인 메뉴 상태일때 Controller 객체를 전달할 수 있도록 생성자에 this를 넣어준다.
```kt
                // 메인 메뉴를 보여주는 상태
                STATE_SHOW_MAIN_MENU -> {
                    // 메인메뉴를 보여주기 위한 클래스의 객체를 생성해서 반환한다.
                    ShowMainMenuView(this)
                }
```

### 주 생성자로 Controller 객체를 받아준다.
```kt
class ShowMainMenuView(val controllerClass: ControllerClass) : ViewClass() {
```

### 사용자가 입력한 메뉴에 따라 프로그램의 상태를 변경하는 메서드를 만들어준다.
```kt
    // 사용자가 입력한 메뉴 번호에 따라 상태를 변경시키는 기능
    fun setProgramState(inputMenuNumber:Int){
        // 사용자가 입력한 메뉴 번호에 따라 프로그램의 상태를 변경한다.
        when(inputMenuNumber){
            // 학생 정보 입력
            MainMenuNumber.MAIN_MENU_INPUT_STUDENT_INFO.number ->{
                controllerClass.programState = ProgramState.STATE_INPUT_STUDENT_INFO
            }
            // 학생 정보 검색
            MainMenuNumber.MAIN_MENU_SEARCH_STUDENT_INFO.number ->{
                controllerClass.programState = ProgramState.STATE_SEARCH_STUDENT_INFO
            }
            // 학생 정보 전체 보기
            MainMenuNumber.MAIN_MENU_SHOW_STUDENT_INFO_ALL.number -> {
                controllerClass.programState = ProgramState.STATE_SHOW_STUDENT_INFO_ALL
            }
            // 학생 정보 삭제 하기
            MainMenuNumber.MAIN_MENU_DELETE_STUDENT_INFO.number -> {
                controllerClass.programState = ProgramState.STATE_DELETE_STUDENT_INFO
            }
            // 프로그램 종료
            MainMenuNumber.MAIN_MENU_EXIT_PROGRAM.number -> {
                controllerClass.programState = ProgramState.STATE_EXIT_PROGRAM
            }
        }
    }
```

### show 메서드에서 구현한 메서드들을 모두 호출한다.
```kt
    override fun show() {
        // 메뉴를 출력한다.
        showMainMenu()
        // 메뉴 번호를 입력받는다
        val inputMenuNumber = inputMainMenuNumber()
        // 메뉴 번호에라 프로그램의 상태를 변경한다.
        setProgramState(inputMenuNumber)
    }
```

### 각 메서드에 접근 제한자를 설정해준다.

```kt

    // 메인 메뉴를 보여주는 메서드
    private fun showMainMenu()

    // 사용자에게 메뉴 번호를 입력받는 기능
    private fun inputMainMenuNumber():Int

    // 사용자가 입력한 메뉴 번호에 따라 상태를 변경시키는 기능
    private fun setProgramState(inputMenuNumber:Int)
```

---

# 학생 정보 입력 상태를 구현한다.(파일명이 없으면 InputStudentInfoView.kt)

### Controller에서 프로그램의 상태를 학생 정보 입력 상태로 변경한다.

```kt
    var programState:ProgramState = STATE_INPUT_STUDENT_INFO
```

### Controller에서 학생 정보 입력 상태일때 객체를 생성하는 부분에서 Controller를 전달하기 위해 생성자에 this를 넣어준다.
```kt
                // 학생 정보를 입력받는 상태
                STATE_INPUT_STUDENT_INFO -> {
                    // 학생 정보를 입력 받기 위한 객체를 생성하여 반환한다.
                    InputStudentInfoView(this)
                }
```

### 주 생성자에서 Controller 객체를 받는다.
```kt
class InputStudentInfoView(val controllerClass: ControllerClass) : ViewClass() {
```

### 운동부 선택을 위한 메뉴를 출력하는 메서드를 구현한다.
```kt
    // 운동부를 선택하기 위한 화면을 출력
    private fun showStudentType(){
        println()
        println("소속 운동부를 선택해주세요")
        println("1. 축구부")
        println("2. 야구부")
        println("3. 농구부")
        print("소속 운동부 : ")
    }
```

### Values.kt 에 운동부를 나타내는 enum class를 정의한다.
```kt
// 운동부 타입
enum class StudentType(var number:Int, var str:String){
    STUDENT_TYPE_SOCCER(1, "축구부"),
    STUDENT_TYPE_BASEBALL(2, "야구부"),
    STUDENT_TYPE_BASKETBALL(3, "농구부")
}
```

### 운동부 번호를 입력받는 메서드를 구현해준다.
```kt
    // 소속 운동부를 입력받는 기능
    private fun inputStudentType():Int{
        val scanner = Scanner(System.`in`)
        val typeNumber = scanner.nextInt()
        return typeNumber
    }
```

### 학생 정보를 입력받는 메서드를 구현한다.
```kt
    // 학생 정보를 입력받는 기능
    private fun inputStudentInfo(studentType:Int){
        // 입력받은 학생 타입별로 분기하여 객체를 생성한다.
        val studentModel = when(studentType){
            // 축구부
            StudentType.STUDENT_TYPE_SOCCER.number -> SoccerStudentModel()
            // 야구부
            StudentType.STUDENT_TYPE_BASEBALL.number -> BaseBallStudentModel()
            // 농구부
            StudentType.STUDENT_TYPE_BASKETBALL.number -> BasketBallStudentModel()
            else -> SoccerStudentModel()
        }
        // 학생 정보를 입력받는다.
        val scanner = Scanner(System.`in`)
        studentModel.inputStudentInfo(scanner)

        // 학생 정보를 파일에 저장한다.
        StudentRepository.addStudentInfo(studentModel)
    }
```

### show 메서드에서 메서드들을 호출한다.
```kt
    override fun show() {

        // 운동부 선택 메뉴를 출력한다.
        showStudentType()

        // 운동부 번호를 입력받는다.
        val typeNumber = inputStudentType()

        // 학생 정보를 입력받는다.
        inputStudentInfo(typeNumber)

        // 프로그램의 상태를 메인 메뉴 상태로 변경한다.
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU

    }
```
---

# 학생 정보 검색 구현(파일명이 없으면 SearchStudentInfoView.kt)

### Controller에서 프로그램의 상태를 변경한다.

```kt
    var programState:ProgramState = STATE_SEARCH_STUDENT_INFO
```

### Controller에서 학생정보검색 상태에서의 생성자에 Controller를 전달한다.
```kt
                // 학생 정보를 검색하는 생태
                STATE_SEARCH_STUDENT_INFO -> {
                    // 학생 정보 검색을 위한 객체를 생성하여 반환한다.
                    SearchStudentInfoView(this)
                }
```

### 주 생성자를  추가하고 Controller를 받아준다.
```kt
class SearchStudentInfoView(val controllerClass: ControllerClass) : ViewClass() {
```

### ToolClass 클래스에 companion object를 추가하고 등록되어 있는 학생 데이터가 있는지 확인하는 메서드를 구현한다.
```kt
class ToolClass {
    companion object{
        // 등록되어 있는 학생이 있는지 확인하는 메서드
        fun checkStudentExist():Boolean{
            // 학생 정보를 가져온다.
            val studentList = StudentRepository.getStudentInfo()
            // 관리하는 객체의 수가 0이면 false를 반환한다.
            if(studentList.size == 0){
                return false
            }
            // 관리하는 객체의 수가 0이 아니면 true를 반환한다.
            else {
                return true
            }
        }
    }
}
```

### SearchStudentInfoView에 있는 checkStudentExist 메서드는 삭제해준다.

### 학생이 있을 때와 없을 때를 분기한다.
```kt
        // 등록된 학생이 있는지 확인한다.
        val check1 = ToolClass.checkStudentExist()

        // 만약 학생이 없다면
        if(check1 == false){
            println()
            println("등록된 학생 정보가 없습니다.")
        }
        // 학생이 있다면
        else {
            
        }
```

### 검색할 학생의 이름을 입력받는 메서드를 구현한다.
```kt
    // 학생 이름을 입력받는 기능
    private fun inputSearchStudentName():String{
        println()
        print("검색할 학생의 이름을 입력해주세요 : ")
        val scanner = Scanner(System.`in`)
        val inputName = scanner.next()
        return inputName
    }
```

### 입력한 이름에 해당하는 학생이 있는지 확인하는 메서드를 만들어준다.
```kt
    // 입력한 학생 정보가 있는지 확인하는 기능
    fun checkSearchStudentExist(inputName:String):Boolean{
        // 학생이 있는지 여부 값
        var isExistStudentName = false
        // 학생 데이터를 가져온다.
        val studentList = StudentRepository.getStudentInfo()
        // 학생의 수 만큼 반복한다.
        studentList.forEach {
            // 검색한 학생의 이름과 현재 학생 객체의 이름이 같은지 확인한다.
            if(inputName == it.studentName){
                // 변수에 true를 담아준다.
                isExistStudentName = true
                return@forEach
            }
        }
        return isExistStudentName
    }
```

### 학생 정보를 검색하는 메서드를 구현한다.
```kt
    // 입력한 학생 정보를 가져오는 기능
    private fun getSearchStudentInfo(inputName:String):MutableList<StudentModel>{
        // 검색된 학생 정보를 담을 리스트
        val searchStudentList = mutableListOf<StudentModel>()
        // 학생 전체데이터를 가져온다.
        val studentList = StudentRepository.getStudentInfo()
        // 학생의 수 만큼 반복한다.
        studentList.forEach {
            // 입력한 학생의 이름과 현재 학생의 이름이 같다면..
            if(inputName == it.studentName){
                // 담아준다.
                searchStudentList.add(it)
            }
        }
        // 반환한다.
        return searchStudentList
    }
```
### show 메서드를 구현한다.

```kt
    override fun show() {

        // 등록된 학생이 있는지 확인한다.
        val check1 = ToolClass.checkStudentExist()

        // 만약 학생이 없다면
        if(check1 == false){
            println()
            println("등록된 학생 정보가 없습니다.")
        }
        // 학생이 있다면
        else {
            // 학생 이름을 검색한다.
            val inputName = inputSearchStudentName()
            // 입력한 학생이 있는지 검사한다.
            val check2 = checkSearchStudentExist(inputName)
            // 입력한 학생이 없다면
            if(check2 == false){
                println()
                println("입력한 학생의 정보가 없습니다")
            }
            // 입력한 학생이 있다면
            else {
                // 검색한 학생의 정보를 가져온다.
                val searchStudentList = getSearchStudentInfo(inputName)
                // 가져온 학생의 수 만큼 반복한다.
                searchStudentList.forEach{
                    // 공통 부분 호출
                    it.showStudentInfo()
                    it.actionRun()
                    // 각각 다른 부분 호출
                    when(it){
                        // 축구라면
                        is SoccerStudentModel ->{
                            it.actionTakkle()
                        }
                        // 야구부라면
                        is BaseBallStudentModel -> {
                            it.actionStellBase()
                        }
                        // 농구부라면
                        is BasketBallStudentModel ->{
                            it.actionShutThreePoint()
                        }
                    }
                }
            }
        }

        // 프로그램 상태를 메인 메뉴로 변경한다.
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }
```
---

# 전제 학생 정보를 출력하는 상태(ShowStudentInfoAllView)

### Controller에서 프로그램 상태를 변경한다./

```kt
    // 프로그램의 상태값을 담을 변수
    var programState:ProgramState = STATE_SHOW_STUDENT_INFO_ALL
```

### Controller 에서 전체 학생 정보를 출력하는 상태의 객체를 생성하는 곳의 생성자에게 Controller를 전달한다.
```kt
                // 학생 정보 전체를 보는 상태
                STATE_SHOW_STUDENT_INFO_ALL -> {
                    // 학생 정보 전체를 보기 위한 객체를 생성하여 반환한다.
                    ShowStudentInfoAllView(this)
                }
```

### 주 생성자로 Controller를 받는다.
```kt
class ShowStudentInfoAllView(val controllerClass: ControllerClass) : ViewClass() {
```

### checkStudentExist 메서드는 삭제해준다.

### 학생 정보를 출력하는 메서드를 구현한다.
```kt
    // 학생 정보를 출력하는 메서드
    private fun showStudentInfoAll(){
        // 학생 전체의 정보를 가져온다.
        val studentList = StudentRepository.getStudentInfo()
        // 반복한다.
        studentList.forEach {
            // 공통 부분
            it.showStudentInfo()
            it.actionRun()
            // 분기한다.
            when(it){
                is SoccerStudentModel -> {
                    it.actionTakkle()
                }
                is BaseBallStudentModel ->{
                    it.actionStellBase()
                }
                is BasketBallStudentModel -> {
                    it.actionShutThreePoint()
                }
            }
        }
    }
```

### 전체에 대한 데이터를 구하는 메서드를 구현해준다.
```kt
    // 전체적인 학생들의 데이터를 구하는 메서드
    fun getStudentAllData():MutableMap<String, Int>{
        // 데이터를 담을 맵을 생성한다.
        val dataMap = mutableMapOf<String, Int>()
        // 학생 데이터를 가져온다.
        val studentList = StudentRepository.getStudentInfo()

        // 데이터를 담을 변수들
        var totalCount = studentList.size
        var totalSoccerCount = 0
        var totalBaseBallCount = 0
        var totalBasketBallCount = 0
        var totalGoalCount = 0
        var totalHomeRunCount = 0
        var totalReboundCount = 0

        // 학생 수 만큼 반복한다.
        studentList.forEach {
            // 학생의 타입에 따라 분기한다.
            when(it){
                is SoccerStudentModel -> {
                    // 학생 수를 증가시킨다
                    totalSoccerCount++
                    // 골 넣은 수를 누적한다.
                    totalGoalCount += it.goalCount
                }
                is BaseBallStudentModel -> {
                    // 학생 수를 증가시킨다
                    totalBaseBallCount++
                    // 홈런 개수를 누적한다.
                    totalHomeRunCount += it.homeRunCount
                }
                is BasketBallStudentModel ->{
                    // 학생 수를 증가시킨다.
                    totalBasketBallCount++
                    // 리바운드 개수를 누적한다.
                    totalReboundCount += it.reboundCount
                }
            }
        }

        // 구한 데이터를 맵에 담는다.
        dataMap["totalCount"] = totalCount
        dataMap["totalSoccerCount"] = totalSoccerCount
        dataMap["totalBaseBallCount"] = totalBaseBallCount
        dataMap["totalBasketBallCount"] = totalBasketBallCount
        dataMap["totalGoalCount"] = totalGoalCount
        dataMap["totalHomeRunCount"] = totalHomeRunCount
        dataMap["totalReboundCount"] = totalReboundCount

        return dataMap
    }
```

### 학생 전체 데이터를 출력하는 메서드를 만들어준다.
```kt
    // 전체적인 학생들의 데이터를 출력하는 메서드
    fun showStudentAllData(dataMap:MutableMap<String, Int>){
        println()
        println("전체 학생의 수 : ${dataMap["totalCount"]}명")
        println("축구부 학생의 수 : ${dataMap["totalSoccerCount"]}명")
        println("야구부 학생의 수 : ${dataMap["totalBaseBallCount"]}명")
        println("농구부 학생의 수 : ${dataMap["totalBasketBallCount"]}명")
        println("축구부 학생들이 넣은 골의 총 합 : ${dataMap["totalGoalCount"]}개")
        println("야구부 학생들이 친 홈런의 총 합 : ${dataMap["totalHomeRunCount"]}개")
        println("농구부 학생들이 한 리바운드의 총 합 : ${dataMap["totalReboundCount"]}개")
    }
```

### show 메서드를 구현해준다.

```kt
    override fun show() {
        // 등록되어 있는 학생이 있는지 확인한다.
        val check1 = ToolClass.checkStudentExist()

        // 등록되어 있는 학생이 없다면
        if(check1 == false) {
            println()
            println("등록된 학생 정보가 없습니다")
        }
        // 등록되어 있는 학생이 있다면
        else {
            // 학생 정보들을 출력한다.
            showStudentInfoAll()
            // 학생 전체에 관련된 정보를 구한다.
            val dataMap = getStudentAllData()
            // 학생 전체관련 데이터를 출력한다.
            showStudentAllData(dataMap)
        }
        
        // 프로그램의 상태를 변경한다.
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }
```

### 프로그램 종료 상태를 구현한다.(ExitProgramView)

```kt
package com.lion.view

import kotlin.system.exitProcess

class ExitProgramView : ViewClass() {
    override fun show() {
        exitProgram()
    }

    // 프로그램을 종료하는 기능
    private fun exitProgram(){
        println()
        println("프로그램을 종료합니다")
        exitProcess(0)
    }
}
```

# 삭제하기 (DeleteStudentInfoView)

### Controller에서 프로그램의 상태를 변경한다.

```kt
    // 프로그램의 상태값을 담을 변수
    var programState:ProgramState = STATE_DELETE_STUDENT_INFO
```

### Controller에서 삭제 상태일때 객체 생성하는 부분에 생성자에 Controller를 전달해준다.
```kt
                // 학생 정보를 삭제하는 상태
                STATE_DELETE_STUDENT_INFO -> {
                    // 학생 정보를 삭제하기 위한 객체를 생성하여 반환한다.
                    DeleteStudentInfoView(this)
                }
```

### 주 생성자에서 controller를 받는다.
```kt
class DeleteStudentInfoView(val controllerClass: ControllerClass) : ViewClass() {
```

### checkStudentExist 메서드는 삭제한다.

### 학생 이름을 입력받는 메서드를 구현한다.
```kt
    // 삭제할 학생의 이름을 입력받는 기능
    fun inputDeleteStudentName():String{
        println()
        print("삭제할 학생의 이름을 입력해주세요 : ")
        val scanner = Scanner(System.`in`)
        val inputName = scanner.next()
        return inputName
    }
```

### 검색하고자 하는 학생이 있는지 확인하는 메서드를 구현한다.
```kt
    // 입력한 학생이 있는지 검사하는 기능
    fun checkInputStudentExist(inputName:String):Boolean{
        // 반환할 값
        var check1 = false
        // 모든 학생의 정보를 가져온다.
        val studentList = StudentRepository.getStudentInfo()
        // 학생의 수 만큼 반복한다.
        studentList.forEach {
            // 입력한 학생의 이름과 현재 학생의 이름이 같은지.
            if(inputName == it.studentName){
                // 반환할 값에 true를 넣어주고 forEach를 중단한다.
                check1 = true
                return@forEach
            }
        }
        // 반환한다.
        return check1
    }
```

### 학생 정보를 삭제하는 메서드를 구현해준다.
```kt
    // 학생 정보를 삭제하는 기능
    fun deleteStudentInfo(inputName: String){
        // 학생데이터를 삭제한다.
        StudentRepository.deleteStudentInfo(inputName)
        println()
        println("${inputName}학생의 정보를 삭제하였습니다")
    }
```

### show 메서드를 구현해준다.
```kt
    override fun show() {
        // 학생 정보가 저장되어 있는지 확인한다.
        val check1 = ToolClass.checkStudentExist()

        // 학생 정보가 없다면
        if(check1 == false){
            println()
            println("등록된 학생 정보가 없습니다")
        }
        // 학생 정보가 있다면
        else {
            // 삭제할 학생의 이름을 입력받는다.
            val inputName = inputDeleteStudentName()
            // 삭제할 학생이 있는지 확인한다
            val check2 = checkInputStudentExist(inputName)
            // 학생이 없다면
            if(check2 == false){
                println()
                println("입력한 학생은 없습니다")
            }
            // 학생이 있다면
            else {
                // 삭제한다.
                deleteStudentInfo(inputName)
            }
        }
        // 메인 메뉴 상태로 변경한다.
        controllerClass.programState = ProgramState.STATE_SHOW_MAIN_MENU
    }
```

---

# 최종

### Controller에서 프로그램의 상태를 메인 메뉴 상태로 변경한다.

```kt
    // 프로그램의 상태값을 담을 변수
    var programState:ProgramState = STATE_SHOW_MAIN_MENU
```

### while 문 내부의 isRunning 부분을 주석처리 한다.
```kt
            // isRunning = false
```
















