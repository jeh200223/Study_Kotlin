// 코틀린에서의 배열은 자바의 배열과 개념적으로 동일하고
// 문법적인 차이만 존재한다.
// 배열이 관리하는 기억장소의 개수를 늘리거나 줄이는 것은 불가능하다.
fun main(){
    // 배열 생성

    // 배열이 관리하는 값(객체)들을 지정해준다.
    // 지정한 값(객체) 만큼의 기억장소가 생성되고 그 기억장소들을 관리하는 배열이 생성된다.
    // 배열이 관리하는 기억장소의 개수는 변경할 수 없다.
    val array1 = arrayOf(10, 20, 30, 40, 50)
    println("array1 : $array1")
-
    // 배열이 관리하는 값(객체)를 모아 문자열로 반들어 반환 받을 수 있다.
    // 이를 통해 배열이 관리하는 값(객체)들을 출력해볼 수 있다.
    println("array1 : ${array1.contentToString()}")

    // 다양한 타입의 값(객체)을 담을 수 있다.
    val array2 = arrayOf(100, 11.11, "문자열", true)
    println("array2 : ${array2.contentToString()}")

    // 정수값만 담을 수 있는 배열 생성
    // 기본 자료형
    // 자료형arrayOf
    val array3 = intArrayOf(10, 20, 30, 40, 50)
    val array4 = doubleArrayOf(11.11, 22.22, 33.33, 44.44, 55.55)
    // 기본 자료형이 아닌 객체 타입들은 제네릭을 설정해준다.
    val array5 = arrayOf<String>("문자열1", "문자열2", "문자열3")

    println("array3 : ${array3.contentToString()}")
    println("array4 : ${array4.contentToString()}")
    println("array5 : ${array5.contentToString()}")

    // 람다식을 통한 배열 생성
    // 람다식 내부의 코드를 수행하여 반환받은 결과를 배열에 담아준다.
    // Array(기억장소의 개수, 호출할 함수 혹은 람다식을 받은 변수)
    // 기억장소의 수 만큼 함수 또는 람다식을 동작시킨다. 동작 시킬 때 마다 반환받은
    // 값이나 객체를 배열에 담아준다.
    // 0 이 5개 담긴 배열 생성
    val array6 = Array(5){
        0
    }
    println("array6 : ${array6.contentToString()}")

    // it에 몇 번째 반복인지 알 수 있는 값(0 부터 1씩 증가)이 담긴다.
    // 0 에서 부터 1씩 증가되는 값 5개를 가진 배열
    val array7 = Array(5){
        it
    }
    println("array7 : ${array7.contentToString()}")

    // 3부터 3의 배수 10개를 가지고 있는 배열을 생성한다.
    val array8 = Array(10){
        3 + (it * 3)
    }
    println("array8 : ${array8.contentToString()}")

    println("--------------------------------------------")

    // 다차원 배열
    // 배열안에 배열이 들어 있는 것
    val array9 = arrayOf(
        arrayOf(10, 20, 30),
        arrayOf(40, 50, 60),
        arrayOf(70, 80, 90)
    )

    println("array9 : ${array9.contentToString()}")
    println("array9 : ${array9.contentDeepToString()}")

    // 배열이 관리하는 기억 장소의 값(객체)를 가지고 온다
    // 자바와 마찮가지로 0부터 1씩 증가는 순서값을 사용한다.
    // 자바와 동일하게 [ ] 연산자를 사용하지만 자바와 다르게 get 메서가 호출된다.
    println("array1.get(0) : ${array1.get(0)}")
    println("array1.get(1) : ${array1.get(1)}")

    println("array1[0] : ${array1[0]}")
    println("array1[1] : ${array1[1]}")

    println("array9.get(0).get(0) : ${array9.get(0).get(0)}")
    println("array9[0][0] : ${array9[0][0]}")
    println("---------------------------------------------------------")

    println("array1 : ${array1.contentToString()}")

    // 0 번째 기억 장소에 새로운 값(객체)를 저장한다.
    array1[0] = 100
    println("array1 : ${array1.contentToString()}")

    // = 연산자를 사용하면 set 메서드가 호출된다.
    // set(위치, 값(객체))
    array1.set(1, 200)
    println("array1 : ${array1.contentToString()}")

    // 더하기 연산
    // 배열의 + 는 배열이 관리하는 값(객체)를 추가하기 위해 사용한다.
    // 허나 한번 만들어진 배열은 기억장소의 크기를 변경할 수 없다.
    // 따라서 새로운 배열이 생성된다.
    val array10 = array1 + 60
    println("array1 : ${array1.contentToString()}")
    println("array10 : ${array10.contentToString()}")

    val array11 = array1 + arrayOf(60, 70, 80, 90, 100)
    println("array1 : ${array1.contentToString()}")
    println("array11 : ${array11.contentToString()}")

    // 배열의 일부분을 가져온다.
    // 순서값 1 ~ 3 까지
    val array12 = array1.sliceArray(1..3)
    println("array12 : ${array12.contentToString()}")

    // 위치 값을 지정하여 원하는 것을 가져온다.
    // 순서값을 담은 리스트를 만들어 넣어줘야 한다.
    val array13 = array1.sliceArray(listOf(0, 2, 4))
    println("array13 : ${array13.contentToString()}")

    println("--------------------------------------------")

    // 배열이 제공하는 메서드와 프로퍼티들
    println("array1 : ${array1.contentToString()}")
    println("첫 번째 값(객체) : ${array1.first()}")
    println("미자막 값(객체) : ${array1.last()}")
    println("30(있는 값)의 위치 : ${array1.indexOf(30)}")
    println("1000(없는 값)의 위치 : ${array1.indexOf(1000)}")
    println("최대값 : ${array1.max()}")
    println("최소값 : ${array1.min()}")
    println("총합 : ${array1.sum()}")
    println("평균 : ${array1.average()}")
    println("관리하는 기억 장소의 개수 : ${array1.size}")
    println("관리하는 기억 장소의 개수 : ${array1.count()}")
    println("30을 포함하는가 : ${array1.contains(30)}")
    println("1000을 포함하는가 : ${array1.contains(1000)}")
    println("30을 포함하는가 : ${30 in array1}")
    println("1000을 포함하는가 : ${1000 in array1}")

    println("----------------------------------")

    val array14 = Array(10){
        it + 1
    }
    println("array14 : ${array14.contentToString()}")

    // 배열이 관리하는 값(객체)의 순서를 랜덤하게 섞는다.
    array14.shuffle()
    println("array14 : ${array14.contentToString()}")

    // 정렬(오름차순)
    val array15 = array14.sortedArray()
    println("array14 : ${array14.contentToString()}")
    println("array15 : ${array15.contentToString()}")

    // 정렬(내림차순)
    val array16 = array14.sortedArrayDescending()
    println("array16 : ${array16.contentToString()}")

    // 처음부터 끝까지 순회하면서 반복한다.
    // 순서값을 이용해 배열에서 값을 가지고 온다
    // 배열이 관리하는 값(객체)와 순서값이 필요할 때
    for(idx in 0..<array14.size){
        println("array14[idx] : ${array14[idx]}")
    }
    println("--------------------------------------")

    // 배열이 관리하는 값(객체)만 필요한 경우
    for(value in array14){
        println("array14 : $value")
    }
    println("--------------------------------------")

    // 배열이 관리하는 값의 개수만큼 forEach 코드 블럭의 코드가 수행된다.
    // 이 때, it 에 배열이 관리하는 값이 들어온다.
    array14.forEach {
        println("array14 : $it")
    }

    println("-----------------------------------------")
    // 순서값도 필요하다면...
    // index : 순서값
    // i : 값
    array14.forEachIndexed { index, i ->
        println("array14 index : $index, i : $i")
    }
}