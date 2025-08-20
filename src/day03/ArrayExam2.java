package day03;

public class ArrayExam2 {

    public static void main(String[] args) {
        int[] intArr1 = new int[5];
        for (int val : intArr1) {
            System.out.println(val);
        }

        int[] intArr2 = {10, 20, 30, 40, 50};
        for (int val : intArr2) {
            System.out.println(val);
        }

        int[] intArr3 = new int[100];
        for (int i = 0; i < intArr3.length; i++) {
            intArr3[i] = (i + 1);
        }
        for (int val : intArr3) {
            System.out.printf("val = %3d\t", val);
            if (val % 10 == 0) {
                System.out.println();
            }
        }
    }
}
