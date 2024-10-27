fun main(){
    testFunction1()
    // 일반 함수는 변수에 담을 수 없다.
    // val testFunction2 = testFunction1
    testFunction3()
}

// 일반함수
fun testFunction1(){
    println("testFunction1 입니다")
}
// 익명함수
val testFunction3 = fun(){
    println("익명함수 입니다")
}