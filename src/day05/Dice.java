package day05;

import java.util.Random;

public class Dice {

    int face = 6;
    int eye;

    // 기능 - 던지기, 굴리기
    public void roll() {
        // 주사위의 면에 따라 랜덤한 값을 하나 발생
//        Random random = new Random();

        // Math.random()은 0.0 ~ 1.0 사이의 값이 리턴된다. 1.0은 포함되지 않는다.
        eye = (int) (Math.random() * face) + 1;
    }

    public static void main(String[] args) {
        // Math.random() * 6은 0~5까지 출력된다. 1~6까지를 원한다면 +1을 해주어야 한다.
        System.out.println((int) (Math.random() * 6) + 1);
    }
}
