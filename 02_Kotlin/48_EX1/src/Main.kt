import java.util.*

//동물관리 프로그램
//
//동물 종류에는 강아지, 고양이, 앵무새가 있다.
//
//프로그램이 처음 시작하면 동물 정보를 입력받는다.
//각 종류별로 1가지씩 입력을 받는다.
//
//강아지 정보입력
//이름 :
//나이 :
//개인기 개수
//
//고양이 정보입력
//이름 :
//나이 :
//서열 :
//
//앵무새 정보 입력
//이름 :
//나이 :
//단어 개수 :
//
//입력이 완료되면 다음과 같이 출력한다.
//
//강아지 이름 : 000
//강이지 나이 : 00살
//개인기 개수 : 00개
//
//고양이 이름 : 000
//고양이 나이 : 00살
//서열 : 0위
//
//앵무새 이름 : 000
//앵무새 나이 : 00살
//단어 개수 : 0개
//
//리스트와 맵만 사용해서 만들어주세요

fun main(){
    // 입력받는다
    val scanner = Scanner(System.`in`)

    println()
    println("강아지 정보입력")
    print("이름 : ")
    val name1 = scanner.next()
    print("나이 : ")
    val age1 = scanner.nextInt()
    print("개인기 개수 : ")
    val data1 = scanner.nextInt()
    val dogMap = mapOf("name" to name1, "age" to age1, "data" to data1)

    println()
    println("고양이 정보입력")
    print("이름 : ")
    val name2 = scanner.next()
    print("나이 : ")
    val age2 = scanner.nextInt()
    print("서열 : ")
    val data2 = scanner.nextInt()
    val catMap = mapOf("name" to name2, "age" to age2, "data" to data2)

    println()
    println("앵무새 정보 입력")
    print("이름 : ")
    val name3 = scanner.next()
    print("나이 : ")
    val age3 = scanner.nextInt()
    print("단어 개수 : ")
    val data3 = scanner.nextInt()
    val parrotMap = mapOf("name" to name3, "age" to age3, "data" to data3)

    // 출력한다.
    println()
    println("강아지 이름 : ${dogMap["name"]}")
    println("강이지 나이 : ${dogMap["age"]}살")
    println("개인기 개수 : ${dogMap["data"]}개")

    println()
    println("고양이 이름 : ${catMap["name"]}")
    println("고양이 나이 : ${catMap["age"]}살")
    println("서열 : ${catMap["data"]}위")

    println()
    println("앵무새 이름 : ${parrotMap["name"]}")
    println("앵무새 나이 : ${parrotMap["age"]}살")
    println("단어 개수 : ${parrotMap["data"]}개")
}