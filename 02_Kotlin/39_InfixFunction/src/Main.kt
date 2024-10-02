// infix 함수 : 함수 호출을 연산자 사용하듯이 할 수 있는 함수
// 값1 함수이름 값2 형태로 호출한다.
// 값1 객체를 통해 함수를 호출하고 매개변수로 값2가 전달된다.
fun main(){
    val r1 = 10.add2(20)
    println("r1 : $r1")

    val r2 = 10 add2 20
    println("r2 : $r2")

    val a100 = TestClass1()
    a100.number1 = 100

    val a200 = TestClass1()
    a200.number1 = 200

    val a300 = a100.add4(a200)
    val a400 = a100 add4 a200
    println("a300.number1 : ${a300.number1}")
    println("a400.number1 : ${a400.number1}")
}

// 확장함수를 infix 함수로 정의한다.
// 기존의 클래스에 메서드를 추가한다 -> 확장함수
// 확장함수를 infix 함수로 정의한다.
infix fun Int.add2(a1:Int) : Int{
    return this + a1
}

class TestClass1{
    var number1 = 0

    infix fun add4(target:TestClass1) : TestClass1{
        val r1 = this.number1 + target.number1
        val t1 = TestClass1()
        t1.number1 = r1
        return t1
    }
}