package day03;

public class ArrayExam1 {

    public static void main(String[] args) {
        String name1 = "김철수";
        String name2 = "박영미";
        String name3 = "홍길동";

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        // 선언
        int[] intArr1;
        int intArr2[];
        int[][] intArr3;
        int[] intArr4[];

        // 배열의 생성
        intArr1 = new int[3];

        int[] intArr = new int[5];

        // index를 사용해서 배열의 요소에 접근
        intArr1[0] = 10;

        System.out.println(intArr1[0]);
        System.out.println(intArr1[1]);
        System.out.println(intArr1[2]);
        int x = intArr1[0];

        System.out.println(x);
        System.out.println("intArr1.length = " + intArr1.length);

        for (int i = 0; i < intArr1.length; i++) {
            System.out.println(intArr1[i]);
        }

        System.out.println("====== foreach ======");
        for (int val : intArr1) {
            System.out.println(val);
        }

        String[] strArr = new String[3];
        strArr[0] = "A";
        strArr[1] = "B";
        strArr[2] = "C";
        for (String str : strArr) {
            System.out.println(str);
        }
    }
}
