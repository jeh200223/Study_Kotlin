import java.util.*
import kotlin.math.abs
import kotlin.math.pow

fun main(){
    ex10()
}

// 1부터 2000까지의 숫자 중에 하샤드 수를 찾아 모두 출력한다.
// 하샤드 수란 어떤 숫자 x에 대해 x의 자리숫의 합으로 x가 나눠어
// 떨어지는 숫자를 의미한다.
// (예 : 18, 1 + 8 = 9, 18 / 9 = 0)
fun ex07(){
    // 1 ~ 2000까지 반복한다.
    for(v1 in 1..2000) {
        // 하샤드 숫자인지 검사한다.
        // 현재숫자를 각 자리수 별로 뜯어낸다.
        val a1 = v1 / 1000
        val t1 = v1 % 1000

        val a2 = t1 / 100
        val t2 = t1 % 100

        val a3 = t2 / 10
        val a4 = t2 % 10
        // 총합을 구한다.
        val a5 = a1 + a2 + a3 + a4
        // 현재 숫자를 총합으로 나눈 나머지를 구한다.
        if(v1 % a5 == 0){
            println(v1)
        }
    }
}


// 직선의 방정식은 다음과 같다
// y = ax + b
// 다음과 같이 x와 y가 주어졌을 때 a 와 b 에 들어갈 값을
// 구해 출력한다. (최소제곱법이라는 계산식을 찾아 만들어주세요)
// x = 2, y = 4
// x = 3, y = 5
// x = 4, y = 3
// x = 5, y = 8
// https://teddy0315.tistory.com/3
fun ex08(){
    // 최소 제곱법 계산식에는 x의 평균과 y의 평균이 필요하다.
    val xMean = (2 + 3 + 4 + 5).toDouble() / 4.0
    println("x의 평균 : $xMean")

    val yMean = (4 + 5 + 3 + 8).toDouble() / 4.0
    println("y의 평균 : $yMean")

    // 기울기를 구하기 위한 분모를 계산한다.
    val a1 = (2.toDouble() - xMean).pow(2.0)
    + (3.toDouble() - xMean).pow(2.0)
    + (4.toDouble() - xMean).pow(2.0)
    + (5.toDouble() - xMean).pow(2.0)
    println("분모 : $a1")

    // 기울기를 구하기 위한 분자를 계산한다.
    val a2 = (2.toDouble() - xMean) * (4.toDouble() - yMean)
    + (3.toDouble() - xMean) * (5.toDouble() - yMean)
    + (4.toDouble() - xMean) * (3.toDouble() - yMean)
    + (5.toDouble() - xMean) * (8.toDouble() - yMean)
    println("분자 : $a2")

    // 기울기를 구한다
    val gradient = a2 / a1
    println("기울기 : $gradient")

    // y절편을 구한다.
    val intercept = yMean - (xMean * gradient)
    println("y절편 : $intercept")

    val pred1 = gradient * 2 + intercept
    val pred2 = gradient * 3 + intercept
    val pred3 = gradient * 4 + intercept
    val pred4 = gradient * 5 + intercept
    println("진짜 결과 : 4, 예측 결과 : $pred1")
    println("진짜 결과 : 5, 예측 결과 : $pred2")
    println("진짜 결과 : 3, 예측 결과 : $pred3")
    println("진짜 결과 : 8, 예측 결과 : $pred4")
}

// 키보드로 부터 10개의 정수값을 입력받는다.
// 입력받은 10개의 숫자중 최소와 최대값의 범위중
// 가운데 값과 가장 가까운 정수값을 출력해준다.
fun ex10(){
    // 키보드로 부터 10개의 정수 값을 입력받는다.
    val scanner = Scanner(System.`in`)
    print("정수값 1 : ")
    val a1 = scanner.nextInt()
    print("정수값 2 : ")
    val a2 = scanner.nextInt()
    print("정수값 3 : ")
    val a3 = scanner.nextInt()
    print("정수값 4 : ")
    val a4 = scanner.nextInt()
    print("정수값 5 : ")
    val a5 = scanner.nextInt()
    print("정수값 6 : ")
    val a6 = scanner.nextInt()
    print("정수값 7 : ")
    val a7 = scanner.nextInt()
    print("정수값 8 : ")
    val a8 = scanner.nextInt()
    print("정수값 9 : ")
    val a9 = scanner.nextInt()
    print("정수값 10 : ")
    val a10 = scanner.nextInt()

    // 최소와 최대값을 구한다.
    var max1 = a1
    var min1 = a1

    if(max1 < a2){
        max1 = a2
    }
    if(min1 > a2){
        min1 = a2
    }

    if(max1 < a3){
        max1 = a3
    }
    if(min1 > a3){
        min1 = a3
    }

    if(max1 < a4){
        max1 = a4
    }
    if(min1 > a4){
        min1 = a4
    }

    if(max1 < a5){
        max1 = a5
    }
    if(min1 > a5){
        min1 = a5
    }

    if(max1 < a6){
        max1 = a6
    }
    if(min1 > a6){
        min1 = a6
    }

    if(max1 < a7){
        max1 = a7
    }
    if(min1 > a7){
        min1 = a7
    }

    if(max1 < a8){
        max1 = a8
    }
    if(min1 > a8){
        min1 = a8
    }

    if(max1 < a9){
        max1 = a9
    }
    if(min1 > a9){
        min1 = a9
    }

    if(max1 < a10){
        max1 = a10
    }
    if(min1 > a10){
        min1 = a10
    }

    // 중간 값을 구한다.
    val median = ((max1 - min1) / 2) + min1
    // 중간 값과 가장 가까운 값을 구한다.
    var result = a1
    var temp = abs(a1 - median)

    if(temp > abs(a2 - median)){
        result = a2
        temp = abs(a2 - median)
    }

    if(temp > abs(a3 - median)){
        result = a3
        temp = abs(a3 - median)
    }

    if(temp > abs(a4 - median)){
        result = a4
        temp = abs(a4 - median)
    }

    if(temp > abs(a5 - median)){
        result = a5
        temp = abs(a5 - median)
    }

    if(temp > abs(a6 - median)){
        result = a6
        temp = abs(a6 - median)
    }

    if(temp > abs(a7 - median)){
        result = a7
        temp = abs(a7 - median)
    }

    if(temp > abs(a8 - median)){
        result = a8
        temp = abs(a8 - median)
    }

    if(temp > abs(a9 - median)){
        result = a9
        temp = abs(a9 - median)
    }

    if(temp > abs(a10 - median)){
        result = a10
        temp = abs(a10 - median)
    }

    println("최대값 : $max1")
    println("최소값 : $min1")
    println("중간값 : $median")
    println("중간값과 가장 가까운 값 : $result")
}