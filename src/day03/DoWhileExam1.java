package day03;

public class DoWhileExam1 {

    /*
    do {
        // 무조건 해당 블럭을 한 번은 실행
    } while (탈출 조건식)
     */
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}
