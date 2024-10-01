public class MainClass {
    // main 메서드에 구현한 코들는 쓰래드로 운영된다.
    public static void main(String[] args) {

        // Thread 클래스를 상속받은 클래스의 객체를 생성한다.
        TestClass1 t1 = new TestClass1();
        // 쓰래드를 가동시킨다.
        t1.start();

        // Runnable 인터페이스를 구현한 클래스의 객체를 생성한다.
        TestClass2 t2 = new TestClass2();
        // Thread 클래스의 객체를 생성한다.
        // Runnable 인터페이스를 구현한 클래스를 통해 생성한 객체를 넣어준다.
        Thread thread = new Thread(t2);
        // 쓰래드를 가동한다.
        // Thread 객체를 생성할 때 전달해준 객체의 run 메서드 내부의 코드를
        // 별도의 쓰래드로 운영한다.
        thread.start();

        for(int i = 0 ; i < 10 ; i++){
            try{
                // 100ms 만큼 쉬었다가 진행한다.
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.printf("main - %d\n", i);
        }
    }
}

// Thread 클래스를 상속받은 클래스
// Thread 클래스안에 쓰래드를 발생시키는 메서드가 있다.
class TestClass1 extends Thread{
    // 쓰래드로 운영할 코드를 작성할 메서드
    // 쓰래드를 가동시키라는 명령을 사용하면 JVM은 쓰래드 하나를 발생시키고
    // run 메서드 내부의 코드를 발생시킨 쓰래드를 통해 운영한다.
    @Override
    public void run() {
        for(int i = 0 ; i < 10 ; i++){
            try{
                // 300ms 만큼 쉬었다가 진행한다.
                Thread.sleep(300);
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.printf("TestClass1 - %d\n", i);
        }
    }
}

// 자바는 단일 상속만 지원하기 때문에 이미 다른 클래스를 상속받고 있을 경우를 대비하여
// Runnable 인터페이스를 제공하고 있다.
class TestClass2 implements Runnable{

    @Override
    public void run() {
        for(int i = 0 ; i < 10 ; i++){
            try{
                // 400ms 만큼 쉬었다가 진행한다.
                Thread.sleep(400);
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.printf("TestClass2 - %d\n", i);
        }
    }
}