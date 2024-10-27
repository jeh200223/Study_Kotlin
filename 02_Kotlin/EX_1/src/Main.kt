import java.util.ArrayList
import java.util.Scanner

fun main() {
    /*1. 사용자에게 키보드로 정수를 입력받는다.
    1부터 입력받은 숫자까지의 총합을 구해 출력한다.*/
//    first()

    /*2. 사용자에게 키보드로 정수를 입력받는다.
    입력받은 정수가 짝수인지 홀수인지를 출력한다.
    짝수인지 홀수인지 판단하는 함수를 만들어 사용한다.
    이 함수의 반환값은 Boolean 이고 매개변수로 전달된
    값이 짝수이면 true, 홀수이면 false를 반환하게 한다.*/
//    second()

    /*3. 1 ~ 1000까지 7의 배수와 3의 배수의 총합을 출력한다.*/
//    third()

//    4. 1 ~ 1000까지 7의 배수와 3의 배수의 평규능 출력한다.
//    fourth()

//    5. 7의 배수(양수만)의 총합이 2000을 넘어가는 시점의 7의배수가 무엇인지와 총합을 출력한다.
//    fifth()

//    6. 1부터 2000까지의 숫자 중에 소수를 찾아 모두 출력한다. 수는 1과 자기 자신으로만 나눠지는 숫자를 의미한다
//    sixth()

    /*7.1부터 2000까지의 숫자 중에 하샤드 수를 찾아 모두 출력한다. 하샤드 수란 어떤 숫자 x에 대해 x의 자리숫의 합으로 x가 나눠어 떨어지는 숫자를 의미한다.
    (예 : 18, 1 + 8 = 9, 18 / 9 = 0)*/
    seventh()
    /*8. 직선의 방정식은 다음과 같다
            y = ax + b
    다음과 같이 x와 y가 주어졌을 때 a 와 b 에 들어갈 값을
            구해 출력한다. (최소제곱법이라는 계산식을 찾아 만들어주세요)
    x = 2, y = 4
    x = 3, y = 5
    x = 4, y = 3
    x = 5, y = 8*/
//    eighth()

    /*9. 키보드로 부터 10개의 정수값을 입력받는다.
    입력받는 숫자중 가장 큰 값과 가장 작은 값의 평균을
    구해 출력한다.*/
//    nineth()


    /*키보드로 부터 10개의 정수값을 입력받는다.
    입력받은 10개의 숫자중 최소와 최대값의 범위중
    가운데 값과 가장 가까운 정수값을 출력해준다.*/
//    ten()
}

fun first() {
    println("숫자를 입력해주세요")
    var scanner = Scanner(System.`in`)
    var a1 = 0
    var result = 0
    var inputNumber = scanner.nextInt()

    while (a1 < inputNumber) {
        a1++
        result = result.plus(a1)
    }

    println("총합 $result")
}

fun second() {
    println("숫자를 입력해주세요")
    var scanner = Scanner(System.`in`)
    var inputNumber = scanner.nextInt()
    var bolcheck:Boolean = false

    when(inputNumber.rem(2)){
        0 -> bolcheck = true
        1 -> bolcheck = false
    }

    if(bolcheck) {
        println("값은 짝수입니다")
    } else if (!bolcheck) {
        println("값은 홀수입니다.")
    } else {
        println("오류입니다.")
    }
}

fun third() {
    var sum = 0
    var a1 = 1


    while (a1 < 1000) {
        a1++
        if(a1.rem(7) == 0 || a1.rem(3) == 0) {
            sum = sum.plus(a1)
        }
    }

    println("총합 $sum")
}

fun fourth() {
    var sevensum = 0
    var thirdsum = 0
    var a1 = 1
    var sevenavg = 0;
    var thirdavg = 0;
    var sevencount = 0;
    var thirdcount = 0;


    while (a1 < 1000) {
        a1++

        if(a1.rem(7) == 0) {
           sevensum = sevensum.plus(a1)
           sevencount++
        }
        if (a1.rem(3) == 0) {
            thirdsum = thirdsum.plus(a1)
            thirdcount++
        }

    }
    sevenavg = sevensum.div(sevencount);
    thirdavg = thirdsum.div(thirdcount);
    println("7의배수 평균은 $sevenavg 이고 3의배수 평균은 $thirdavg 이다.")
}

fun fifth() {
    var sum = 0
    var a1 = 1
    var a1count = 0


    while (a1 < 1000) {
        a1++
        if(sum >= 2000){
            break
        } else {
            if(a1.rem(7) == 0) {
                sum = sum.plus(a1)
                a1count = a1
            }
        }
    }

    println("7의배수 $a1count 총합 $sum")
}

fun sixth() {
    val primes = mutableListOf<Int>()

    for (num in 2..2000) {
        if (isPrime(num)) {
            primes.add(num)
        }
    }

    println(primes.joinToString("\n"))
}

fun seventh() {
    var arrayList = ArrayList<Int>()
    for (num in 1..2000) {
        if(ishashard(num)) {
            arrayList.add(num)
        }
    }
    println("하샤드 수 : ${arrayList.joinToString (", ") }")
}

fun ishashard(num: Int): Boolean {
    val sum = num.toString().map { it.toString().toInt() }.sum()
    return num.rem(sum) == 0
}

fun eighth() {
    val xValues = listOf(2.0, 3.0, 4.0, 5.0)
    val yValues = listOf(4.0, 5.0, 3.0, 8.0)

    val n = xValues.size
    val sumX = xValues.sum()
    val sumY = yValues.sum()
    val sumXY = xValues.zip(yValues) { x, y -> x * y }.sum()
    val sumX2 = xValues.sumOf { it * it }

    // 기울기 a 계산
    val a = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX)

    // 절편 b 계산
    val b = (sumY - a * sumX) / n

    // 결과 출력
    println("기울기 a: $a")
    println("절편 b: $b")
}

fun nineth() {
    var number = 0;
    var maxnum:Int
    var minnum:Int
    var avgnum:Int
    var arrayList = ArrayList<Int>()
    var a1 = 0
    var scanner = Scanner(System.`in`)

    while (a1 < 10){
        a1++
        println("숫자를 입력해주세요")
        number = scanner.nextInt()
        arrayList.add(number)
    }
    maxnum = arrayList.sorted().last()
    minnum = arrayList.sorted().first()
    avgnum = (maxnum.plus(minnum)).div(2)
    println("최대값과 최소값의 평균은 $avgnum 입니다.")
}


fun ten() {
    var a1 = 0
    var number:Int
    val scanner = Scanner(System.`in`)
    val arrayList = ArrayList<Int>()
    val cenNum:Int?
    var maxnum:Int
    var minnum:Int
    var avgnum:Int

    while (a1 < 10){
        a1++
        println("숫자를 입력해주세요")
        number = scanner.nextInt()
        arrayList.add(number)
    }
    maxnum = arrayList.sorted().last()
    minnum = arrayList.sorted().first()
    avgnum = (maxnum.plus(minnum)).div(2)
    cenNum = arrayList.minByOrNull { Math.abs(it - avgnum) }
    println("최대값과 최소값의 평균에서의 근사값은 $cenNum 입니다.")
}

fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}