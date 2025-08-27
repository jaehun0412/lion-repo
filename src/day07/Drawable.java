package day07;

// 추상클래스는 클래스이다. 미완성 메서드를 가질 수 있는 클래스
// 인터페이스는 껍데기만 갖는다. 구현체가 없는 것이 기본이다.
public interface Drawable {

    void draw(); // 추상메서드 (구현부가 없다.)

    void erase();

    // Java 8+
    default void defaultTest() {
        System.out.println("필요하면 자식클래스가 오버라이드해서 사용");
    }

    // Java 8+
    static void showInfo() {
        System.out.println("독립적인 기능 구현");
    }
}
