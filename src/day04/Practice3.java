package day04;

import java.util.Arrays;

public class Practice3 {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7};
        int[] reversed = new int[original.length];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = original[original.length - (i + 1)];
        }

        System.out.println("original = " + Arrays.toString(original));
        System.out.println("reversed = " + Arrays.toString(reversed));
    }
}
