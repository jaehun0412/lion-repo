package day11;

import java.util.Scanner;

public class ExceptionExam6 {

    public static void inputScore(int score) {
        // score는 점수 값을 나타내며, 0~100까지만 입력 받고 싶다.
        if (score < 0 || score > 100) {
            throw new RuntimeException();
        }
        System.out.println("학생의 점수: " + score);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        inputScore(input.nextInt());

        System.out.println("main 종료");
    }
}
