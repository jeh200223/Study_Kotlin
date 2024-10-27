// Scope Function
// let, apply, run, with, also
// 생성되어 있는 객체의 프로퍼티나 메서드를 사용할 때
// 클래스로 부터 객체를 생성할 때
fun main(){
    val t1 = TestClass1(100, 200)
    t1.a3 = 300
    t1.a4 = 400
    t1.testMethod1()
    println("----------------------------------")
    // 이미 생성되어 있는 객체에 scope function을 사용해본다.

    // let
    val t2 = TestClass1(100, 200)

    // it 에 객체의 정보가 담겨져 있다.
    t2.let {
        it.a3 = 300
        it.a4 = 400
        it.testMethod1()
    }
    println("------------------------------------")
    // apply
    val t3 = TestClass1(100, 200)

    // 객체의 메서드로 포함된다.
    t3.apply {
        a3 = 300
        a4 = 400
        testMethod1()
    }
    println("------------------------------------")
    // run
    val t4 = TestClass1(100, 200)
    // 객체의 메서드로 포함된다.
    t4.run{
        a3 = 300
        a4 = 400
        testMethod1()
    }
    println("------------------------------------")
    // also
    val t5 = TestClass1(100, 200)
    // it 을 통해 객체에 접근할 수 있다.
    t5.also {
        it.a3 = 300
        it.a4 = 400
        it.testMethod1()
    }
    println("------------------------------------")

    // with
    val t6 = TestClass1(100, 200)
    // 두 번째 매개변수 지정한 함수는 객체의 메서드로 포함된다.
    with(t6){
        a3 = 300
        a4 = 400
        testMethod1()
    }
    println("------------------------------------")

    val t7 = TestClass1(100, 200)
    val t8 = TestClass1(1000, 2000)

    t7.apply {
        a3 = 300
        a4 = 400
        t8.let {
            it.a3 = 3000
            it.a4 = 4000
            it.testMethod1()
            testMethod1()
        }
    }
    println("------------------------------------")
    // 객체를 생성할 때 사용한다.

    // let
    // it 을 통해 객체에 접근한다.
    // 생성된 객체가 자동으로 반환되지 않기 때문에 직접 반환해줘야 한다.
    val t9 = TestClass1(100, 200).let {
        it.a3 = 300
        it.a4 = 400
        // 생성한 객체를 반환해준다.
        it
    }
    println("t9 : $t9")
    t9.testMethod1()
    println("--------------------------------")
    // apply
    // apply 코드 블럭이 객체의 메서드로 포함된다.
    // 객체의 정보가 반환된다.
    val t10 = TestClass1(100, 200).apply {
        a3 = 300
        a4 = 400
    }
    println("t10 : $t10")
    t10.testMethod1()
    println("--------------------------------")
    // run
    // run 코드 블럭이 객체의 메서드로 포함된다.
    // 생성된 객체가 자동으로 반환되지 않기 때문에 직접 반환해줘야 한다.
    val t11 = TestClass1(100, 200).run{
        a3 = 300
        a4 = 400
        this
    }
    println("t11 : $t11")
    t11.testMethod1()
    println("--------------------------------")
    // also
    // it 을 통해 객체에 접근한다.
    // 객체의 정보가 반환된다.
    val t12 = TestClass1(100, 200).also {
        it.a3 = 300
        it.a4 = 400
    }
    println("t12 : $t12")
    t12.testMethod1()
    println("--------------------------------")
    // with
    // with 코드블럭은 객체의 메서드로 포함된다.
    // 객체의 정보를 반환해줘야 한다.
    val t13 = with(TestClass1(100, 200)){
        a3 = 300
        a4 = 400
        this
    }
    println("t13 : $t13")
    t13.testMethod1()
}

class TestClass1(var a1:Int, var a2:Int){
    var a3:Int = 0
    var a4:Int = 0

    fun testMethod1(){
        println("a1 : $a1")
        println("a2 : $a2")
        println("a3 : $a3")
        println("a4 : $a4")
    }
}