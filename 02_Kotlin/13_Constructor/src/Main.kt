fun main() {
    val t1 = TestClass1()
    println("t1 : $t1")

    println("----------------------------------")

    val t21 = TestClass2()
    println("t21 : $t21")

    println("----------------------------------")

    val t22 = TestClass2(100, 200)
    println("t22 : $t22")

    // TestClass3은 매개변수가 없는 생성자가 없으므로 선택할 수 없다.
    // val t31 = TestClass3()
    // 생성자를 작성해 두었기 때문에 매개변수가 없는 생성자를 선택할 수 없고
    // 작성한 생성자를 선택해야 한다.
    val t32 = TestClass3(100, 200)
    println("t32 : $t32")

    println("-----------------------------------")

    val t41 = TestClass4(100, 200, 300)
    val t42 = TestClass4(100, 200, 300, 400)
    println("t41 : $t41")
    println("t42 : $t42")
}

class TestClass1{
    // init 코드 블럭
    // 객체를 생성할 때 자동으로 동작하는 부분
    // init 코드 블럭은 Java 코드로 변경될 때 모든 생상자 상단에
    // 삽입되는 코드가 된다.
    // 코틀린 언어 측면에서 보면 생성자보다 먼저 동작하는 부분에 해당한다.
    init{
        println("TestClass1의 init 코드 블럭")
        println("객체가 생성될 때 생성자 보다 먼저 동작하는 부분이다")
        println("Java 코드로 변경될 때 모든 생성자 상단에 삽입되는 코드이다")
    }
}

class TestClass2{

    init {
        println("TestClass2의 init 코드 블럭입니다.")
    }

    // 코틀린에서는 생성자를 정의할 때 클래스의 이름과 동일하게 하지 않고
    // consturctor 라는 이름을 사용한다.
    constructor(){
        println("TestClass2의 매개 변수가 없는 생성자")
    }
    // 매개변수의 개수나 타입을 다르게 하여 여러 개의 생성자를
    // 제공할 수 있다.
    constructor(a1:Int, a2:Int){
        println("TestClass2의 매개 변수가 있는 생성자")
        println("a1 : $a1")
        println("a2 : $a2")
    }
}

// 자바와 마찮가지로 생성자를 작성해주면
// 매개변수 없는 생성자가 자동으로 추가되지 않는다.
class TestClass3{

    constructor(a1:Int, a2:Int){
        println("TestClass3의 생성자")
        println("a1 : $a1")
        println("a2 : $a2")
    }
}

// 주 생성자
// 클래스당 하나만 가질 수 있는 생성자.
// 클래스 이름 옆에 바로 작성한다.
// 주 생성자에 정의한 매개변수는 다음과 같이 변환된다.
// var나 val을 붙히지 않은 변수 : 생성자의 매개변수
// var나 val을 붙힌 변수 : 생성자의 매개변수로 정의되고
// 동일한 이름의 맴버변수도 정의된다. 생성자 내부에 매개변수로 들어온 값을
// 맴버변수에 넣어주는 코드도 삽입된다.
// 즉, 주 생성자에 var나 val로 정의한 변수들은 클래스의 맴버 변수로
// 정의된다. 또한, 주 생성자에는 코드를 작성할 수 없으므로
// 클래스의 맴버 변수를 정의하는 용도로 사용한다.
// 이러한 주 생성자에 정의한 맴버 변수들은 향후 코틀린에서 제공하는
// 특별한 클래스에서 특별한 동작이 제공된다.
// 주 생성자의 사용 목적
// 1. 클래스에 맴버 변수를 정의하는 목적으로 사용한다.
// 2. 다른 생성자를 선택하여 객체를 생성하였을 경우 맴버 변수에 값을 넣어주는 것을 강제적으로 하게 하기 위해 사용한다.

// 주 생성자에 정의하는 맴버 변수는 객체를 생성할 때 값을 받아 맴버 변수에 담고자 하는 변수만
// 정의해 주면 된다.
class TestClass4(a1:Int, var a2:Int, val a3:Int){
    var a4:Int = 0

    // 다른 생성자들은 반드시 주 생성자를 호출해야 한다.
    constructor(a1:Int, a2:Int, a3:Int, a4:Int) : this(a1, a2, a3){
        this.a4 = a4
    }
}
