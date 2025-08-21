package day04;

public class Practice2 {

    public static void main(String[] args) {
        int[] numbers = {23, 56, 12, 89, 34, 67, 45, 78, 90, 11};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
