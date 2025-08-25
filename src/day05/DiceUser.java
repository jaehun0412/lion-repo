package day05;

public class DiceUser {

    public static void countNum(Dice dice, int rollTimes, int eye) {
        int totalCount = 0;
        for (int i = 0; i < rollTimes; i++) {
            dice.roll();

            if (dice.eye == eye) {
                totalCount++;
            }
        }
        System.out.printf("주사위를 %d번 굴려 %d 나온 횟수: %d\n", rollTimes, eye, totalCount);
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        dice.roll(); // 주사위 굴리기
        System.out.println("주사위를 굴려서 나온 눈: " + dice.eye);

        // 주사위를 10번 굴려서 3이 나오는 횟수
        int totalCount = 0;
        for (int i = 0; i < 10; i++) {
            dice.roll();

            if (dice.eye == 3) {
                totalCount++;
            }
        }
        System.out.println("주사위를 10번 굴려서 3이 나온 횟수: " + totalCount);

        // 주사위를 100번 굴려서 5가 나오는 횟수
        totalCount = 0;
        for (int i = 0; i < 100; i++) {
            dice.roll();

            if (dice.eye == 5) {
                totalCount++;
            }
        }
        System.out.println("주사위를 100번 굴려서 5가 나온 횟수: " + totalCount);

        DiceUser.countNum(dice, 100, 2);
        DiceUser.countNum(dice, 200, 6);
    }
}
