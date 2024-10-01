동물관리 프로그램

동물에는 강아지(Dog), 고양이(Cat), 앵무새(Parrot)이 있다.

프로그램이 처음 시작하면 다음과 같은 메인 메뉴가 나타난다.

1. 동물정보 추가
2. 동물 이름 검색
3. 동물 전체 정보 보기
4. 동물 정보 삭제
5. 종료
   메뉴 선택 :

종류의 경우 System.exit(0); 이렇게 코드를 작성하면 프로그램이 종료된다
-------------------------------------------------------------------
메인 메뉴에서 1번을 선택하면 다음과 같이 진행된다.

동물 종류 선택
1. 강아지
2. 고양이
3. 앵무새
   동물 종류 선택 :

1. 강아지를 선택했을 경우 다음과 같이 입력을 받는다.
   이름 :
   나이 :
   개인기 개수 :

2. 고양이를 선택했을 경우 다음과 같이 입력을 받는다.
   이름 :
   나이 :
   수염의 개수 :

3. 앵무새를 선택했을 경우 다음과 같이 입력을 받는다.
   이름 :
   나이 :
   단어의 개수 :

입력이 모두 완료되면 다시 메인 메뉴를 보여준다.
----------------------------------------------------------------
메인 메뉴에서 2번을 선택하면...

만약 입력된 동물의 정보가 없다면..
등록된 동물이 없습니다
라는 메세지를 보여주고 메인 메뉴를 보여준다.

등록된 동물이 있다면..

동물의 이름을 입력해주세요 :

만약 입력한 이름의 동물이 있다면 그 동물의 정보를 보여준다.
만약 입력한 이름의 동물이 없다면
검색된 동물이 없습니다
라는 메시지를 보여준다.

동물의 정보나 메시지를 보여준 후에 메인 메뉴를 보여준다.
---------------------------------------------------------------------
메인 메뉴에서 3번 메뉴를 선택했을 경우

다음과 같이 출력한다.

전체 동물의 수 : 00마리

이후에 각 동물의 정보를 출력한다.
동물의 정보를 출력할때 각 동물의 행동도 출력해준다.
강아지인 경우에는
강아지가 달립니다.

고양이인 경우에는
고양이가 벽을 탑니다.

앵무새인 경우에는
하늘을 납니다.


모든 동물의 정보를 출력한 후에 다음 같이 출력해준다.

강아지 : 00마리
고양이 : 00마리
앵무새 : 00마리

모든 출력이 완료되면 메인 메뉴를 출력해준다.
--------------------------------------------------------------
메인 메뉴에서 4번을 선택했다면...

만약 등록된 동물이 없다면...

등록된 동물이 없습니다.

를 보여주고 메인 메뉴를 보여준다.

등록된 동물이 있다면....

삭제할 동물의 이름 입력 :

있는 동물의 이름을 입력하면 동물 정보를 삭제하고 메인 메뉴를
보여준다.

없는 동물의 이름을 입력하면
입력한 동물은 없습니다
를 보여주고 메인 메뉴를 보여준다.
--------------------------------------------------

### 입력받을 동물 정보를 정리한다.
- 이름
- 나이
- 개인기 개수
- 수염의 개수
- 단어의 개수

### 동물 정보를 동물 별로 구분한다.
- 이름 - 공용
- 나이 - 공용
- 개인기 개수 - 강아지
- 수염의 개수 - 고양이
- 단어의 개수 - 앵무새
- 강아지가 달립니다 - 강아지
- 고양이가 벽을 탑니다 - 고양이
- 앵무새가 하늘을 납니다. - 앵무새

### com.lion.main 패키지와 com.lion.manage, com.lion.animal를 만들어준다.

### main패키지에 MainClass를 만들어준다.

### manage패키지에 MenuClass, AddClass, SearchClass, ViewClass, DeletClass, ExitClass를 만들어준다.

### animal패키지에 DogClass, CatClass, BirdClass를 만들어준다.

### MenuClass에 메뉴 선택 변수를 만들어준다.
```java
Integer menuType;
```

### MenuClass에 메뉴 선택 메서드를 만들어준다.
```java
public void inputMenuCount() {
   Scanner scanner = new Scanner(System.in);
   System.out.println("메뉴를 선택해주세요.");
   System.out.println();
   System.out.println("1. 동물정보 추가");
   System.out.println("2. 동물 이름 검색");
   System.out.println("3. 동물 전체 정보 보기");
   System.out.println("4. 동물 정보 삭제");
   System.out.println("5. 종류");
   System.out.print("메뉴 선택 : ");

   menuType = scanner.nextInt();

   switch (menuType){
      case MenuValues.TYPE_ADD:
         new AddClass(MenuValues.TYPE_ADD);
         break;
      case MenuValues.TYPE_SEARCH:
         new SearchClass(MenuValues.TYPE_ADD);
         break;
      case MenuValues.TYPE_VIEW:
         new ViewClass(MenuValues.TYPE_ADD);
         break;
      case MenuValues.TYPE_DELETE:
         new DeleteClass(MenuValues.TYPE_ADD);
         break;
      case MenuValues.TYPE_EXIT:
         new ExitClass(MenuValues.TYPE_ADD);
         break;
   }
}
```

### manage패키지에 MenuValues Interface를 만들어준다.
```java
public interface MenuValues {
    Integer TYPE_ADD = 1;
    Integer TYPE_SEARCH = 2;
    Integer TYPE_VIEW = 3;
    Integer TYPE_DELETE = 4;
    Integer TYPE_EXIT = 5;
}
```


### manage패키지에 AnimalValues Interface를 만들어준다.
```java
public interface AnimalValues {
   int TYPE_DOG = 1;
   int TYPE_CAT = 2;
   int TYPE_BIRD = 3;
}
```

### AddClass에 동물 종류 선택 메서드를 만들어준다.
```java
public void inputAnimalType(){
   Scanner scanner = new Scanner(System.in);
   System.out.println();
   System.out.println("동물 종류를 선택해주세요.");
   System.out.println("1. 강아지");
   System.out.println("2. 고양이");
   System.out.println("3. 앵무새");

   System.out.print("동물 종류 선택 : ");

   animalType = scanner.nextInt();

   AnimalClass animalClass = null;

   switch (animalType) {
      case AnimalValues.TYPE_DOG:
         animalClass = new DogClass(AnimalValues.TYPE_DOG);
         break;
      case AnimalValues.TYPE_CAT:
         animalClass = new CatClass(AnimalValues.TYPE_CAT);
         break;
      case AnimalValues.TYPE_BIRD:
         animalClass = new BirdClass(AnimalValues.TYPE_BIRD);
         break;
   }

   animalClass.inputAnimalInfoBase(scanner);
   arrayList.add(animalClass);
}
```

### DogClass, CatClass, BirdClass를 AnimalClass에 상속시킨다.

### AnimalClass에 변수를 만든다.
```java
String name;
    Integer age;
```

### AnimalClass에 공통으로 입력받는 메서드를 만든다.
```java
public void inputAnimalInfoBase(Scanner scanner){
   System.out.print("이름 : ");
   name = scanner.next();
   System.out.print("나이 : ");
   age = scanner.nextInt();
}
```

### AnimalClass에 공통으로 출력하는 메서드를 만든다.
```java
public void showAnimalInfoBase(){
        System.out.printf("이름 : %s", name);
        System.out.printf("나이 : %d살", age);
    }
```

### AnimalClass에 각 기능을 하는 메서드를 만든다.
```java
public void doAction(){
        
    }
```

### DogClass에 필요한 변수를 만든다.
```java
Integer Count;
```

### DogClass에 입력받는 메서드를 오버라이드 한다.
```java
@Override
    public void inputAnimalInfoBase(Scanner scanner) {
        super.inputAnimalInfoBase(scanner);
        System.out.print("개인기 개수 : ");
        Count = scanner.nextInt();
    }
```

### DogClass에 출력하는 메서드를 오버라이드 한다.
```java
@Override
    public void showAnimalInfoBase() {
        super.showAnimalInfoBase();
        System.out.printf("개인기 개수 : %d", Count);
    }
```

### DogClass에 기능하는 메서드를 오버라이드 한다.
```java
@Override
    public void doAction() {
        super.doAction();
    }
```

### DogClass에 개별 기능 메서드를 만들고 오버라이드한 기능 메서드를 수정한다.
```java
@Override
    public void doAction() {
        run();
    }
    
    public void run () {
        System.out.println("강아지가 달립니다.");
    }
```

### CatClass도 동일하게 작업한다.
```java
public class CatClass extends AnimalClass{
    Integer beardCount;
    public CatClass(int animalType) {
        super(animalType);
    }

    @Override
    public void inputAnimalInfoBase(Scanner scanner) {
        super.inputAnimalInfoBase(scanner);
        System.out.print("수염의 개수 : ");
        beardCount = scanner.nextInt();
    }

    @Override
    public void showAnimalInfoBase() {
        super.showAnimalInfoBase();
        System.out.printf("수염의 개수 : %d개\n", beardCount);
    }

    @Override
    public void doAction() {
        climb();
    }

    public void climb() {
        System.out.println("고양이가 벽을 탑니다.");
    }
}

```

### BirdClass도 동일하게 작업한다.
```java
public class BirdClass extends AnimalClass{
    Integer wordCount;
    public BirdClass(int animalType) {
        super(animalType);
    }

    @Override
    public void inputAnimalInfoBase(Scanner scanner) {
        super.inputAnimalInfoBase(scanner);
        System.out.print("단어의 개수 : ");
        wordCount = scanner.nextInt();
    }

    @Override
    public void showAnimalInfoBase() {
        super.showAnimalInfoBase();
        System.out.printf("단어의 개수 : %d개\n", wordCount);
    }

    @Override
    public void doAction() {
        fly();
    }

    public void fly () {
        System.out.println("앵무새가 하늘을 납니다.");
    }
}
```

### ExitClass에 프로그램 종료하는 메서드를 만든다.
```java
public class ExitClass{
    public void programExit(){
        System.out.println();
        System.out.println("시스템이 종료됩니다.");
        System.exit(0);
    }
}
```

### MenuClass에 메뉴선택 메서드를 수정해준다.
```java
public void inputMenuCount() {
   Scanner scanner = new Scanner(System.in);
   System.out.println();
   System.out.println("메뉴를 선택해주세요.");
   System.out.println("1. 동물정보 추가");
   System.out.println("2. 동물 이름 검색");
   System.out.println("3. 동물 전체 정보 보기");
   System.out.println("4. 동물 정보 삭제");
   System.out.println("5. 종료");
   System.out.print("메뉴 선택 : ");

   menuType = scanner.nextInt();

   switch (menuType){
      case MenuValues.TYPE_ADD:
         AddClass addClass = new AddClass();
         addClass.inputAnimalType();
         break;
      case MenuValues.TYPE_SEARCH:
         SearchClass searchClass = new SearchClass();
         break;
      case MenuValues.TYPE_VIEW:
         ViewClass viewClass = new ViewClass();
         break;
      case MenuValues.TYPE_DELETE:
         DeleteClass deleteClass = new DeleteClass();
         break;
      case MenuValues.TYPE_EXIT:
         ExitClass exitClass = new ExitClass();
         exitClass.programExit();
         break;
   }
}
```
