fun main() {
    val t1 = TestClass1(100, 200, 300)
    // println("t1.a1 : ${t1.a1}")
    println("t1.a2 : ${t1.a2}")
    println("t1.a3 : ${t1.a3}")

    t1.a2 = 2000
    // t1.a3 = 3000
    println("t1.a2 : ${t1.a2}")
}

// 주 생성자
// var나 val 을 붙히지 않은 변수 : 생성자의 매개변수로 정의된다.
// var를 붙혀준 변수 : 맴버 변수 a2가 정의되고 변수에 읽고 쓰기가 가능하다.
// val을 붙혀준 변수 : 맴버 변수 a3가 정의되고 변수는 읽기만 가능하다.
class TestClass1(a1:Int, var a2:Int, val a3:Int){
    // 맴버 변수
    // 맴버 변수는 var나 val을 붙히지 않은 변수는 정의할 수 없다.
    // a4 = 400
    // var를 붙혀준 변수는 읽고 쓰기가 가능하다.
    var a5 = 500
    // val을 분혀준 변수는 읽기만 가능하다.
    val a6 = 600

    fun testMethod1(){
        // 같은 클래스에서의 사용
        // 같은 클래스 내부라도 val 변수의 값을 변경하는 것은 불가능하다.
        a2 = 2000
        //a3 = 3000
        a5 = 4000
        //a6 = 5000
    }

    fun testMethod2(v1 : Int, v2 : Int){
        println("v1 : $v1")
        println("v2 : $v2")


        // 매개변수는 읽기만 가능하다
        // v1 = 1000
        // v2 = 2000

        // 메서드 내의 지역변수
        // 지역변수도 var나 val을 붙혀줘야 한다.
        // v3 = 3000
        var v4 = 4000
        val v5 = 5000
        println("v4 : $v4")
        println("v5 : $v5")

        v4 = 40000
        // v5 = 50000
    }
}

class TestClass2{
    // setter
    // public void setMemberA1(int memberA1){
    //      this.memberA1 = memberA1;
    // }

    // getter
    // public int getMemberA2(){
    //      return memberA2;
    // }
    val memberA2 = 200

    // getter나 setter를 원하는 대로 만들수 있다.
    // field는 맴버변수 memberA3를 가르킨다.
    var memberA3 = 0
        get(){
            println("getter 호출")
            return field
        }
        set(value){
            println("setter 호출")
            if(value in 1..10){
                field = value
            }
        }

    // val 변수는 setter를 정의하지 못한다.
    val memberA4 = 0
        get(){
            println("getter 호출")
            return field
        }
}