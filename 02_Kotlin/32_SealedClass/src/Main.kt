// Sealed Class : 특정 클래스를 상속 받은 클래스들을 열거형 처럼 모아서
// 관리할 수 있는 개념
// 열거형은 변수들을 추가적하여 다수의 값들을 추가로 관리할 수 있다.
// Sealed Class는 이러한 열거형에 메서드를 넣어주고 싶을 때 사용하면 된다.

fun main(){
    val n1 = TwoClass1(100)
    checkNumber1(n1)
    println("-------------------------")

    val r4 = getNumberString1(n1)
    println("r4 : $r4")
    println("-------------------------")

    val n2 = NumberClass2.TwoClass2(100)
    checkNumber2(n2)
    println("-------------------------")

    println("-------------------------")
    val r5 = getNumberString2(n2)
    println("r5 : $r5")
}

open class NumberClass1{
    open fun numberMethod1(){
        println("NumberClass1의 numberMethod1")
    }
}

class OneClass1(var a1:Int, var a2:Int) : NumberClass1()

class TwoClass1(var a2:Int) : NumberClass1(){
    override fun numberMethod1() {
        println("TwoClass1의 numberMethod1")
    }
}

class ThreeClass1(var a1:Int, var a2:Double) : NumberClass1()

// Sealed 클래스
sealed class NumberClass2{

    open fun numberMethod2(){
        println("NumberClass2의 numberMethod2")
    }
    // 관리할 클래스
    class OneClass2(var a1:Int, var a2:Int):NumberClass2()
    class TwoClass2(var a1:Int):NumberClass2(){
        override fun numberMethod2() {
            println("TwoClass2의 numberMethod2")
        }
    }
    class ThreeClass2(var a1:Int, var a2:Double):NumberClass2()
}

// NumberClass1 타입을 받는 함수
// 각 클래스가 서로 독립적이기 때문에 모든 경우의 가지수로
// 분기하지 않더라도 오류가 발생하지 않는다.
fun checkNumber1(t1:NumberClass1){
    when(t1){
        is OneClass1 ->{
            println("OneClass1입니다")
            println(t1.a1)
            println(t1.a2)
            t1.numberMethod1()
        }
        is TwoClass1 ->{
            println("TowClass1입니다")
            println(t1.a2)
            t1.numberMethod1()
        }
    }
}

// 클래스타입으로 분기하여 값을 반환하는 함수
// 여기에서도 모든 경우의 가지수로 분기하지 않아 된다.
// 모든 경우의 가지수라는 판단을 할 수가 없기 때문에 else를 필요로 한다.
fun getNumberString1(n1:NumberClass1) = when(n1){
    is OneClass1 -> "OneClass1입니다"
    is TwoClass1 -> "TowClass1입니다"
    else -> "그 외의 클래스입니다"
}

// NumberClass2 타입을 받는 함수
// 각 클래스가 NumberClass2라는 Sealed Class 안에 있기 때문에
// 모든 클래스로 분기하지 않으면 오류가 발생한다.
fun checkNumber2(t2:NumberClass2){
    when(t2){
        is NumberClass2.OneClass2 ->{
            println("OneClass2입니다")
            println(t2.a1)
            println(t2.a2)
            t2.numberMethod2()
        }
        is NumberClass2.TwoClass2 ->{
            println("TowClass2입니다")
            println(t2.a1)
            t2.numberMethod2()
        }
        is NumberClass2.ThreeClass2 ->{
            println("ThreeClass2입니다")
            println(t2.a1)
            println(t2.a2)
            t2.numberMethod2()
        }
    }
}

// 클래스타입으로 분기하여 값을 반환하는 함수
// 여기에서도 모든 경우의 가지수로 분기해야 한다.
// 모든 경우의 가지수라는 판단을 할 수 있기 때문에 else를 필요로 하지 않는다.
fun getNumberString2(n2:NumberClass2) = when(n2){
    is NumberClass2.OneClass2 -> "OneClass2입니다"
    is NumberClass2.TwoClass2 -> "TowClass2입니다"
    is NumberClass2.ThreeClass2 -> "ThredClass2입니다"
}