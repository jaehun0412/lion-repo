package day04;

class VendingMachine {
    // 필드
    String product;
    int price;

    // 메서드
    public String pushProductButton(int menuId) {
        if (menuId == 1) return "콜라";
        else if (menuId == 2) return "사이다";
        else if (menuId == 3) return "환타";
        else return "없는 상품";

    }
}

public class VendingMachineMain {

    // 추상화 - 불필요한 것들은 제거하고 필요한 것만 남기는 과정
    // 어떤 목적으로 사용하느냐에 따라서 달라질 수 있다.
    // 컵 - 물 마시는 용도 / 꽃을 꽂는 용도

    public static void main(String[] args) {
        // 인스턴스 생성
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        // 메서드 호출(메시지 전송)
        String product = vm1.pushProductButton(1);
        System.out.println("선택한 상품: " + product);

        // 자판기를 5개 만들고 싶다면?
        VendingMachine[] machines = new VendingMachine[5];
        for (int i = 0; i < 5; i++) {
            machines[i] = new VendingMachine();
        }
    }
}


