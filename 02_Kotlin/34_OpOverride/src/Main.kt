// 코틀린은 연산자를 사용하게 되면 자바의 연산 처리 방식을 따르지 않고
// 연산자에 해당하는 메서드를 호출하여 그 메서드가 반환하는 값을
// 연산의 결과로 사용한다.
// 이때문에 클래스를 작성할 때 연산자와 관련된 메서드를 구현해주면
// 객체간의 연산을 구현할 수 있다.
fun main(){
    // 정수값 두 개의 연산
    val num1 = 100
    val num2 = 200
    val a1 = num1 + num2
    println("a1 : $a1")

    // 코틀린에서 + 연산자를 사용하게되면
    // 클래스에 정의되어 있는 plus 메서드가 호출된다.
    // plus 메서드가 반환하는 값을 연산의 결과로 사용한다.
    val a2 = num1.plus(num2)
    println("a2 : $a2")

    val t1 = TestClass(100, 200)
    val t2 = TestClass(1000, 2000)

    // 객체간의 연산을 할 때 연산자에 해당하는 메서드를 구현해 놓지 않으면
    // 오류가 발생한다.
    val t3 = t1 + t2
    println("t3.a1 : ${t3.a1}")
    println("t3.a2 : ${t3.a2}")

    val t4 = t1 - t2
    println("t4.a1 : ${t4.a1}")
    println("t4.a2 : ${t4.a2}")
}

class TestClass(var a1:Int, var a2:Int){
    // + 연산자를 사용할 때 호출되는 메서드
    // 연산자와 관련된 메서드는 연산자 좌측에 있는 객체를 통해
    // 호출이 되고 연산자 우측에 있는 객체가 매개변수로 들어온다.
    operator fun plus(target:TestClass) : TestClass{
        val r1 = this.a1 + target.a1
        val r2 = this.a2 + target.a2
        val result = TestClass(r1, r2)
        return result
    }

    operator fun minus(target:TestClass) : TestClass{
        val r1 = this.a1 - target.a1
        val r2 = this.a2 - target.a2
        val result = TestClass(r1, r2)
        return result
    }
}