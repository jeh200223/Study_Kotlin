// inline 함수 : 함수를 정의할 때 inline 함수로 정의를 하게 되면
// java 코드로 변환될 때 함수를 호출하는 부분이 함수 내부의 코드 부분으로
// 변경된다.
// kotlin 입장에서 보면 일반 함수와 inline 함수는 다를게 없다.

fun main(){
    testFunction1()
    testFunction1()
    testFunction2()
    testFunction2()
}

// 일반함수
fun testFunction1(){
    println("----------------------")
    println("testFunction1")
    println("----------------------")
}

// inline 함수
inline fun testFunction2(){
    println("----------------------")
    println("testFunction2")
    println("----------------------")
}