public class MainClass {
    public static void main(String[] args) {
        // TestClass1은 추상 클래스이므로 객체를 생성하는 것이 불가능하다.
        // TestClass1 t1 = new TestClass1();
        // t1.method1();

        TestClass2 t2 = new TestClass2();
        t2.method1();
        t2.method2();

        // 추상 클래스를 상속받은 클래스로 부터 객체를 딱 하나만 만들어 쓸래
        // 라고 할 경우 익명 중첩클래스를 사용하기도 한다.
        TestClass1 t10 = new TestClass1(){
            @Override
            public void method2() {
                System.out.println("익명 중첩 클래스의 method2");
            }
        };
        t10.method1();
        t10.method2();
    }
}

// 추상 메서드가 있는 클래스는 추상클래스임을 알려주는 목적으로
// abstract 키워드를 붙혀줘야 한다.
abstract class TestClass1{
    // 맴버 메서드
    public void method1(){
        System.out.println("구현되어 있는 메서드");
    }
    // 추상 메서드
    // 추상 메서드는 구현되지 않은 메서드( { } 가 없는 메서드)를 의미하며
    // abstract 키워드를 붙혀줘야 한다.
    public abstract void method2();
}
// 추상 클래스를 사용하려면 상속받은 자식 클래스를 만들어줘야 한다.
// 이 때, 부모로부터 물려받은 추상 메서드를 구현하지 않으면
// 자식 클래스도 추상 클래스가 된다.
// 따라서 객체를 생성하기 위해서는 추상 메서드들을 구현해줘야 한다.
class TestClass2 extends TestClass1{
    // 부모로 부터 물려받은 추상메서드 구현
    @Override
    public void method2() {
        System.out.println("TestClass2의 method2");
    }
}