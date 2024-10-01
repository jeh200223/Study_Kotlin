fun main(){
    // 범위 관련 연산자
    // 숫자1..숫자2 : 숫자1부터 숫자2까지 1씩 증가되는 값을 관리하는 요소
    val k1 = 1..10
    println(k1.toList())

    // 숫자1 until 숫자2 : 숫자1 부터 숫자2 - 1 까지 1씩 증가되는 값을 관리하는 요소
    val k2 = 1 until 10
    println(k2.toList())

    // until 은 ..< 연산자로 대체해서 쓸 수 있다.
    val k3 = 1 ..< 10
    println(k3.toList())

    // step : 증가폭을 설정할 수 있다.
    val k4 = 1 .. 10 step 2
    println(k4.toList())

    // 숫자1 downTo 숫자2 : 숫자1 부터 숫자 2까지 1씩 감소
    val k5 = 10 downTo 1
    println(k5.toList())

    // downTo 사용시 step을 지정하면 감소 폭을 설정한다.
    val k6 = 10 downTo 1 step 2
    println(k6.toList())

    // while문 : 조건에 만족하는 동한 반복한다.
    // 조건식이 위에 있으므로 조건이 처음부터 거짓이라면 단 한번도 수행되지 않는다.
    var a1 = 0
    while(a1 < 10){
        println("while - $a1")
        a1++
    }
    println("-----------------------------------------")

    // do while : 조건에 만족하는 동한 반복한다.
    // 조건식이 아래에 있으므로 조건이 처음부터 거짓이라도 단 한번은 수행된다.
    // 조건식에 들어가는 변수의 값이 반복해야 하는 코드 내부에서 결정되는 경우 사용한다.
    var a2 = 0
    do{
        println("do while - $a2")
        a2++
    }while(a2 < 10)
    println("-----------------------------------------")

    // 코틀린에서 for문은 데이터를 관리하는 요소를 통해 반복하는 것만 제공된다.
    val a3 = 1..10

    for(item in a3){
        println("for - $item")
    }
    println("-----------------------------------------")
}