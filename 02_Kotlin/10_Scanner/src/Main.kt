import java.util.Scanner

fun main(){
    // 자바에서는 식별자를 정의할 때 예약어를 절대 사용할 수 없다.
    // 하지만 코틀린은 가능하다.
    val `class` = 100

    println(`class`)

    // Scanner 객체 생성
    val scanner = Scanner(System.`in`)
    print("숫자를 입력해주세요 : ")
    val a1 = scanner.nextInt()
    println("a1 : $a1")
}