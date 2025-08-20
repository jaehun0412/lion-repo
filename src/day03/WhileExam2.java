package day03;

public class WhileExam2 {

    /**
     * 전위증감식과 후위증감식 비교
     */
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 10) {
            System.out.println(i);
        }

        System.out.println("==========");

        i = 0;
        while (++i < 10) {
            System.out.println(i);
        }
    }
}
