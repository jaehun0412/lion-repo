package day07;

public class PhotoTest {

    public static void main(String[] args) {
        // 추상메서드와 마찬가지로 인스턴스도 타입으로 사용이 가능하다.

        Drawable d = new Photo("a.png", 200, 500);

        d.draw();
        d.erase();

    }
}
