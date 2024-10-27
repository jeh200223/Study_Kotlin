fun main() {

    val nameArray = arrayOf("홍길동", "최길동", "박길동")
    val ageArray = arrayOf(10, 11, 12)
    val korArray = arrayOf(90, 91, 92)
    val mathArray = arrayOf(80, 81, 82)
    val engArray = arrayOf(70, 71, 72)

    for(value in 0..< nameArray.size){
        println("이름 : ${nameArray[value]}")
        println("나이 : ${ageArray[value]}")
        println("국어점수 : ${korArray[value]}점")
        println("수학점수 : ${mathArray[value]}점")
        println("영어점수 : ${engArray[value]}점")
        println()
    }

    println("전체 학생수 : ${nameArray.size}명")
    println("국어 총점 : ${korArray.sum()}점")
    println("수학 총점 : ${mathArray.sum()}점")
    println("영어 총점 : ${engArray.sum()}점")
    println("국어 평균 : ${korArray.average().toInt()}점")
    println("수학 평균 : ${mathArray.average().toInt()}점")
    println("영어 평균 : ${engArray.average().toInt()}점")
}