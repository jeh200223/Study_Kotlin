// 고차함수 : 함수를 매개변수로 받거나 함수를 반환하는 함수
// 함수를 받는 매개변수가 제일 마지막에 있을 경우 괄호가 중첩되지 않도록 작성하는 문법을 제공한다.
fun main(){
    // 익명함수가 변수에 담을 수 있기 때문에
    // 익명함수를 정의하여 전달해준다.
    val t1 = fun(x1:Int, x2:Int) : Int{
        return x1 + x2
    }
    testFunc1(100, 200, t1)
    println("--------------------------------")

    val t2 = fun(x1:Int, x2:Int) : Int{
        return x1 - x2
    }
    testFunc1(100, 200, t2)
    println("--------------------------------")

    testFunc1(100, 200, fun(x1:Int, x2:Int) : Int {
        return x1 * x2
    })
    println("--------------------------------")
    // 고차 함수가 받는 함수는 함수 대신에 람다식을 사용하는 것도 가능하다.
    val lambda1 = {x1:Int, x2:Int ->
        x1 / x2
    }
    testFunc1(100, 200, lambda1)
    println("--------------------------------")

    testFunc1(100, 200, {x1:Int, x2:Int ->
        x1 % x2
    })
    println("--------------------------------")
    val r1 = testFunc2(100)
    val r2 = r1(300, 400)
    println("r2 : $r2")
    println("--------------------------------")
    val r3 = testFunc3(100)
    val r4 = r3(300, 400)
    println("r4 : $r4")
    println("--------------------------------")
    // 제일 마지막 매개변수가 함수를 받으므로 익명함수를 전달한다.
    testFunc4(100, 200, fun(v1:Int, v2:Int):Int{
        return v1 + v2
    })
    // 익명함수 대신 람다식을 사용할 수 있다.
    testFunc4(100, 200, {v1:Int, v2:Int ->
        v1 + v2
    })
    // 제일 마지막 매개변수가 함수를 받는 매개변수이고 람다식으로 전달할 때는
    // () 밖에다 전달할 람다식을 작성하는 것이 가능하다.
    testFunc4(100, 200){v1:Int, v2:Int ->
        v1 + v2
    }
    println("--------------------------------")
    testFunc5(100, 200){v1:Int ->
        v1 + 300
    }
    // 매개변수로 받는 함수의 매개변수가 1개인 경우 람다식에서 매개변수를 생략할 수 있다.
    // 만약 매개변수를 생략하게 되면 it라는 매개변수가 자동으로 정의된다.
    testFunc5(100, 200){
        it + 300
    }

}

// 매개변수로 함수를 받는 함수
// 함수를 받는 매개변수의 타입은 (매개변수 형태) -> 반환타입 으로 작성한다.
fun testFunc1(a1:Int, a2:Int, a3:(Int, Int) -> Int){
    // 매개변수로 전달받은 함수를 호출한다.
    val r1 = a3(a1, a2)
    println("testFunc1 r1 : $r1")
}

// 함수를 반환하는 함수
// 함수의 반환타입을 (반환할 함수의 매개변수 행태) -> 반환할 함수의 반환타입
// 형태로 작성해준다.
fun testFunc2(a1:Int) : (Int, Int) -> Int{

    val a2 = 100
    // 반환되는 함수 안에서 외부의 변수를 사용하는 것이 가능하다.
    return fun(x1:Int, x2:Int):Int{
        return x1 + x2 + a1 + a2
    }
}
// 람다를 반환하는 것도 가능하다.
fun testFunc3(a1:Int) : (Int, Int) -> Int{
    val a2 = 100
    return {x1:Int, x2:Int ->
        x1 + x2 + a1 + a2
    }
}

// 제일 마지막 매개변수가 함수를 받는 함수
fun testFunc4(a1:Int, a2:Int, a3:(Int, Int) -> Int){
    val r1 = a3(a1, a2)
    println("testFunc4 : $r1")
}

// 매개변수로 받는 함수의 매개변수가 1개만 있는 경우
fun testFunc5(a1:Int, a2:Int, a3:(Int) -> Int){
    val r1 = a3(a1 + a2)
    println("testFunc5 : $r1")
}