import java.util.Scanner

fun main() {
    val galaxy:inputPhoneInfo  = SamSung()
    val apple:inputPhoneInfo = Apple()
    val blackBerry:inputPhoneInfo = BlackBerry()

    // 정보 입력
    galaxy.inputPhoneInfoBase()
    apple.inputPhoneInfoBase()
    blackBerry.inputPhoneInfoBase()

    // 갤럭시 정보 출력
    galaxy.showPhoneInfoBase()
    galaxy.talkToAi()
    galaxy.doAction()

    // 애플 정보 출력
    apple.showPhoneInfoBase()
    apple.talkToAi()
    apple.doAction()

    // 블랙베리 정보 출력
    blackBerry.showPhoneInfoBase()
    blackBerry.talkToAi()
    blackBerry.doAction()
}

open class inputPhoneInfo() {
    var volume:Int = 0
    lateinit var color:String
    open fun inputPhoneInfoBase() {
        val scanner = Scanner(System.`in`)
        print("용량 : ")
        volume = scanner.nextInt()
        print("색상 : ")
        color = scanner.next()
    }

    open fun showPhoneInfoBase() {
        println("용량 : ${volume}GB")
        println("색상 : $color")
    }

    open fun talkToAi() {

    }

    open fun doAction() {

    }
}

class SamSung : inputPhoneInfo() {
    lateinit var site:String

    override fun inputPhoneInfoBase() {
        println("삼성 갤럭시 정보를 입력해주세요")
        super.inputPhoneInfoBase()
        val scanner = Scanner(System.`in`)
        print("접히는 방향 : ")
        site = scanner.next()
        println()
    }

    override fun showPhoneInfoBase() {
        super.showPhoneInfoBase()
        println("접히는 방향 : $site")
    }

    override fun talkToAi() {
        println("빅스비가 잘 못알아듣습니다.")
    }

    override fun doAction() {
        println("아이폰보다 튼튼합니다")
        println()
    }
}

class Apple : inputPhoneInfo() {
    lateinit var type:String

    override fun inputPhoneInfoBase() {
        println()
        println("애플 아이폰 정보를 입력해주세요")
        super.inputPhoneInfoBase()
        val scanner = Scanner(System.`in`)
        print("기종 : ")
        type = scanner.next()
        println()
    }

    override fun showPhoneInfoBase() {
        super.showPhoneInfoBase()
        println("기종 : $type")
    }

    override fun talkToAi() {
        println("시리가 이상한 소리를 합니다")
    }

    override fun doAction() {
        println("통화녹음하면 상대방에게 고지합니다")
        println()
    }
}

class BlackBerry : inputPhoneInfo() {
    var Count:Int = 0

    override fun inputPhoneInfoBase() {
        println()
        println("블랙베리의 정보를 입력해주세요")
        super.inputPhoneInfoBase()
        val scanner = Scanner(System.`in`)
        print("키보드 키 개수 : ")
        Count = scanner.nextInt()
        println()
    }

    override fun showPhoneInfoBase() {
        super.showPhoneInfoBase()
        println("키보드 키 개수 : $Count")
    }

    override fun talkToAi() {
        println("음성 ai 서비스가 없습니다")
    }

    override fun doAction() {
        println("단종되었습니다.. 삼가....고인의...명복을... - 자유롭게")
        println()
    }
}