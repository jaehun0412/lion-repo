package day04;

public class VarArgsExample {
    // 객체 - 속성(값, 필드), 행위(기능, 메서드)
    // 접근제한자 리턴타입 메서드명(매개변수들...)

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    // 가변 길이 매개변수를 받는 메서드
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    // 일반 매개변수와 가변 길이 매개변수를 함께 사용
    public static void printInfo(String name, int... scores) {
        System.out.println(name + "의 점수: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println("(총 " + scores.length + "과목)");
    }

    // main - 프로그램의 시작점
    public static void main(String[] args) {
        System.out.println("sum(1, 2) = " + sum(1, 2));
        System.out.println("sum(1,2,3) = " + sum(1, 2, 3));
        System.out.println("sum(1,2,3,4,5) = " + sum(1, 2, 3, 4, 5));
        System.out.println("sum() = " + sum());

        int[] arr = {10, 20, 30};
        System.out.println("sum(arr) = " + sum(arr));

        printInfo("철수", 90, 85, 88);
        printInfo("영희", 95, 92);
    }
}
