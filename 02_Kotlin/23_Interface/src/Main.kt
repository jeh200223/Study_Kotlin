// 인터페이스
// 메서드 오버라이딩의 강제성을 주기위해 추상클래스를 사용한다.
// 코틀린은 단일 상속만 지원하기 때문에 사용해야할 추상 클래스가 여러 개라면
// 추상 클래스 하나당 하나의 자식클래스를 만들어줘야 한다.
// 만약 멤버 변수가 필요하지 않고 맴버 메서드가 필요하지 않다면
// 추상 클래스 대신 인터페이스로 만들어서 제공해도 된다.
// 하나의 클래스를 다수의 인터페이스를 구현할 수 있다.
// 코틀린에서 인터페이스에 정의한 프로퍼티는 반드시 인터페이스를 구현한
// 클래스에서 재정의 해줘야 한다.
// 인터페이스에 정의한 추상 메서드는 반드시 인터페이스를 구현한 클래스에서
// 재정의 해줘야 한다.
// 인터페이스에 만들어놓은 메서드는 정적 메서드에 해당하고 (객체를 생성할 수
// 없기 때문에..) 인터페이스를 구현 클래스에서 재정의한 인터페이스의 프로퍼티에
// 접근할 수 있다.

fun main(){
    val t1 = TestClass1()
    // 추상 클래스의 맴버 사용
    println("t1.memberA1 : ${t1.memberA1}")
    t1.method10()
    t1.method11()

    // 인터페이스의 요소 사용
    println("t1.memberA2 : ${t1.memberA2}")
    t1.inter1Method1()
    t1.inter1Method2()

    println("t1.memberA3 : ${t1.memberA3}")
    t1.inter2Method1()
    t1.inter2Method2()
}

// 추상 클래스
abstract class AbstractClass1{
    // 추상 클래스에 정의한 변수는 완벽하게 구현되어 있는 프로퍼티
    var memberA1 = 100

    // 추상 클래스에 구현되어 있는 메서드는 맴버 메서드이다
    fun method10(){
        println("AbstractClass의 method10")
    }
    // 추상 클래스에 정의한 추상 메서드는 자식클래스에서 구현해줘야 한다.
    abstract fun method11()
}

// 인터페이스
interface Inter1{
    // 인터페이스에 정의된 프로퍼티는 세터와 게터가 구현되어있지 않다.
    // 이에 인터페이스에서 값을 담을 수 없으며
    // 인터페이스를 구현한 클래스에서 재정의 해줘야 한다.
    var memberA2:Int
    // 추상 메서드
    fun inter1Method1()
    // 인터페이스에 구현한 메서드는 자바와 달리 정적 메서드로 사용할 수 없다.
    // 즉 인터페이스 이름을 통해 호출하는 것이 불가능하다.
    // 이 메서드는 인터페이스를 구현한 클래스의 맴버 메서드로 포함된다.
    fun inter1Method2(){
        println("Inter1의 inter1Method2")
        println("Inter1의 memberA2 : $memberA2")
    }
}

interface Inter2{
    var memberA3:Int

    fun inter2Method1()
    fun inter2Method2(){
        println("Inter2의 inter2Method2")
        println("Inter2의 memberA3 : $memberA3")
    }
}

class TestClass1 : AbstractClass1(), Inter1, Inter2{
    // 추상 클래스가 가진 추상 메서드만 구현하면 된다.
    override fun method11() {
        println("TestClass1의 method11")
    }

    // Inter1에 정의되어 있는 프로퍼티를 재정의한다
    // 필요하단 setter와 getter를 구현해준다.
    override var memberA2: Int = 100
    // get() = TODO("Not yet implemented")
    //set(value) {}

    // Inter1에 있는 추상메서드를 재정의한다.
    override fun inter1Method1() {
        println("TestClass1의 inter1Method1")
    }

    override var memberA3: Int = 200

    override fun inter2Method1() {
        println("TestClass1의 inter2Method1")
    }
}