fun main(){
    // 함수 호출
    testFun1()
    println("-----------------------")
    // 함수에 정의되어 있는 매개변수의 수 만큼 전달해야 한다.
    testFunc2(100, 200)
    println("-----------------------")
    // 기본값을 가지는 매개변수는 값을 전달하지 않으면 기본값이 들어간다.
    testFunc3(100, 200)
    testFunc3(100)
    println("-----------------------")
    // 함수를 호출할때 전달하는 값이 어떤 매개변수에 들어갈지 결정할 수 있다.
    testFunc3(a2=200, a1=100)
    println("-----------------------")
    // 값을 반환하는 함수 호출
    val r1 = testFunc4(100, 200)
    println("r1 : $r1")
    println("-----------------------")
    val r2 = testFunc5(100, 200)
    println("r2 : $r2")
    println("-----------------------")
    val r3 = testFunc6(1)
    val r4 = testFunc7(1)
    println("r3 : $r3")
    println("r4 : $r4")
    println("-----------------------")
    // 람다식 사용
    val r5 = lambda1(100, 200)
    println("r5 : $r5")
    println("-----------------------")
    val r6 = lambda2(100, 200)
    println("r6 : $r6")
    println("-----------------------")
    val r7 = lambda3(100, 200)
    println("r7 : $r7")
    println("-----------------------")
    val r8 = testFunc8(100, 200)
    val r9 = lambda4(100, 200)
    println("r8 : $r8")
    println("r9 : $r9")
}
// 기본적인 함수
fun testFun1(){
    println("testFun1 입니다")
}
// 매개변수를 가진 함수
// 코틀린에서 함수들은 무조건 무언가를 반환한다.
// 개발자가 명시적으로 무언가를 반환하지 않으면
// Unit 타입의 값을 반환한다. Unit은 반환 타입을 생략해도 된다.
fun testFunc2(a1:Int, a2:Int){
    println("testFun2")
    println("a1 : $a1")
    println("a2 : $a2")
}

// 매개변수에는 기본값을 설정할 수 있다.
fun testFunc3(a1:Int, a2:Int=0){
    println("testFun2")
    println("a1 : $a1")
    println("a2 : $a2")
}
// 반환값을 명시한 함수
fun testFunc4(a1:Int, a2:Int):Int{
    return a1 + a2
}
// testFun4과 같이 함수 내부의 코드가
// 어떠한 값을 반화하는 것만으로 되어 있다면...
// 이 함수는 매개변수 a1 과 a2를 더한 값을 반환하는 함수이다.
fun testFunc5(a1:Int, a2:Int) = a1 + a2

fun testFunc6(a1:Int) = when(a1){
    0 -> "0입니다"
    1 -> "1입니다"
    else -> "0, 1이 아닙니다"
}

fun testFunc7(a1:Int) = if(a1 == 0){
    "0입니다"
} else if(a1 == 1){
    "1입니다"
} else {
    "0, 1이 아닙니다"
}

// 람다 : 잔달 받은 값을 가지고 계산을 한 다음에 계산의 결과를 반환하는 식
// 람다식이라고 부르기도 한다.
// 코틀린은 람다식으로 함수(메서드)를 상당수 대체할 수 있도록 지원을 하고 있다.
// 코틀린에서는 람다 함수라고 부르기도 한다.
// (Int, Int) : 람다식을 사용할 때 전달 받을 값의 타입
// -> Int : 람다식을 통해서 반환할 값의 타입
// {a1:Int, a2:Int : 람다식을 사용할 전달 받을 값을 담을 변수
// -> a1 + a2 : 반환할 값
val lambda1 : (Int, Int) -> Int = {a1:Int, a2:Int -> a1 + a2 }
// 코틀린은 람다 함수 대신에 람다식만 사용해도 된다.
val lambda2 = {a1:Int, a2:Int -> a1 + a2}
// 람다식에 타입을 생락할 수 있다.
val lambda3 : (Int, Int) -> Int = {a1, a2 -> a1 + a2}
// 여러 줄의 코드를 가지고 있는 함수
fun testFunc8(a1:Int, a2:Int): Int{
    val r1 = a1 + 100
    val r2 = a2 + 200
    return r1 + r2
}
// 람다식으로 작성
// 람다식 제일 마지막에 작성한
// 변수의 값이나 값이나 수식의 결과가 최종 결과로 반환된다.
val lambda4 = {a1:Int, a2:Int ->
    val r1 = a1 + 100
    val r2 = a2 + 200
    r1 + r2
}