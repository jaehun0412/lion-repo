package day11;

import java.io.FileReader;

public class ExceptionExam5 {

    public static void 심부름() {
        int i = 0;

        try {
            System.out.println(10 / i);
        } catch (Exception e) {
            System.out.println("다른 마트로 이동");
        }
    }

    public static void 심부름2() throws Exception {
        int i = 0;
        System.out.println(10 / i);
    }

    public static void main(String[] args) throws Exception {
        심부름();

        try {
            심부름2();
        } catch (Exception e) {
            System.out.println("동생한테 시킴");
        }

        String str = null;
        str.charAt(0);
        FileReader fr = new FileReader("a");
        심부름2();

    }
}
