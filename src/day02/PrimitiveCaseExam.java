package day02;

public class PrimitiveCaseExam {

    public static void main(String[] args) {
        // 형변환 - 관련 있는 것들끼리만 변환할 수 있다.
        // 기본 - 숫자, boolean

        byte b = 10;
        int i = b;

        b = (byte) i; // 명시적 형변환

        byte b2 = (byte) 128;
        System.out.println(b2);
    }
}
