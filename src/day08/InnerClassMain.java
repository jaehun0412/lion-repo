package day08;

public class InnerClassMain {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        // 내부 클래스
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        // 정적 중첩 클래스
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.display();

        // 지역 클래스
        outer.methodWithLocalClass();

        // 익명 클래스
        outer.createAnonymousClass();
    }
}
