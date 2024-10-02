import kotlin.reflect.KClass
import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.primaryConstructor

// 리플렉션 : 프로그램 실행 중에 코드를 통해
// 객체나 클래스 등의 정보를 파악하고자 할 때 사용한다.
// 잘 사용하지 않는 개념이긴 하지만 안드로이드에서 사용하는 것이 있기 때문에
// 살펴본다.

// 코틀린에서 리플렉션을 사용하기 위해서는 라이브러리를 추가해야 한다

// 파일 > 프로젝트 구조
//좌측에서 라이브러리를 선택해준다.
// 라이브러리를 누르면 나오는 화면에서 중간에 있는 + 를 눌러준다.
// + 를 누르면 나오는 메뉴에서 Maven에서.. 를 선택해준다.
// 검색창에서 kotlin reflect 로 검색을한다.
// 검색 결과에서 kotlin-reflect를 찾아 선택해준다.
fun main(){
    // 클래스 타입
    val a1 = String::class
    val a2 = String::class.java
    println("String 코틀린에서의 타입 : $a1")
    println("String 자바에서의 타입 : $a2")
    println("---------------------------------")

    // 객체를 통해 클래스 타입 확인
    val str1 = "안녕하세요"
    val a3 = str1::class
    val a4 = str1::class.java
    println("안녕하세요 코틀린에서의 타입 : $a3")
    println("안녕하세요 자바에서의 타입 : $a4")
    println("--------------------------------")

    val test1 = TestClass()
    val a7 = test1::class
    val a8 = test1::class.java
    println("test1 코틀린에서의 타입 : $a7")
    println("test1 자바에서의 타입 : $a8")
    println("--------------------------------")

    // 객체를 생성했을 때 사용한 클래스에 대한 다양한 정보를 파악할 수 있다.
    println("추상 클래스인가 : ${test1::class.isAbstract}")
    println("Companion Object 인가 : ${test1::class.isCompanion}")
    println("Data 클래스인가 : ${test1::class.isData}")
    println("final 클래스인가 : ${test1::class.isFinal}")
    println("open 클래스인가 : ${test1::class.isOpen}")
    println("중첩 클래스인가 : ${test1::class.isInner}")
    println("Sealed 클래스인가 : ${test1::class.isSealed}")
    println("--------------------------------")

    // 생성자의 정보
    val constructors = test1::class.constructors
    // 생성자가 다수일 수도 있기 때문에 리스트 형태로 반환된다.
    for(con in constructors){
        println("생성자 : $con")
        // 생성자의 매개변수에 대한 정보를 파악할 있다.
        for(param in con.parameters){
            println("매개변수 순서 : ${param.index}")
            println("매개변수 타입 : ${param.type}")
            println("매개변수 이름 : ${param.name}")
        }
    }
    println("--------------------------------")

    // 주 생성자
    val primaryCon = test1::class.primaryConstructor
    // 주 생성자가 있다면
    if(primaryCon != null){
        println(primaryCon)

        for(param in primaryCon.parameters){
            println("매개변수 순서 : ${param.index}")
            println("매개변수 타입 : ${param.type}")
            println("매개변수 이름 : ${param.name}")
        }
    }
    println("--------------------------------")

    // 프로퍼티(변수)의 목록을 가져온다.
    val properties = test1::class.declaredMemberProperties
    for(prop in properties){
        println("이름 : ${prop.name}")
        println("타입 : ${prop.returnType}")
        println("open 인지 : ${prop.isOpen}")
        println("Abstract 인지 : ${prop.isAbstract}")
    }
    println("--------------------------------")

    // 메서드 정보
    val methods = test1::class.declaredMemberFunctions
    for(met in methods){
        println("메서드 이름 : ${met.name}")
        println("반환 타입 : ${met.returnType}")
        println("open 인지 : ${met.isOpen}")
        println("Abstract 인지 : ${met.isAbstract}")

        val params = met.parameters
        for(p1 in params){
            println("매개변수 순서 : ${p1.index}")
            println("매개변수 타입 : ${p1.type}")
            println("매개변수 이름 : ${p1.name}")
        }
    }
}

class TestClass(){
    val number1 = 100
    var number2 = 200

    constructor(a1:Int) : this()

    constructor(a1:Int, a2:Int) : this()

    fun testMethod1(){

    }
}