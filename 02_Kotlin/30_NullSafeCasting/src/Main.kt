fun main(){
    val t1:TestClass1? = TestClass1()

    // ?. : 변수에 null값이 들어가 있다면
    // 프로퍼티나 메서드 사용을 취소하고 null을 반환한다.
    t1?.testMethod1()

    // 만약 변수에 null이 들어가져있지 않다는 것을
    // 확실하게 보장해주면 스마트 캐스팅이 발생한다.
    if(t1 != null){
        t1.testMethod1()
    }

    // 변수 is 클래스명 : null을 허용하지 않는 클래스명 타입으로 변환이 가능한가
    // 변수 is 클래스명? : null을 허용하는 클래스명 타입으로 변환이 가능한가
    // 이때도 스마트 캐스팅이 발생한다.
    if(t1 is TestClass1){
        t1.testMethod1()
    }
    println("----------------------------")

    testMethod10(t1)
    testMethod10(null)

    println("----------------------------")

    testMethod20(t1)
    testMethod20(null)
}

class TestClass1{
    fun testMethod1(){
        println("TestClass1의 testMethod1입니다")
    }
}

fun testMethod10(t2:TestClass1?){
    t2?.testMethod1()

    if(t2 is TestClass1){
        // 스마트 캐스팅 발생
        t2.testMethod1()
    }

    if(t2 != null){
        // 스마트 캐스팅 발생
        t2.testMethod1()
    }
}

fun testMethod20(t2:Any?){

    // 스마트 캐스팅 발생
    if(t2 is TestClass1){
        t2.testMethod1()
    }

    // 매개변수가 부모 클래스 타입인 경우
    // null 인지를 검사하게 되면 부모 클래스 타입으로
    // 스마트 캐스팅이 발생한다.
    if(t2 != null){
        // 여기에서 is 를 통해 검사를 해야만 한다.
        if(t2 is TestClass1){
            t2.testMethod1()
        }
    }
}