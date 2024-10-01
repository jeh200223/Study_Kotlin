public class MainClass {
    public static void main(String[] args) {
        // String 클래스
        // 문자열을 관리하는 메서드를 가진 클래스
        // 자바에서 " " 로 묶은 문자열 자체가 String 클래스의 객체가 된다.
        String str1 = "안녕하세요";
        System.out.printf("str1 : %d\n", str1.length());
        System.out.printf("안녕하세요 : %d\n", "안녕하세요".length());

        // 문자열 비교
        // 코드에서 문자열을 작성해주면 문자열을 관리하는 String 객체가
        // 생성된다.
        // 그 이후 같은 문자열을 계속 사용하면 전에 생성한 String 객체를
        // 계속 이용하게 된다.

        // 문자열 두 개를 == 로 비교하게 되면
        // 문자열 객체 정보를 비교하는 것이 된다.
        if (str1 == "안녕하세요") {
            System.out.println("문자열은 같습니다");
        } else {
            System.out.println("문자열은 다릅니다");
        }

        // 새로운 String 객체를 생성한다.
        String str2 = new String("안녕하세요");
        if (str1 == str2) {
            System.out.println("문자열은 같습니다");
        } else {
            System.out.println("문자열은 다릅니다");
        }

        // 문자열 내용을 비교할 때는 equlas 메서드를 사용해야 한다.
        if (str1.equals(str2)) {
            System.out.println("문자열은 같습니다");
        } else {
            System.out.println("문자열은 다릅니다");
        }

        // 대소문자가 다른 두 문자열 비교
        String eng1 = "abCDef";
        String eng2 = "ABcdEF";

        if (eng1.equals(eng2)) {
            System.out.println("문자열은 같습니다");
        } else {
            System.out.println("문자열은 다릅니다");
        }

        // 대소문자를 무시하고 비교한다.
        if (eng1.equalsIgnoreCase(eng2)) {
            System.out.println("문자열은 같습니다");
        } else {
            System.out.println("문자열은 다릅니다");
        }

        // 소문자들을 대문자로 변환한 문자열을 생성한다.
        String upperStr = eng1.toUpperCase();
        System.out.printf("eng1 : %s\n", eng1);
        System.out.printf("upperStr : %s\n", upperStr);

        // 대문자들을 소문자로 변환한 문자열을 생성한다.
        String lowerStr = eng1.toLowerCase();
        System.out.printf("eng1 : %s\n", eng1);
        System.out.printf("lowerStr : %s\n", lowerStr);

        // ~ 로 시작하는지
        String str4 = "abcdef";

        if (str4.startsWith("abc")) {
            System.out.println("abc로 시작합니다");
        } else {
            System.out.println("abc로 시작하지 않습니다");
        }

        if (str4.startsWith("kkk")) {
            System.out.println("kkk로 시작합니다");
        } else {
            System.out.println("kkk로 시작하지 않습니다");
        }

        // ~ 끝나는가
        if (str4.endsWith("def")) {
            System.out.println("def로 끝납니다");
        } else {
            System.out.println("def로 끝나지 않습니다");
        }

        if (str4.endsWith("kkk")) {
            System.out.println("kkk로 끝납니다");
        } else {
            System.out.println("kkk로 끝나지 않습니다");
        }

        // 지정한 문자열이 어디에 있는가..
        System.out.println(str4.indexOf("c"));
        System.out.println(str4.indexOf("cd"));
        System.out.println(str4.indexOf("ccc"));

        // 문자열의 일부만 발췌한다.
        // 순서값 2(세번째)글자에서 부터 끝까지
        String str5 = str4.substring(2);
        System.out.printf("str5 : %s\n", str5);

        // 순서 값2(세번째)글에서 부터 순서값 4 - 1(네번째) 까지
        String str6 = str4.substring(2, 4);
        System.out.printf("str6 : %s\n", str6);

        // 문자열이 관리하는 글자 수
        System.out.println(str4.length());

        // 공백제거
        String str7 = "      안녕하세요       ";
        System.out.printf("[%s]\n", str7);
        System.out.printf("[%s]\n", str7.trim());
    }
}