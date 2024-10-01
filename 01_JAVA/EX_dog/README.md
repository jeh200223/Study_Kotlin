강아지만 관리하는 프로그램

강아지의 정보는
이름, 나이, 몸무게로 구성된다.

프로그램을 시작하면

강아지 3마리의 정보를 입력받는다.
입력받은 내용은 파일로 저장한다.

입력이 완료되면

파일에 저장되어 있는 강아지 데이터들을 읽어와
모두 출력한다.

### MainClass에 출력화면을 만들어준다.
```java
System.out.println("강아지 정보");
        System.out.println("이름 : aaa");
        System.out.println("나이 : 11");
        System.out.println("몸무게 : 11");

        System.out.println("이름 : aaa");
        System.out.println("나이 : 11");
        System.out.println("몸무게 : 11");

        System.out.println("이름 : aaa");
        System.out.println("나이 : 11");
        System.out.println("몸무게 : 11");
```

### AnimalClass를 만들어준다.

### AnimalClass에 정보를 담을 배열을 만들어준다.
```java
String [] name = new String[3];
int [] age = new int[3];
int [] weights = new int[3];
```

### AnimalClass에 정보입력과 출력 메서드를 만들어준다.
```java
public void inputAnimalInfo() {

}

public void showAnimalInfo() {
    
}
```

### AnimalClass에 파일에 정보입력을 위한 아웃스트림 토대를 작성한다.
```java
public void inputAnimalInfo() {
    try {
        FileOutputStream fos = new FileOutputStream("test.dat");
        DataOutputStream dos = new DataOutputStream(fos);

        
        dos.flush();
        dos.close();
        fos.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}
```

### AnimalClass에 파일에 작성한 토대를 기반으로 입력문과 파일 저장 기능을 작성한다.
```java
public void inputAnimalInfo() {

    try {
        FileOutputStream fos = new FileOutputStream("test.dat");
        DataOutputStream dos = new DataOutputStream(fos);

        for (int i = 0; i < 3; i++) {
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            System.out.print("이름 입력 : ");
            name[i] = scanner.next();
            System.out.print("나이 입력 : ");
            age[i] = scanner.nextInt();
            System.out.print("몸무게 입력 : ");
            weights[i] = scanner.nextInt();

            dos.writeUTF(name[i]);
            dos.writeInt(age[i]);
            dos.writeInt(weights[i]);
        }
        dos.flush();
        dos.close();
        fos.close();

    } catch (Exception e) {
        e.printStackTrace();
    }

}
```

### AnimalClass에 파일을 읽어오기 위한 인풋스트림 토대를 작성한다.
```java
public void showAnimalInfo() {

    try {
        FileInputStream fis = new FileInputStream("test.dat");
        DataInputStream dis = new DataInputStream(fis);
        
        dis.close();
        fis.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
```

### AnimalClass에 토대를 기반으로 읽어오는 기능과 출력문을 작성한다.
```java
public void showAnimalInfo() {

    try {
        FileInputStream fis = new FileInputStream("test.dat");
        DataInputStream dis = new DataInputStream(fis);

        for (int i = 0; i < 3; i++){
            name[i] = dis.readUTF();
            age[i] = dis.readInt();
            weights[i] = dis.readInt();

            System.out.printf("이름 : %s\n", name[i]);
            System.out.printf("나이 : %s\n", age[i]);
            System.out.printf("몸무게 : %s\n", weights[i]);
        }
        dis.close();
        fis.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
```

### MainClass에 출력화면을 수정해준다.
```java
public class MainClass {
    public static void main(String[] args) {

        AnimalClass animalClass = new AnimalClass();
        animalClass.inputAnimalInfo();
        animalClass.showAnimalInfo();
    }
}

```