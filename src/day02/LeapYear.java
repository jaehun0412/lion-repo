package day02;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = sc.nextInt();

        String leapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "윤년" : "평년";

        System.out.println(year + "년은 " + leapYear + "입니다.");
    }
}
