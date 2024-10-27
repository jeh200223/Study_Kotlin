fun main() {
    // 문자열 생성

    // String 클래스의 생성자에
    // StringBuffer, StringBuilder, ByteArray, CharArray 등을 넣어주면
    // 가지고 있는 글자 데이터를 이용해 문자열을 생성한다.
    val array1 = CharArray(5){
        'a'
    }
    println("array1 : ${array1.concatToString()}")

    val str1 = String(array1)
    println("str1 : $str1")

    // "" 로 묶어 준 것도 String 객체를 생성한 것이다.
    val str2 = "안녕하세요"
    println("str2 : $str2")

    // 배열 처럼 순서값을 가지고 원하는 글자를 가져올 수 있다.
    println("str2[0] : ${str2[0]}")
    println("str2[1] : ${str2[1]}")

    // 문자열은 변경이 불가능하다.
    // str1[0] = 'A'

    // 원하는 부분의 글자들을 추출하여 새로운 문자열 객체로 생성한 다음 반환한다.
    // 순서값을 지정한다.
    val str3 = str2.substring(1..3)
    println("str3 : $str3")

    // 문자열 비교
    val str4 = "Hello World"
    val str5 = "hello world"
    val str6 = "Hello World"
    val str7 = String(charArrayOf('H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'))

    // compareTo : 두 문자열을 비교하는 메서드
    // 문자열을 구성하는 각 글자의 코드값을 합산하고 그걸 뺀 결과를 반환한다.
    println(str4.compareTo(str5))
    println(str4.compareTo(str6))

    // compareTo의 두 번째 매개변수에 true를 넣어주면
    // 모두 소문자로 변환하여 계산해준다.
    println(str4.compareTo(str5, true))

    // equals 메서드도 두 번째 매개변수에 true를 넣어주면 대소문자를 무시하고 비교한다.
    if(str4.equals(str5, true)){
        println("두 문자열은 대소문자를 무시하면 같습니다")
    }

    // 구분자를 기준으로 문자열을 나눈다.
    val str8 = "ab_cd ef_gh"

    // 띄어쓰기를 기준으로 나눈다.
    val r6 = str8.split(" ")
    println("r6 : $r6")

    // 언더바를 기준으로 나눈다.
    val r7 = str8.split("_")
    println("r7 : $r7")

    // uppercase : 소문자를 대문자로 해서 새로운 문자열을 만들어준다.
    // lowercase : 대문자를 소문자로 해서 새로운 문자열을 만들어준다.
    val str10 = str4.uppercase()
    val str11 = str4.lowercase()
    println("str4 : $str4")
    println("str10 : $str10")
    println("str11 : $str11")
}