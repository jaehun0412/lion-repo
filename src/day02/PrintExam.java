package day02;

public class PrintExam {

    public static void main(String[] args) {
        String name = "홍길동";
        int age = 20;
        double height = 175.5;
        char grade = 'A';

        System.out.printf("이름: %s\n", name);
        System.out.printf("나이: %d세\n", age);
        System.out.printf("키: %.1f\n", height);
        System.out.printf("학점: %c\n", grade);

        System.out.println();

        System.out.println("나의 이름은 " + name + "이고, 나이는 " + age + "입니다.");
        System.out.printf("나의 이름은 %s이고, 나이는 %d입니다.\n", name, age);

        boolean flag = false;
        System.out.printf("테스트 결과는 %b입니다.", flag);
    }
}
