fun main() {
    val sub2 = SubClass2()
    println("sub2 : $sub2")

    val sub3 = SubClass3()
    println("sub3.superMemeberA3 : ${sub3.superMemberA3}")
    println("sub3.subMemberA3 : ${sub3.subMember3}")
    sub3.superMethod3()
    sub3.subMethod3()

    val sub4 = SubClass4(100,200)
    println("sub4 : $sub4")
}

// 코틀린의 모든 클래스는 기본적으로 상속이 불가능하다.
// class SuperClass1
// class SubClass1 : SuperClass1()

// 코틀린은 open 클래스만 상속이 가능하다.

open class SuperClass2

// : 부모클래스이름()
// () : 부모의 생성자를 선택한다.
class SubClass2 : SuperClass2()

open class SuperClass3{

    val superMemberA3 = 300

    fun superMethod3(){
        println("SuperClass3의 superMethod3")
    }
}

class SubClass3 : SuperClass3(){
    val subMember3 = 3000

    fun subMethod3(){
        println("SubClass3의 subMethod3")
    }
}

// 만약에 주생성자가 있다고 하더라도
// 자식에서 부모의 생성자를 선택하지 않으면
// 무조건 매개변수가 없는 생성자를 호출한다.
// 자식에서 무조건 주 생성자를 선택하는 것이 아니다.
open class SuperClass4(var a1:Int, var a2:Int){

    constructor() : this(100, 200){
        println("매개변수가 없는 생성자")
    }
}

class SubClass4 : SuperClass4{

    // 호출할 다른 생성자를 선택하지 않았기 때문에
    // 부모가 가진 매개변수가 없는 생성자를 호출한다.
    constructor()

    // 만약 부모가 가진 다른 생성자를 호출하겠다면 명시해줘야 한다.
    constructor(a1:Int, a2:Int) : super(a1, a2)
}

