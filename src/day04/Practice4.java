package day04;

public class Practice4 {

    public static void main(String[] args) {
        int[][] gugudan = new int[8][9];

        for (int row = 0; row < gugudan.length; row++) {
            for (int column = 0; column < gugudan[row].length; column++) {
                gugudan[row][column] = (row + 2) * (column + 1);
            }
        }

        for (int row = 0; row < gugudan.length; row++) {
            for (int column = 0; column < gugudan[row].length; column++) {
                System.out.print((row+2) + " * " + (column + 1) + " = " + gugudan[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
