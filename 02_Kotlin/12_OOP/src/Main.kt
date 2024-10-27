fun main() {
    // 코틀린은 객체를 생성할 때 new 키워드를 사용하지 않는다.
    val obj1 = TestClass1()
    println("obj1 : $obj1")

    val obj2 = TestClass2()
    // a1은 val로 선언된 맴버 변수이므로
    // 값을 가져다 사용하는 것만 가능하다
    println("obj2.a1 : ${obj2.a1}")
    println("obj2.a2 : ${obj2.a2}")

    // obj2.a1 = 100
    obj2.a2 = 200

    obj2.testMethod1()
    obj2.testMethod2()
}

// 클래스를 정의하는 문법은 자바와 동일하다.
// 코틀린 클래스, 함수, 메서드 등등 아직 관리할 코드를
// 작성하지 않는다면 { }는 생략해도 된다.
class TestClass1

class TestClass2{
    // 맴버 변수
    val a1 = 0
    var a2 = 0

    // 맴버 메서드
    fun testMethod1(){
        println("testMethod1")
    }

    fun testMethod2(){
        println("testMethod2")
    }
}