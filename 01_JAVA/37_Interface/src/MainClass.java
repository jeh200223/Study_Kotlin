public class MainClass {
    public static void main(String[] args) {
        TestClass1 t1 = new TestClass1();
        // 객체는 클래스가 구현한 인터페이스 타입에 담을 수 있다.
        mainMethod1(t1);
        mainMethod2(t1);

        // Functional Interface의 경우 Interface를 구현한 클래스 없이 람다식이라는 것을 사용할 수 있다.
        mainMethod4(new Inter4(){
            @Override
            public int method4(int a1, int a2) {
                return a1 + a2;
            }
        });

        mainMethod4((v1, v2) -> {
            // 필요한 코드들을 메서드 구현하듯이 구현한다
            return v1 + v2;
        });

        // 만약에 구현할 코드가 값을 반환하는 것 하나 밖에 없다면
        mainMethod4((v1, v2) -> v1 + v2);
    }

    public static void mainMethod1(Inter1 inter1){
        inter1.interMethod1();
    }

    public static void mainMethod2(Inter2 inter2){
        inter2.interMethod2();
        inter2.interMethod3();
    }

    public static void mainMethod4(Inter4 inter4){
        int r1 = inter4.method4(100, 200);
        System.out.printf("r1 : %d\n", r1);
    }
}

// 인터페이스
interface Inter1{
    // 추상 메서드
    // 인터페이스에 정의 되어 있는 추상 메서드들은 public abstract 이다.
    // abstract 키워드를 붙혀주지 않는다.
    void interMethod1();
}

interface Inter2{
    // 추상 메서드
    void interMethod2();
    void interMethod3();
}

// 인터페이스를 구현한 클래스
// 인터페이스를 구현할 때는 implements라는 키워드를 사용하며
// 구현한 인터페이스들을 쉼표로 구분하여 나열해 준다.
class TestClass1 implements Inter1, Inter2{

    @Override
    public void interMethod1() {
        System.out.println("TestClass1의 interMethod1");
    }

    @Override
    public void interMethod2() {
        System.out.println("TestClass1의 interMethod2");
    }

    @Override
    public void interMethod3() {
        System.out.println("TestClass1의 interMethod3");
    }
}

// 변수를 가지고 있는 인터페이스
interface Inter3{
    // 인터페이스 정의한 변수는 public static final 변수이다.
    // 클래스가 아니기 때문에 객체를 생성할 수 없다.
    // 이에 변수를 static으로 정의한다.
    // final 변수이기 때문에 값을 변경하는 것이 불가능하다.
    // 클래스 파일로 만들어질때 이 변수를 사용한 모든 곳이 실제 값으로 변경된다.
    // 프로그램 수행중에 값이 절대로 변하지 않는 값을 정의할 때 인터페이스 몰아서 정의하면 편하다.
    int a1 = 100;
}

// 추상 메소드가 하나 밖에 없는 interface인 경우
// Function Interface로 정의해 사용할 수 있다.
// @FunctionalInterface 어노테이션은 생략이 가능하다.
// 단 추상메서드가 하나만 있어야지만 람다로 처리할 수 있다.
@FunctionalInterface
interface Inter4{
    int method4(int a1, int a2);
}