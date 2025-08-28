package day09;

import java.util.Scanner;

public class SystemIOExample {
    public static void main(String[] args) {
        // 표준 출력
        System.out.println("일반 메시지");
        System.err.println("에러 메시지"); // 빨간색으로 출력

        // 표준 입력
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();
        System.out.println("안녕하세요, " + name + "님!");
        scanner.close();
    }
}