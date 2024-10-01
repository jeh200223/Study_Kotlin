fun main(){
    // 클래스를 상속받은 클래스의 객체를 생성한다.
    val obj1:SubClass1 = SubClass1()
    // 인터페이스를 구현한 클래스의 객체를 생성한다.
    val obj2:SubClass2 = SubClass2()

    println("obj1 : $obj1")
    println("obj2 : $obj2")

    // 부모클래스 타입 변수에 담는다.
    val obj3:SuperClass1 = obj1
    // 구현한 인터페이스 타입 변수에 담는다.
    val obj4:Inter1 = obj2
    println("obj3 : $obj3")
    println("obj4 : $obj4")

    // 부모클래스 타입 변수를 통해 자식이 가지고 있는 오버라이딩 하지 않은 맴버를 사용하는 것은 불가능하다.
    // obj3.subMethod1()
    // 인터페이스 타입 변수를 통해 클래스에서 구현한 오버라이딩 하지 않은 맴버를 사용하는 것은 불가능한다.
    // obj4.subMethod2()

    println("-----------------------------------")

    // 부모 클래스 타입형 변수에 담긴 객체의 정보를 자식 클래스형 타입으로 변환한다.
    // 스마트 캐스팅
    // 특정 조건을 만족하면 그 부분에서는 변수 자체의 타입이 변환된 것처럼 사용할 수 있는 개념
    // obj3은 SuperClass1 타입으로 정의된 변수이다.
    // 이 때, 자식 클래스 타입인 SubClass1 타입으로 변환하는 작업을 수행하면
    // 변수의 타입 자체가 변경된 것처럼 사용할 수 있다.
    // 둘 간에 어떠한 상속관계도 없다면 오류가 발생하기 때문에
    // 오류가 발생하지 않았고 실행이 된다라는 것은 문제가 없다고 보기 때문에
    // 스마트 캐스팅이 발생한다.
    // 이에 형변환을 할 때 다른 변수에 담아서 사용할 필요가 없다.
    val obj10 = obj3 as SubClass1
    obj10.subMethod1()
    obj3.subMethod1()

    obj4 as SubClass2
    obj4.subMethod2()

    // 형변환을 할 수가 없기 때문에 오류가 발생한다.
    // val temp1:SuperClass1 = SuperClass1()
    // temp1 as SubClass1

    println("---------------------------------")

    val obj5:SubClass1 = SubClass1()

    // 형변환이 가능하지 확인한다.
    val chk1 = obj5 is SubClass1
    val chk2 = obj5 is SuperClass1
    val chk3 = obj5 is Inter1

    println("chk1 : $chk1")
    println("chk2 : $chk2")
    println("chk3 : $chk3")

    println("------------------------------------")

    // 안전한 형변환을 위해 is로 검사를 사는 것이 좋다.
    val obj6:SuperClass1 = SubClass1()

    // 아래의 if의 조건식이 true라면 obj6은 SubClass1 타입으로
    // 변환이 가능한 객체임을 의미한다.
    // 이 때, 스마트 캐스팅이 발생하여 if 안에서는 obj6이
    // SubClass1 타입인 것 처럼 사용이 가능하다.
    if(obj6 is SubClass1){
        obj6.subMethod1()
    }
    // if 문 밖으로 나가면 SuperClass1 타입으로 사용해야 한다.
    // obj6.subMethod1()

    val obj100 = SubClass1()
    val obj200 = SubClass2()
    val obj300 = 200
    val obj400 = "안녕하세요"

    anyMethod(obj100)
    anyMethod(obj200)
    anyMethod(obj300)
    anyMethod(obj400)
}

open class SuperClass1
interface Inter1

class SubClass1 : SuperClass1(){
    fun subMethod1(){
        println("SubClass1의 subMethod1입니다")
    }
}

class SubClass2 : Inter1{
    fun subMethod2(){
        println("SubClass2의 subMethod2입니다")
    }
}

// 다양한 타입의 객체를 받는 함수
fun anyMethod(obj:Any){
    // 형변환 가능한지 검사하여 처리한다.
    // 이 때, 스마트 캐스팅이 발생한다.
    when(obj){
        is SubClass1 -> obj.subMethod1()
        is SubClass2 -> obj.subMethod2()
        is Int -> println(obj - 100)
        is String -> println(obj.length)
    }

    if(obj is SubClass1){
        obj.subMethod1()
    } else if(obj is SubClass2){
        obj.subMethod2()
    } else if(obj is Int){
        println(obj - 100)
    } else if(obj is String){
        println(obj.length)
    }
}
