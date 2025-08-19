package day02;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요(1 ~ 7): ");
        int dayNumber = sc.nextInt();
        String dayName;

        switch (dayNumber) {
            case 1:
                dayName = "월요일";
                break;
            case 2:
                dayName = "화요일";
                break;
            case 3:
                dayName = "수요일";
                break;
            case 4:
                dayName = "목요일";
                break;
            case 5:
                dayName = "금요일";
                break;
            case 6:
                dayName = "토요일";
                break;
            case 7:
                dayName = "일요일";
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                return;
        }

        System.out.println("dayNumber = " + dayName);
    }
}
