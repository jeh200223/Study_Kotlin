// Date : 컴퓨터 입장에서의 시간 관리 객체
// Calendar : 사람 입장에서의 시간 관리 객체
// Calendar는 내부적으로 Date 객체를 가지고 시간을 관리한다.
// 사람이 시간값을 가져올 수 있도록 메서드를 제공하고 있다.

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        // 현재 시간값을 가지고 있는 Date 객체를 생성한다.
        Date date1 = new Date();
        System.out.printf("현재시간 : %s\n", date1);

        // 특정 시간을 지정할 수 있다.
        Date date2 = new Date(1125034805687L);
        System.out.printf("지정한 시간 : %s\n", date2);

        // 0을 지정한다.
        Date date3 = new Date(0L);
        System.out.printf("0L : %s\n", date3);

        // 최대 시간
        Date date4 = new Date(Long.MAX_VALUE);
        // 최소 시간
        Date date5 = new Date(Long.MIN_VALUE);
        System.out.printf("최대시간 : %s\n", date4);
        System.out.printf("최소시간 : %s\n", date5);

        // 현재 시간값을 가지고 있는 Calendar 객체를 가져온다.
        Calendar calendar1 = Calendar.getInstance();
        System.out.printf("calendar1 : %s\n", calendar1);

        // Calendar에 Date 객체를 지정하여 시간을 설정한다.
        calendar1.setTime(new Date(0L));
        System.out.printf("calendar1 : %s\n", calendar1);

        Calendar calendar2 = Calendar.getInstance();

        Integer year = calendar2.get(Calendar.YEAR);
        // 월은 0부터 시작하기 때문에 1을 더해준다.
        Integer month = calendar2.get(Calendar.MONTH) + 1;
        Integer day = calendar2.get(Calendar.DATE);
        Integer hour = calendar2.get(Calendar.HOUR);
        Integer minute = calendar2.get(Calendar.MINUTE);
        Integer second = calendar2.get(Calendar.SECOND);

        System.out.printf("%d년 %d월 %d일, %d시 %d분 %d초\n", year,
                month, day, hour, minute, second);

        calendar2.set(Calendar.YEAR, 3000);
        // 월은 1을 빼줘야 한다.
        calendar2.set(Calendar.MONTH, Calendar.MAY);

        year = calendar2.get(Calendar.YEAR);
        month = calendar2.get(Calendar.MONTH) + 1;

        System.out.printf("%d년 %d월 %d일, %d시 %d분 %d초\n", year,
                month, day, hour, minute, second);

        // 양식을 정해 날짜값을 문자열로 만들어준다.
        // https://yunamom.tistory.com/200
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String str100 = simpleDateFormat.format(new Date());
        System.out.printf("str100 : %s\n", str100);
    }
}
