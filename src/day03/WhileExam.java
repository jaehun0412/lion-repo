package day03;

public class WhileExam {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println("안녕" + i);
            }
            i++;
        }

        System.out.println("================");

        i = 1;
        while (true) {
            if (i == 11) {
                break;
            }
            System.out.println(i);
            i++;
        }

        System.out.println("================");

        i = 0;
        while (i++ < 10) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
