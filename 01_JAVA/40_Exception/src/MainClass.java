public class MainClass {
    public static void main(String[] args) {
        try {
            // null이 들어있는 변수를 통해 객체에 접근하고자 했기 때문에
            // NullPointerException 이 발생한다.
//             TestClass1 t1 = null;
//             t1.memberA1 = 200;

            // 10을 0으로 나누려고 했기때문에 수학적 오류이기 때문에
            // ArithmeticException이 발생한다
//            int a1 = 10 / 0;
            //System.out.printf("a1 : %d\n", a1);

            // 배열이 3개의 기억공간을 관리하는데 11번째 기억공간에
            // 값을 넣으려고 했기 때문에
            // IndexOutOfBoundsException 이 발생한다.
//            int [] array1 = new int[3];
//            array1[10] = 100;

            TestClass1 t1 = new TestClass1();
            // 호출한 메서드에서 예외가 발생하였는데
            // 호출한 메서드 내부에서 예외처리를 하지 않았어도
            // 메서드를 호출한 쪽에서 예외처리를 했다면
            // 예외처리 한 것으로 취급해준다.
            t1.cal(10, 0);
        }
        // NullPointerException이 발생했을 때 동작하는 부분
        catch(NullPointerException e){
            System.out.println("NullPointerException 이 발생하였습니다");
        }
        // ArithmeticException이 발생했을 때 동작하는 부분
        catch(ArithmeticException e){
            System.out.println("ArithmeticException이 발생하였습니다");
        }
        // 모든 예외와 관련된 클래스들은 Exception 클래스를 상속받고 있다.
        // 이에, 아래의 부분은 그외의 모든 예외에 대한 catch 부분이 된다.
        catch(Exception e){
            System.out.println("그 외의 모든 오류가 발생하였습니다");
        }
        System.out.println("이 부분이 수행될까요?");

        TestClass1 t100 = new TestClass1();
        t100.cal(100, 0);
    }
}

class TestClass1{
    int memberA1 = 100;
    // throws ArithmeticException : 이 메서드는 ArithmeticException 을 발생할 수도 있기 때문에
    // 메서드를 호출하는 쪽에서 예외처리를 하라고 강제성을 주는 부분이다.
    // 메서드를 호출한 쪽에서 예외처리를 하지 않으면 오류가 발생한다.
    public int cal(int a1, int a2) throws IOException {
        return a1 / a2;
    }
}