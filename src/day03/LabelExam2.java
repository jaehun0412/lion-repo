package day03;

public class LabelExam2 {

    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0 && j == 2) {
                    continue outer; // 바깥쪽 반복문의 다음 반복으로
                }
                System.out.println(i + ", " + j);
            }
        }
    }
}
