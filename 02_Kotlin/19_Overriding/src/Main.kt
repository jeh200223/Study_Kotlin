fun main(){
    // SubClass1을 가지고 만든 객체를 SubClass1 타입 변수에 담는다.
    // 모두 사용가능
    val sub1:SubClass1 = SubClass1()
    println("sub1.superValue1 : ${sub1.superValue1}")
    println("sub1.subValue1 : ${sub1.subValue1}")
    sub1.superMethod1()
    sub1.subMethod1()

    // SubClass1을 가지고 만든 객체를 SuperClass1(부모) 타입 변수에 담는다.
    // 부모의 영역만 사용이 가능
    val sub2:SuperClass1 = SubClass1()
    println("sub2.superValue1 : ${sub2.superValue1}")
    // println("sub2.subValue1 : ${sub2.subValue1}")
    sub2.superMethod1()
    // sub2.subMethod1()

    // overriding한 요소를 부모타입 변수를 가지고 사용한다.
    println("sub2.superValue2 : ${sub2.superValue2}")

    // overriding한 메서드를 부모타입 변수로 호출한다.
    sub2.superMethod2()
}

open class SuperClass1{
    val superValue1 = 100
    // 자식 클래스에서 재구현을 허용 하겠다면 open을 붙혀줘야 한다.
    open val superValue2 = 300


    fun superMethod1(){
        println("SuperClass1의 메서드")
    }
    // 자식 클래스에서 재구현을 허용 하겠다면 open을 붙혀줘야 한다.
    open fun superMethod2(){
        println("SuperClass1의 superMethod2")
    }
}

class SubClass1 : SuperClass1(){

    val subValue1 = 200

    // 부모의 변수를 overriding 하려면
    // override 키워드를 붙혀줘야 한다.
    // open 이 붙어있지 않은 변수는 재정의가 불가능하다.
    // override val superValue1 = 1000
    // 부모의 변수를 overriding 하는 목적은
    // setter와 getter를 다시 정의하기 위함이다.
    override val superValue2: Int = 3000

    fun subMethod1(){
        println("SubClass1의 메서드")
    }

    override fun superMethod2() {
        println("SubClass1의 superMethod2")
        // 부모의 것을 사용하고 싶다면
        println("super.superValue2 : ${super.superValue2}")
        super.superMethod2()
    }
}