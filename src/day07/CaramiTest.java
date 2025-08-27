package day07;

public class CaramiTest {

    public static void main(String[] args) {
        Carami carami = new Carami();
        // 모든 클래스의 레퍼런스 변수를 이용해서 사용할 수 있는 우리가 만들지 않는 메서드들
        // Object가 가지고 있는 메서드들
        carami.setName("강경미");
        System.out.println(carami.toString());
        System.out.println(carami);

        String str = "hello";

        System.out.println(str.toString());
        System.out.println(str);
    }
}
