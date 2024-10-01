### 학생관리 프로그램에 파일 입출력을 적용해 본다.

---

### 프로그램의 내용은 이전과 동일하게 한다.

---

### 패키지 생성
- com.lion.main : main 메서드를 구한
- com.lion.repository : 데이터를 읽어와 데이터를 관리하는 객체에 담아주는 역할을 한다.
- com.lion.model : 데이터를 담고 데이터를 처리하는 객체
- com.lion.view : 눈에 보이는 화면을 처리는 객체
- com.lion.controller : 코드의 흐름을 제어한다.
- com.lion.util : 기타 도구 역할

---

# 프로그램의 상태 정의

### 프로그램은 다음과 같은 상태로 정의된다.
- 메인 메뉴를 보여주는 상태
- 학생 정보를 입력받는 상태
- 학생 이름을 통해 검색하여 보여는 상태
- 학생 정보 전체를 보여주는 상태
- 학생 정보를 삭제하는 상태
- 프로그램 종료 상태

### util 패키지에 Values 인터페이스를 생성해준다.

```java
package com.lion.util;

public interface Values {
    // 프로그램의 상태를 정의하는 값
    // 메인 메뉴를 보여주는 상태
    int STATE_SHOW_MAIN_MENU = 1;
    // 학생 정보를 입력받는 상태
    int STATE_INPUT_STUDENT_INFO = 2;
    // 학생 이름을 통해 검색하여 보여는 상태
    int STATE_SEARCH_STUDENT_BY_NAME = 3;
    // 학생 정보 전체를 보여주는 상태
    int STATE_SHOW_STUDENT_INFO_ALL = 4;
    // 학생 정보를 삭제하는 상태
    int STATE_DELETE_STUDENT_INFO = 5;
    // 프로그램 종료 상태
    int STATE_EXIT_PROGRAM = 6;
}
```

---

# Controller 작성

### contoller 패키지에 ControllerClass를 만들어준다.

### 프로그램 상태를 담을 변수를 선언하고 초기 상태 값을 설정해준다.

```java
    // 프로그램 상태값을 담을 변수
    private int programState;

    // 생성자
    public ControllerClass(){
        // 프로그램의 초기 상태를 설정한다.
        programState = Values.STATE_SHOW_MAIN_MENU;
    }
```

### 상태별로 분기하여 반복하는 메서드를 만들어준다.

```java

    // 상태별로 분기하면서 필요한 처리를 하는 메서드
    public void doController(){

        // 반복을 제어하기 위한 변수
        boolean isRunning = true;

        // 반복한다.
        while(isRunning){
            // 테스트용으로 한번만 반복되게 한다.
            isRunning = false;
        }
    }
```

### 프로그램 상태에 따라 분기되도록 작성해준다.

```java

            // 프로그램 상태에 따라 분기한다.
            switch (programState){
                // 메인 메뉴를 보여주는 상태
                case Values.STATE_SHOW_MAIN_MENU :
                    break;
                // 학생 정보를 입력받는 상태
                case Values.STATE_INPUT_STUDENT_INFO :
                    break;
                // 학생 이름을 통해 검색하여 보여는 상태
                case Values.STATE_SEARCH_STUDENT_BY_NAME :
                    break;
                // 학생 정보 전체를 보여주는 상태
                case Values.STATE_SHOW_STUDENT_INFO_ALL :
                    break;
                // 학생 정보를 삭제하는 상태
                case Values.STATE_DELETE_STUDENT_INFO :
                    break;
                // 프로그램 종료 상태
                case Values.STATE_EXIT_PROGRAM :
                    break;
            }

```

---

# 출력 화면을 만들어준다.

### 각 View 클래스가 상속받을 ViewClass 를 view 패키지에 만들어준다.

```java
package com.lion.view;

public abstract class ViewClass {
    public abstract void doShow();
}
```

### Controller 클래스의 doController 메서드에 View 객체를 담을 변수를 선언한다.
```java
        // 화면 처리를 하기 위한 객체를 담을 변수
        ViewClass viewClass = null;
```

### Controller 클래스의 doControoler 메서드의 제일 마지막에 ViewClass가 가지고 있는 메서드를 호출한다.
```java
            // 화면 출력 메서드를 호출한다.
            viewClass.doShow();
```

### view 패키지에 메인 메뉴 화면을 처리할 ShowMainMenuView 클래스를 생성해준다.

```java
package com.lion.view;

public class ShowMainMenuView extends ViewClass{
    @Override
    public void doShow() {

    }
}

```

### ShowMainMenuView 클래스의 메서드를 구현해준다.
```java
    public void doShow() {
        System.out.println();
        System.out.println("메뉴를 선택해주세요");
        System.out.println("1. 학생 정보 입력");
        System.out.println("2. 학생 이름으로 검색");
        System.out.println("3. 학생 정보 전체 보기");
        System.out.println("4. 학생 정보 삭제 하기");
        System.out.println("5. 프로그램 종료");
        System.out.println("메뉴 입력 : ");
    }
```

### Controller 클래스에서 메인 메뉴를 보여주는 상태일 때 ShowMainMenuView 객체를 생성한다.
```java
                    viewClass = new ShowMainMenuView();
```

### main 패키지에 MainClass를 만들고 main 메서드를 구현해준다.
```java
package com.lion.main;

import com.lion.controller.ControllerClass;

public class MainClass {
    public static void main(String[] args) {
        ControllerClass controllerClass = new ControllerClass();
        controllerClass.doController();
    }
}
```

### 다음 상태 구현을 위해 Controller의 초기 상태를 변경해준다.
```java
        // 프로그램의 초기 상태를 설정한다.
        programState = Values.STATE_INPUT_STUDENT_INFO;
```

### 학생 정보를 입력받는 화면을 위해 InputStudentInfoView 클래스를 view 패키지에 만들어준다.
```java
package com.lion.view;

public class InputStudentInfoView extends ViewClass{

    @Override
    public void doShow() {
        
    }
}
```

### 출력하는 메서드를 구현해준다.
```java
    public void doShow() {
        System.out.println();
        System.out.println("소속 운동부 선택");
        System.out.println("1. 축구부");
        System.out.println("2. 야구부");
        System.out.println("3. 농구부");
        System.out.println("소속 운동부 : ");

        System.out.println();
        System.out.println("축구부 학생 정보 입력");
        System.out.println("이름 : ");
        System.out.println("나이 : ");
        System.out.println("골 넣은 개수 : ");

        System.out.println();
        System.out.println("야구부 학생 정보 입력");
        System.out.println("이름 : ");
        System.out.println("나이 : ");
        System.out.println("홈런 친 개수 : ");

        System.out.println();
        System.out.println("농구부 학생 정보 입력");
        System.out.println("이름 : ");
        System.out.println("나이 : ");
        System.out.println("리바운드 개수 : ");
    }
```

### Controller 에서 학생 정보 입력 상태일 때 InputStudentInfoView 객체를 생성해준다.
```java
                    viewClass = new InputStudentInfoView();
```

### 다음 구현을 위해 Contoller의 프로그램 상태를 변경해준다.
```java
        // 프로그램의 초기 상태를 설정한다.
        programState = Values.STATE_SEARCH_STUDENT_BY_NAME;
```

### 학생 정보 검색을 위핸 SearchStudentByNameView 클래스를 view 패키지에 만들어준다.
```java
package com.lion.view;

public class SearchStudentByNameView extends ViewClass{
    @Override
    public void doShow() {
        
    }
}
```

### 출력 메서드를 구현해준다.
```java
@Override
    public void doShow() {
        System.out.println();
        System.out.println("저장된 학생 정보가 없습니다");
        System.out.println("검색할 학생의 이름 : ");
        
        System.out.println();
        System.out.println("소속 운동부 : 축구부");
        System.out.println("이름 : 박지성");
        System.out.println("나이 : 40살");
        System.out.println("골 넣은 개수 : 50골");
        System.out.println("축구 선수가 태클을 합니다");
        
        System.out.println();
        System.out.println("소속 운동부 : 야구부");
        System.out.println("이름 : 오타니");
        System.out.println("나이 : 23살");
        System.out.println("홈런 친 개수 : 54개");
        System.out.println("야구 선수가 도루를 합니다");

        System.out.println();
        System.out.println("소속 운동부 : 농구부");
        System.out.println("이름 : 마이클조던");
        System.out.println("나이 : 100살");
        System.out.println("리바운드 개수 : 1000개");
        System.out.println("농구 선수가 블로킹을 합니다");
    }
```

### Controller에서 학생 정보 검색 상태에 객체를 생성해준다.
```java
                    viewClass = new SearchStudentByNameView();
```

### Controller에서 프로그램 초기 상태를 변경해준다.
```java
        // 프로그램의 초기 상태를 설정한다.
        programState = Values.STATE_SHOW_STUDENT_INFO_ALL;
```

### 학생 정보 전체를 보기위한 ShowStudentInfoAllView 클래스를 view 패키지에 만들어준다.
```java
package com.lion.view;

public class ShowStudentInfoAllView extends ViewClass{
    @Override
    public void doShow() {

    }
}

```

### 출력하는 메서드를 구현해준다.
```java
    public void doShow() {
        System.out.println();
        System.out.println("등록된 학생 정보가 없습니다");
        System.out.println("총 학생 수 : 100명");

        System.out.println();
        System.out.println("소속 운동부 : 축구부");
        System.out.println("이름 : 박지성");
        System.out.println("나이 : 40살");
        System.out.println("골 넣은 개수 : 50골");
        System.out.println("축구 선수가 태클을 합니다");

        System.out.println();
        System.out.println("소속 운동부 : 야구부");
        System.out.println("이름 : 오타니");
        System.out.println("나이 : 23살");
        System.out.println("홈런 친 개수 : 54개");
        System.out.println("야구 선수가 도루를 합니다");

        System.out.println();
        System.out.println("소속 운동부 : 농구부");
        System.out.println("이름 : 마이클조던");
        System.out.println("나이 : 100살");
        System.out.println("리바운드 개수 : 1000개");
        System.out.println("농구 선수가 블로킹을 합니다");

        System.out.println();
        System.out.println("축구부 : 30명");
        System.out.println("야구부 : 30명");
        System.out.println("농구부 : 30명");
    }

```

### Controller 클래스에 학생 정보 전체를 보여주는 상태의 객체를 생성해준다.
```java
                    viewClass = new ShowStudentInfoAllView();
```

### 학생 정보 삭제를 위해 Controller의 초기 상태를 변경해준다.
```java
        // 프로그램의 초기 상태를 설정한다.
        programState = Values.STATE_DELETE_STUDENT_INFO;
```

### 학생 정보 삭제 상태를 위해 view 패키지에 DeleteStudentInfoView 클래스를 생성해준다.
```java
package com.lion.view;

public class DeleteStudentInfoView extends ViewClass{
    @Override
    public void doShow() {
        
    }
}
```

### 출력하는 메서드를 구현해준다.
```java

    public void doShow() {
        System.out.println();
        System.out.println("저장된 학생 정보가 없습니다");
        System.out.println("삭제할 학생 이름 : ");
        System.out.println("입력하신 학생은 존재하지 않습니다");
        System.out.println("홍길동 학생의 정보를 삭제하였습니다");
    }
```

### Controller에서 학생 정보 삭제 상태일 때 객체를 생성해준다.
```java
                    viewClass = new DeleteStudentInfoView();
```

### Contoller에서 종료 상태일때를 구현해준다.
```java
                    System.out.println("프로그램을 종료합니다");
                    System.exit(0);
```

---

 

### 각 상태별 구현을 위해 필요한 데이터를 추출한다.
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
- 축구부 학생 수
- 야구부 학생 수
- 농구부 학생 수

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

5. 학생 정보 삭제
- 저장된 학생 정보가 있는지 확인하는 기능 -> Repository
- 삭제할 학생 이름을 입력받는 기능 -> View
- 입력한 학생이 있는지 검사하는 기능 -> Repository
- 입력한 학생의 정보를 삭제하는 기능 -> Repository

---

# 학생들의 정보를 담을 클래스

### model 패키지에 각 학생 클래들이 상속받을 StudentClass를 만들어준다.

```java
package com.lion.model;

public class StudentClass {
    // 소속 운동부 번호
    int type;
    // 학생 이름
    String studentName;
    // 학생 나이
    int studentAge;
}
```

### model 패키지 각 학생별 클래스를 만들어준다.
- SoccerStudentClass
- BaseBallStudentClass
- BasketBallStudentClass

### 축구 선수 클래스를 생성해준다.
```java
package com.lion.model;

public class SoccerStudentClass extends StudentClass{
    // 골 넣은 개수
    int goalCount;
}
```

### 야구 선수 클래스를 생성해준다.
```java
package com.lion.model;

public class BaseBallStudentClass extends StudentClass{
    // 홈런 친 개수
    int homeRunCount;
}

```

### 농구선수 클래스를 생성해준다.
```java
package com.lion.model;

public class BasketBallStudentClass extends StudentClass{
    // 리바운드 개수
    int reboundCount;
}

```

### ShowMainMenuView 클래스에 필요한 메서드를 구현해준다.
```java
    // 메뉴 번호를 입력받는 메서드
    public void inputMenuNumber(){

    }
```

### InputStudentInfoView 클래스에 필요한 메서드를 구현해준다.
```java
    // 소속 운동부 번호를 입력받는 메서드
    public void inputStudentType(){

    }
    // 학생 정보를 입력받는 메서드
    public void inputStudentInfo(){

    }
```

### SeardchStudentByNameView 클래스에 필요한 메서드를 구현한다.
```java
    // 학생 이름을 입력받는 메서드
    public void inputSearchStudentName(){

    }

    // 검색된 학생의 정보를 출력하는 메서드
    public void showSearchStudentInfo(){

    }
```

### StudentClass에 필요한 메서드를 구현해준다.
```java
    // 학생의 정보를 출력하는 메서드
    public void showStudentInfo(){

    }
    // 학생의 특기를 출력하는 메서드
    public void showAction(){
        
    }
```

### BaseBallStudentClass에 메서드를 구현해준다.
```java
    @Override
    public void showStudentInfo() {
        super.showStudentInfo();
    }

    @Override
    public void showAction() {
        super.showAction();
    }
```

### BasketBallStudentClass에 필요한 메서드를 구현해준다.

```java
    @Override
    public void showStudentInfo() {
        super.showStudentInfo();
    }

    @Override
    public void showAction() {
        super.showAction();
    }
```

### SoccerStudentClass에 필요한 메서드를 구현해준다.
```java
    @Override
    public void showStudentInfo() {
        super.showStudentInfo();
    }

    @Override
    public void showAction() {
        super.showAction();
    }
```

### ShowStudentInfoAllView에 필요한 메서드를 구현해준다.
```java
    // 전체 학생 정보를 출력하는 메서드
    public void showStudentInfoAll(){

    }

    // 각 운동부 별 학생 정보를 출력하는 메서드
    public void showStudentCountByType(){

    }
```

### DeleteStudentInfoView에 필요한 메서드들을 구현해준다.
```java
    // 삭제할 학생 이름을 입력받는 메서드
    public void inputDeleteStudentName(){
        
    }
```

### repository 패키지에 StudentRepository 클래스를 만들어준다.

```java
package com.lion.repository;

public class StudentRepository {
    // 학생 정보를 저장하는 메서드
    public void saveStudentInfo(){

    }

    // 저장된 학생 정보가 있는지 확인하는 메서드
    public void checkStudentExistAll(){

    }

    // 이름을 통해 학생 정보를 검색하는 메서드
    public void searchStudentInfoByName(){

    }

    // 총 학생수를 구하는 메서드
    public void getStudentCountAll(){

    }

    // 학생 정보 전체를 가져오는 메서드
    public void getStudentInfoAll(){

    }

    // 각 운동부 별 학생 수를 구하는 메서드
    public void getStudentCountByType(){

    }

    // 이름을 통해 학생이 있는지 검사
    public void checkStudentExistByName(){

    }

    // 입력한 학생 정보를 삭제하는 메서드
    public void deleteStudentInfoByName(){

    }
}

```

---

# Repository 구현

### Values에 파일 이름을 정의한다.
```java
    // 저장 파일 이름
    String FILE_NAME = "student.dat";
```

### 파일로 부터 리스트를 읽어와 반환하는 메서드를 만들어준다.
```java
    // 학생 정보 전체를 가져오는 메서드
    public ArrayList<StudentClass> getStudentInfoAll(){
        ArrayList<StudentClass> studentList = null;

        try{
            // 파일이 있는지 확인한다.
            File file = new File(Values.FILE_NAME);
            if(file.exists()){
                // 파일로 부터 리스트를 읽어온다.
                FileInputStream fis = new FileInputStream(Values.FILE_NAME);
                ObjectInputStream ois = new ObjectInputStream(fis);
                studentList = (ArrayList<StudentClass>) ois.readObject();
                ois.close();
                fis.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        return studentList;
    }
```

### 학생 정보를 저장하는 메서드를 구현한다.
```java
    // 학생 정보를 저장하는 메서드
    public void saveStudentInfo(StudentClass studentClass){
        try{
            // 저장되어 있는 학생 정보 전체를 읽어온다.
            ArrayList<StudentClass> studentList = getStudentInfoAll();
            // 만약 가져온 것이 없면(파일이 없을 경우)
            // 새로운 리스트를 생성한다.
            if(studentList == null){
                studentList = new ArrayList<>();
            }
            // 리스트에 학생 객체를 담아준다.
            studentList.add(studentClass);
            // 파일에 저장한다.
            FileOutputStream fos = new FileOutputStream(Values.FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            oos.flush();
            oos.close();
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
```

### 저장되어 있는지 확인하는 메서드를 구현한다
```java
    // 저장된 학생 정보가 있는지 확인하는 메서드
    public boolean checkStudentExistAll(){
        boolean result = true;

        try{
            // 저장된 학생 정보들을 가져온다.
            ArrayList<StudentClass> studentList = getStudentInfoAll();
            // 만약 null이거나 관리하는 객체의 개수가 0으면 저장된 것이 없는 것으로 한다.
            if(studentList == null || studentList.size() == 0){
                result = false;
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return result;
    }
```

### StudentClass에 학생 이름을 반환하는 메서드를 만들어준다.
```java
    // 학생의 이름을 반환하는 메서드
    public String getStudentName(){
        return studentName;
    }
```

### StudentRepository 클래스에 학생 이름을 통해 학생 객체를 검색하는 메서드를 만들어준다.
```java
    // 이름을 통해 학생 정보를 검색하는 메서드
    public StudentClass searchStudentInfoByName(String searchStudentName){
        StudentClass studentClass = null;

        // 학생들의 정보를 가져온다.
        ArrayList<StudentClass> studentList = getStudentInfoAll();
        // 저장되어 있는 학생이 있다면
        if(studentList != null && studentList.size() > 0){
            // 학생의 수 만큼 반복한다.
            for(StudentClass item : studentList){
                // 현재의 학생 이름과 검색하고자 하는 학생의 이름이 같다면..
                if(item.getStudentName().equals(searchStudentName)){
                    // 현재 학생 객체를 변수에 담아준다.
                    studentClass = item;
                    break;
                }
            }
        }

        return studentClass;
    }

```

### 학생의 수를 구하는 메서드를 구현해준다.
```java
    // 총 학생수를 구하는 메서드
    public int getStudentCountAll(){
        // 학생 수를 담을 변수
        int studentCount = 0;

        // 학생 정보를 가져온다.
        ArrayList<StudentClass> studentList = getStudentInfoAll();
        // 저장된 학생 정보가 있다면..
        if(studentList != null || studentList.size() > 0){
            studentCount = studentList.size();
        }

        return studentCount;
    }
```

### Values 에 각 운동부를 나타내는 값을 정의한다.
```java
    // 각 운동부를 나타내는 값
    int TYPE_SOCCER = 1;
    int TYPE_BASEBALL = 2;
    int TYPE_BASKETBALL = 3;
```

### StudentClass에 학생 타입을 반환하는 메서드를 구현해준다.
```java
    // 학생의 타입을 반환하는 메서드
    public int getType(){
        return type;
    }
```

### 운동부별 학생 수를 구하는 함수를 구현한다.
```java
    // 각 운동부 별 학생 수를 구하는 메서드
    public HashMap<String, Integer> getStudentCountByType(){
        // 각 운동부 학생의 수를 담을 변수
        int soccerCount = 0;
        int baseBallCount = 0;
        int basketBallCount = 0;

        // 학생들의 데이터를 가져온다.
        ArrayList<StudentClass> studentList = getStudentInfoAll();

        // 가져온 데이터가 있다면
        if(studentList != null && studentList.size() > 0){
            // 학생의 수 만큼 반복한다.
            for(StudentClass item : studentList){
                // 운동부 타입으로 분기한다.
                switch (item.getType()){
                    case Values.TYPE_SOCCER :
                        soccerCount++;
                        break;
                    case Values.TYPE_BASEBALL:
                        baseBallCount++;
                        break;
                    case Values.TYPE_BASKETBALL:
                        basketBallCount++;
                        break;
                }
            }
        }
        // 학생 수를 맵에 담겠는다.
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("soccerCount", soccerCount);
        map1.put("baseBallCount", baseBallCount);
        map1.put("basketBallCount", basketBallCount);

        return map1;
    }
```

### 학생 이름을 통해 학생 정보기 잇는지 확인하는 메서드를 만들어준다.
```java

    // 이름을 통해 학생이 있는지 검사
    public boolean checkStudentExistByName(String searchStudentName){
        boolean result = false;

        // 학생들의 정보를 가져온다.
        ArrayList<StudentClass> studentList = getStudentInfoAll();
        // 가져온 학생 정보가 있다면..
        if(studentList != null && studentList.size() > 0){
            // 학생의 수 만큼 반복한다.
            for(StudentClass item : studentList){
                // 학생의 이름과 검색 이름이 같은지 확인한다.
                if(item.getStudentName().equals(searchStudentName)){
                    result = true;
                    break;
                }
            }
        }

        return result;
    }
```

### 학생 객체를 삭제하는 메서드를 구현해준다.
```java

    // 입력한 학생 정보를 삭제하는 메서드
    public void deleteStudentInfoByName(String deleteStudentName){
        // 삭제할 학생 객체의 위치를 가지고 있는 변수
        int deleteIndex = -1;
        // 학생 정보들을 가져온다.
        ArrayList<StudentClass> studentList = getStudentInfoAll();
        // 가져온 것이 있다면
        if(studentList != null && studentList.size() > 0){
            // 학생의 수 만큼 반복한다.
            for(int i = 0 ; i < studentList.size() ; i++){
                // 이름이 같다면
                // i 번째 객체를 추출한다.
                StudentClass item = studentList.get(i);
                if(item.getStudentName().equals(deleteStudentName)){
                    // 현재의 순값을 변수에 담아준다.
                    deleteIndex = i;
                    break;
                }
            }
        }
        // 삭제한다.
        if(deleteIndex > -1){
            studentList.remove(deleteIndex);
            try{
                // 파일에 저장한다.
                FileOutputStream fos = new FileOutputStream(Values.FILE_NAME);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(studentList);
                oos.flush();
                oos.close();
                fos.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
```
---

# 각 학생 객체를 구현한다.

### StudentClass를 객체 직렬화 한다.
```java
 implements Serializable
```

### StudentClass에 학생 정보를 입력받는 메서드를 만들어준다.
```java
    // 학생의 정보를 입력받는 메서드
    public void inputStudentInfo(Scanner scanner){
        System.out.print("이름 : ");
        studentName = scanner.next();
        System.out.print("나이 : ");
        studentAge = scanner.nextInt();
    }
```

### StudentClass에 학생 정보를 출력하는 메서드를 만들어준다.
```java
    // 학생의 정보를 출력하는 메서드
    public void showStudentInfo(){
        System.out.printf("이름 : %s\n", studentName);
        System.out.printf("나이 : %d살\n", studentAge);
    }
```

### StudentClass의 showAction은 추상 메서드로 만들어준다. 클래스도 추상 클래스로 만들어준다.
```java
// 학생의 특기를 출력하는 메서드
public abstract void showAction();
```


```java
public abstract class StudentClass
```

### BaseBallStudentClass에 학생 정보를 입력받는 메서드를 구현해준다.
```java
    // 학생 정보를 입력받는 메서드
    @Override
    public void inputStudentInfo(Scanner scanner) {
        type = Values.TYPE_BASEBALL;
        System.out.println();
        System.out.println("야구부 학생 정보 입력");
        super.inputStudentInfo(scanner);
        System.out.print("홈런 친 개수 : ");
        homeRunCount = scanner.nextInt();
    }
```

### BaseBallStudentClass에 학생 정보를 출력하는 메서드를 구현한다.
```java
    @Override
    public void showStudentInfo() {
        System.out.println();
        System.out.println("소속 운동부 : 야구부");
        super.showStudentInfo();
        System.out.printf("홈런 친 개수 : %d개\n", homeRunCount);
    }
```

### BaseBallStudentClass에 특기 메서드를 구현한다.
```java
    @Override
    public void showAction() {
        System.out.println("야구 선수가 도루를 합니다");
    }
```

### BasketBallStudentClass

```java

    @Override
    public void inputStudentInfo(Scanner scanner) {
        type = Values.TYPE_BASKETBALL;
        System.out.println();
        System.out.println("농구부 학생 정보 입력");
        super.inputStudentInfo(scanner);
        System.out.print("리바운드 개수 : ");
        reboundCount = scanner.nextInt();
    }

    @Override
    public void showStudentInfo() {
        System.out.println();
        System.out.println("소속 운동부 : 농구부");
        super.showStudentInfo();
        System.out.printf("리바운드 개수 : %d개\n", reboundCount);
    }

    @Override
    public void showAction() {
        System.out.println("농구 선수가 블로킹을 합니다");
    }
```

### SoccerStudentClass의 메서드를 구현한다.
```java
    @Override
    public void inputStudentInfo(Scanner scanner) {
        type = Values.TYPE_SOCCER;
        System.out.println();
        System.out.println("축구부 학생 정보 입력");
        super.inputStudentInfo(scanner);
        System.out.print("골 넣은 개수 : ");
        goalCount = scanner.nextInt();
    }

    @Override
    public void showStudentInfo() {
        System.out.println();
        System.out.println("소속 운동부 : 축구부");
        super.showStudentInfo();
        System.out.printf("골 넣은 개수 : %d골\n", goalCount);
    }

    @Override
    public void showAction() {
        System.out.println("축구 선수가 태클을 합니다");
    }
```

---

# View를 구현한다.

### Controller에 상태값을 변경하는 메서드를 구현해준다.

```java
    // 상태값을 변경하는 메서드
    public void setProgramState(int programState){
        this.programState = programState;
    }
```

### Controller 에서 삭제 상태 객체를 생성하는 코드를 수정해준다.(this)
```java
                // 학생 정보를 삭제하는 상태
                case Values.STATE_DELETE_STUDENT_INFO :
                    viewClass = new DeleteStudentInfoView(this);
                    break;

```

### DeleteStudentInfoView 클래스에 Contoller를 담을 변수를 선언하고 생성자를 구현해준다.
```java
    ControllerClass controllerClass;

    public DeleteStudentInfoView(ControllerClass controllerClass){
        this.controllerClass = controllerClass;
    }
```

### 편리성을 위해 Repository에 있는 모든 메서드들을 static으로 변경한다.

### DeleteStudentInfoView 의 메서드를 구현해준다.
```java

    @Override
    public void doShow() {
        System.out.println();
        // 저장된 학생 정보가 있는지 확인한다.
        boolean chk = StudentRepository.checkStudentExistAll();
        if(chk == false) {
            System.out.println("저장된 학생 정보가 없습니다");
        } else {
            // 삭제할 학생의 이름을 입력받는다.
            System.out.print("삭제할 학생 이름 : ");
            String inputName = inputDeleteStudentName();
            // 학생이 있는지 확인한다.
            boolean chk2 = StudentRepository.checkStudentExistByName(inputName);
            if(chk2 == false) {
                System.out.println("입력하신 학생은 존재하지 않습니다");
            } else {
                // 학생 정보를 삭제한다.
                StudentRepository.deleteStudentInfoByName(inputName);
                System.out.printf("%s 학생의 정보를 삭제하였습니다\n", inputName);
            }
        }
        // 프로그램의 상태를 메인 메뉴 상태로 변경한다.
        controllerClass.setProgramState(Values.STATE_SHOW_MAIN_MENU);
    }

    // 삭제할 학생 이름을 입력받는 메서드
    public String inputDeleteStudentName(){
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.next();
        return inputName;
    }
```
### Controller에 학생정보 입력 상태일 때 객체를 생성하는 부분을 수정한다.
```java
                    viewClass = new InputStudentInfoView(this);
```

### InputStudentInfoView의 생성자를 구현해준다.
```java

    ControllerClass controllerClass;

    public InputStudentInfoView(ControllerClass controllerClass){
        this.controllerClass = controllerClass;
    }
    
```

### InputStudentInfoView 의 메서드를 구현해준다.
```java

    @Override
    public void doShow() {
        System.out.println();
        System.out.println("소속 운동부 선택");
        System.out.println("1. 축구부");
        System.out.println("2. 야구부");
        System.out.println("3. 농구부");
        System.out.print("소속 운동부 : ");
        // 운동부 번호를 입력받는다.
        int inputType = inputStudentType();

        // 학생 객체를 담을 변수
        StudentClass studentClass = null;
        // 운동부로 분기한다.
        switch (inputType){
            case Values.TYPE_SOCCER:
                studentClass = new SoccerStudentClass();
                break;
            case Values.TYPE_BASEBALL:
                studentClass = new BaseBallStudentClass();
                break;
            case Values.TYPE_BASKETBALL:
                studentClass = new BasketBallStudentClass();
                break;
        }

        // 학생 정보를 입력받는다.
        Scanner scanner = new Scanner(System.in);
        studentClass.inputStudentInfo(scanner);

        // 학생 정보를 저장한다.
        StudentRepository.saveStudentInfo(studentClass);

        // 프로그램 상태를 메인메뉴 상태로 변경한다.
        controllerClass.setProgramState(Values.STATE_SHOW_MAIN_MENU);

    }
    // 소속 운동부 번호를 입력받는 메서드
    public int inputStudentType(){
        Scanner scanner = new Scanner(System.in);
        int inputType = scanner.nextInt();
        return inputType;
    }
```

### Controller에 학생정보 검색 상태일 때 객체를 생성하는 부분을 수정한다.
```java
                    viewClass = new SearchStudentByNameView(this);
```

### SearchStudentByNameView의 생성자를 구현해준다.
```java
    ControllerClass controllerClass;

    public SearchStudentByNameView(ControllerClass controllerClass){
        this.controllerClass = controllerClass;
    }
```


### SearchStudentByNameView 의 메서드들을 구현한다.
```java
    public void doShow() {
        System.out.println();
        // 저장된 데이터가 있는지 확인한다.
        boolean chk1 = StudentRepository.checkStudentExistAll();
        // 저장된 데이터가 없다면
        if(chk1 == false) {
            System.out.println("저장된 학생 정보가 없습니다");
        } else {
            // 학생 이름을 입력받는다.
            System.out.println("검색할 학생의 이름 : ");
            String inputName = inputSearchStudentName();
            // 입력한 이름의 학생이 있는지 확인한다.
            boolean chk2 = StudentRepository.checkStudentExistByName(inputName);
            // 학생이 없다면
            if(chk2 == false){
                System.out.println("입력하신 학생의 정보는 존재하지 않습니다");
            } else {
                // 검색한 학생 객체를 가져온다.
                StudentClass studentClass = StudentRepository.searchStudentInfoByName(inputName);
                // 출력한다.
                studentClass.showStudentInfo();
                studentClass.showAction();
            }
        }

        // 프로그램의 상태를 메인 메뉴 상태로 변경한다.
        controllerClass.setProgramState(Values.STATE_SHOW_MAIN_MENU);
    }

    // 학생 이름을 입력받는 메서드
    public String inputSearchStudentName(){
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.next();
        return inputName;
    }
```

### Controller 에 메인 메뉴를 보여주는 상태의 객체를 생성한다.
```java
                case Values.STATE_SHOW_MAIN_MENU :
                    viewClass = new ShowMainMenuView(this);
                    break;
```

### ShowMainMenuView 클래스에 생성자를 구현해준다.
```java
    ControllerClass controllerClass;

    public ShowMainMenuView(ControllerClass controllerClass){
        this.controllerClass = controllerClass;
    }
```
### Values 에 메뉴를 나타내는 값을 정의해준다.
```java
    // 메인 메뉴 항목을 나타내는 값
    int MAIN_MENU_INPUT_STUDENT_INFO = 1;
    int MAIN_MENU_SEARCH_STUDENT_INFO_BY_NAME = 2;
    int MAIN_MENU_SHOW_STUDENT_INFO_ALL = 3;
    int MAIN_MENU_DELETE_STUDENT_INFO = 4;
    int MAIN_MENU_EXIT_PROGRAM = 5;
```

### ShowMainMenuView의 메서드를 구현해준다.
```java

    @Override
    public void doShow() {
        System.out.println();
        System.out.println("메뉴를 선택해주세요");
        System.out.println("1. 학생 정보 입력");
        System.out.println("2. 학생 이름으로 검색");
        System.out.println("3. 학생 정보 전체 보기");
        System.out.println("4. 학생 정보 삭제 하기");
        System.out.println("5. 프로그램 종료");
        System.out.print("메뉴 입력 : ");
        // 메뉴 번호를 입력받는다.
        int inputNumber = inputMenuNumber();
        // 메뉴 번호로 분기하여 프로그램의 상태를 변경한다.
        switch (inputNumber){
            case Values.MAIN_MENU_INPUT_STUDENT_INFO  :
                controllerClass.setProgramState(Values.STATE_INPUT_STUDENT_INFO);
                break;
            case Values.MAIN_MENU_SEARCH_STUDENT_INFO_BY_NAME:
                controllerClass.setProgramState(Values.STATE_SEARCH_STUDENT_BY_NAME);
                break;
            case Values.MAIN_MENU_SHOW_STUDENT_INFO_ALL:
                controllerClass.setProgramState(Values.STATE_SHOW_STUDENT_INFO_ALL);
                break;
            case Values.MAIN_MENU_DELETE_STUDENT_INFO:
                controllerClass.setProgramState(Values.STATE_DELETE_STUDENT_INFO);
                break;
            case Values.MAIN_MENU_EXIT_PROGRAM:
                controllerClass.setProgramState(Values.STATE_EXIT_PROGRAM);
                break;
        }
    }

    // 메뉴 번호를 입력받는 메서드
    public int inputMenuNumber(){
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        return inputNumber;
    }
```

### Controller에서 학생정보 전체를 보여주는 상태의 객체를 생성하는 곳을 수정해준다(this)
```java
                // 학생 정보 전체를 보여주는 상태
                case Values.STATE_SHOW_STUDENT_INFO_ALL :
                    viewClass = new ShowStudentInfoAllView(this);
                    break;
```

### ShowStudentInfoAllView 의 생성자를 구현해준다.
```java
    ControllerClass controllerClass;

    public ShowStudentInfoAllView(ControllerClass controllerClass){
        this.controllerClass = controllerClass;
    }
```

### ShowStudentInfoAllView의 메서드를 구현한다.
```java
    @Override
    public void doShow() {
        System.out.println();

        // 저장된 정보가 있는지 확인한다.
        boolean chk1 = StudentRepository.checkStudentExistAll();
        // 저장된 정보가 없다면
        if(chk1 == false) {
            System.out.println("등록된 학생 정보가 없습니다");
        } else {
            // 학생수를 구한다.
            int studentCount = StudentRepository.getStudentCountAll();
            System.out.printf("총 학생 수 : %d명\n", studentCount);

            // 전체 학생의 데이터를 가져온다.
            ArrayList<StudentClass> studentList = StudentRepository.getStudentInfoAll();
            // 학생의 수 만큼 반복한다.
            for(StudentClass item : studentList){
                // 학생 정보를 출력한다.
                item.showStudentInfo();
                item.showAction();
            }
            // 각 운동부 별 학생 수를 구한다.
            HashMap<String, Integer> map1 = StudentRepository.getStudentCountByType();
            System.out.println();
            System.out.printf("축구부 : %d명\n", map1.get("soccerCount"));
            System.out.printf("야구부 : %d명\n", map1.get("baseBallCount"));
            System.out.printf("농구부 : %d명\n", map1.get("basketBallCount"));
        }
        // 프로그램의 상태를 메인 메뉴상태로 변경한다.
        controllerClass.setProgramState(Values.STATE_SHOW_MAIN_MENU);
    }
```














