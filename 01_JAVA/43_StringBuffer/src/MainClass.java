// String : 문자열에 대한 작업을 하게 되면 새로운 String 객체가 계속 생성된다.
// 메모리를 과도하게 사용할 가능성이 높지만 원본을 유지할 수 있다.
// StringBuffer : 문자열에 대한 작업을 하게 되면 관리하는 문자열 자체를 변경한다.
// 메모리를 적게 사용하지만 원본을 유지할 수 없다.

public class MainClass {
    public static void main(String[] args) {
        // 문자열과 문자열 간의 연산
        // 두 문자열을 합친 새로운 문자열이 생성된다.
        String str1 = "abc";
        String str2 = str1 + "def";
        System.out.printf("str1 : %s\n", str1);
        System.out.printf("str2 : %s\n", str2);

        // 문자열과 문자열이 아닌 것 간의 연산
        // 문자열이 아닌 것이 문자열로 만들어지고 두 문자열을 합친 새로운 문자열이 생성된다.
        String str3 = "abc";
        String str4 = str3 + 100;
        System.out.printf("str3 : %s\n", str3);
        System.out.printf("Str4 : %s\n", str4);

        // 1. "가나다라" 문자열 객체 생성
        // 2. 100을 통해 "100" 문자열 객체 생성
        // 3. "가나다라100" 문자열이 생성
        // 4. "가나다라100ㅇㅇ" 문자열이 생성
        // 5. 11.11을 통해 "11.11" 문자열이 생성
        // 6. "가나다라100ㅇㅇ11.11" 문자열이 생성
        String str5 = "가나다라" + 100 + "ㅇㅇ" + 11.11;
        System.out.printf("str5 : %s\n", str5);

        // StringBuffer 생성
        // 만약 관리할 문자열이 없다면 생성자에 아무것도 넣어주지 않는다.
        StringBuffer stringBuffer1 = new StringBuffer("abc");

        // 문자열 추가
        stringBuffer1.append("안녕하세요");
        stringBuffer1.append(100);
        System.out.printf("stringBuffer1 : %s\n", stringBuffer1);

        // 만약 StringBuffer를 String으로 변환하고 싶다면..
        String str6 = stringBuffer1.toString();
        System.out.printf("str6 : %s\n", str6);

        // StringBuffer가 제공하는 문자열 변환 관련 메서드들은 반환 타입으로
        // StringBuffer 객체 자신을 반환한다.
        stringBuffer1.append("가나다라").append(11.11).append("메롱");
        System.out.printf("stringBuffer1 : %s\n", stringBuffer1);

        // 삭제
        // 순서값 2(3번째) ~ 4 - 1(4번째) 까지 제거
        stringBuffer1.delete(2, 4);
        System.out.printf("stringBuffer1 : %s\n", stringBuffer1);

        // 삽입
        // 2번 위치(3번째)에 "다라"를 삽입한다.
        stringBuffer1.insert(2, "다라");
        System.out.printf("stringBuffer1 : %s\n", stringBuffer1);

        // 변경
        // 1번 위치(2번째)에서 부터 3 - 1 위치(3번째) 까지의
        // 문자열을 제거하고 그 위치에 "반갑습니다"를 넣어준다.
        stringBuffer1.replace(1, 3, "반갑습니다");
        System.out.printf("stringBuffer1 : %s\n", stringBuffer1);
    }
}