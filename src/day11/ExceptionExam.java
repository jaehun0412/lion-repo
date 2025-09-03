package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExam {

    public static void main(String[] args) {

        while (true) {

            try {
                Scanner sc = new Scanner(System.in);

                System.out.print("점수를 입력하세요: ");
                int score = sc.nextInt();

                if (score < 0 || score > 100) {
                    throw new IllegalArgumentException("점수는 0~100 사이만 입력 가능합니다.");
                }

                System.out.println("입력 성공: " + score);
                return;
            } catch (InputMismatchException e) {
                System.out.println("점수는 숫자만 입력 가능합니다.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
