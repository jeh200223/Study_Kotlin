# 학생관리 프로그램

학생 관리 프로그램

처음에 입력을 받고 출력한다.

각 학생당 한 번씩만 입력 받는다.

축구부 학생 정보를 입력해주세요
이름 :
나이 :
골 넣은 개수 :
축구 선수가 달립니다 -> run
태클을 합니다 -> 자유롭게

야구부 학생 정보를 입력해주세요
이름 :
나이 :
홈런 개수 :
야구 선수가 달립니다 -> run
도루를 합니다 -> 자유롭게

농부구 학생 정보를 입력해주세요
이름 :
나이 :
리바운드 개수 :
농구 선수가 달립니다 -> run
블록킹을 합니다 - 자유롭게

---

# 패키지 생성

### 다음 패키지를 생성한다.
- com.lion.main
- com.lion.school

---

# Main 파일 생성

### main 패키지에 Main.kt 파일을 만들어준다.

```kt
package com.lion.main

fun main(){

}
```

### 출력화면을 구성한다.

```kt
package com.lion.main

fun main(){
    println()
    println("축구부 학생 정보를 입력해주세요")
    println("이름 : ")
    println("나이 : ")
    println("골 넣은 개수 : ")

    println()
    println("야구부 학생 정보를 입력해주세요")
    println("이름 : ")
    println("나이 : ")
    println("홈런 개수 : ")

    println()
    println("농부부 학생 정보를 입력해주세요")
    println("이름 : ")
    println("나이 : ")
    println("리바운드 개수 : ")

    println()
    println("축구부 학생 정보")
    println("이름 : 홈길동")
    println("나이 : 10살")
    println("골 넣은 개수 : 100골")
    println("축구 선수가 달립니다")
    println("태클을 합니다")

    println()
    println("야구부 학생 정보")
    println("이름 : 홍길동")
    println("나이 : 10살")
    println("홈런 개수 : 100개")
    println("야구 선수가 달립니다")
    println("도루를 합니다")

    println()
    println("농부부 학생 정보")
    println("이름 : 홍길동")
    println("나이 : 10살")
    println("리바운드 개수 : 100개")
    println("농구 선수가 달립니다")
    println("블록킹을 합니다")
}
```

---

# 설계

### 필요한 데이터 정리
- 이름
- 나이
- 골 넣은 개수
- 홈런 개수
- 리바운드 개수

### 필요한 기능 정리
- 학생 정보를 입력받는 기능
- 학생 정보를 출력하는 기능
- 달리는 기능
- 태클하는 기능
- 도루하는 기능
- 블록킹 하는 기능

### 데이터 선별
- 이름 -> 축구부 학생, 야구부 학생, 농구부 학생
- 나이 -> 축구부 학생, 야구부 학생, 농구부 학생
- 골 넣은 개수 -> 축구부 학생
- 홈런 개수 -> 야구부 학생
- 리바운드 개수 -> 농구부 학생

### 기능 선별
- 학생 정보를 입력받는 기능 -> 축구부 학생, 야구부 학생, 농구부 학생
- 학생 정보를 출력하는 기능 -> 축구부 학생, 야구부 학생, 농구부 학생
- 달리는 기능 -> 축구부 학생, 야구부 학생, 농구부 학생
- 태클하는 기능 -> 축구부 학생
- 도루하는 기능 -> 야구부 학생
- 블록킹 하는 기능 -> 농구부 학생

---

# 학생 클래스를 작성

### school 패키지에 클래스를 만들어준다.
- StudentClass
- SoccerStudentClass
- BaseBallStudentClass
- BasketBallStudentClass

### StudentClass를 구현한다.
```kt
package com.lion.school

open class StudentClass(var studentName:String = "", var studentAge:Int = 0) {

    // 학생 정보를 입력받는 메서드
    open fun inputStudentInfo(){

    }
    // 학생 정보를 출력하는 메서드
    open fun printStudentInfo(){

    }

    // 달리는 메서드
    open fun run(){

    }

}
```

### SoccerStudentClass를 구현한다.

```kt
package com.lion.school

class SoccerStudentClass(var goalCount:Int = 0) : StudentClass() {

    // 태클하는 기능
    fun takkle(){

    }
}
```

### BaseBallStudentClass를 구현해준다.

```kt
package com.lion.school

class BaseBallStudentClass(var homeCount:Int = 0) : StudentClass() {

    // 도루하는 기능
    fun homeStill(){
        
    }
}
```

### BasketBallStudentClass

```kt
package com.lion.school

class BasketBallStudentClass(var roboundCount:Int = 0) : StudentClass() {

    // 블록킹 하는 기능
    fun blocking(){
        
    }
}
```

---

# StudentClass 기능 구현

### 학생 정보를 입력받는 메서드를 구현한다.

```kt
    // 학생 정보를 입력받는 메서드
    open fun inputStudentInfo(scanner: Scanner){
        print("이름 : ")
        studentName = scanner.next()
        println("나이 : ")
        studentAge = scanner.nextInt()
    }
```

### 학생 정보를 출력하는 메서드를 구현한다.
```kt
    // 학생 정보를 출력하는 메서드
    open fun printStudentInfo(){
        println("이름 : $studentName")
        println("나이 : ${studentAge}살")
    }
```

---

# SoccerStudentClass 구현

### 학생 정보를 입력받는 메서드를 구현한다.

```kt
    // 학생 정보를 입력받는 메서드
    override fun inputStudentInfo(scanner: Scanner) {
        println()
        println("축구부 학생 정보를 입력해주세요")
        super.inputStudentInfo(scanner)
        print("골 넣은 개수 : ")
        goalCount = scanner.nextInt()
    }
```

### 학생 정보를 출력하는 메서드를 구현한다.
```kt
    // 학생 정보를 출력하는 메서드
    override fun printStudentInfo() {
        println()
        println("축구부 학생 정보")
        super.printStudentInfo()
        println("골 넣은 개수 : ${goalCount}골")
    }
```

### 달리는 메서드를 구현해준다.
```kt
    // 달리는 메서드
    override fun run() {
        println("축구 선수가 달립니다")
    }
```

### 태클하는 기능을 구현한다.
```kt
    // 태클하는 기능
    fun takkle(){
        println("태클을 합니다")
    }
```

---

# BaseBallStudentClass 구현

### 같은 방법으로 메서드들을 구현해준다
```kt
    // 학생 정보를 입력받는 메서드
    override fun inputStudentInfo(scanner: Scanner) {
        println()
        println("야구부 학생 정보를 입력해주세요")
        super.inputStudentInfo(scanner)
        print("홈런 개수 : ")
        homeCount = scanner.nextInt()
    }

    // 학생 정보를 출력하는 메서드
    override fun printStudentInfo() {
        println()
        println("야구부 학생 정보")
        super.printStudentInfo()
        println("홈런 개수 : ${homeCount}개")
    }

    // 달리는 메서드
    override fun run() {
        println("야구 선수가 달립니다")
    }
    
    // 도루하는 기능
    fun homeStill(){
        println("도루를 합니다")
    }
```

---

# BasketBallStudentClass 구현

### 같은 방법으로 메서드들을 구현해준다

```kt

    // 학생 정보를 입력받는 메서드
    override fun inputStudentInfo(scanner: Scanner) {
        println()
        println("농구부 학생 정보를 입력해주세요")
        super.inputStudentInfo(scanner)
        print("리바운드 개수 : ")
        reboundCount = scanner.nextInt()
    }

    // 학생 정보를 출력하는 메서드
    override fun printStudentInfo() {
        println()
        println("농구부 학생 정보")
        super.printStudentInfo()
        println("리바운드 개수 : ${reboundCount}개")
    }

    // 달리는 메서드
    override fun run() {
        println("농구 선수가 달립니다")
    }

    // 블록킹 하는 기능
    fun blocking(){
        println("블록킹을 합니다")
    }
```
---

# Main 구현

### 필요한 객체들을 생성한다.
```kt
    val scanner = Scanner(System.`in`)
    val soccerStudentClass = SoccerStudentClass()
    val baseBallStudentClass = BaseBallStudentClass()
    val basketBallStudentClass = BasketBallStudentClass()
```

### 학생 정보를 입력받는다.
```kt
    // 학생 정보를 입력받는다.
    soccerStudentClass.inputStudentInfo(scanner)
    baseBallStudentClass.inputStudentInfo(scanner)
    basketBallStudentClass.inputStudentInfo(scanner)
```

### 학생 정보를 출력한다.

```kt
    // 학생 정보를 출력한다.
    soccerStudentClass.printStudentInfo()
    soccerStudentClass.run()
    soccerStudentClass.takkle()
    
    baseBallStudentClass.printStudentInfo()
    baseBallStudentClass.run()
    baseBallStudentClass.homeStill()
    
    basketBallStudentClass.printStudentInfo()
    basketBallStudentClass.run()
    basketBallStudentClass.blocking()
```



