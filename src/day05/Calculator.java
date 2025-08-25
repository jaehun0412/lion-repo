package day05;

public class Calculator {

    public int plus(int a, int b) {
        return a + b;
    }

    public int plus(int a, int b, String name) {
        return a + b;
    }

    public int plus(int a, int b, int c) {
        return a + b + c;
    }

    public void plus(String str, int a) {
    }

    public void plus(int a, String str) {
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.plus(10, 20);
        cal.plus("test", 30);

        System.out.println(10);
        System.out.println('c');

        System.out.println("test");
    }

}
