fun main() {
    // 추상클래스는 객체를 생성하지 못한다.
    // val t1 = TestClass1()

    val t2 = TestClass2()
    t2.testMethod1()
}

// 추상 클래스
abstract class TestClass1{

    // 추상 메서드
    abstract fun testMethod1()
}

// 추상 클래스를 상속받은 메서드
// 추상 메서드를 구현해줘야 한다.
class TestClass2 : TestClass1(){
    override fun testMethod1() {
        println("TestClass2의 testMethod1")
    }
}