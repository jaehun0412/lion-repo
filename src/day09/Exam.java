package day09;

import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int value = keyboard.nextInt();

        System.out.println(value);

        if (value == 0) {
            System.exit(0);
        }

        keyboard.close();

        System.out.println(System.currentTimeMillis());

        System.out.println(System.nanoTime());

        System.out.println(System.getenv("JAVA_HOME"));

        System.out.println("Java 버전: " + System.getProperty("java.version"));
        System.out.println("OS: " + System.getProperty("os.name"));
        System.out.println("사용자 홈: " + System.getProperty("user.home"));
        System.out.println("현재 디렉토리: " + System.getProperty("user.dir"));
    }
}
