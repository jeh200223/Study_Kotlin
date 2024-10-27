// 예외처리 : 자바 프로그램은 오류가 발생할 경우 오류가 발생한
// 코드 부분을 처리하는 쓰래드를 강제 종료시킨다.
// 이를 예방하기 위해 예외처리를 해준다.

// 코틀린은 자바와 달리 예외처리를 강제하지 않는다.

// try : 개발자가 원하는 코드를 작성하는 부분
// catch : try 부분에서 오류가 발생되면 try 부분의 수행을 중단 시키고
// catch 부분을 수행해준다.
// catch에는 오류가 발생했을 때 동작할 코드를 작성해준다(오류에 대한 기록, 오류를 정상화 등)
// finally : 무조건 수행되는 부분(불필요)
fun main(){
    try{
        // val a1:String? = null
        // println(a1!!.length)

        // val a2 = 10 / 0
        // println("a2 : $a2")

        val a3 = arrayOf(10, 20, 30)
        println(a3[10])
    }catch(e:NullPointerException){
        println("NullPointerException이 발생하였습니다")
        e.printStackTrace()
    }catch(e:ArithmeticException){
        println("수학적 오류가 발생하였습니다")
    }catch(e:Exception){
        println("그 외의 오류가 발생하였습니다")
    }

    println("이 부분이 수행될까요?")
}