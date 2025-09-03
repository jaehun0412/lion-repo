package day11;

public class ExceptionExam3 {

    public static void methodA(int[] arr) {
        try {
            System.out.println(arr[5]);
        } /*catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }*/ catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        methodA(arr);

        int[] arr2 = null;
        methodA(arr2);

        System.out.println("메서드 실행 후 처리");

    }
}
