package day03;

public class ArrayExceptionExample {

    public static void main(String[] args) {
        int[] arr = new int[3];

        try {
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;
            arr[3] = 40;

        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }
}
