import java.util.*

//학생 정보를 입력받는다.
//
//학생의 정보는 다음과 같이 구성된다.
//이름
//나이
//국어점수
//영어점수
//수학점수
//
//총 5명의 학생 정보를 입력받는다.
//
//입력이 완료되면 다음과 같이 출력한다.
//
//00번째 학생 정보
//이름 : 000
//나이 : 00 살
//국어점수 : 00점
//영어점수 : 00점
//수학점수 : 00점
//
//학생의 수 만큼
//
//국어 총점 : 000점
//영어 총점 : 000점
//수학 총점 : 000점
//국어 평균 : 000점
//영어 평균 : 000점
//수학 평균 : 000점
//
//학생 한명의 정보는 맵으로 관리한다.
//학생 전체는 리스트로 관리한다
fun main(){
    // 입력을 받는다.
    val scanner = Scanner(System.`in`)
    // 학생 정보를 담을 리스트
    val studentList = mutableListOf<MutableMap<String, Any>>()
    // 학생의 수 만큼 반복한다.
    for(idx in 0..4){
        println()
        print("이름 : ")
        val name1 = scanner.next()
        print("나이 : ")
        val age1 = scanner.nextInt()
        print("국어점수 : ")
        val kor1 = scanner.nextInt()
        print("영어점수 : ")
        val eng1 = scanner.nextInt()
        print("수학점수 : ")
        val math1 = scanner.nextInt()

        // 입력 받은 데이터를 맵에 담는다.
        val map1:MutableMap<String, Any> = mutableMapOf("name" to name1, "age" to age1,
            "kor" to kor1,
            "eng" to eng1, "math" to math1)
        // 맵을 리스트에 담는다.
        studentList.add(map1)
    }

    // 출력을 한다.
    studentList.forEachIndexed { index, mutableMap ->
        println()
        println("${index + 1}번째 학생 정보")
        println("이름 : ${mutableMap["name"]}")
        println("나이 : ${mutableMap["age"]}살")
        println("국어점수 : ${mutableMap["kor"]}점")
        println("영어점수 : ${mutableMap["eng"]}점")
        println("수학점수 : ${mutableMap["math"]}점")
    }

    // 총합을 구한다.
    var korTotal = 0
    var engTotal = 0
    var mathTotal = 0

    // 학생 수 만큼 반복한다.
    studentList.forEach {
        korTotal += it["kor"] as Int
        engTotal += it["eng"] as Int
        mathTotal += it["math"] as Int
    }

    // 평균을 구한다.
    val korAvg = korTotal / studentList.size
    val engAvg = engTotal / studentList.size
    val mathAvg = mathTotal / studentList.size

    println()
    println("국어 총점 : ${korTotal}점")
    println("영어 총점 : ${engTotal}점")
    println("수학 총점 : ${mathTotal}점")
    println("국어 평균 : ${korAvg}점")
    println("영어 평균 : ${engAvg}점")
    println("수학 평균 : ${mathAvg}점")

    
}