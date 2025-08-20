package day03;

public class ArrayTraversalExample {

    public static void main(String[] args) {
        int[] scores = {95, 87, 66, 73, 82};

        // TODO 배열의 모든 요소 출력
        for (int score : scores) {
            System.out.print(score + "\t");
        }
        System.out.println();

        // TODO 총점, 평균 구하기
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double avg = (double) sum / scores.length;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);

        // TODO 최대값 찾기
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        System.out.println("max = " + max);
    }
}

