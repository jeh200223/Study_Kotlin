fun main(){
    val array1 = arrayOf(10, 20, 30, 40, 50)
    val list1 = listOf(10, 20, 30, 40, 50)
    val list2 = mutableListOf(10, 20, 30, 40, 50)
    val map1 = mapOf("a1" to 10, "a2" to 20, "a3" to 30)
    val map2 = mutableMapOf("a1" to 10, "a2" to 20, "a3" to 30)

    // 불변형 리스트로 변환(새롭게 생성)
    val a10 = array1.toList()
    val a11 = list2.toList()
    val a12 = map1.toList()
    val a13 = map2.toList()
    println("a10 : $a10")
    println("a11 : $a11")
    println("a12 : $a12")
    println("a13 : $a13")

    // 가변형 리스트로 변환 (맵 지원X)
    val a20 = array1.toMutableList()
    val a21 = list1.toMutableList()
    println("a20 : $a20")
    println("a21 : $a21")

    // 배열로 변환(맵 지원X)
    // val a30 = list1.toIntArray()
    val a30 = list1.toTypedArray<Int>()
    val a31 = list2.toTypedArray<Int>()
    println("a30 : ${a30.contentToString()}")
    println("a31 : ${a31.contentToString()}")

    // 불변형 맵으로 변환(배열, 리스트 지원X)
    val a32 = map2.toMap()
    println("a32 : $a32")

    // 가변형 맵으로 변환(배열, 리스트 지원X)
    val a33 = map1.toMutableMap()
    println("a33 : $a33")
}