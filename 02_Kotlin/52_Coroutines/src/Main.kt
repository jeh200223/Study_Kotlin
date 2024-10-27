import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// 코루틴 : 쓰래드 내부에서 여러 처리를 동시에 하기 위해 사용하는 것
// 코틀린에서 코루틴을 사용하려면 kotlinx-coroutines-core 라이브러리를
// 추가해줘야 한다.

// 메인 메뉴에서
// 파일 > 프로젝트 구조
// 좌측에서 라이브러리 선택
// 중간 상단에 있는 + 를 눌러 "Maven 에서"를 선택해준다
// 나타난 검색 창에서 kotlinx-coroutines-core 로 검색을 해준다.
// 검색 결과에서 "org.jetbrains.kotlinx:kotlinx-coroutines-core:버전" 으로 되어 있는 것을 선택해준다.

//fun main() {
//    // 코루틴 가동
//    GlobalScope.launch {
//        // 여기에 코루틴으로 처리할 코드를 작성해주세요
//        for(idx in 1..10){
//            // 100ms 쉬었다가 진행한다.
//            delay(100)
//            println("코루틴 내부 : $idx")
//        }
//    }
//    println("코루틴 외부")
//    // 코루틴을 발생시킨 쓰래드는 코루틴 코드가
//    // 모두 끝날때까지 끝나면 안된다.
//    Thread.sleep(3000)
//}

//fun main(){
//    // 코루틴이 끝날때까지 쓰래드가 대기할 수 있도록
//    // runBlocking이라는 것을 제공하고 있다.
//    // 코루틴 가동
//    GlobalScope.launch {
//        // 여기에 코루틴으로 처리할 코드를 작성해주세요
//        for(idx in 1..10){
//            // 100ms 쉬었다가 진행한다.
//            delay(100)
//            println("코루틴 내부 : $idx")
//        }
//    }
//    println("코루틴 외부")
//    // 코루틴이 동작하는 동안 3000ms 만큼 쓰래드가 쉬도록 한다.
//    // runBlocking : 코루틴 내부가 아닌 곳에서 코루틴 관련
//    // 메서드를 사용할 수 있도록 한다.
//    runBlocking {
//        delay(3000)
//    }
//}

// runBlocking을 함수에 설정할 수 있다.
// 함수에 runBlocking을 설정하면 그 함수 안에서
// 코투린 관련 함수를 사용하는 것이 자유롭다.
//fun main() = runBlocking {
//    GlobalScope.launch {
//        // 여기에 코루틴으로 처리할 코드를 작성해주세요
//        for(idx in 1..10){
//            // 100ms 쉬었다가 진행한다.
//            delay(100)
//            println("코루틴 내부 : $idx")
//        }
//    }
//    println("코루틴 외부")
//    // main 함수 자체에 runBlocking을 설정하였기 때문에
//    // 코루틴 외부에서 코루틴 관련 코드를 작성할때 runBlocking
//    // 블럭을 사용하지 않아도 된다.
//    delay(3000)
//}

//fun main() = runBlocking {
//    // 코루틴을 가동시키면 Job 객체가 반환된다.
//    // 이를 통해 코루틴에 관련된 제어를 할 수 있다.
//    val job = GlobalScope.launch {
//        // 여기에 코루틴으로 처리할 코드를 작성해주세요
//        for(idx in 1..10){
//            // 100ms 쉬었다가 진행한다.
//            delay(100)
//            println("코루틴 내부 : $idx")
//        }
//    }
//    println("코루틴 외부")
//    // 코루틴이 끝날때까지 쓰래드를 대기시킨다.
//    // 동기처리할 때 사용한다.
//    job.join()
//    println("join 이후")
//}

//fun main() = runBlocking {
//    // launch 함수 : 코루틴을 위해 제공하는 고차함수
//    // 내부의 코드를 코루틴으로 운영해준다.
//    // 코루틴을 관리하는 쓰래드는 코루틴의 코드가 모두 끝날때까지
//    // 쓰래드 종료를 대기해준다.
//    // 만약 동기적 처리가 필요하면 반환하는 Job객체를 받아 동기처리
//    // 해주면 된다.
//    val job = launch {
//        // 여기에 코루틴으로 처리할 코드를 작성해주세요
//        for(idx in 1..10){
//            // 100ms 쉬었다가 진행한다.
//            delay(100)
//            println("코루틴 내부 : $idx")
//        }
//    }
//    println("코루틴 외부")
//    job.join()
//    println("코루틴 수행 이후")
//}

//fun main() = runBlocking {
//
//    val job = launch {
//        // 이건 제가 for문 할 때 말씀드리지 않아지 지금 하는겁니다.ㅠㅠ
//        // 코루틴하고 관계 없습니다.
//        // 첫 번째 매개변수로 넣어준 횟수만큼
//        // 두 번째 매개변수로 넣어준 함수나 람다를 실행시켜준다.
//        // 람다내에서 it에는 반복 횟차 값이 들어온다.
//        repeat(10){
//            // 100ms 쉬었다가 진행한다.
//            delay(100)
//            println("코루틴 내부 : $it")
//        }
//    }
//    println("코루틴 외부")
//    job.join()
//    println("코루틴 수행 이후")
//}

// 만약 동시에 여러 코루틴을 동작시키겠다면
// 동기화 하지 않으면 됩니다.
fun main() = runBlocking {
    launch {
        repeat(10){
            delay(100)
            println("코루틴 1 : $it")
        }
    }

    launch {
        repeat(10){
            delay(100)
            println("코루틴 2 : $it")
        }
    }

    repeat(10){
        delay(100)
        println("쓰래드 내부 : $it")
    }
}