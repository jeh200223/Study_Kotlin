// Set : 관리하는 객체들을 지칭할 수 있는 이름이나 순서가 없다.
// 특정 객체를 지칭하는 것을 불가능하다.
// 중복된 객체를 담을 수 없다.
// 집합에 관련된 연산을 제공한다.

import java.util.ArrayList;
import java.util.HashSet;

public class MainClass {
    public static void main(String[] args) {
        // set 생성
        HashSet<String> set1 = new HashSet<>();
        set1.add("문자열1");
        set1.add("문자열2");
        System.out.printf("set1 : %s\n", set1);

        // 중복된 객체를 저장한다.
        set1.add("문자열2");
        System.out.printf("set1 : %s\n", set1);

        // 객체 제거
        set1.remove("문자열1");
        System.out.printf("set1 : %s\n", set1);

        // 모두 삭제
        set1.clear();
        System.out.printf("set1 : %s\n", set1);

        System.out.println("--------------------------------");

        // set이 관리하는 객체를 사용하는 방법
        HashSet<String> set2 = new HashSet<>();
        set2.add("문자열1");
        set2.add("문자열2");
        set2.add("문자열3");

        // 방법1 : for문을 이용해서 처음부터 끝까지 반복한다.
        // 이때, 객체가 추출된 순서는 예측할 수 없다.
        for(String item : set2){
            System.out.println(item);
        }

        // 방법2 : set을 전달하여 List를 생성하고 List를 사용한다.
        ArrayList<String> list1 = new ArrayList<>();
        list1.addAll(set2);
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>(set2);
        System.out.println(list2);

        System.out.println("---------------------------------");
    }
}