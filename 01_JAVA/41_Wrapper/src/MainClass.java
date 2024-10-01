// Wrapper 클래스
// 기본 자료형 값을 관리하는 객체를 의미한다.
// 기본 자료형은 객체가 아니기 때문에 기본 자료형 값을 가지고
// 작업을 하는 메서드 자체가 존재하지 않는다.
// 이에 기본 자료형값을 관리하는 수 있는 클래스들을 제공하고 있고'
// 이 클래스들은 Wrapper 클래스라고 부른다.

public class MainClass {
    public static void main(String[] args) {
        boolean a1 = true;
        byte a2 = 10;
        char a3 = 'a';
        double a4 = 11.11;
        float a5 = 11.11f;
        int a6 = 100;
        long a7 = 100L;
        short a8 = 100;

        Boolean b1 = Boolean.valueOf(a1);
        Byte b2 = Byte.valueOf(a2);
        Character b3 = Character.valueOf(a3);
        Double b4 = Double.valueOf(a4);
        Float b5 = Float.valueOf(a5);
        Integer b6 = Integer.valueOf(a6);
        Long b7 = Long.valueOf(a7);
        Short b8 = Short.valueOf(a8);

        // 관리하는 값을 추출한다.
        boolean a10 = b1.booleanValue();
        byte a20 = b2.byteValue();
        char a30 = b3.charValue();
        double a40 = b4.doubleValue();
        float a50 = b5.floatValue();
        int a60 = b6.intValue();
        long a70 = b7.longValue();
        short a80 = b8.shortValue();

        System.out.printf("a10 : %s\n", a10);
        System.out.printf("a20 : %d\n", a20);
        System.out.printf("a30 : %c\n", a30);
        System.out.printf("a40 : %f\n", a40);
        System.out.printf("a50 : %f\n", a50);
        System.out.printf("a60 : %d\n", a60);
        System.out.printf("a70 : %d\n", a70);
        System.out.printf("a80 : %d\n", a80);

        // Boxing : 기본 자료형값을 Wrapper의 객체로 포장하는 작업
        // Auto Boxing : Wrapper클래스 타입 변수에 기본 자료형 값을 넣어주면
        // Boxing작업을 해주는 개념
        // 개발자가 작성하는 자바 코드를 valueOf 메서드를 이용하여
        // 객체를 생성하는 코드로 변경해준다.
        Boolean b9 = true;
        Byte b10 = 10;
        Character b11 = 'a';
        Double b12 = 11.11;
        Float b13 = 11.11f;
        Integer b14 = 100;
        Long b15 = 100L;
        Short b16 = 100;

        // Unboxing : Wrapper 클래스의 객체가 관리하는 값을 반환하는 것을 의미한다.
        // Auto Unboxing : Wrapper클래스의 객체를 가지고 있는 변수로 부터 객체를
        // 가져오면 객체가 관리하는 값을 자동으로 반환해준다.
        System.out.printf("b9 : %s\n", b9);
        System.out.printf("b10 : %d\n", b10);
        System.out.printf("b11 : %c\n", b11);
        System.out.printf("b12 : %f\n", b12);
        System.out.printf("b13 : %f\n", b13);
        System.out.printf("b14 : %d\n", b14);
        System.out.printf("b15 : %d\n", b15);
        System.out.printf("b16 : %d\n", b16);

        Integer r1 = b14 + 200;
        // Integer r1 = Integer.valueOf(b14.intValue() + 200);

        System.out.println("------------------------------");

        // 해당 자료형에 대한 정보를 확인할 수 있다.
        System.out.printf("최소값 : %d\n", Integer.MIN_VALUE);
        System.out.printf("최대값 : %d\n", Integer.MAX_VALUE);
        System.out.printf("바이트 수 %d\n", Integer.BYTES);
        System.out.printf("비트 수 : %d\n", Integer.SIZE);

        System.out.println("------------------------------");

        // 문자열로 되어 있는 값을 기본 자료형 값을 변경한다.
        Integer a100 = Integer.parseInt("12345");
        System.out.printf("a100 : %d\n", a100);

        Double a200 = Double.parseDouble("11.11");
        System.out.printf("a200 : %f\n", a200);
    }
}
