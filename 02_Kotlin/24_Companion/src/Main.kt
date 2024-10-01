// Companion Object
// Java에서 Static과 동일하다.
// 클래스내에서 companion 맴버로 정의된 요소들은
// 객체 생성 없이 사용이 가능하며
// 클래스 이름을 통해 접근한다.
fun main() {
    val t1 = TestClass1()
    // 클래스에 정의된 맴버들은 객체를 생성해야지만 사용할 수 있다.
    println("t1.a1 : ${t1.a1}")
    t1.testMethod1()

    // 객체를 통해 정적 맴버에 접근하는 것은 불가능하다.
    // println("t1.a2 : ${t1.a2}")
    // t1.testMethod2()

    // 정적 맴버들은 클래스의 이름을 가지고 접근한다.
    println("TestClass1.a2 : ${TestClass1.a2}")
    TestClass1.testMethod2()

    // Java의 클래스를 사용한다.
    val javaMain = JavaMain()
    println("javaMain.javaA1 : ${javaMain.javaA1}")
    javaMain.javaMethod2()

    // Java 에서 정의한 정적 맴버를 사용한다.
    println("JavaMain.javaA2 : ${JavaMain.javaA2}")
    JavaMain.javaMethod3()
}

class TestClass1{
    // 맴버 변수
    var a1 = 100

    // 정적 맴버를 정의하는 부분
    companion object{
        var a2 = 200

        fun testMethod2(){
            println("testMethod2")
            // 정적 맴버 변수
            println("testMethod2 - a2 : $a2")
            // 맴버 사용
            // 정적 맴버는 객체를 생성하지 않아도 사용이 가능하다.
            // 이제 정적 메서드가 호출이 되었을 때 객체가 생성되어 있다는 것을
            // 완벽하게 보장받을 수 없기 때문에 일반 맴버들은 사용하는 것이 불가능하다.
            // println("testMethod2 - a1 : $a1")
            // testMethod1()
        }
    }

    // 맴버 메서드
    fun testMethod1(){
        println("testMethod1")
        // 맴버 변수를 사용
        println("testMethod1 - a1 : $a1")
        // 정적 맴버 변수 사용
        // 정적 맴버들은 객체를 생성하지 않아도 메모리에 생성되기 때문에
        // 일반 맴버에서 정적 맴버를 사용하는 것은 가능하다.
        println("testMethod1 - a2 : $a2")
        testMethod2()
    }
}

class KotlinClass{
    // 일반 맴버 변수
    var kotlinA1 = 100

    // 정적 맴버
    companion object{
        var kotlinA2 = 200

        // Companion Object 안에 @JvmStatic 어노테이션을 붙혀서
        // 정의한 맴버들은 Java 코드로 변경될 때 클래스의 static 맴버로 정의된다.
        // 코틀린 코드에서 사용할 때는 차이가 없지만 Java에서 사용할 때
        // 그냥 클래스 이름을 통해 접근이 가능해준다.
        // Kotlin 언어를 이용해 만든 클래스를 Java 프로그램에서 사용하고자 할 때
        // 정적 맴버를 정의할 때 @JvmStatic을 붙혀준다.
        @JvmStatic var kotlinA3 = 300

        fun kotlinMethod3(){
            println("KotlinClass - kotlinMethod3")
        }

        @JvmStatic fun kotlinMethod4(){
            println("KotlinClass - kotlinMethod4")
        }
    }

    // 일반 멤버 메서드
    fun kotlinMethod2(){
        println("KotlinClass - kotlinMethod2")
    }
}