// map : 객체를 이름을 통해 관리하는 요소
// 순서에 대한 개념은 없다.
fun main(){
    // 이름 to 객체 형태로 지정한다.
    // 수정 불가능한 map
    // 이름 to 값(객체)
    val map1 = mapOf("key1" to 10, "key2" to 20, "key3" to 30)
    println("map1 : $map1")

    // 이름은 문자열이 아니어도 된다.
    val map2 = mapOf(10 to 11.11, 20 to 22.22, 30 to 33.33)
    println("map2 : $map2")

    // 수정 가능한 맵
    val map3 = mutableMapOf("key1" to 10, "key2" to 20, "key3" to 30)
    println("map3 : $map3")

    // 텅 비어있는 맵을 만들때는 제네릭을 설정해줘야 한다.
    val map4 = mapOf<String, Int>()
    val map5 = mutableMapOf<String, Int>()

    println("map4 : $map4")
    println("map5 : $map5")

    println("-------------------------------------")

    // 맵이 관리하는 객체를 가져온다.
    println("map1[key1] : ${map1["key1"]}")
    println("map1[key2] : ${map1["key2"]}")

    println("------------------------------------")
    // 맵이 관리하는 객체의 개수
    println("map1 size : ${map1.size}")
    // 객체를 저장할 때 사용한 이름들을 가져온다.
    println("map1 keys : ${map1.keys}")
    // 저장되어 있는 객체들을 가져온다.
    println("map1 values : ${map1.values}")

    // 지정한 이름으로 저장된 객체가 있는지 확인한다.
    println(map1.containsKey("key1"))
    println(map1.containsKey("key100"))

    // 지정한 객체가 저장되어 있는지 확인한다.
    println(map1.containsValue(10))
    println(map1.containsValue(1000))

    // 맵에서 in 은 이 이름으로 저장되어 있는 객체가 있는지 확인하는 것이다.
    println("key" in map1)

    println("-----------------------------------")

    val map200 = mutableMapOf("a1" to 10, "a2" to 20)
    println("map200 : $map200")

    // 객체를 추가한다.
    map200.put("a3", 30)
    println("map200 : $map200")

    // [ ] 로 객체를 넣어줄 때 없는 이름을 사용하면 추가된다.
    map200["a4"] = 40
    println("map200 : $map200")

    // 수정
    // [ ] 로 객체를 넣어줄 때 있는 이름을 사용하면 수정된다.
    map200["a4"] = 400
    println("map200 : $map200")

    // 제거
    val a100 = map200.remove("a1")
    println("map200 : $map200")
    println("a100 : $a100")

    val a200 = map200.remove("a100")
    println("map200 : $map200")
    println("a200 : $a200")

    // 모두 삭제
    map200.clear()
    println("map200 : $map200")
}
