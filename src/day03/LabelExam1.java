package day03;

public class LabelExam1 {

    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0 && j == 2) {
                    break outer; // 바깥쪽 반복문까지 종료
                }
                System.out.println(i + ", " + j);
            }
        }
    }
}
