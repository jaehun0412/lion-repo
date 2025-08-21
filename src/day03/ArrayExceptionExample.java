package day03;

public class ArrayExceptionExample {

    public static void main(String[] args) {
        int[] arr = new int[3];

        // 배열은 인덱스를 벗어나서 접근할 수 없다.
        try {
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;
            arr[3] = 40;

        } catch (ArrayIndexOutOfBoundsException e) {
            // 예외처리하는 부분
            System.out.println("배열 인덱스 범위 초과");
        }

        System.out.println("다음 실행해야 하는 문장");
    }
}
