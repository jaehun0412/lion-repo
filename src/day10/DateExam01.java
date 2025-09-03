package day10;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateExam01 {

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        Date birthDay = new Date(2010, 11, 24);
        System.out.println(birthDay);
        // 월이 0부터 11까지 .. 입력할 때는 -1, 출력할 때는 +1

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(birthDay));

        System.out.println(birthDay.getYear());
        System.out.println(birthDay.getMonth() + 1);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(1));
        System.out.println(calendar.get(Calendar.MONTH) + 1);

        calendar.set(Calendar.YEAR, 2020);
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.set(2020, 11, 25);

        System.out.println("======");
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.getActualMaximum(Calendar.DATE));
        System.out.println("========== now ==========");

        Calendar now2 = Calendar.getInstance();
        System.out.println(now2.get(Calendar.DATE));
        System.out.println(now2.getActualMaximum(Calendar.DATE)); // 해당 월의 마지막날
        System.out.println(now2.get(Calendar.DAY_OF_WEEK)); // 요일
    }
}
