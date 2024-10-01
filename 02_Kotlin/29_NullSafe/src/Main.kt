// null : 값은 값인데 의미가 없는 값
// Java에서 객체의 정보를 담을 변수에 아직 담을 객체가 없을 경우 넣어주는 값
// 코틀린은 지연 초기화가 있기 때문에 변수에 null 을 넣지 않아도 된다.
// 하지만 다른 사람이 만든 클래스의 메서드에서 null을 반환하는 경우도 있기 때문에
// null 값에 대한 대비가 필요하다.

// null 안전성 : 변수를 통해 객체에 접근할 때 null 값이 들어 있기 때문에
// 발생하는 오류를 예방하는 적업
// 변수에 null 값이 들어가지 못하도록 해준다.
// 변수에 null 값이 들어가 있을 경우 객체의 접근 시도 자체를 취소해버린다.
// 변수에 null 값이 들어가 있을 경우 메서드를 호출하거나 프로퍼티 사용을 취소시켜버린다.
// 변수에 null 값이 들어가 있을 경우 메서드를 호출하거나 프로퍼티 사용할 취소시키고 지정된
// 기본값을 반환한다.
fun main(){
    // null을 허용하지 않는 변수
    // 변수에 ?를 붙혀주지 않으면 null을 허용하지 않는 변수가 된다.
    // var a1:TestClass1 = null

    // null을 허용하는 변수
    // 반드시 타입을 작성해줘야 한다.
    var a2:TestClass1? = null
    // null 값이 들어있는 변수를 통해 객체에 접근하는 코드를 작성하면 오류를 낸다.
    // 이는 null을 허용하는 변수이기 때문에 null 안정성을 확보에 대한 강제성을 부여한 것이다.
    // a2.test1Method()

    println("--------------------------------------------------")
    // !! : null을 허용하는 변수에 저장되어 있는 값을 null을 허용하지 않는 형태로 변환한다.
    val t1:TestClass1 = TestClass1()
    val t2:TestClass1? = TestClass1()
    val t3:TestClass1? = null

    // null을 허용하지 않는 타입 변수에 null을 허용하지 않는 타입의 변수의 값을 넣어준다.
    val t4:TestClass1 = t1
    // null을 허용하는 변수 타입에 null을 허용하지 않는 타입의 변수의 값을 넣어준다.
    val t5:TestClass1? = t1

    println("t4 : $t4")
    println("t5 : $t5")

    // null을 허용하는 타입이지만 객체의 정보를 가지고 있는 변수의 값을
    // null을 허용하는 타입 변수에 담아준다.
    val t6:TestClass1? = t2
    // null을 허용하는 타입이지만 객체의 정보를 가지고 있는 변수의 값을
    // null을 허용하지 않는 타입 변수에 담아준다.
    // 이 때, !! 연산자를 이용하여 null을 허용하는 타입을 null을 허용하지 않는 타입으로
    // 변환할 수 있다.
    val t7:TestClass1 = t2!!
    println("t6 : $t6")
    println("t7 : $t7")

    // 하지만 !! 는 null의 안정성을 확보한 것이 아니다.
    // null값이 들어있는 변수를 !! 를 이용해 null을 허용하지 않는 타입으로 변환하려고 하면
    // 오류가 발생한다.
    val t8:TestClass1? = t3
    // val t9:TestClass1 = t3!!

    println("-----------------------------------------------------")

    // 변수 ?:
    // null을 허용하는 변수를 사용할 때 변수에 null 값이 들어가 있을 경우 null 대신에
    // 설정한 기본값을 전달해 준다.
    // 변수에 null값이 들어 있을 경우 객체를 생성해서 전달하는 작업을 하고자 할 때 사용한다.
    var t9:TestClass1? = TestClass1()
    var t10:TestClass1? = null

    var t11:TestClass1 = t9 ?: TestClass1()
    println("t9 : $t9")
    println("t11 : $t11")

    val t12:TestClass1 = t10 ?: TestClass1()
    println("t10 : $t10")
    println("t12 : $t12")

    // ?.
    // 객체가 가지고 있는 프로퍼티나 메서드를 사용할 때 사용한다.
    // 만약 변수에 null 값이 들어 있다면 프로퍼티나 메서드의 사용이 취소되고 null 값이 반환된다.
    val t13:TestClass1? = TestClass1()
    val t14:TestClass1? = null

    // 프로퍼티
    // 객체가 가지고 있는 변수에 null이 들어 있다면 프로퍼티 접근이 중단되고 null을 반환한다.
    println("t13?.testValue1 : ${t13?.testValue1}")
    println("t14?.testValue1 : ${t14?.testValue1}")

    // 메서드 호출
    // 변수에 null이 들어가 있으면 메서드 호출이 중단되고 null을 반환한다.
    val r1 = t13?.test1Method()
    val r2 = t13?.test2Method()
    println("r1 : $r1")
    println("r2 : $r2")

    val r3 = t14?.test1Method()
    val r4 = t14?.test2Method()
    println("r3 : $r3")
    println("r4 : $r4")
}

class TestClass1{
    var testValue1 = 100

    fun test1Method(){
        println("TestClass1의 test1Method")
    }

    fun test2Method():Int{
        return 100
    }
}