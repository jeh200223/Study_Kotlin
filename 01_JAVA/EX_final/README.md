### 동물관리 프로그램 내용은 전반적으로 똑같다.

### 패키지부터 설계한다.
- com.lion.main
- com.lion.controller
- com.lion.util
- com.lion.view
- com.lion.model
- com.lion.repository

### 프로그램은 다음과 같은 상태로 정의한다.
- 메인 메뉴를 보여주는 상태
- 동물 정보를 입력받는 상태
- 동물 이름을 통해 검색하여 보이는 상태
- 동물 정보 전체를 보여주는 상태
- 동물 정보를 삭제하는 상태
- 프로그램 종료 상태

### util패키지에 Values 인터페이스를 생성해준다.
```java
public interface Values {
    // 메인 메뉴를 보여주는 상태
    int State_Show_Main_Menu = 1;
    // 동물 정보를 입력받는 상태
    int State_Input_Animal_Info = 2;
    // 동물 이름을 통해 검색하여 보이는 상태
    int State_Search_Animal_Info = 3;
    // 동물 정보 전체를 보여주는 상태
    int State_Show_Animal_Info_All = 4;
    // 동물 정보를 삭제하는 상태
    int State_Delete_Animal_Info = 5;
    // 프로그램 종료 상태
    int State_Exit_Program = 6;
}
```

### Controller 패키지에 ControllerClass를 만들고 프로그램 상태를 담을 변수를 설정하고 초기상태를 설정한다.
```java
int programState;


    public ControllerClass() {
        // 프로그램의 초기상태를 설정한다.
        programState = Values.State_Show_Main_Menu;
    }
```

### 상태별로 분기하여 반복하는 메서드를 만들어준다.
```java
public void doController() {
        boolean isRunning = true;

        while (isRunning) {

            isRunning = false;

            switch (programState) {
                case Values.State_Show_Main_Menu:
                    break;
                case Values.State_Input_Animal_Info:
                    break;
                case Values.State_Search_Animal_Info:
                    break;
                case Values.State_Show_Animal_Info_All:
                    break;
                case Values.State_Delete_Animal_Info:
                    break;
                case Values.State_Exit_Program:
                    break;
            }
        }
    }
```

### 각 View 클래스가 상속받을 ViewClass 를 view 패키지에 만들어준다.
```java
package com.lion.view;

public abstract class ViewClass {
    public abstract void doshow();
}
```

### Controller 클래스의 doController 메서드에 View 객체를 담을 변수를 선언한다.
```java
ViewClass viewClass = null;
```

### Controller 클래스의 doControoler 메서드의 제일 마지막에 ViewClass가 가지고 있는 메서드를 호출한다.
```java
viewClass.doshow();
```

### view패키지에 메인메뉴 화면을 처리할 ShowMainMenuView 클래스를 만들어준다.
```java
package com.lion.view;

public class ShowMainMenuView extends ViewClass{
    @Override
    public void doshow() {

    }
}
```

### 메인메뉴 출력화면을 작성해준다.
```java
public void doshow() {
        System.out.println();
        System.out.println("메뉴를 선택해주세요");
        System.out.println("1. 동물 정보 입력");
        System.out.println("2. 동물 이름으로 검색");
        System.out.println("3. 동물 정보 전체 보기");
        System.out.println("4. 동물 정보 삭제 하기");
        System.out.println("5. 프로그램 종료");
        System.out.println("메뉴 선택 : ");
    }
```

### Controller 클래스에서 메인 메뉴를 보여주는 상태 일 때 ShowMainMenuView객체를 생성한다.
```java
viewClass = new ShowMainMenuView();
```
### main 패키지에 MainClass를 작성하여 실행해본다.
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

### 다음 화면 상태 확인을 위해 초기화면을 설정해준다.
```java
public ControllerClass() {
        // 프로그램의 초기상태를 설정한다.
        programState = Values.State_Input_Animal_Info;
    }
```

### view패키지에 동물 정보 입력 화면을 처리할 InputAnimalInfoView 클래스를 만들어준다.
```java
package com.lion.view;

public class InputAnimalInfoView extends ViewClass{
    @Override
    public void doshow() {
        
    }
}
```

### 동물정보 입력 출력화면을 작성해준다.
```java
public void doshow() {
        System.out.println();
        System.out.println("동물 종류 선택");
        System.out.println("1. 강아지");
        System.out.println("2. 고양이");
        System.out.println("3. 앵무새");
        System.out.println("동물 종류 선택 : ");

        System.out.println();
        System.out.println("강아지 정보 입력");
        System.out.println("이름 : ");
        System.out.println("나이 : ");
        System.out.println("개인기 개수 : ");

        System.out.println();
        System.out.println("고양이 정보 입력");
        System.out.println("이름 : ");
        System.out.println("나이 : ");
        System.out.println("수염의 개수 : ");

        System.out.println();
        System.out.println("앵무새 정보 입력");
        System.out.println("이름 : ");
        System.out.println("나이 : ");
        System.out.println("단어의 개수 : ");
    }
```

### Controller 클래스에서 동물 정보 입력을 보여주는 상태 일 때 InputAnimalInfoView 객체를 생성한다.
```java
viewClass = new InputAnimalInfoView();
```

### 다음 화면 상태 확인을 위해 초기화면을 설정해준다.
```java
programState = Values.State_Search_Animal_Info;
```

### view패키지에 동물 검색 화면을 처리할 SearchAnimalView 클래스를 만들어준다.
```java
public class SearchAnimalView extends ViewClass{
    @Override
    public void doshow() {
        
    }
}
```

### 동물 검색 출력화면을 작성해준다.
```java
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
```

### Controller 클래스에서 동물 정보 검색을 보여주는 상태 일 때 SearchAnimalView 객체를 생성한다.
```java
viewClass = new SearchAnimalView();
```

### 다음 화면 상태 확인을 위해 초기화면을 설정해준다.
```java
programState = Values.State_Show_Animal_Info_All;
```

### view패키지에 전체 동물 정보 출력 화면을 처리할 ShowAnimalAllInfoView 클래스를 만들어준다.
```java
public class ShowAnimalAllInfoView extends ViewClass{
    @Override
    public void doshow() {
        
    }
}
```

### 전체 동물 정보 출력화면을 작성해준다.
```java
public void doshow() {
        System.out.println();
        System.out.println("저장된 동물 정보가 없습니다.");
        System.out.println("총 동물 마리 : ");

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

        System.out.println();
        System.out.println("강아지 : 1마리");
        System.out.println("고양이 : 1마리");
        System.out.println("앵무새 : 1마리");
    }
```

### Controller 클래스에서 동물 정보 출력화면을 보여주는 상태 일 때 ShowAnimalAllInfoView 객체를 생성한다.
```java
viewClass = new ShowAnimalAllInfoView();
```

### 다음 화면 상태 확인을 위해 초기화면을 설정해준다.
```java
programState = Values.State_Delete_Animal_Info;
```

### view패키지에 동물 정보 삭제 화면을 처리할 DeleteAnimalInfoView 클래스를 만들어준다.
```java
public class DeleteAnimalInfoView extends ViewClass{
    @Override
    public void doshow() {
        
    }
}
```

### 동물 정보 삭제 출력화면을 작성해준다.
```java
public void doshow() {
        System.out.println();
        System.out.println("저장된 동물 정보가 없습니다.");
        System.out.println("삭제할 동물의 이름 : ");
        System.out.println("입력하신 동물은 존재하지 않습니다.");
        System.out.println("묭이의 정보를 삭제하였습니다.");
    }
```

### Controller 클래스에서 동물 정보 출력화면을 보여주는 상태 일 때 DeleteAnimalInfoView 객체를 생성한다.
```java
viewClass = new DeleteAnimalInfoView();
```

### Controller에서 종료 상태일때를 구현한다.
```java
System.out.println("프로그램을 종료합니다");
                    System.exit(0);
```

# 클래스 설계를 위한 요소 선별

1. 메인 메뉴
- 사용자가 입력하는 메인 메뉴의 번호

2. 동물 정보 입력
- 동물의 이름
- 동물의 나이
- 개인기 개수
- 수염의 개수
- 단어의 개수

3. 동물 이름 검색
- 사용자가 입력한 동물의 이름
- 소속 동물 종류
- 동물의 이름
- 동물의 나이
- 개인기 개수
- 수염의 개수
- 단어의 개수

4. 전체 동물 정보 출력
- 총 동물의 수
- 소속 동물 종류
- 동물의 이름
- 동물의 나이
- 개인기 개수
- 수염의 개수
- 단어의 개수
- 강아지 수
- 고양이 수
- 앵무새 수

5. 동물 정보 삭제
- 사용자가 입력한 삭제할 동물 이름

### 각 상태별 필요한 기능
1. 메인 메뉴
- 메뉴 번호를 입력받는 기능

2. 동물 정보 입력
- 동물 종류를 입력받는 기능
- 동물 정보를 입력받는 기능
- 동물 저장 기능

3. 동물 이름 검색
- 저장된 동물이 있는지 확인하는 기능
- 동물 이름을 입력받는 기능
- 이름을 통해 동물 정보를 검색하는 기능
- 검색된 동물의 정보를 출력하는 기능
- 강아지 특기를 출력하는 기능
- 고양이 특기를 출력하는 기능
- 앵무새 특기를 출력하는 기능

4. 동물 전체 정보 출력
- 저장된 동물이 있는지 확인하는 기능
- 총 동물 수를 구하는 기능
- 전체 동물 정보를 가져오는 기능
- 전체 동물 정보를 출력하는 기능
- 각 종류별 동물 수를 구하는 기능
- 각 종류별 동물 수를 출력하는 기능
- 강아지 특기를 출력하는 기능
- 고양이 특기를 출력하는 기능
- 앵무새 특기를 출력하는 기능

5. 동물 정보 삭제
- 저장된 동물이 있는지 확인하는 기능
- 삭제할 동물의 이름을 입력받는 기능
- 입력받은 동물의 이름이 있는지 검사하는 기능
- 입력받은 동물의 정보를 삭제하는 기능

### 뽑아낸 데이터를 선별
1. 메인 메뉴
- 사용자가 입력하는 메인 메뉴의 번호

2. 동물 정보 입력
- 동물의 이름 - 강아지, 고양이, 앵무새
- 동물의 나이 - 강아지, 고양이, 앵무새
- 개인기 개수 - 강아지
- 수염의 개수 - 고양이
- 단어의 개수 - 앵무새

3. 동물 이름 검색
- 사용자가 입력한 동물의 이름
- 소속 동물 종류 - 강아지, 고양이, 앵무새
- 동물의 이름 - 강아지, 고양이, 앵무새
- 동물의 나이 - 강아지, 고양이, 앵무새
- 개인기 개수 - 강아지
- 수염의 개수 - 고양이
- 단어의 개수 - 앵무새

4. 전체 동물 정보 출력
- 총 동물의 수
- 소속 동물 종류 - 강아지, 고양이, 앵무새
- 동물의 이름 - 강아지, 고양이, 앵무새
- 동물의 나이 - 강아지, 고양이, 앵무새
- 개인기 개수 - 강아지
- 수염의 개수 - 고양이
- 단어의 개수 - 앵무새
- 강아지 수
- 고양이 수
- 앵무새 수

5. 동물 정보 삭제
- 사용자가 입력한 삭제할 동물 이름

### 뽑아낸 기능 선별
1. 메인 메뉴
- 메뉴 번호를 입력받는 기능 - View

2. 동물 정보 입력
- 동물 종류를 입력받는 기능 - View
- 동물 정보를 입력받는 기능 - View
- 동물 저장 기능 - Repository

3. 동물 이름 검색
- 저장된 동물이 있는지 확인하는 기능 - Repository
- 동물 이름을 입력받는 기능 - View
- 이름을 통해 동물 정보를 검색하는 기능 - Repository
- 검색된 동물의 정보를 출력하는 기능 - View
- 강아지 특기를 출력하는 기능 - 강아지
- 고양이 특기를 출력하는 기능 - 고양이
- 앵무새 특기를 출력하는 기능 - 앵무새

4. 동물 전체 정보 출력
- 저장된 동물이 있는지 확인하는 기능 - Repository
- 총 동물 수를 구하는 기능 - Repository
- 전체 동물 정보를 가져오는 기능 - Repository
- 전체 동물 정보를 출력하는 기능 - View
- 각 종류별 동물 수를 구하는 기능 - Repository
- 각 종류별 동물 수를 출력하는 기능 - View
- 강아지 특기를 출력하는 기능 - 강아지
- 고양이 특기를 출력하는 기능 - 고양이
- 앵무새 특기를 출력하는 기능 - 앵무새

5. 동물 정보 삭제
- 저장된 동물이 있는지 확인하는 기능 - Repository
- 삭제할 동물의 이름을 입력받는 기능 - View
- 입력받은 동물의 이름이 있는지 검사하는 기능 - Repository
- 입력받은 동물의 정보를 삭제하는 기능 - Repository

# 동물들의 정보를 담을 클래스

### model 패키지에 각 동물 클래스들이 상속받을 AnimalClass를 만들어준다.
```java
public class AnimalClass {
    int type;
    String name;
    int age;
}
```

### model 패키지에 각 동물 클래스들을 만들어준다.
- DogClass
- CatClass
- BirdClass

### DogClass를 만들어준다.
```java
package com.lion.model;

public class DogClass extends AnimalClass{
    int trickCount;
}
```

### CatClass를 만들어준다.
```java
package com.lion.model;

public class CatClass extends AnimalClass{
    int beardCount;
}

```

### BirdClass를 만들어준다.
```java
package com.lion.model;

public class BirdClass extends AnimalClass{
    int wordCount;
}

```

### ShowMainMenuView 클래스에 필요한 메서드를 구현해준다.
```java
public void inputMenuNumber(){

    }
```

### InputAnimalInfoView 클래스에 필요한 메서드를 구현해준다.
```java
public void inputAnimalNumber() {

    }

    public void inputAnimalInfo() {
        
    }
```

### SearchAnimalView 클래스에 필요한 메서드를 구현해준다.
```java
public void inputAnimalName() {
        
    }
    
    public void showSearchAnimalInfo() {
        
    }
```

### ShowAnimalAllInfoView 클래스에 필요한 메서드를 구현해준다.
```java
public void showAllAnimalInfo() {
        
    }
    
    public void showAnimalTypeCount() {
        
    }
```

### ShowAnimalAllInfoView 클래스에 필요한 메서드를 구현해준다.
```java
public void inputDeleteAnimal() {
        
    }
```

### AnimalClass 클래스에 필요한 메서드를 구현해준다.
```java
public void inputAnimalInfoBase() {

    }

    public void showAnimalInfoBase() {

    }

    public void showAction() {
        
    }
```

### DogClass 클래스에 필요한 메서드를 구현해준다.
```java
@Override
    public void inputAnimalInfoBase() {
        super.inputAnimalInfoBase();
    }

    @Override
    public void showAnimalInfoBase() {
        super.showAnimalInfoBase();
    }

    @Override
    public void showAction() {
        super.showAction();
    }
```

### CatClass 클래스에 필요한 메서드를 구현해준다.
```java
@Override
    public void inputAnimalInfoBase() {
        super.inputAnimalInfoBase();
    }

    @Override
    public void showAnimalInfoBase() {
        super.showAnimalInfoBase();
    }

    @Override
    public void showAction() {
        super.showAction();
    }
```
### BirdClass 클래스에 필요한 메서드를 구현해준다.
```java
@Override
    public void inputAnimalInfoBase() {
        super.inputAnimalInfoBase();
    }

    @Override
    public void showAnimalInfoBase() {
        super.showAnimalInfoBase();
    }

    @Override
    public void showAction() {
        super.showAction();
    }
```

### repository 패키지에 AnimalRepository 클래스를 만들어준다.
```java
public void saveAnimalInfo() {

    }

    public void checkAnimalExistInfo() {

    }

    public void searchAnimalByName() {

    }

    public void getAnimalCount() {

    }

    public void getAnimalInfoAll () {

    }

    public void getAnimalCountByType() {

    }

    public void checkAnimalExistByName () {

    }

    public void deleteAnimalInfoByName() {
        
    }
```

# Repository 구현

### 파일로 부터 리스트를 읽어와 반환하는 메서드를 만들어준다.
```java
public ArrayList<AnimalClass> getAnimalInfoAll () {
        ArrayList<AnimalClass> animalList = null;

        try {
            File file = new File(Values.FILE_NAME);
            if(file.exists()) {
                FileInputStream fis = new FileInputStream(Values.FILE_NAME);
                ObjectInputStream ois = new ObjectInputStream(fis);

                animalList = (ArrayList<AnimalClass>) ois.readObject();
                ois.close();
                fis.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return animalList;
    }
```

### 동물 정보를 저장하는 메서드를 구현한다.
```java
public void saveAnimalInfo(AnimalClass animalClass) {
        try {
            ArrayList<AnimalClass> animalList = getAnimalInfoAll();
            if (animalList == null) {
                animalList = new ArrayList<>();
            }
            animalList.add(animalClass);

            FileOutputStream fos = new FileOutputStream(Values.FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(animalList);

            oos.flush();
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### 저장되어 있는지 확인하는 메서드를 구현한다
```java
public boolean checkAnimalExistInfo() {
        boolean result = true;
        try {
            ArrayList<AnimalClass> animalList = getAnimalInfoAll();
            if(animalList == null || animalList.size() == 0) {
                result = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
```

### AnimalClass에 동물 이름을 반환하는 메서드를 만들어준다.
```java
public String getAnimalName() {
        return name;
    }
```

### AnimalRepository 클래스에 동물 이름을 통해 동물 객체를 검색하는 메서드를 만들어준다.
```java
public AnimalClass searchAnimalByName(String searchAnimalName) {
        AnimalClass animalClass = null;

        ArrayList<AnimalClass> animalList = getAnimalInfoAll();

        if(animalList != null || animalList.size() > 0) {
            for(AnimalClass item : animalList) {
                if(item.getAnimalName().equals(searchAnimalName)){
                    animalClass = item;
                    break;
                }
            }
        }

        return animalClass;
    }
```

### 
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```
###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```
###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```
###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```
###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```
###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```
###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```
###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```
###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```
###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```
###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```

###
```java
```
