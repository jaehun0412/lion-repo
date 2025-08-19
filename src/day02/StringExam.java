package day02;

public class StringExam {

    public static void main(String[] args) {
        String name = "홍길동";

        int i = 10;

        System.out.println(name.concat(" haha"));
        System.out.println(name + " haha");

        // 형변환
        System.out.println(name + (i + 20));
        System.out.println(name + 20 + 22 + "hi");
    }
}
