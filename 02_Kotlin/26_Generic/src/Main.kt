// Generic : 클래스를 작성할 때 변수, 매개변수 등과 같이 타입을
// 정해줘야 하는 부분에서 타입을 정하지 않고 객체를 생성할 때
// 객체를 생성하는 개발자가 정할 수 있도록 하는 개념
// 같은 클래스를 통해 객체를 생성하였다고 하더라도 객체를 생성할 때
// 정해준 제네릭따라서 타입을 다르게 설정할 수 있다.

fun main(){
    // 제네릭을 설정하지 않는다.
    // 코틀린은 제네릭을 설정하지 않으면 오류가 발생한다.
    val t1 = TestClass1<Int>()
    t1.testMethod1(100)

    val t2 = TestClass1<String>()
    t2.testMethod1("안녕하세요")

    val t3 = TestClass2<Int, String, Double, Boolean>(100, "문자열")
    t3.testMethod2(11.11, true)

    // 불변성 : 객체를 생성할 때 설정한 제네릭과 객체를 담을 변수의 제네릭이 같을 때만 담을 수 있다.
    // 클래스간의 상속 관계에 상관없이 제네릭에 설정한 타입이 다르면 오류가 발생한다.
    val t5:TestClass3<SuperClass2> = TestClass3<SuperClass2>()
    // val t6:TestClass3<SuperClass1> = TestClass3<SuperClass2>()
    // val t7:TestClass3<SubClass1> = TestClass3<SuperClass2>()

    // 공변성 : 변수에 설정한 제네릭이 객체를 생성했을 때 사용한 제네릭과 같거나 부모 타입인 경우 담을 수 있다.
    val t8:TestClass4<SuperClass2> = TestClass4<SuperClass2>()
    val t9:TestClass4<SuperClass1> = TestClass4<SuperClass2>()
    // val t10:TestClass4<SubClass1> = TestClass4<SuperClass2>()

    // 반 공변성 : 변수에 설정한 제네릭이 객체를 생성했을 때 사용한 제네릭과 같거나 자식 타입인 경우 담을 수 있다.
    val t11:TestClass5<SuperClass2> = TestClass5<SuperClass2>()
    //val t12:TestClass5<SuperClass1> = TestClass5<SuperClass2>()
    val t13:TestClass5<SubClass1> = TestClass5<SuperClass2>()
}

// < > : 안에 단어를 넣어준다. 일반적으로 대문자 한글자를 넣어준다.
// 이 단어는 아직 결정되지 않은 타입을 의미한다.
// 어떠한 타입인지는 결정되지 않았지만 이 타입의 변수들을 정의하여
// 클래스를 작성하고 향후, 객체를 생성할 때 타입을 결정할 수 있다.
// 아직 타입이 정해져 있지 않기 때문에 특정 클래스의 맴버를 사용하는 코드는
// 작성할 수 없다.
// T : 타입
// E : 리스트나 배열 등과 같이 순서를 가지고 객체를 관리하는 요소에서
// 관리하는 객체 타입
// K : 맵과 같이 이름을 가지고 객체를 관리하는 요소에서 이름으로 사용할 객체 타입
// V : 맵과 같이 이름을 가지고 객체를 관리하는 요소에서 관리할 객체의 타입
// N : 숫자
// S, U, V : 2번째, 3번째, 4번째를 의미한다.

class TestClass1<T>{
    fun testMethod1(a1:T){
        println("a1 : $a1")
    }
}

// 다수의 제네릭을 설정하는 것도 가능하다.
class TestClass2<A, B, C, D>(var a1:A, var a2:B){
    fun testMethod2(a3:C, a4:D){
        println("$a1, $a2, $a3, $a4")
    }
}

open class SuperClass1
open class SuperClass2 : SuperClass1()
class SubClass1 : SuperClass2()

// 불변성
class TestClass3<T>
// 공변성
class TestClass4<out T>()
// 반 공변성
class TestClass5<in T>()