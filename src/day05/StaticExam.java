package day05;

public class StaticExam {

    int i;
    static int si;

    public void method() {
        System.out.println(i);
        System.out.println(si);
    }

    public void method2() {
        method();
        staticMethod();
        staticMethod2();
    }

    public static void staticMethod() {
        // static한 메서드는 static한 필드만 접근 가능
//        System.out.println(i); // 컴파일 오류
        System.out.println(si);
    }

    public static void staticMethod2() {
        staticMethod();
//        method(); // 컴파일 오류
    }

    public static void main(String[] args) {
        System.out.println(si);
        staticMethod();

        // 인스턴스 필드, 인스턴스 메서드는 객체가 반드시 인스턴스화 된 후에 사용할 수 있다.
//        System.out.println(i);
//        method();
    }
}
