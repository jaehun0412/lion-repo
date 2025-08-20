package day03;

import java.util.Arrays;

public class ArrayCopyExample {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // for문
        int[] copy1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy1[i] = arr[i];
        }

        // System.arraycopy()
        int[] copy2 = new int[arr.length];
        System.arraycopy(arr, 0, copy2, 0, arr.length);

        // Arrays.copyOf()
        int[] copy3 = Arrays.copyOf(arr, arr.length);

        // Arrays.copyOfRange()
        int[] copy4 = Arrays.copyOfRange(arr, 1, 4);

        System.out.println("arr = " + arr);
        System.out.println("copy1 = " + copy1);
        System.out.println("copy2 = " + copy2);
        System.out.println("copy3 = " + copy3);
        System.out.println("copy4 = " + copy4);
    }
}
