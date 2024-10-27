import java.util.Scanner

fun main(){

    ex02()

}

fun ex01(){
    val dog_name:String
    val dog_age:Int
    val dog_trick:Int
    val cat_name:String
    val cat_age:Int
    val cat_rank:Int
    val bird_name:String
    val bird_age:Int
    val bird_word:Int

    val name_map = mutableMapOf<String, String>()
    val age_map = mutableMapOf<String, Int>()
    val solo_map = mutableMapOf<String, Int>()

    val scanner = Scanner(System.`in`)
    println("강아지 정보입력")
    print("이름 : ")
    dog_name = scanner.next()
    name_map.put("강아지", dog_name)
    print("나이 : ")
    dog_age = scanner.nextInt()
    age_map.put("강아지", dog_age)
    print("개인기 개수 : ")
    dog_trick = scanner.nextInt()
    solo_map.put("강아지", dog_trick)
    println()

    println("고양이 정보입력")
    print("이름 : ")
    cat_name = scanner.next()
    name_map.put("고양이", cat_name)
    print("나이 : ")
    cat_age = scanner.nextInt()
    age_map.put("고양이", cat_age)
    print("서열 : ")
    cat_rank = scanner.nextInt()
    solo_map.put("고양이", cat_rank)
    println()

    println("앵무새 정보 입력")
    print("이름 : ")
    bird_name = scanner.next()
    name_map.put("앵무새", bird_name)
    print("나이 : ")
    bird_age = scanner.nextInt()
    age_map.put("앵무새", bird_age)
    print("단어 개수 : ")
    bird_word = scanner.nextInt()
    solo_map.put("앵무새", bird_word)
    println()

    println("강아지 이름 : ${name_map["강아지"]}")
    println("강아지 나이 : ${age_map["강아지"]}살")
    println("개인기 개수 : ${solo_map["강아지"]}개")
    println()

    println("고양이 이름 : ${name_map["고양이"]}")
    println("고양이 나이 : ${age_map["고양이"]}살")
    println("서열 : ${solo_map["고양이"]}위")
    println()

    println("앵무새 이름 : ${name_map["앵무새"]}")
    println("앵무새 나이 : ${age_map["앵무새"]}살")
    println("단어 개수 : ${solo_map["앵무새"]}개")
}

fun ex02(){

    val scanner = Scanner(System.`in`)

    val studentList = mutableListOf<Any>()

    val name_map = mutableMapOf<Int, String>()
    val age_map = mutableMapOf<Int, Int>()
    val kor_map = mutableMapOf<Int, Int>()
    val eng_map = mutableMapOf<Int, Int>()
    val math_map = mutableMapOf<Int, Int>()

    var studentname:String
    var studentage:Int
    var studentkor:Int
    var studenteng:Int
    var studentmath:Int


    for (i in 0..< 5){
        print("이름 : ")
        studentname = scanner.next()
        name_map.put(i, studentname)
        print("나이 : ")
        studentage = scanner.nextInt()
        age_map.put(i, studentage)
        print("국어점수 : ")
        studentkor = scanner.nextInt()
        kor_map.put(i, studentkor)
        print("영어점수 : ")
        studenteng = scanner.nextInt()
        eng_map.put(i, studenteng)
        print("수학점수 : ")
        studentmath = scanner.nextInt()
        math_map.put(i, studentmath)
    }
    
    studentList.add(name_map)
    studentList.add(age_map)
    studentList.add(kor_map)
    studentList.add(eng_map)
    studentList.add(math_map)

    for (index in 0..< studentList.size) {
        println("${index + 1}번째 학생 정보")
        println("이름 : ${name_map[index]}")
        println("나이 : ${age_map[index]}살")
        println("국어점수 : ${kor_map[index]}점")
        println("영어점수 : ${eng_map[index]}점")
        println("수학점수 : ${math_map[index]}점")
        println()
    }

    println("국어 총점 : ${kor_map.values.sum()}점")
    println("영어 총점 : ${eng_map.values.sum()}점")
    println("수학 총점 : ${math_map.values.sum()}점")
    println("국어 평균 : ${kor_map.values.average().toInt()}점")
    println("영어 평균 : ${eng_map.values.average().toInt()}점")
    println("수학 평균 : ${math_map.values.average().toInt()}점")
}