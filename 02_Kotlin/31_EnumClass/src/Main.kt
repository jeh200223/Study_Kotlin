// 열거형
// 프로그램 개발 시 특정 그룹안의 구성 요소를 정의하는 값이 필요하고자
// 할 때 사용한다.
// 월을 나타내는 단어들, 혈액을 나타내는 단어들, 성별 등등

// 값 자체는 중요하지 않고 다르기만 하면 되는 경우에 사용한다.
// 학생수

fun main(){
    printDirection1(DirectionClass.NORTH)
    printDirection1(DirectionClass.WEST)

    printDirection2(DirectionEnum.NORTH)
    printDirection2(DirectionEnum.WEST)

    val r1 = getDirectionString1(DirectionClass.NORTH)
    val r2 = getDirectionString1(DirectionClass.WEST)
    println("r1 : $r1")
    println("r2 : $r2")

    val r3 = getDirectionString2(DirectionEnum.NORTH)
    val r4 = getDirectionString2(DirectionEnum.WEST)
    println("r3 : $r3")
    println("r4 : $r4")

    println("------------------------------------")

    println(Number.ONE)
    println(Number.ONE.num)
    println(Number.ONE.str)
}

// 동서남북을 의미하는 정적 맴버 변수를 정의한다.
class DirectionClass{
    companion object{
        val NORTH = 0
        val SOUTH = 1
        val WEST = 2
        val EAST = 3
    }
}

// 정적 맴버의 값을 받는 메서드
fun printDirection1(dir:Int){
    when(dir){
        DirectionClass.NORTH -> println("북쪽입니다")
        DirectionClass.SOUTH -> println("남쪽입니다")
        DirectionClass.WEST -> println("서쪽입니다")
        DirectionClass.EAST -> println("동쪽입니다")
    }
}

// 열거형 정의
enum class DirectionEnum{
    NORTH, SOUTH, WEST, EAST
}

fun printDirection2(dir:DirectionEnum){
    // enum class 타입으로 분기를 할 경우
    // 모든 값에 대한 경우를 구현하지 않으면 오류가 발생한다.
    when(dir){
        DirectionEnum.NORTH -> println("북쪽입니다")
        DirectionEnum.SOUTH -> println("남쪽입니다")
        DirectionEnum.WEST -> println("서쪽입니다")
        DirectionEnum.EAST -> println("동쪽입니다")
    }
}

// 각 경우별로 분기를 하여 값을 반환하는 함수
// Companion Object에 정의한 변수들은 각각이 서로 관련성이 없는
// 독립적인 변수이다
// 이에 분기를 하게 되면 모든 경우의 가지수에대해 분기를 했다는 것을
// 판단할 수가 없기 때문에 else 작성을 강제하고 있다.
fun getDirectionString1(dir:Int) = when(dir){
    DirectionClass.NORTH -> "북쪽입니다"
    DirectionClass.SOUTH -> "남쪽입니다"
    DirectionClass.WEST -> "서쪽입니다"
    DirectionClass.EAST -> "동쪽입니다"
    else -> "애매합니다"
}

// 열거형 값을 받아 분기하여 값을 반환하는 함수
// enum class에 정의한 모든 경우로 분기하여 작성해주면 오류가 발생하지 않고
// else를 필요로 하지 않는다.
fun getDirectionString2(dir:DirectionEnum) = when(dir){
    DirectionEnum.NORTH -> "북쪽입니다"
    DirectionEnum.SOUTH -> "남쪽입니다"
    DirectionEnum.WEST -> "서쪽입니다"
    DirectionEnum.EAST -> "동쪽입니다"
}

// 하나에 대해 여러 가지 값을 표현할 수 있는 경우
// (예 : 원소를 나타내는 값(원소기호, 원소이름, 원소번호)
// 저 같은 경우에는 정수값 하나와 문자열값 하나를 추가로 설정해 주는 편입니다.
// enum 값은 분기를 할 때 사용
// 정수 값은 외부로 데이터를 보내고자 할 때(저장, 서버와 통신 등) 사용
// 문자열 값은 출력하고자 할 때 사용
enum class Number(val num:Int, val str:String){
    ONE(1, "일"),
    TWO(2, "이"),
    THREE(3, "삼")
}

fun printNumber(v1:Number){
    // enum 값은 분기할 때 사용
    when(v1){
        Number.ONE -> println("1입니다")
        Number.TWO -> println("2입니다")
        Number.THREE -> println("3입니다")
    }
    // 정수 값은 외부로 보내고자 할 때
    println(100 + v1.num)

    // 문자열 값은 출력할 때
    println(v1.str)
}