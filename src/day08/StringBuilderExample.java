package day08;

public class StringBuilderExample {
    public static void main(String[] args) {
        // StringBuilder 사용
        StringBuilder sb = new StringBuilder("Hello");

        // 문자열 추가
        sb.append(" World");
        sb.append(" Java").append(" Programming"); // 메서드 체이닝
        System.out.println(sb); // Hello World Java Programming

        // 삽입
        sb.insert(6, "Beautiful ");
        System.out.println(sb); // Hello Beautiful World Java Programming

        // 삭제
        sb.delete(6, 16); // 6번째 인덱스부터 16번째 전 인덱스(15)까지
        System.out.println(sb); // Hello World Java Programming

        // 역순
        sb.reverse();
        System.out.println(sb);

        // 성능 비교
        long start = System.currentTimeMillis();

        // String 연결 (비효율적)
        String str1 = "";
        for (int i = 0; i < 10000; i++) {
            str1 += i;
        }

        long end = System.currentTimeMillis();
        System.out.println("String: " + (end - start) + "ms");

        // StringBuilder (효율적)
        start = System.currentTimeMillis();

        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            str2.append(i);
        }

        end = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (end - start) + "ms");
    }
}
