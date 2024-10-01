// 맵 : 이름을 통해 객체를 관리하는 요소

import java.util.HashMap;

public class MainClass {
    public static void main(String[] args) {
        // 맵 생성
        HashMap<String, String> map1 = new HashMap<>();
        // 맵에 객체를 추가한다.
        map1.put("str1", "문자열1");
        map1.put("str2", "문자열2");
        System.out.printf("map1 : %s\n", map1);

        // 맵의 이름은 아무 클래스타입이나 상관이 없다.
        HashMap<Integer, Double> map2 = new HashMap<>();
        map2.put(100, 11.11);
        map2.put(200, 22.22);
        System.out.printf("map2 : %s\n", map2);

        // 저장된 객체를 가져온다.
        String str1 = map1.get("str1");
        String str2 = map1.get("str2");
        System.out.printf("str1, str2 : %s, %s\n", str1, str2);

        // 없는 이름으로 가져온다.
        String str100 = map1.get("str100");
        System.out.printf("str100 : %s\n", str100);

        // 수정
        // put 메서드를 사용할 때 이미 있는 이름으로 지정하면
        // 수정된다.
        map1.put("str1", "새로운 문자열");
        System.out.printf("map1 : %s\n", map1);

        // 삭제
        map1.remove("str1");
        System.out.printf("map1 : %s\n", map1);

        // 전체 삭제
        map1.clear();
        System.out.printf("map1 : %s\n", map1);
    }
}
