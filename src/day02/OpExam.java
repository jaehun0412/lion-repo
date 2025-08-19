package day02;

public class OpExam {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a / b);
        System.out.println(a % b); // 나눈 나머지 값

        boolean ba = true, bb = true;

        // and && 두 조건이 모두 참일때만 참!
        System.out.println(ba && bb);
        System.out.println(ba || bb);
        System.out.println(!ba);
        System.out.println(ba ^ bb);

        System.out.println("===== 단락평가 =====");

        int c = 3, d = 8;

        System.out.println((a < b++) & (c < d++));

        System.out.println(b);
        System.out.println(d);
        System.out.println("증감연산자");
        a++; // a = a + 1;

        int incrI = 10;
        System.out.println(++incrI);
        System.out.println(incrI);
    }
}
