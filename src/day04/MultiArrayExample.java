package day04;

import java.util.Arrays;

public class MultiArrayExample {

    public static void main(String[] args) {
        // 선언 - [][] 몇 개냐가 차원을 결정
        int[][] intArr;
        intArr = new int[3][2];

        intArr[0][0] = 100;
        intArr[0][1] = 200;
        intArr[1][0] = 300;

        int[][] intArr2 = new int[2][];
        intArr2[0] = new int[2];
        intArr2[0][0] = 10;
        intArr2[1] = new int[10];
        intArr2[1][0] = 20;

        System.out.println(intArr2[0][0]);
        int[][][][] intArr4 = new int[2][][][];

        int[] arr5 = {1, 2, 3};


        int[][] matrix = new int[3][3];

        int arr = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = ++arr;
            }
        }

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print("value = " + column + "\t");
            }
            System.out.println();
        }

        int[][] scores = {
                {60, 70, 80},
                {70, 80, 90},
                {80, 90, 100}
        };

        // 2차원 배열 순회
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }

        // 향상된 for문으로 출력
        for (int[] row : scores) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        // 가변 길이 2차원 배열
        int[][] jagged = new int[3][];
        jagged[0] = new int[]{1, 2};
        jagged[1] = new int[]{3, 4, 5};
        jagged[2] = new int[]{6, 7, 8, 9};

        for (int[] row : jagged) {
            System.out.println(Arrays.toString(row));
        }

    }
}
