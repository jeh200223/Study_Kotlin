// 컬렉션 : 다수의 객체를 관리하기 위해 제공되는 자료구조 관련 클래스들

// List : 0부터 1씩 증가하는 숫자값으로 객체들을 관리한다.
// 배열과 다르게 관리할 객체의 개수를 정하지 않고 객체를 추가, 수정, 삭제등이 가능하다.

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        // ArrayList
        ArrayList list1 = new ArrayList();
        list1.add("문자열1");
        list1.add("문자열2");
        // 추가한 객체를 가져온다.
        // 제네릭을 설정하지 않으면 Object 타입이기 때문에
        // 형변환을 해줘야 한다.
        String str1 = (String) list1.get(0);
        String str2 = (String) list1.get(1);
        System.out.printf("%s, %s\n", str1, str2);

        // 제네릭을 설정하여 생성한다.
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("문자열1");
        list2.add("문자열2");

        String str3 = list2.get(0);
        String str4 = list2.get(1);
        System.out.printf("%s, %s\n", str3, str4);

        System.out.println("---------------------------");

        // ArrayList 객체생성
        ArrayList<String> list3 = new ArrayList<>();
        // 객체 추가
        // 뒤에 추가
        list3.add("문자열1");
        list3.add("문자열2");

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("문자열3");
        list4.add("문자열4");
        list3.addAll(list4);

        System.out.printf("list3 : %s\n", list3);

        // 제일 뒤에 추가(add와 동일)
        list3.addLast("문자열5");

        // 제일 앞에 추가
        list3.addFirst("문자열0");
        System.out.printf("list3 : %s\n", list3);

        // 삽입
        // add, addall 메서드를 사용할 때 첫 번째 매개변수에 위치를 지정한다.
        list3.add(1, "새로운 문자열");
        System.out.printf("list3 : %s\n", list3);

        ArrayList<String> list5 = new ArrayList<>();
        list5.add("새로운 문자열2");
        list5.add("새로운 문자열3");
        list3.addAll(3, list5);
        System.out.printf("list3 : %s\n", list3);

        // 수정
        list3.set(3, "수정된 문자열");
        System.out.printf("list3 : %s\n", list3);

        // 삭제
        list3.remove(1);
        System.out.printf("list3 : %s\n", list3);

        list3.remove("수정된 문자열");
        System.out.printf("list3 : %s\n", list3);

        // 모두 삭제
        list3.clear();
        System.out.printf("list3 : %s\n", list3);

        list3.add("문자열1");
        list3.add("문자열2");
        list3.add("문자열3");
        list3.add("문자열4");
        list3.add("문자열5");

        // List가 관리하는 객체의 개수
        System.out.printf("리스트가 관리하는 객체의 수 : %d\n", list3.size());

        // for문을 이용해 객체를 하나씩 가져와서 사용한다.
        for(int i = 0 ; i < list3.size() ; i++){
            System.out.printf("%d 번째 객체 : %s\n", i, list3.get(i));
        }

        // 몇번쩨 인지를 알필요가 없을 경우
        for(String item : list3){
            System.out.println(item);
        }
    }
}
