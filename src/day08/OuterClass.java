package day08;

public class OuterClass {
    private int outerField = 10;
    private static int staticField = 20;

    // 1. 내부 클래스
    public class InnerClass {
        public void display() {
            System.out.println("outerField = " + outerField);
            System.out.println("staticField = " + staticField);
        }
    }

    // 2. 정적 중첩 클래스
    public static class StaticNestedClass {
        public void display() {
            // System.out.println("outerField = " + outerField); // non-static 필드 접근 불가
            System.out.println("staticField = " + staticField); // static 필드만 접근 가능
        }
    }

    // 3. 지역 클래스
    public void methodWithLocalClass() {
        final int localVal = 5;

        class LocalClass {
            public void display() {
                System.out.println("outerField = " + outerField);
                System.out.println("staticField = " + staticField);
                System.out.println("localVal = " + localVal); // final 혹은 사실상 final만 접근 가능
            }
        }
    }

    // 4. 익명 클래스
    public void createAnonymousClass() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 클래스");
            }
        };

        // Java 8+ 람다 표현식
        Runnable lambdaRunnable = () -> System.out.println("람다 실행");
    }
}