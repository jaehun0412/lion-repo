package day04;

public class ScoreTableExample {

    public static void main(String[] args) {
        String[] students = {"김철수", "이영희", "박민수"};
        String[] subjects = {"국어", "영어", "수학", "과학"};
        int[][] scores = {
                {90, 85, 88, 92},  // 김철수
                {85, 90, 95, 88},  // 이영희
                {78, 82, 85, 90}   // 박민수
        };

        // 성적표
        System.out.println("==== 성적표 ====");
        System.out.print("이름\t");
        for (String subject : subjects) {
            System.out.print(subject + "\t");
        }
        System.out.println("총점\t평균");
        System.out.println("-".repeat(55));

        // 각 학생의 성적 출력
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + "\t");
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + "\t\t");
                sum += scores[i][j];
            }
            double avg = (double) sum / scores[i].length;
            System.out.print(sum + "\t\t" + avg);
            System.out.println();
        }
    }
}
