package day08;

public class EnumTest {

    public static void main(String[] args) {
        // 요일 값을 저장하고 싶다
        String day;
        day = "MONDAY";

        // 나는 요일값만 저장하고 싶은데...
        day = "test";
        day = "play";

        Day today = Day.TUESDAY;
        // 열거형 타입을 선언하여서 잘못된 값이 들어가지 않는다.

        OrderStatus status = OrderStatus.CANCELLED;
        System.out.println(status.getDescription());

        for (OrderStatus value : OrderStatus.values()) {
            System.out.println(value.name() + ": " + value.getDescription());
        }
    }
}
