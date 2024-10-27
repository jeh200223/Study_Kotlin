// DataClass : 객체가 관리하는 맴버 변수들을 보다 쉽게 사용할 수 있도록
// 제공되는 클래스
// 몇 가지 메서드가 구현된다.
// 자동으로 구현되는 메서드들은 주 생성자를 통해서 정의된 맴버 변수들에
// 대해 작업을 해주는 메서드들이다.
// 주 생성자가 아닌 다른 곳에서 정의된 맴버 변수들에 대해서는
// 작업을 해주지 않는다.
fun main(){
    // 객체를 생성한다.
    val t1 = TestClass1(100, 200)
    val t2 = TestClass2(100, 200)
    println("t1 : $t1")
    // 객체를 출력하면 toString 메서드가 호출된다.
    // toString 메서드는 객체가 관리하는 맴버 변수들의 값을
    // 확인할 수 있도록 문자열을 구성하여 반환하여 준다.
    println("t2 : $t2")

    val t10 = TestClass1(100, 200)
    val t20 = TestClass2(100, 200)

    // == 연산자
    // 코틀린에서 == 연산자를 사용하면 equals 메서드가 호출된다.
    // 일반 클래스에서는 equals 메서드가 두 객체의 주소값을 비교하여
    // 같은 객체인지를 판단한다.
    if(t1 == t10){
        println("t1과 t10은 같습니다")
    } else {
        println("t1과 t10은 같지 않습니다.")
    }
    // Data 클래스에서는 equals 메서드가 주 생성자를 통해 정의된 맴버 변수의
    // 값이 서로 같은지를 비교하여 같은 객체인지를 판단한다.
    if(t2 == t20){
        println("t2와 t20은 같습니다")
    } else {
        println("t2와 t20은 같지 않습니다.")
    }

    // copy : 데이터 클래스에만 있다.
    // 객체를 복제한 새로운 객체를 생성해준다.
    val t100 = t2.copy()
    println("t2 : $t2")
    println("t100 : $t100")

    t100.a1 = 1000
    println("t2 : $t2")
    println("t100 : $t100")

    // ComponentN
    // Data Class에만 있다.
    // 주 생성자에 정의되어 있는 맴버 변수의 수 만큼 만들어지는 메서드
    // 주 생성자에 정의되어 있는 변수의 순서대로 값을 반환받을 수 있는
    // 메서드이다.
    // 주 생성자에 정의되어 있는 첫 번째 맴버 변수 값을 받아온다.
    val num1 = t2.component1()
    // 주 생성자에 정의되어 있는 두 번째 맴버 변수 값을 받아온다.
    val num2 = t2.component2()
    println("$num1, $num2")

    // 객체 분해
    // 주 생성자에 정의되어 있는 맴버 변수의 순서대로 값을 받아올 수 있다.
    // 이 때, componentN 메서드가 호출된다.
    val (num10, num20) = t2
    println("$num10, $num20")
}

class TestClass1(var a1:Int, var a2:Int){
    var a3:Int = 0
}

data class TestClass2(var a1:Int, var a2:Int){
    var a3:Int = 0
}