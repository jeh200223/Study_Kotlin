import kotlin.concurrent.thread

// 쓰래드
// 하나의 프로그램 안에서 다수의 처리를
// 동시에(비동기) 처리하고자 할 때 사용하는 개념
fun main(){
    val t1 = ThreadClass1()
    t1.start()

    val t2 = ThreadClass2()
    val t3 = Thread(t2)
    t3.start()

    // 코틀린은 쓰래드 발생을 위해
    // thread 코드 블럭을 제공하고 있다.
    // thread 코드 블럭에 원하는 코드를 작성해주면
    // 새로운 쓰래드를 발생시켜 처리해준다.
    thread {
        for(idx in 1..10){
            Thread.sleep(100)
            println("thread3 : $idx")
        }
    }

    for(idx in 1..10){
        Thread.sleep(100)
        println("main : $idx")
    }
}

// Thread를 상속받은 클래스
class ThreadClass1 : Thread(){
    // Thread 에서 처리할 코드를 가지고 있는 메서드
    override fun run() {
        for(idx in 1..10){
            Thread.sleep(100)
            println("Thread1 : $idx")
        }
    }
}

// Runnable 인터페이스를 구현한 클래스
class ThreadClass2 : Runnable{
    override fun run() {
        for(idx in 1..10){
            Thread.sleep(100)
            println("Thread2 : $idx")
        }
    }
}