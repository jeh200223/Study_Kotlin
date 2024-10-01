# 학생관리 프로그램

학생 종류에는 축구부학생, 야구부학생, 농구부학생이 있다.

프로그램이 처음 시작하면 다음과 같은 메인 메뉴가 나타난다.

1. 학생 정보 추가
2. 학생 이름 검색
3. 학생 전체 정보 보기
4. 학생 정보 삭제
5. 종료
   메뉴 선택 :

종류의 경우 System.exit(0); 이렇게 코드를 작성하면 프로그램이 종료된다

-------------------------------------------------------------------

메인 메뉴에서 1번을 선택하면 다음과 같이 진행된다.

학생 운동부 종류 선택
1. 축구부
2. 야구부
3. 농구부
   운동부 종류 선택 :

1. 축구부를 선택했을 경우 다음과 같이 입력을 받는다.
   이름 :
   나이 :
   골 넣은 개수 :

2. 야구부를 선택했을 경우 다음과 같이 입력을 받는다.
   이름 :
   나이 :
   홈런의 개수 :

3. 농구부를 선택했을 경우 다음과 같이 입력을 받는다.
   이름 :
   나이 :
   골 넣은 개수 :

입력이 모두 완료되면 다시 메인 메뉴를 보여준다.

----------------------------------------------------------------

메인 메뉴에서 2번을 선택하면...

만약 입력된 학생의 정보가 없다면..
등록된 학생이 없습니다
라는 메세지를 보여주고 메인 메뉴를 보여준다.

등록된 학생이 있다면..

학생의 이름을 입력해주세요 :

만약 입력한 이름의 학생이 있다면 그 학생의 정보를 보여준다.
만약 입력한 이름의 학생이 없다면
검색된 학생이 없습니다
라는 메시지를 보여준다.

학생의 정보나 메시지를 보여준 후에 메인 메뉴를 보여준다.

---------------------------------------------------------------------

메인 메뉴에서 3번 메뉴를 선택했을 경우

다음과 같이 출력한다.

전체 학생의 수 : 00명

이후에 각 학생의 정보를 출력한다.
학생의 정보를 출력할때 각 학생의 특기도 출력해준다.
축구부인 경우에는
태클을 합니다

야구부인 경우에는
도루를 합니다.

농구인 경우에는
리바운드를 합니다.

모든 학생의 정보를 출력한 후에 다음 같이 출력해준다.

축구부 : 00명
야구부 : 00명
농구부 : 00명

모든 출력이 완료되면 메인 메뉴를 출력해준다.

--------------------------------------------------------------

메인 메뉴에서 4번을 선택했다면...

만약 등록된 학생이 없다면...

등록된 학생이 없습니다.

를 보여주고 메인 메뉴를 보여준다.

등록된 학생이 있다면....

삭제할 학생의 이름 입력 :

있는 학생의 이름을 입력하면 학생 정보를 삭제하고 메인 메뉴를
보여준다.

없는 학생의 이름을 입력하면
입력한 학생은 없습니다
를 보여주고 메인 메뉴를 보여준다.

-----------------------------------------------------------

### 패키지를 만들어준다.
- com.lion.main
- com.lion.controller
- com.lion.view
- com.lion.model

---

### MVC 패턴
- M : Model, 데이터를 관리하는 요소
- V : View, 눈에 보이는 작업을 처리하는 요소
- C : Controller, 프로그램의 흐름을 제어하는 요소

---

### 프로그램 상태 정의
- 메인메뉴를 보여주는 상태
- 학생 정보를 입력하는 상태
- 학생 검색을 하는 상태
- 학생 정보 전체를 보여주는 상태
- 학생 정보 삭제를 하는 상태
- 프로그램 종료 상태

---

# main 패키지에 MainClass를 만들어준다

```java
package com.lion.main;

public class MainClass {
    public static void main(String[] args) {
        
    }
}

```

---


### controller 패키지에 ControllerClass를 만들어준다.
- Controller는 프로그램의 각 상태에 맞는 메서드를 호출하는 역할을 수행해준다.

---

### com.lion.util 패키지를 만들어주고 Values 인터페이스를 만들어준다.

---

### Values에 각 상태를 의미하는 값을 정의한다.

```java

    // 메인메뉴를 보여주는 상태
    int STATE_SHOW_MAIN_MENU = 1;
    // 학생 정보를 입력하는 상태
    int STATE_INPUT_STUDENT_INFO = 2;
    // 학생 검색을 하는 상태
    int STATE_SEARCH_STUDENT_INFO = 3;
    // 학생 정보 전체를 보여주는 상태
    int STATE_SHOW_STUDENT_INFO_ALL = 4;
    // 학생 정보 삭제를 하는 상태
    int STATE_DELETE_STUDENT_INFO = 5;
    // 프로그램 종료 상태
    int STATE_EXIT_PROGRAM = 6;

```

---

### Controller에 각 상태별로 분기하는 코드를 작성한다.

```java

package com.lion.controller;

import com.lion.util.Values;

public class ControllerClass {

    // 프로그램의 상태값을 담을 변수
    private int programState;

    public ControllerClass(){
        // 프로그램의 초기 상태를 설정한다.
        programState = Values.STATE_SHOW_MAIN_MENU;
    }

    // 각 상태별로 분기해서 처리하는 메서드
    // 일단은 반복을 하지 않을 겁니다. 나중에 무한 반복되게 만들어주겠습니다.
    public void runController(){
        // 반복을 제어하기 위한 변수
        boolean running = false;

        while(running){
            // 프로그램의 상태값 별로 분기한다.
            switch (programState){
                // 메인메뉴를 보여주는 상태
                case Values.STATE_SHOW_MAIN_MENU :
                    break;
                // 학생 정보를 입력하는 상태
                case Values.STATE_INPUT_STUDENT_INFO :
                    break;
                // 학생 검색을 하는 상태
                case Values.STATE_SEARCH_STUDENT_INFO :
                    break;
                // 학생 정보 전체를 보여주는 상태
                case Values.STATE_SHOW_STUDENT_INFO_ALL :
                    break;
                // 학생 정보 삭제를 하는 상태
                case Values.STATE_DELETE_STUDENT_INFO :
                    break;
                // 프로그램 종료 상태
                case Values.STATE_EXIT_PROGRAM :
                    break;
            }
        }
    }

}

```

---


### view 패키지에 다른 클래스들이 상속을 받기 위한 ViewClass를 만들어준다.

```java
package com.lion.view;

public abstract class ViewClass {
    // 출력 메서드
    public abstract void show();
}

```

### ControllerClass에 ViewClass 타입의 변수를 선언해준다.

```java

    // View 객체의 정보를 담을 변수
    private ViewClass viewClass;

```

---

### ControllerClass에 runController 메서드 내에서 ViewClass의 show 메서드를 호출하도록 한다.

```java

            // 출력하는 메서드 호출
            viewClass.show();

```

---

### view 패키지에 MenuMenuView 클래스를 작성하며 메인 메뉴 출력 화면을 구성해준다.

```java
package com.lion.view;

public class MenuMenuView extends ViewClass{
    @Override
    public void show() {
        System.out.println();
        System.out.println("1. 학생 정보 추가");
        System.out.println("2. 학생 이름 검색");
        System.out.println("3. 학생 전체 정보 보기");
        System.out.println("4. 학생 정보 삭제");
        System.out.println("5. 종료");
        System.out.println("메뉴 선택 :");
    }
}


```

---

### ControllerClass에서 메인 메뉴 상태일 때 MenuMenuView의 객체를 생성해 변수에 담아준다.

```java

                    viewClass = new MenuMenuView();

```

---

### 학생 정보 입력을 위한 InputStudentInfoView 클래스를 view 패키지에 만들어준다.


```java

package com.lion.view;

public class InputStudentInfoView extends ViewClass {
    @Override
    public void show() {
        System.out.println();
        System.out.println("학생 운동부 종류 선택");
        System.out.println("1. 축구부");
        System.out.println("2. 야구부");
        System.out.println("3. 농구부");
        System.out.println("운동부 종류 선택 :");

        System.out.println();
        System.out.println("이름 :");
        System.out.println("나이 :");
        System.out.println("골 넣은 개수 :");
        System.out.println("홈런의 개수 :");
        System.out.println("골 넣은 개수 :");
    }
}


```

### ControllerClass의 STATE_INPUT_STUDENT_INFO 상태일때 객체를 생성하는 코드를 넣어준다.

```java

                    viewClass = new InputStudentInfoView();

```

---

### ControllerClass의 생성자에서 프로그램의 초기상태를 변경해주고 테스트 한다.

```java


        // 프로그램의 초기 상태를 설정한다.
        programState = Values.STATE_INPUT_STUDENT_INFO;
```

---

### view 패키에 STATE_SEARCH_STUDENT_INFO 를 위한 SearchStudentInfoView 클래스를 생성해 준다.

```java

package com.lion.view;

public class SearchStudentInfoView extends ViewClass{
    @Override
    public void show() {
        System.out.println();
        System.out.println("등록된 학생이 없습니다");
        System.out.println("학생의 이름을 입력해주세요 :");
        System.out.println();
        System.out.println("검색된 학생이 없습니다");
        System.out.println();
        System.out.println("소속 운동부 : 축구부");
        System.out.println("이름 : 홍길동");
        System.out.println("나이 : 10살");
        System.out.println("골 넣은 개수 : 5골");
        System.out.println("태클을 합니다");
        System.out.println("소속 운동부 : 야구부");
        System.out.println("이름 : 홍길동");
        System.out.println("나이 : 10살");
        System.out.println("홈런 개수 : 5개");
        System.out.println("도루를 합니다");
        System.out.println("소속 운동부 : 농구보");
        System.out.println("이름 : 홍길동");
        System.out.println("나이 : 10살");
        System.out.println("골넣은 개수 : 5골");
        System.out.println("리바운드를 합니다");
    }
}


```

### ControllerClass에 STATE_SEARCH_STUDENT_INFO 일때 SearchStudentInfoView 객체를 생성해준다.

```java

                    viewClass = new SearchStudentInfoView();
```

---

### STATE_SHOW_STUDENT_INFO_ALL 상태일때를 위한 ShowStudentInfoAllView 클래스를 view 패키지에 만들어준다.

```java
package com.lion.view;

public class ShowStudentInfoAllView extends ViewClass{
    @Override
    public void show() {
        System.out.println();
        System.out.println("등록된 학생이 없습니다");
        System.out.println("전체 학생의 수 : 100명");
        System.out.println();
        System.out.println("소속 운동부 : 축구부");
        System.out.println("이름 : 홍길동");
        System.out.println("나이 : 10살");
        System.out.println("골 넣은 개수 : 5골");
        System.out.println("태클을 합니다");
        System.out.println();
        System.out.println("소속 운동부 : 야구부");
        System.out.println("이름 : 홍길동");
        System.out.println("나이 : 10살");
        System.out.println("홈런 개수 : 5개");
        System.out.println("도루를 합니다");
        System.out.println();
        System.out.println("소속 운동부 : 농구보");
        System.out.println("이름 : 홍길동");
        System.out.println("나이 : 10살");
        System.out.println("골넣은 개수 : 5골");
        System.out.println("리바운드를 합니다");
        System.out.println();
        System.out.println("축구부 : 10명");
        System.out.println("야구부 : 10명");
        System.out.println("농구부 : 10명");
    }
}

```

---

### Controller에 STATE_SHOW_STUDENT_INFO_ALL 상태일때의 view 객체를 생성해준다.

```java
                    viewClass = new ShowStudentInfoAllView();
                    break;
```

---

### 학생 정보를 삭제하는 상태일때에 대한 DeleteStudentView 클래스를 view 패키지에 만들어준다.

```java

package com.lion.view;

public class DeleteStudentView extends ViewClass{
    @Override
    public void show() {
        System.out.println();
        System.out.println("등록된 학생이 없습니다.");
        System.out.println("삭제할 학생의 이름 입력 :");
        System.out.println("삭제하였습니다");
        System.out.println("입력한 학생은 없습니다");
    }
}


```
---

### ControllerClass에 STATE_DELETE_STUDENT_INFO 상태일때의 객체를 생성해준다.

```java

                    viewClass = new DeleteStudentView();

```

---

### Controller 클래스에 종료 상태일때를 작성해준다.

```java
                    // 프로그램을 종료한다.
                    // 0 : 정상적으로 모두 수행되어 끝났을 때
                    // 1 : 비정상적인 상황이 벌어져 종료를 시킬 때
                    System.exit(0);
```

---

### 각 상태별로 변경하면서 데이터를 뽑아 본다.
- 화면을 구성하기 위해서 필요한 데이터
- 발생이 예측되는 데이터
- 사용자가 입력하는 데이터
- 등등

```
메인 메뉴 상태
사용자가 선택한 메뉴 번호

학생 정보를 입력하는 상태
사용자가 선택한 운동부 종류
이름
나이
축구부 골 넣은 개수
야구부 홈런의 개수
농구부 골 넣은 개수

학생 정보를 검색하는 상태
등록한 학생이 있는지 여부
사용자가 입력한 학생의 이름
사용자가 입력한 학생이 있는지 여부
소속 운동부
이름
나이
축구부 골 넣은 개수
야구부 홈런개수
농구부 골넣은 개수

학생 정보 전체를 보여주는 상태
등록한 학생이 있는지 여부
전체 학생의 수
소속 운동부
이름
나이
축구부 골 넣은 개수
야구부 홈런 개수
농구부 골 넣은 개수
축구부 학생 수
야구부 학생 수
농구부 학생 수

학생 정보를 삭제하는 상태
등록한 학생이 있는지 여부
사용자가 입력한 학생의 이름
입력한 학생이 있는지 여부
```

### 각 상태별로 필요한 기능들을 정리한다.

```
메인 메뉴 상태
사용자에게 메뉴 번호를 입력받는 기능

학생 정보를 입력하는 상태
운동부 종류 번호를 입력받는 기능
학생의 정보를 입력받는 기능

학생 정보를 검색하는 상태
등록된 학생이 있는지 확인하는 기능
검색하고자 하는 학생의 이름을 입력받는 기능
검색하고자 하는 학생이 있는지 검사하는 기능
검색된 학생의 정보를 출력하는 기능
태클하는 기능
도루하는 기능
리바운드하는 기능

학생 정보 전체를 보여주는 상태
등록된 학생이 있는지 확인하는 기능
전체 학생의 수를 구하는 기능
학생들의 정보를 출력하는 기능
축구부, 야구부, 농구부 학생들의 수를 구하는 기능
태클하는 기능
도루하는 기능
리바운드하는 기능

학생 정보를 삭제하는 상태
등록된 학생이 있는지 확인하는 기능
삭제할 학생의 이름을 입력받는 기능
입력받은 학생이 있는지 검사하는 기능
학생 정보를 삭제하는 기능
```

### 각 상태별로 정리한 데이터는 누구의 데이터인지를 선별한다.

```declarative
메인 메뉴 상태
사용자가 선택한 메뉴 번호

학생 정보를 입력하는 상태
사용자가 선택한 운동부 종류 -> 축구부학생, 야구부학생, 농구부학생
이름 -> 축구부학생, 야구부학생, 농구부학생
나이 -> 축구부학생, 야구부학생, 농구부학생
축구부 골 넣은 개수 -> 축구부 학생
야구부 홈런의 개수 -> 야구부 학생
농구부 골 넣은 개수 -> 농구부 학생

학생 정보를 검색하는 상태
등록한 학생이 있는지 여부
사용자가 입력한 학생의 이름
사용자가 입력한 학생이 있는지 여부
소속 운동부 -> 축구부학생, 야구부학생, 농구부학생
이름 -> 축구부학생, 야구부학생, 농구부학생
나이 -> 축구부학생, 야구부학생, 농구부학생
축구부 골 넣은 개수 -> 축구부 학생
야구부 홈런개수 -> 야구부 학생
농구부 골넣은 개수 -> 농구부 학생

학생 정보 전체를 보여주는 상태
등록한 학생이 있는지 여부
전체 학생의 수
소속 운동부 -> 축구부학생, 야구부학생, 농구부학생
이름 -> 축구부학생, 야구부학생, 농구부학생
나이 -> 축구부학생, 야구부학생, 농구부학생
축구부 골 넣은 개수 -> 축구부 학생
야구부 홈런 개수 -> 야구부 학생
농구부 골 넣은 개수 -> 농구부 학생
축구부 학생 수
야구부 학생 수
농구부 학생 수

학생 정보를 삭제하는 상태
등록한 학생이 있는지 여부
사용자가 입력한 학생의 이름
입력한 학생이 있는지 여부
```

### 이를 토대로 model 패키지에 클래스를 만들어준다
- StudentClass
- SoccerStudentClass
- BaseBallStudentClass
- BasketBallStudentClass

[StudentClass.java]
```java

package com.lion.model;

public class StudentClass {
    // 운동부 타입
    int studentType;
    // 이름
    String studentName;
    // 나이
    int studentAge;
}
```
[SoccerStudentClass.java]

```java
package com.lion.model;

public class SoccerStudentClass extends StudentClass{
    // 골 넣은 개수
    int goalCount;
}


```

[BaseBallStudentClass.java]

```java
package com.lion.model;

public class BaseBallStudentClass extends StudentClass{
    // 홈런 개수
    int homeRunCount;
}

```

[BasketBallStudentClass.java]
```java

package com.lion.model;

public class BasketBallStudentClass extends StudentClass{
    // 골 넣은 개수
    int goalCount;
}


```

### 위에서 정리한 각 기능들을 어떤 클래스에 만들것인지 선별한다.
- 만약 model에 있는 클래스의 기능이 아니라면 각 상태별로 클래스를 만들어 각 상태별로 구현해준다.

```declarative
메인 메뉴 상태
사용자에게 메뉴 번호를 입력받는 기능

학생 정보를 입력하는 상태
운동부 종류 번호를 입력받는 기능
학생의 정보를 입력받는 기능 -> 축구부학생, 야구부학생, 농구부 학생

학생 정보를 검색하는 상태
등록된 학생이 있는지 확인하는 기능
검색하고자 하는 학생의 이름을 입력받는 기능
검색하고자 하는 학생이 있는지 검사하는 기능
검색된 학생의 정보를 출력하는 기능 -> 축구부학생, 야구부학생, 농구부학생
태클하는 기능 -> 축구부학생
도루하는 기능 -> 야구부학생
리바운드하는 기능 -> 농구부학생

학생 정보 전체를 보여주는 상태
등록된 학생이 있는지 확인하는 기능
전체 학생의 수를 구하는 기능
학생들의 정보를 출력하는 기능 -> 축구부학생, 야구부학생, 농구부학생
축구부, 야구부, 농구부 학생들의 수를 구하는 기능
태클하는 기능 -> 축구부학생
도루하는 기능 -> 야구부학생
리바운드하는 기능 -> 농구부학생

학생 정보를 삭제하는 상태
등록된 학생이 있는지 확인하는 기능
삭제할 학생의 이름을 입력받는 기능
입력받은 학생이 있는지 검사하는 기능
학생 정보를 삭제하는 기능
```

---

### model에 있는 각 클래스에 메서드를 구현해준다.

[StudentClass.java]

```java

    // 학생의 정보를 출력하는 기능
    public void showStudentInfo(){
        
    }
    
```

[SoccerStudentClass.java]

```java
    // 태클하는 기능
    void takkle(){

    }
```

[BaseBallStudentClass.java]
```java
    // 도루하는 기능
    void baseSteel(){
        
    }
```

[BasketBallStudentClass.java]

```java
    // 리바운드하는 기능
    void rebound(){
        
    }
```

### com.lion.service 패키지를 만들어준다.
- 각 상태별 Service클래스를 만들어준다.
- MainMenuService
- InputStudentService
- SearchStudentService
- ShowStudentInfoAllService
- DeleteStudentService

### MainMenuService에 메서드를 구현해준다.

```java

package com.lion.service;

public class MainMenuService {
    // 사용자에게 메뉴 번호를 입력받는 기능
    void inputMainMenuNumber(){

    }
}


```

### InputStudentService 에 메서드를 구현해준다.

```java

package com.lion.service;

public class InputStudentService {
    // 운동부 종류 번호를 입력받는 기능
    void inputStudentTypeNumber(){

    }
}


```
---

### SearchStudentService 에 메서드를 구현해준다.

```java
package com.lion.service;

public class SearchStudentService {
    // 등록된 학생이 있는지 확인하는 기능
    void checkStudentCount(){

    }
    // 검색하고자 하는 학생의 이름을 입력받는 기능
    void inputSearchStudentName(){

    }
    // 검색하고자 하는 학생이 있는지 검사하는 기능
    void checkSearchStudentExist(){

    }
}


```
---

### ShowStudentInfoAllService 에 필요한 메서드들을 구현해준다.

```java
package com.lion.service;

public class ShowStudentInfoAllService {
    // 등록된 학생이 있는지 확인하는 기능
    void checkStudentCount(){

    }
    // 전체 학생의 수를 구하는 기능
    void getStudentCount(){

    }
    // 축구부, 야구부, 농구부 학생들의 수를 구하는 기능
    void getStudentTypeCount(){

    }
}

```

### DeleteStudentService 에 메서드를 구현한다.
```java

package com.lion.service;

public class DeleteStudentService {
    // 등록된 학생이 있는지 확인하는 기능
    // 등록된 학생이 있는지 확인하는 기능
    void checkStudentCount(){

    }
    // 삭제할 학생의 이름을 입력받는 기능
    void inputDeleteStudentName(){

    }
    // 입력받은 학생이 있는지 검사하는 기능
    void checkDeleteStudentExist(){

    }
    // 학생 정보를 삭제하는 기능
    void deleteStudentInfo(){

    }
}

```

---

### MainMenuView 에서 서비스의 객체를 생성한다.
```java

    // 서비스 클래스
    MainMenuService mainMenuService;

    public MainMenuView(){
        mainMenuService = new MainMenuService();
    }
    
```
### Values에 각 메인 메뉴의 항목을 나타내는 값을 정의한다.

```java

    // 메인 메뉴의 항목을 나타내는 값
    int MAIN_MENU_INPUT_STUDENT_INFO = 1;
    int MAIN_MENU_SEARCH_STUDENT_INFO = 2;
    int MAIN_MENU_SHOW_STUDENT_INFO_ALL = 3;
    int MAIN_MENU_DELETE_STUDENT_INFO = 4;
    int MAIN_MENU_EXIT_PROGRAM = 5;
```

---

### Controller에 프로그램 상태를 설정할 수 있는 메서드를 구현해준다.
```java

    // 프로그램의 상태를 변경하는 메서드를 만들어준다.
    public void setProgramState(int programState){
        this.programState = programState;
    }

```

---

### MainMenuView 객체를 생성할 때 컨트롤러 객체를 전달할 수 있도록 변경해준다.
```java

                // 메인메뉴를 보여주는 상태
                case Values.STATE_SHOW_MAIN_MENU :
                    viewClass = new MainMenuView(this);
                    break;

```
---

### MainMenuView에 service 받을 변수를 정의하고 service 객체를 생성하고 controller를 받을 수 있도록 수정해준다.

```java

    // Controller 클래스
    ControllerClass controllerClass;
    // 서비스 클래스
    MainMenuService mainMenuService;

    public MainMenuView(ControllerClass controllerClass){
        this.controllerClass = controllerClass;
        mainMenuService = new MainMenuService();
    }
    
```

### show 메서드 내부를 수정해준다.

[MainMenuView.java]

```java
package com.lion.view;

import com.lion.controller.ControllerClass;
import com.lion.service.MainMenuService;
import com.lion.util.Values;

public class MainMenuView extends ViewClass{
    // Controller 클래스
    ControllerClass controllerClass;
    // 서비스 클래스
    MainMenuService mainMenuService;

    public MainMenuView(ControllerClass controllerClass){
        this.controllerClass = controllerClass;
        mainMenuService = new MainMenuService();
    }

    @Override
    public void show() {
        // 반복을 제어하는 변수
        boolean isRunning = true;

        // 제대로 입력할 때 까지 반복한다.
        while(isRunning) {
            try {
                System.out.println();
                System.out.println("1. 학생 정보 추가");
                System.out.println("2. 학생 이름 검색");
                System.out.println("3. 학생 전체 정보 보기");
                System.out.println("4. 학생 정보 삭제");
                System.out.println("5. 종료");
                System.out.println("메뉴 선택 :");
                // 메뉴를 입력받는다.
                int menuNumber = mainMenuService.inputMainMenuNumber();
                // 만약 잘못 입력하였다면
                if(menuNumber < 1 || menuNumber > 5){
                    System.out.println("잘못 입력 하였습니다");
                } else {
                    //  사용자가 입력한 메뉴 번호별로 분기한다.
                    // 각 메뉴에 따른 프로그램의 상태를 설정해준다.
                    switch (menuNumber){
                        case Values.MAIN_MENU_INPUT_STUDENT_INFO :
                            controllerClass.setProgramState(Values.STATE_INPUT_STUDENT_INFO);
                            break;
                        case Values.MAIN_MENU_SEARCH_STUDENT_INFO :
                            controllerClass.setProgramState(Values.STATE_SEARCH_STUDENT_INFO);
                            break;
                        case Values.MAIN_MENU_SHOW_STUDENT_INFO_ALL :
                            controllerClass.setProgramState(Values.STATE_SHOW_STUDENT_INFO_ALL);
                            break;
                        case Values.MAIN_MENU_DELETE_STUDENT_INFO :
                            controllerClass.setProgramState(Values.STATE_DELETE_STUDENT_INFO);
                            break;
                        case Values.MAIN_MENU_EXIT_PROGRAM :
                            controllerClass.setProgramState(Values.STATE_EXIT_PROGRAM);
                            break;
                    }
                    // 반복문을 종료한다.
                    isRunning = false;
                }
            }catch(Exception e){
                System.out.println("잘못 입력 하였습니다");
            }
        }
    }
}


```

### InputStudentInfoView에 변수를 정의하고 생성자를 작성해준다.

```java

    // 컨트롤러
    ControllerClass controllerClass;
    // 서비스
    InputStudentService inputStudentService;

    public InputStudentInfoView(ControllerClass controllerClass){
        this.controllerClass = controllerClass;
        inputStudentService = new InputStudentService();
    }
```

---

### Controller 에서 InputStudentInfoView 객체 생성하는 부분을 수정해준다.

```java
                    viewClass = new InputStudentInfoView(this);
```

---

### Values에 각 운동부를 나타내는 값을 정의한다.

```java

    // 각 운동부를 나타내는 값
    int TYPE_SOCCER = 1;
    int TYPE_BASEBALL = 2;
    int TYPE_BASKETBALL = 3;
```

---

### InputStudentService 에 운동부 종류를 입력받는 메서드를 구현해준다.

```java
    // 운동부 종류 번호를 입력받는 기능
    public int inputStudentTypeNumber(){
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        return type;
    }

```

---

### 입력받은 운동부 타입별로 분기한다.
```java

        // 운동부 종류별로 분기한다.
        // 학생 객체를 담을 변수
        StudentClass studentClass = null;
        // 운동부 타입에 따라 분기한다.
        switch (type){
            case Values.TYPE_SOCCER :
                break;
            case Values.TYPE_BASEBALL:
                break;
            case Values.TYPE_BASKETBALL:
                break;
        }

```

---

### StudentClass에 학생정보를 입력받는 메서드를 구현해준다.

```java
    // 학생 정보를 입력받는 기능
    public void inputStudentInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("이름 : ");
        studentName = scanner.next();
        System.out.print("나이 : ");
        studentAge = scanner.nextInt();
    }

```

---

### SoccerStudentClass에 학생 정보를 입력받는 메서드를 구현한다.

```java
    @Override
    public void inputStudentInfo() {
        super.inputStudentInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("골 넣은 개수 :");
        goalCount = scanner.nextInt();
    }

```

### BaseBallStudentClass에 학생 정보를 입력받는 메서드를 구현한다.

```java

    // 학생 정보를 입력받는 메서드
    @Override
    public void inputStudentInfo() {
        super.inputStudentInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("홈런 개수 :");
        homeRunCount = scanner.nextInt();
    }
```

### BasketBallStudent 에 학생 정보를 입력받는 메서드를 구현한다.
```java
    @Override
    public void inputStudentInfo() {
        super.inputStudentInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("골 넣은 개수 :");
        goalCount = scanner.nextInt();
    }
```


---
### InputStudentInfoView에 운동부 타입별로 분기하여 객체를 생성한다.
```java

        // 운동부 종류별로 분기한다.
        // 학생 객체를 담을 변수
        StudentClass studentClass = null;
        // 운동부 타입에 따라 분기한다.
        switch (type){
            case Values.TYPE_SOCCER :
                studentClass = new SoccerStudentClass();
                break;
            case Values.TYPE_BASEBALL:
                studentClass = new BaseBallStudentClass();
                break;
            case Values.TYPE_BASKETBALL:
                studentClass = new BasketBallStudentClass();
                break;
        }
```

### 학생 정보를 입력받는 부분을 구현해준다.

[InputStudentInfoView.java]

```java
        // 학생 정보를 입력받는 메서드를 호출한다.
        studentClass.inputStudentInfo();

```


---

### Controller에 학생 객체를 담을 리스트를 준비한다.
```java
    // 학생 객체를 담을 리스트
    private ArrayList<StudentClass> studentList;

    public ControllerClass(){
        studentList = new ArrayList<>();

```

### Controller에 학생 객체를 추가하는 메서드를 구현한다.
```java

    // 리스트에 학생 객체를 추가하는 메서드
    public void addStudentClass(StudentClass studentClass){
        studentList.add(studentClass);
    }

```

---

### InputStudentInfoView에 학생 객체를 리스트에 저장해준다.

```java

        // 학생 객체를 담아준다.
        controllerClass.addStudentClass(studentClass);
```

---

### SearchStudentInfoView에 변수를 선언하고 생성자를 구현해준다.
```java
    ControllerClass controllerClass;
    SearchStudentService searchStudentService;

    public SearchStudentInfoView(ControllerClass controllerClass){
        this.controllerClass = controllerClass;
        searchStudentService = new SearchStudentService();
    }

```
---

### Controller에서 InputStudentInfoView 객체를 생성하는 곳을 수정한다.

```java
                    viewClass = new SearchStudentInfoView(this);
```

---


### StudentClass에서 학생 이름을 반환하는 메서드를 구현해준다.
```java
    // 학생의 이름을 반환하는 메서드
    public String getStudentName(){
        return studentName;
    }
```

---

### Controller에 학생 이름을 받아 학생이 있는지 확인하는 메서드를 만들어준다.
```java

    // 학생이름으로 객체를 검색한다.
    public StudentClass searchStudentByName(String studentName){
        // 학생의 수 만큼 반복한다.
        for(StudentClass studentClass : studentList){
            // 현재 학생의 이름과 검색 이름이 같다면..
            if(studentClass.getStudentName().equals(studentName)){
                return studentClass;
            }
        }
        return null;
    }
    
```

### SearchStudentInfoView에 입력한 학생 정보를 검색하는 코드를 구현한다.
```java
            // 해당 이름의 학생이 있는지 검색한다.
            StudentClass studentClass = controllerClass.searchStudentByName(searchStudentName);
            // 학생이 없다면
            if(studentClass == null){
                System.out.println();
                System.out.println("검색된 학생이 없습니다");
            }
```

---

### StudentClass에 정보를 출력하는 메서드를 구현해준다.
```java
    // 학생의 정보를 출력하는 기능
    public void showStudentInfo(){
        System.out.printf("이름 : %s\n", studentName);
        System.out.printf("나이 : %d\n", studentAge);
    }

```

---

### BaseBallStudentClass에 학생 정보를 출력하는 메서드를 만들어준다.
```java

    public void baseSteel(){
        System.out.println("야구부 학생이 도루를 합니다");
    }
    @Override
    public void showStudentInfo() {
        System.out.println();
        System.out.println("야구부 선수 정보");
        super.showStudentInfo();
        System.out.printf("홈런 개수 : %d\n", homeRunCount);
        baseSteel();
    }
```

---

### BasketBallStudentClass에 학생 정보를 출력하는 메서드를 만들어준다.
```java

    // 리바운드하는 기능
    void rebound(){
        System.out.println("리바운드를 합니다.");
    }

    @Override
    public void showStudentInfo() {
        System.out.println();
        System.out.println("농구부 선수 정보");
        super.showStudentInfo();
        System.out.printf("골 넣은 개수 : %d\n", goalCount);
        rebound();
    }
```

---

### SoccerStudentClass에 학생 정보를 출력하는 메서드를 구현한다.
```java

    // 태클하는 기능
    public void takkle(){
        System.out.println("축구선수가 태클을 합니다");
    }

    @Override
    public void showStudentInfo() {
        System.out.println();
        System.out.println("축구부 선수 정보");
        super.showStudentInfo();
        System.out.printf("골 넣은 개수 : %d\n", goalCount);
        takkle();
    }
    
```

### SearchStudentInfoView의 show 메서드를 수정해준다.

```java

    @Override
    public void show() {
        System.out.println();
        // 리스트에 담겨져 있는 학생의 수를 가져온다.
        int studentCount = controllerClass.getStudentCount();

        if(studentCount == 0) {
            System.out.println("등록된 학생이 없습니다");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("학생의 이름을 입력해주세요 : ");
            String searchStudentName = scanner.next();
            // 해당 이름의 학생이 있는지 검색한다.
            StudentClass studentClass = controllerClass.searchStudentByName(searchStudentName);
            // 학생이 없다면
            if(studentClass == null){
                System.out.println();
                System.out.println("검색된 학생이 없습니다");
            } else {
                studentClass.showStudentInfo();
            }
        }
    }
```
---

### Controller에서 ShowStudentInfoAllView 객체를 생성하는 곳을 수정해준다.
```java
                    viewClass = new ShowStudentInfoAllView(this);

```

---

### ShowStudentInfoAllView 클래스에 변수를 추가하고 생성자를 구현해준다.
```java

    ControllerClass controllerClass;
    ShowStudentInfoAllService showStudentInfoAllService;
    
    public ShowStudentInfoAllView(ControllerClass controllerClass){
        this.controllerClass = controllerClass;
        showStudentInfoAllService = new ShowStudentInfoAllService();
    }
    
```


### Controller에 리스트를 반환하는 메서드를 만들어준다.
```java


    // 학생 정보를 담고있는 리스트를 반환한다.
    public ArrayList<StudentClass> getStudentList(){
        return studentList;
    }
```
---

### StudentClass에 학생 타입을 반환하는 메서드를 구현해준다.
```java
    // 운동부 타입을 반환하는 메서드
    public int getStudentType(){
        return studentType;
    }

```

---

### ShowStudentInfoAllService에 각 운동부별 학생수를 구하는 메서드를 구현해준다.
```java
    // 축구부, 야구부, 농구부 학생들의 수를 구하는 기능
    public int getStudentTypeCount(int type, ArrayList<StudentClass> studentList){
        // 학생수를 담을 변수
        int studentCount = 0;
        // 학생의 수 만큼 반복한다.
        for(StudentClass studentClass : studentList){
            // 현재 학생의 타입이 매개변수로 전달된 타입과 같은지
            if(studentClass.getStudentType() == type){
                // 학생 수를 증가시킨다.
                studentCount++;
            }
        }
        return studentCount;
    }
```
---

### 각 학생 클래스의 생성자에 학생 타입값을 담아준다.


```java
    public BaseBallStudentClass(){
        studentType = Values.TYPE_BASEBALL;
    }

    public BasketBallStudentClass(){
        studentType = Values.TYPE_BASKETBALL;
    }

    public SoccerStudentClass(){
        studentType = Values.TYPE_SOCCER;
    }
```

---

### ShowStudentInfoAllView에 학생 정보를 출력하는 부분을 구현해준다.

```java
    public void show() {
        System.out.println();
        // 학생 수를 가져온다.
        int studentCount = controllerClass.getStudentCount();
        // 학생이 없다면
        if(studentCount == 0){
            System.out.println("등록된 학생이 없습니다");
        } else {
            System.out.printf("전체 학생의 수 : %d명\n", studentCount);
            // 학생 객체가 담겨져 있는 리스트를 받아온다.
            ArrayList<StudentClass> studentList = controllerClass.getStudentList();
            // 학생의 수 만큼 반복하면서 출력한다.
            for(StudentClass studentClass : studentList){
                studentClass.showStudentInfo();
            }

            // 각 운동부 별 학생 수를 구한다.
            int cnt1 = showStudentInfoAllService.getStudentTypeCount(Values.TYPE_SOCCER, studentList);
            int cnt2 = showStudentInfoAllService.getStudentTypeCount(Values.TYPE_BASEBALL, studentList);
            int cnt3 = showStudentInfoAllService.getStudentTypeCount(Values.TYPE_BASKETBALL, studentList);
            System.out.println();
            System.out.printf("축구부 : %d명\n", cnt1);
            System.out.printf("야구부 : %d명\n", cnt2);
            System.out.printf("농구부 : %d명\n", cnt3);

        }
    }

```

---

### Controller에 DeleteStudentView 객체 생성 하는 코드를 수정해준다.
```java
                    viewClass = new DeleteStudentView(this);
```

---

### DeleteStudentView 클래스에 변수를 선언하고 생성자를 작성해준다.
```java
    ControllerClass controllerClass;
    DeleteStudentService deleteStudentService;

    public DeleteStudentView(ControllerClass controllerClass){
        this.controllerClass = controllerClass;
        deleteStudentService = new DeleteStudentService();
    }

```

---

### DeleteStudentService 클래스에 학생 이름을 입력받는 메서드를 구현한다.

```java
    // 삭제할 학생의 이름을 입력받는 기능
    public String inputDeleteStudentName(){
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.next();
        return studentName;
    }
```

---

### Controller에 학생 객체를 제거하는 메서드를 구현해준다.
```java
    // 매개변수로 받은 객체를 제거한다.
    public void deleteStudentClass(StudentClass studentClass){
        studentList.remove(studentClass);
    }
```
### DeleteStudentView 클래스의 show 메서드를 수정해준다.
```java
    @Override
    public void show() {
        System.out.println();
        // 학생의 수를 가져온다.
        int studentCount = controllerClass.getStudentCount();
        // 학생이 없다면
        if(studentCount == 0) {
            System.out.println("등록된 학생이 없습니다.");
        } else{
            System.out.print("삭제할 학생의 이름 입력 : ");
            String searchName = deleteStudentService.inputDeleteStudentName();
            // 이름에 해당하는 학생 객체를 가져온다.
            StudentClass studentClass = controllerClass.searchStudentByName(searchName);
            // 해당하는 학생이 없다면
            if(studentClass == null){
                System.out.println("입력한 학생은 없습니다");
            } else {
                controllerClass.deleteStudentClass(studentClass);
                System.out.println("삭제하였습니다");
            }
        }
    }
```

### Controller에 MainMenu 상태 인지를 담을 변수를 선언해준다.
```java
    // 메인메뉴 상태인지 여부값
    private boolean isMainMenu;
```
---

### Controller에 초기 상태값을 설정해준다.
```java

        // 프로그램의 초기 상태를 설정한다.
        programState = Values.STATE_SHOW_MAIN_MENU;
        isMainMenu = true;
```

---

### Controller에 각 상태별 분기한 곳에 다음 같이 넣어준다.
- MainMenu 상태 : isMainMenu = true;
- 나머지 : isMainMenu = false;
---

### Contrller 하단부분에 메인메뉴가 아니라면 메인메뉴 상태로 변경하도록 한다.
```java
            // 메인메뉴 상태가 아니라면 메인메뉴 상태로 변경해준다.
            if(isMainMenu == false){
                programState = Values.STATE_SHOW_MAIN_MENU;
            }
```






