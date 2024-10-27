fun main(){
    // 각 데이터를 담을 배열
    val nameArray = arrayOf("홍길동", "최길동", "박길동")
    val ageArray = arrayOf(10, 11, 12)
    val korArray = arrayOf(90, 91, 92)
    val engArray = arrayOf(80, 81, 82)
    val mathArray = arrayOf(70, 71, 72)

    // 각 학생의 정보를 출력한다.
    nameArray.forEachIndexed { index, s ->
        println()
        println("이름 : $s")
        println("나이 : ${ageArray[index]}")
        println("국어점수 : ${korArray[index]}")
        println("영어점수 : ${engArray[index]}")
        println("수학점수 : ${mathArray[index]}")
    }

    println()
    println("전체 학생수 : ${nameArray.size}명")
    println("국어 총점 : ${korArray.sum()}점")
    println("수학 총점 : ${mathArray.sum()}점")
    println("영어 총점 : ${engArray.sum()}점")
    println("국어 평균 : ${korArray.average()}점")
    println("수학 평균 : ${mathArray.average()}점")
    println("영어 평균 : ${engArray.average()}점")
}