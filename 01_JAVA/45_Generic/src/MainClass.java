// 변수를 선언하거나 메서드를 작성할 때 반환값이 있다면
// 타입을 지정해줘야 한다.
// 제네릭을 이용하면 타입을 코드를 작성할 때 결정하는 것이 아닌
// 객체를 생성할 때 결정할 수 있다.

// 제네릭을 나타내는 단어는 영어 대문자, 소문자 상관 없고
// 글자수도 상관이 없다. 자유롭게 지정해주면 된다.

// T : 타입
// E : 요소(배열이나, 컬렉션에 저장되는 객체의 타입)
// K : 이름, 키(맵 계열의 컬렉션에 객체를 저정할 때 사용할 이름)
// V : 반환값이 매핑되는 값
// N : 숫자
// S, U, V : 2번째, 3번째, 4번째 라는 의미

public class MainClass {
    public static void main(String[] args) {
        // 제네릭을 사용한 클래스에 제네릭을 설정하지 않으면
        // Object 타입으로 결정된다.
        TestClass1 t1 = new TestClass1();
        t1.testMethod1(100, 200);
        // 제네릭을 설정한다.
        // A 는 Integer, C 는 Double, D 는 String으로 타입이 결정된다.
        TestClass1<Integer, Double, String> t2 = new TestClass1<>();
        t2.testMethod1(11.11, "안녕하세요");

        TestClass1<Boolean, Integer, Float> t3 = new TestClass1<>();
        t3.testMethod1(10, 11.11f);
    }
}

class TestClass1<A, C, D>{

    A memberA1;

    public void testMethod1(C a1, D a2){
        System.out.printf("%s\n", a1);
        System.out.printf("%s\n", a2);
    }
}