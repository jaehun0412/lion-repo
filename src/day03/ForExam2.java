package day03;

public class ForExam2 {

    public static void main(String[] args) {
        // 1~100까지 짝수의 합 (for문 이용)
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
