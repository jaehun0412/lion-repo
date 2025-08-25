package day05;

public class MethodTest {

    public String methodTest() {
        return "hello";
    }

    public static void main(String[] args) {
        MethodTest m = new MethodTest();
        m.methodTest();

        System.out.println(m.methodTest().concat(" test").toUpperCase());

    }
}
