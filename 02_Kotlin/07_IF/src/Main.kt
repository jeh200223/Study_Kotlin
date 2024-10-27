fun main(){
    // if 문 : 기본적으로 자바와 동일하다.

    val a1 = 10

    if(a1 > 5){
        println("a1은 5보다 큽니다.")
    }

    if(a1 > 20){
        println("a1은 20보다 큽니다.")
    }

    if(a1 > 5){
        println("a1은 5보다 큽니다")
    } else {
        println("a1은 5보다 크지 않습니다")
    }

    if(a1 > 20){
        println("a1은 20보다 큽니다")
    } else {
        println("a1은 20보다 크지 않습니다")
    }

    if(a1 == 3){
        println("a1은 3입니다")
    } else if(a1 == 5){
        println("a1은 5입니다")
    } else if(a1 == 10){
        println("a1은 10입니다")
    } else {
        println("a1은 3, 5, 10이 아닙니다")
    }

    println("-----------------------------------------")

    var a2:String

    if(a1 == 5){
        a2 = "a1은 5입니다"
    } else if(a1 == 10) {
        a2 = "a1은 10입니다"
    } else {
        a2 = "a1은 5, 10이 아닙니다"
    }
    println("a2 : $a2")

    println("-------------------------")

    // 조건에 만족하는 부분을 수행하고
    // 그 부분안에서 제일 마지막에 작성한 값, 변수의 값, 수식의 결과 등을
    // 변수에 담아준다.
    var a3 = if(a1 == 5){

        "a1은 5 입니다"
    } else if(a1 == 10){
        "a1은 10입니다"
    } else {
        "a1은 5, 10이 아닙니다"
    }
    println("a3 : $a3")

    println("-------------------------------")

    val a4 = test1(10)
    println("a4 : $a4")

    println("-------------------------------")
    val a5 = test2(10)
    println("a5 : $a5")
}

fun test1(v1:Int):String{
    if(v1 == 5){
        return "v1은 5입니다"
    } else if(v1 == 10){
        return "v1은 10입니다"
    } else {
        return "v1은 5, 10이 아닙니다"
    }
}

// 매개변수 v1의 값에 따라 무엇을 반환할지 결정하는 함수
// 조건에 만족하는 부분안에서 제일 마지막에 작성한다
// 값, 변수의 값, 수식의 값 등등을 반환하는 함수이다.
fun test2(v1:Int) = if(v1 == 5){
    "v1은 5입니다"
} else if(v1 == 10){
    "v1은 10입니다"
} else{
    "V1은 5, 10이 아닙니다"
}