package day04;

public class Practice1 {

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1);
        }

        for (int val : arr) {
            if (val % 2 == 0) {
                System.out.print(val + "\t");
            }
        }
    }
}
