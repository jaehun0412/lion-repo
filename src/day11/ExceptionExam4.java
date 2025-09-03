package day11;

public class ExceptionExam4 {

    public static void main(String[] args) {
        // 예외가 발생하지 않으면 catch 블럭은 실행되지 않는다.
        // 예외가 발생했을 때 반드시 실행되어야 할 작업은 finally 사용
        System.out.println("프로그램 시작!!");

        String str = null;
        try {
            System.out.println(str.charAt(0));
            int i = Integer.parseInt(args[0]);
            System.out.println(10 / i); // try 블럭에서 예외가 발생하면, 발생한 이후 나머지 작업은 수행되지 않음
            System.out.println("try 블럭 내부 다음 작업");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException catch");
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException catch");
            System.out.println(e);
        } finally {
            System.out.println("finally 실행!!");
        }

        System.out.println("반드시 실행");
        System.out.println("프로그램 종료!!");
    }
}
