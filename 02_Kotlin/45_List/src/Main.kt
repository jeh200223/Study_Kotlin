// 리스트 : 0부터 1씩 증가하는 순서값을 가지고 객체를 관리한다.
// 배열과 다르게 관리하는 객체의 수를 줄이거나 늘릴 수 있다.
// 코틀린 list는 불변형과 가변형으로 제공한다.
// 불변형 추가, 수정, 삭제 등이 불가능하다.
fun main(){
    // 리스트 생성
    // 불변형 리스트
    // 리스트 생성 이후 값의 추가, 수정, 삽입, 삭제 등이 불가능하다.
    val list1 = listOf(10, 20, 30, 40, 50)
    println("list1 : $list1")

    val list2 = listOf("문자열1", "문자열2", "문자열3")
    println("list2 : $list2")

    // 서로 다른 타입의 객체를 담는다.
    val list3 = listOf(100, 11.11, "문자열", true)
    println("list3 : $list3")

    // 수정 가능한 list를 생성한다.
    // 텅 비어 있는 리스트
    // 반드시 제네릭을 설정해줘야 한다.
    val list4 = mutableListOf<Int>()
    println("list4 : $list4")

    // 비어있는 수정 불가능한 리스트
    val list5 = listOf<Int>()
    val list6 = emptyList<Int>()
    println("list5 : $list5")
    println("list6 : $list6")

    // 가변형 리스트를 생성할 때 객체를 지정한다.
    val list7 = mutableListOf(10, 20, 30, 40, 50)
    println("list7 : $list7")

    // null 값을 포함하는 리스트
    val list8 = listOf(10, 20, null, 40, null, 60, 70)
    println("list8 : $list8")

    // null값을 제거한 리스트
    val list9 = listOfNotNull(10, 20, null, 40, null, 60, 70)
    println("list9 : $list9")

    // 관리하는 객체의 개수
    println("list size : ${list1.size}")

    // 관리하는 객체를 가지고 온다.
    println("list1[0] : ${list1[0]}")
    println("list1[1] : ${list1[1]}")

    // 반복문
    for(item in list1){
        println("item : $item")
    }

    // for each
    list1.forEach{
        println("it : $it")
    }
    list1.forEachIndexed { index, i ->
        println("index : $index, i : $i")
    }

    println("---------------------------------")

    val list100 = listOf(10, 20, 30, 10, 20, 30)

    // 지정한 객체가 앞에서 부터 몇 번째에 있는가..
    val index1 = list100.indexOf(20)
    println("index1 : $index1")

    // 지정한 객체가 뒤에서 부터 몇 번째에 있는가..
    // 반환되는 순서값은 앞에서 부터의 순서값이 된다.
    val index2 = list100.lastIndexOf(20)
    println("index2 : $index2")

    // indexOf, lastIndexOf 모두 없는 것을 지정하면 -1을 반환한다.
    val index3 = list100.indexOf(100)
    println("index3 : $index3")

    // 일부를 발췌하여 새로운 리스트를 생성한다.
    // 순서값 1 ~ 3 - 1까지
    val list200 = list100.subList(1, 3)
    println("list200 : $list200")

    println("-----------------------------------------")

    // list에 대한 변경 작업
    val list300 = mutableListOf(10, 20, 30)
    println("list300 : $list300")

    // 객체를 추가한다.
    // 리스트 뒤에 추가된다.
    list300.add(40)
    list300.add(50)
    list300.addAll(listOf(60, 70, 80, 90, 100))
    println("list300 : $list300")

    // 삽입
    // add 메서드를 이용할 때 위치를 지정하면 그 위치에 삽입된다.
    // add(순서값, 객체)
    list300.add(1, 200)
    println("list300 : $list300")

    list300.addAll(3, listOf(2000, 3000, 4000, 5000))
    println("list300 : $list300")

    // 값 수정
    list300[2] = 2000
    println("list300 : $list300")

    // 제거
    list300.remove(5000)
    println("list300 : $list300")

    // 중복된 객체가 여러개 있는 객체를 지정하여 제거한다.
    list300.remove(2000)
    println("list300 : $list300")

    // 다수의 객체를 지정하여 제거한다.
    list300.removeAll(listOf(1000, 2000, 3000, 4000))
    println("list300 : $list300")

    // 제일 처음 것을 제거한다.
    val a1 = list300.removeFirst()
    println("list300 : $list300")
    println("a1 : $a1")

    // 가장 마지막 것을 제거한다.
    val a2 = list300.removeLast()
    println("list300 : $list300")
    println("a2 : $a2")

    // 위치를 지정하여 제거한다.
    val a3 = list300.removeAt(1)
    println("list300 : $list300")
    println("a3 : $a3")

    // 모두 삭제
    list300.clear()
    println("list300 : $list300")
}