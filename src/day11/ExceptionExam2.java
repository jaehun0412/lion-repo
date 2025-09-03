package day11;

public class ExceptionExam2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int value = 0;

        try {
            value = arr[4];
            System.out.println(value);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(value);
        System.out.println("해야할 일1");
        System.out.println("해야할 일2");
        System.out.println("해야할 일3");
        System.out.println("종료");

    }
}
