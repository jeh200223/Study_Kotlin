fun main(){
    val t1 = TestClass1();
    println("t1.a1 : ${t1.a1}")
    println("t1.a2 : ${t1.a2}")
    println("t1.a3 : ${t1.a3}")
    println("t1.a4 : ${t1.a4}")
    println("t1.a5 : ${t1.a5}")
    println("t1.a6 : ${t1.a6}")

    val t2 = TestClass2()
    t2.testMethod1()

    t2.a5 = "믿으시오~"
    t2.testMethod1()

    println("t2.a8 : ${t2.a8}")
    println("t2.a8 : ${t2.a8}")
}

class TestClass1{
    // 코틀린에서는 프로퍼티를 정의할 때 저장할 값을 무조건 지정해줘야 한다.
    // 변수의 타입을 작성했다고 하더라도 반드시 값을 지정해야 한다.
    var a1:Int = 100
    var a2 = 200

    // 변수를 선언할 때 값을 지정하지 않았다고 하더라도 init 블럭에서 값을 넣어주는
    // 작업을 해주면 오류가 발생하지 않는다.
    // init 블럭은 객체를 생성할 때 무조건 동작하는 부분이기 때문에 변수를 사용하기 전에
    // 값이 저장되어 있다는 것을 보장받을 수 있기 때문이다.
    var a3:Int
    val a4:Int

    init{
        a3 = 300
        a4 = 400
    }

    // 생성자
    // 생성자는 객체가 생성될 때 자동으로 동작하는 부분이다.
    // 만약 생성자에서 변수에 값을 넣어주는 작업을 해주게 되면
    // 변수를 사용하기 전에 값이 저장되어 있다는 것을 보장받을 수 있기 때문에
    // 오류가 발생하지 않는다.
    var a5:Int
    val a6:Int

    constructor(){
        a5 = 500
        a6 = 600
    }

    // 만약 생성자가 여러개가 있다면 다면 모든 생성자에서 해당 변수에 값을
    // 넣어주는 작업이 있어야만 한다.
    // 1. 변수에 값을 넣어주는 생성자를 호출하거나
    // 2. 변수에 값을 넣어주는 작업을 하거나
    constructor(a1:Int, a2:Int) : this()

    constructor(a1:Int, a2:Int, a3:Int){
        a5 = 500
        a6 = 600
    }
}

class TestClass2{
    // 지연 초기화
    // init 블럭이나 생성자에서 값을 초기화 하지 않고 메서드에서 값을 저장하는 경우에 사용한다.
    // var property만 가능하다.
    // Int, Double 등과 같은 기본 자료형들은 사용할 수 없다.
    lateinit var a5:String

    fun testMethod1(){
        // ::변수명.isInitialized 를 사용하면 변수가 초기화 되어 있는지 확인할 수 있다.
        println("a5 : ${::a5.isInitialized}")
        // lateinit 변수는 사용 전에 반드시 검사를 하는 것이 좋다.
        if(::a5.isInitialized){
            println("a5 : $a5")
        } else {
            println("a5는 초기화 되어 있지 않습니다")
        }
    }

    // lazy
    // val 로 정의된 property에 설정할 수 있다.
    // by lazy를 붙힌 val 변수는 변수가 선언될때 값이 저장되지 않는다.
    // 해당 변수를 최초로 사용할 때 lazy 블럭의 코드가 수행되어 수행된 결과를
    // 변수에 담아준다.
    // val 변수는 변수의 값을 다시 저장할 수 없기 때문에 lazy 블럭은
    // 한번만 수행된다.
    val a8:Int by lazy {
        println("a8 lazy 코드 블럭")
        val temp = 1 + 2 + 3 + 4 + 5
        // 마지막에 작성한 값이나, 변수의 값이나 수식의 결과를
        // 변수에 담아준다.
        temp
    }
}