package day03;

public class LabelBreakExample {

    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 2) {
                    break outer;
                }
                System.out.println(i + ", " + j);
            }
        }
    }
}
