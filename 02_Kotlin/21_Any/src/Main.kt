// Any 클래스
// 코틀린에서 모든 클래스가 직접 혹은 간접적으로 상속받는 클래스
// 클래스를 정의할 때 상속 관계를 기술하지 않으면 Any클래스를 상속받는다.
// Any 안에는 클래스가 갖춰야할 기본적인 기능들이 들어있다.
// 모든 객체를 담을 변수를 정의할 때 사용한다.
// Any에서 제공하는 메서드를 overriding 할 때 사용한다.

fun main() {

    // Any타입에 객체를 담는다
    val a1:Any = TestClass1()
    val a2:Any = TestClass2()

    println("a1 : $a1")
    println("a2 : $a2")

    val t3 = TestClass3(100, 200)
    // 객체를 출력할 때 toString 메서드를 호출하고
    // 이 메서드가 반환하는 문자열을 출력한다
    println("t3 : $t3")

    val t4 = TestClass3(100, 200)

    if(t3 == t4){
        println("t3와 t4는 같습니다")
    } else {
        println("t3와 t4는 다릅니다")
    }
}

class TestClass1
class TestClass2

// Any 클래스가 제공하는 메서드를 Overriding한 클래스
class TestClass3(var a1:Int, var a2:Int){

    // 객체를 출력하면 자동으로 호출되는 메서드
    // 이 메서드가 반환하는 문자열을 사용하게 된다.
    override fun toString(): String {
        val str1 = """
            TestClass3으로 만든 객체
            a1 : $a1
            a2 : $a2
        """.trimIndent()
        return str1
    }

    // == 연산자를 사용하면 호출되는 메서드
    override fun equals(other: Any?): Boolean {

        // 형변환
        val temp = other as TestClass3

        if(this.a1 == temp.a1 && this.a2 == temp.a2){
            return true
        }

        return false
    }
}


