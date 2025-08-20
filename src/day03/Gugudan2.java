package day03;

import java.util.Scanner;

public class Gugudan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("중단하고 싶은 단을 입력하세요: ");
        int dan = sc.nextInt();

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (dan == i) {
                    break;
                }
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }

        System.out.println("====================");

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (dan == j) {
                    break;
                }
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }

        System.out.println("====================");

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (dan == i) {
                    continue;
                }
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }

        System.out.println("====================");

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (dan == j) {
                    continue;
                }
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
