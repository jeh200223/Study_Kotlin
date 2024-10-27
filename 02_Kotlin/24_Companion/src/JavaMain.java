public class JavaMain {
    // 일반 맴버 변수
    public int javaA1 = 100;

    // 정적 맴버 변수
    public static int javaA2 = 200;

    // 일반 맴버 메서드
    public void javaMethod2(){
        System.out.println("JavaMain - javaMethod2");
    }

    // 정적 맴버 메서드
    public static void javaMethod3(){
        System.out.println("JavaMain - javaMethod3");
    }

    public static void main(String[] args) {
        // 코틀린에서 작성한 클래스를 사용한다.
        KotlinClass kotlinClass = new KotlinClass();
        System.out.println("kotlinClass.kotlinA : " + kotlinClass.getKotlinA1());
        kotlinClass.kotlinMethod2();

        // 코틀린에서 정의한 Companion 맴버를 사용한다(@JvmStatic X)
        System.out.println("kotlinClass.kotlinA2 : " + KotlinClass.Companion.getKotlinA2());
        KotlinClass.Companion.kotlinMethod3();

        // 코틀린에서 정의한 Companion 맴버를 사용한다(@JvmStatic O)
        System.out.println("kotlinClass.kotlinA2 : " + KotlinClass.getKotlinA3());
        KotlinClass.kotlinMethod4();
    }
}