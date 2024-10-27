import com.lion.pkg1.InternalClass3
import com.lion.pkg1.PublicClass3
import com.lion.pkg1.SuperClass3
import com.lion.pkg1.TestClass3
import com.test.pkg2.PublicClass4
import com.test.pkg2.SuperClass4
import com.test.pkg2.TestClass4

// 클래스
// private : 외부에서 객체를 생성할 수 없다.
// public : 외부에서 객체를 생성할 수 있다(기본)
// protected : 클래스에 지정할 수 없다.
// internal : 모듈이 같은 경우에만 객체를 생성할 수 있다.

// 변수와 메서드
// private : 외부에서 접근할 수 없다.
// public : 외부에서 접근이 자유롭다(기본)
// protected : 상속 관계일 경우에만 접근이 가능하다.
// internal : 모듈이 같은 경우에만 접근이 가능하다.

fun main() {
    // 같은 파일 내부의 클래스 사용
    // private : O
    // public : O
    // internal : O
    val privateClass1 = PrivateClass1()
    val publicClass1 = PublicClass1()
    val internalClass1 = InternalClass1()
    println("privateClass1 : $privateClass1")
    println("publicClass1 : $publicClass1")
    println("internalClass1 : $internalClass1")

    // 같은 파일에 있는 클래스의 맴버 사용
    // private : 사용 불가 (외부에서 절대 사용 불가)
    // public : 사용 가능 (자유롭게 사용 가능)
    // protected : 사용 불가 (상속관계가 아니므로 불가)
    // internal : 사용 가능 (같은 모듈이기 때문에 사용 가능)
    val t1 = TestClass1()
    println("t1.privateMember1 : ${t1.privateMember1}")
    println("t1.publicMember1 : ${t1.publicMember1}")
    println("t1.protectedMember1 : ${t1.protectedMember1}")
    println("t1.internalMember1 : ${t1.internalMember1}")

    println("--------------------------------------")

    // 같은 모듈 다른 파일에 있는 클래스
    // private : 파일이 다르므로 사용이 불가
    // public : 사용 가능
    // internal : 같은 모듈이기 때문에 사용이 가능하다
    val privateClass2 = PrivateClass2()
    val publicClass2 = PublicClass2()
    val internalClass2 = InternalClass2()
    println("privateClass2 : $privateClass2")
    println("publicClass2 : $publicClass2")
    println("internalClass2 : $internalClass2")

    println("--------------------------------------")

    // 같은 모듈 다른 파일의 클래스 맴버 사용
    // private : 사용 불가
    // public : 사용 가능
    // protected : 상속 관계가 아니므로 사용 불가
    // internal : 같은 모듈이기 때문에 사용 가능
    val t2 = TestClass2()
    println("t2.privateMember1 : ${t2.privateMember1}")
    println("t2.publicMember1 : ${t2.publicMember1}")
    println("t2.protectedMember1 : ${t2.protectedMember1}")
    println("t2.internalMember1 : ${t2.internalMember1}")

    println("--------------------------------------")

    // 같은 모듈 다른 패키지의 클래스 사용
    // private : 다른 파일 이므로 사용 불가
    // public : : 사용 가능
    // internal : 같은 모듈이므로 사용 가능
    val privateClass3 = PrivateClass3()
    val publicClass3 = PublicClass3()
    val internalClass3 = InternalClass3()
    println("privateClass3 : $privateClass3")
    println("publicClass3 : $publicClass3")
    println("internalClass3 : $internalClass3")

    println("--------------------------------------")

    // 같은 모듈 다른 패키지의 클래스 맴버 사용
    // private : 사용 불가 (외부에서 절대 사용 불가)
    // public : 사용 가능 (자유롭게 사용 가능)
    // protected : 사용 불가 (상속관계가 아니므로 불가)
    // internal : 사용 가능 (같은 모듈이기 때문에 사용 가능)
    val t3 = TestClass3()
    println("t3.privateMember1 : ${t3.privateMember1}")
    println("t3.publicMember1 : ${t3.publicMember1}")
    println("t3.protectedMember1 : ${t3.protectedMember1}")
    println("t3.internalMember1 : ${t3.internalMember1}")

    println("--------------------------------------")

    // 다른 모듈의 클래스 사용
    // private : 사용 불가
    // public : 사용 가능
    // internal : 모듈이 다르므로 사용이 불가능하다
    val privateClass4 = PrivateClass4()
    val publicClass4 = PublicClass4()
    val internalClass4 = InternalClass4()
    println("privateClass4 : $privateClass4")
    println("publicClass4 : $publicClass4")
    println("internalClass4 : $internalClass4")

    println("--------------------------------------")

    // 다른 모듈의 클래스의 맴버 사용
    // private : 사용 불가
    // public : 사용 가능
    // protected : 상속 관계가 아니므로 사용 불가
    // internal : 다른 모듈이기 때문에 사용 불가
    val t4 = TestClass4()
    println("t4.privateMember1 : ${t4.privateMember1}")
    println("t4.publicMember1 : ${t4.publicMember1}")
    println("t4.protectedMember1 : ${t4.protectedMember1}")
    println("tt42.internalMember1 : ${t4.internalMember1}")

    println("--------------------------------------")
}

private class PrivateClass1
public class PublicClass1
// protected class ProtectedClass1
internal class InternalClass1

class TestClass1{
    private val privateMember1 = 100
    public val publicMember1 = 200
    protected val protectedMember1 = 300
    internal val internalMember1 = 400
}

open class SuperClass1{
    private val privateMember1 = 100
    public val publicMember1 = 200
    protected val protectedMember1 = 300
    internal val internalMember1 = 400
}

// 같은 파일에 있는 클래스를 상속
class SubClass1 : SuperClass1(){

    fun subMethod1(){
        // 부모가 가진 맴버 사용
        // private : 사용 불가
        // public : 사용 가능
        // protected : 상속 관계이므로 사용 가능
        // internal : 같은 모듀듈이기 때문에 사용 가능
        println("privateMember1 : $privateMember1")
        println("publicmember1 : $publicMember1")
        println("protectedMember1 : $protectedMember1")
        println("internalMember1 : $internalMember1")
    }
}

// 같은 모듈 다른 파일의 클래스 상속
class SubClass2 : SuperClass2(){
    fun subMethod2(){
        // 부모가 가진 맴버 사용
        // private : 사용 불가
        // public : 사용 가능
        // protected : 상속 관계이므로 사용 가능
        // internal : 같은 모듀듈이기 때문에 사용 가능
        println("privateMember1 : $privateMember1")
        println("publicmember1 : $publicMember1")
        println("protectedMember1 : $protectedMember1")
        println("internalMember1 : $internalMember1")
    }
}

// 같은 모듈 다른 패키지의 클래스 상속
class SubClass3 : SuperClass3(){
    fun subMethod2(){
        // 부모가 가진 맴버 사용
        // private : 사용 불가
        // public : 사용 가능
        // protected : 상속 관계이므로 사용 가능
        // internal : 같은 모듈이기 때문에 사용 가능
        println("privateMember1 : $privateMember1")
        println("publicmember1 : $publicMember1")
        println("protectedMember1 : $protectedMember1")
        println("internalMember1 : $internalMember1")
    }
}

// 다른 모듈의 클래스 상속
class SubClass4 : SuperClass4(){
    fun subMethod2(){
        // 부모가 가진 맴버 사용
        // private : 사용 불가
        // public : 사용 가능
        // protected : 상속 관계이므로 사용 가능
        // internal : 같은 모듈이기 때문에 사용 가능
        println("privateMember1 : $privateMember1")
        println("publicmember1 : $publicMember1")
        println("protectedMember1 : $protectedMember1")
        println("internalMember1 : $internalMember1")
    }
}