fun main() {

    var a1:Int = 100
    println("a1 : $a1")

    // var 로 선언된 변수에 새로운 값을 저장한다.
    a1 = 200
    println("a1 : $a1")

    // val 변수
    val a2:Int = 100
    println("a2 : $a2")

    // val 로 선언된 변수를 값을 새롭게 저장할 수 없다.
    // a2 = 200

    // 변수를 선언과 동시에 초기값을 지정해주면
    // 변수의 타입을 유추할 수 있기 때문에 변수의 타입을 생략해도 된다.
    // 하지만 변수 선언시 값을 지정하지 않을 경우 반드시 타입을 작성해줘야 한다.
    // 만약 객체의 정보를 부모클래스형 타입이나 구현한 인터페이스 타입에
    // 답는 작없을 하겠다면 반드시 변수의 타입을 작성해야 줘야 한다.
    var a3 = 100
    println("a3 : $a3")
    println("a3 type : ${a3.javaClass.name}")

    var a4 = 11.11
    println("a4 : $a4")
    println("a4 type : ${a4.javaClass.name}")

    // 저장할 값이 없을 경우 타입을 생략하면 오류가 발생한다.
    // var a5

    // 기본 자료형
    var a6:Byte = 100
    var a7:Short = 200
    var a8:Int = 300
    var a9:Long = 400L

    var a10:Double = 11.11
    var a11:Float = 22.22f

    var a12:Char = '가'

    var a13:Boolean = true

    var a14:String = "문자열"

    println("a6 : $a6")
    println("a7 : $a7")
    println("a8 : $a8")
    println("a9 : $a9")
    println("a10 : $a10")
    println("a11 : $a11")
    println("a12 : $a12")
    println("a13 : $a13")
    println("a14 : $a14")

    // 문자열 결합
    // 문자열 + 문자열
    // 두 문자열이 합쳐진 새로운 문자열이 만들어준다.
    var a15 = "안녕하세요" + "반갑습니다" + "감사합니다"
    println("a15 : $a15")

    // 문자열 + 문자열 아닌 것
    // 문자열 아닌 것이 문자열로 변환되고 문자열 연산을 수행한다.
    var a16 = "문자열" + 100 + 200
    println("a16 : $a16")

    // 코틀린은 문자열 안에 $를 통해 값이나 변수를 지정할 수 있다.
    // 해당 값이나 변수의 값을 적용해준 문자열이 하나만 생성된다.
    var a17 = "문자열, ${100}, ${200}"
    println("a17 : $a17")

    // 만약 변수만 작성하면 $만 사용할 수 있다.
    var a18 = "홍길동"
    var a19 = 30
    var a20 = "이름은 $a18 이고 나이는 ${a19}살 입니다"
    println("a20 : $a20")

    // null
    // 변수를 선언할 때 ? 를 붙혀주지 않으면 null을 허용하지 않는다.
    // null을 허용하는 변수를 만들어 줄때는 무조건 타입을 작성해줘야 한다.

    // null을 허용하지 않는 변수(?를 작성하지 않는다)
    var a21 = 100
    // a21 = null

    // null을 허용하는 변수(?를 작성한다)
    var a22:Int? = 100
    a22 = null
}