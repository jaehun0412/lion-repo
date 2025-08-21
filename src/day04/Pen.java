package day04;

public class Pen {

    // 속성(값, 필드)
    String color;
    int thickness;

    // 생성자 - 클래스에 생성자가 하나도 정의되지 않으면 컴파일러가 자동으로 생성자를 만든다.
    // 생성자를 하나라도 정의하면 컴파일러는 생성자를 만들지 않는다.
    // 객체가 생성될 때 객체를 초기화하는 일을 담당한다.

    public Pen() {
        System.out.println("Pen() 생성자 실행");
    }

    // 행위(기능, 메서드)
    public  void write(String message) {
        System.out.println(message);
    }

    public void m1() {
        System.out.println("할 일만 함.");
    }

    public void m2(int x) {
        System.out.println(x);
    }

    public int m3() {
        return 0;
    }

    public void m4(int x, int y) {
        System.out.println("pen");
    }

    public int m5(int x) {
        System.out.println("할 일 하고");
        return x;
    }
}
