package day09;

public class WrapperExample {
    public static void main(String[] args) {
        // 박싱 (기본형 -> 객체)
        Integer num1 = new Integer(10); // deprecated
        Integer num2 = Integer.valueOf(20); // 권장

        // 언박싱 (객체 -> 기본형)
        int value = num1.intValue();

        // 자동 박싱/언박싱 (Java 5+)
        Integer num3 = 30; // 자동 박싱
        int value2 = num3; // 자동 언박싱

        // 문자열 변환
        int parsed = Integer.parseInt("123");
        String str = Integer.toString(456);

        // 진법 변환
        System.out.println(Integer.toBinaryString(10)); // "1010" (2진법)
        System.out.println(Integer.toOctalString(10)); // "12" (8진법)
        System.out.println(Integer.toHexString(10)); // "a" (16진법)

        // 다른 진법 파싱
        int binary = Integer.parseInt("1010", 2); // 10
        int octal = Integer.parseInt("12", 8); // 10
        int hex = Integer.parseInt("A", 16); // 10

        // 유용한 상수
        System.out.println("int 최대값: " + Integer.MAX_VALUE);
        System.out.println("int 최소값: " + Integer.MIN_VALUE);
        System.out.println("int 크기: " + Integer.SIZE + "bit");
    }
}