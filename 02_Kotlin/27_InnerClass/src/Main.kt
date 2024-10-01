// 중첩 클래스 : 클래스 안에 만드는 클래스
// 코틀린에서는 일반 중첩 클래스와 익명 중첩 클래스만 제공된다.
fun main(){
    // 내부클래스의 객체를 생성하려면 외부클래스의 객체가 필요하다.
    val obj1 = Outer1()
    val obj2 = obj1.Inner1()

    println("obj1 : $obj1")
    println("obj2 : $obj2")

    // 인터페이스를 구현한 클래스의 객체를 생성한다.
    val obj3 = TestClass2()
    obj3.interMethod1()
    obj3.interMethod2()

    // 익명 중첩클래스는 인터페스를 구현하고 추상 메서드를 구현하거나
    // 클래스를 상속 받고 메서드를 구현한 클래스를 통해 생성하는 객체가
    // 하나만 있을 경우, 즉 다시는 이 클래스를 사용하지 않는 경우에
    // 사용할 수 있다.
    val obj4 = object : Inter1 {
        override fun interMethod1() {
            println("익명 중첩 클래스의 interMethod1")
        }

        override fun interMethod2() {
            println("익명 중첩 클래스의 interMethod2")
        }
    }
    obj4.interMethod1()
    obj4.interMethod2()
}

// 일반 중첩 클래스
// 외부 클래스
class Outer1{

    val outerMembar1 = 100

    fun outerMethod1(){
        println("Outer1의 outerMethod1")
        // 외부 클래스의 객체를 생성했다고 해서
        // 내부 클래스의 객체가 생성되는 것은 아니다.
        // 이에 외부 클래스는 내부 클래스의 맴버를 사용할 수 없다.
        // println("innerMemberB : $innerMemberB")
        // innerMethod1()
    }

    // 내부 클래스
    // 내부 클래스는 반드시 inner 키워드를 붙혀줘야 한다.
    inner class Inner1{

        val innerMemberB = 200

        fun innerMethod1(){
            println("Inner1의 innerMethod1")
            // 내부 클래스의 객체를 생성하려면
            // 반드시 외부 클래스의 객체를 통해야만 한다
            // (내부 클래스는 외부 클래스의 맴버이기 때문에...)
            // 이에, 내부 클래스에서 외부 클래스의 객체가 생성되어
            // 있다는 것을 보장받을 수 있기 때문에 외부 클래스의 맴버를
            // 사용하는 것이 자유롭다.
            println("outerMemberA : $outerMembar1")
            outerMethod1()
        }
    }
}

interface Inter1{
    fun interMethod1()
    fun interMethod2()
}

// 만약 인터페이스를 구현해서 메서드를 구현하거나 클래스를 상속받아
// 메서드를 구현하는 클래스를 가지고 만드는 객체가 다수라면
// 클래스를 직접 작성해서 사용해야 한다.
class TestClass2 : Inter1{
    override fun interMethod1() {
        println("TestClass2의 interMethod1")
    }

    override fun interMethod2() {
        println("TestClass2의 interMethod2")
    }
}
