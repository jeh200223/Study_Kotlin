fun main() {
    // 기본적으로 리터럴은 자바와 동일하다.
    println(100)
    println(11.11)
    println(true)
    println("문자열")
    println('a')
    // RawString
    // 여러 줄의 문자열을 표현할 때 사용한다.
    println("동해물과 백두산이")
    println("마르고 닳도록")
    println("하느님이 보우하사")
    println("우리나라 만세")

    println("동해물과 백두산이\n마르고 닳도록\n하느님이 보우하사\n우리나라 만세")

    println("동해물과 백두산이\n"
            + "마르고 닳도록\n"
            + "하느님이 보우하사\n"
            + "우리나라 만세")

    println("""
        동해물과 백두산이
        마르고 닳도록
        하느님이 보우하사
        우리나라 만세
    """.trimIndent())
}

