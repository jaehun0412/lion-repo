package day03;

public class ArrayCopyExam1 {

    public static void main(String[] args) {
        int i = 10;
        int copyI = i;

        copyI = 20;

        System.out.println(i);

        int[] iArr = {1, 2, 3};
        int[] copyIArr = new int[iArr.length];

        for (int j = 0; j < copyIArr.length; j++) {
            copyIArr[j] = iArr[j];
        }
        System.out.println("복사된 배열");
        for (int val : copyIArr) {
            System.out.println(val);
        }

        copyIArr[0] = 100;

        System.out.println(iArr[0]);

    }
}
