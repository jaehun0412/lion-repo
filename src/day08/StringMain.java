package day08;

import java.util.Arrays;

public class StringMain {
    public static void main(String[] args) {
        String str = "   Hello Java World   ";

        // 길이와 문자 접근
        System.out.println("길이: " + str.length());
        System.out.println("5번째 문자: " + str.charAt(5));

        // 부분 문자열
        System.out.println(str.substring(0, 12)); // 0번 인덱스부터 12개(0~11)의 인덱스

        // 검색
        System.out.println(str.indexOf("Java"));
        System.out.println(str.contains("Java"));
        System.out.println(str.startsWith("     Hello"));
        System.out.println(str.endsWith("World   "));

        // 반환
        System.out.println(str.toLowerCase()); // 소문자로 변환
        System.out.println(str.toUpperCase()); // 대문자로 변환
        System.out.println(str.trim()); // 앞위 공백 제거
        System.out.println(str.replace("Java", "Python")); // 치환

        // 분할과 결합
        String[] words = str.trim().split(" ");
        System.out.println(Arrays.toString(words));

        String joined = String.join("-", words);
        System.out.println(joined);

        // 형식화
        String formatted = String.format("이름: %s, 나이: %d", "홍길동", 25);
        System.out.println(formatted);
    }
}