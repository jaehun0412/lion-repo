package day11;

public class ExceptionExam7 {
    public static void main(String[] args) {
        try {
            ExceptionObj7 exobj = new ExceptionObj7();
            int value = exobj.divide(10, 0);
            System.out.println(value);
        } catch (MyException e) {
            System.out.println("사용자 정의 Exception이 발생했네요.");
            System.out.println("오류 메시지: " + e.getMessage());
        }
    }
}

class ExceptionObj7 {
    public int divide(int i, int j) throws MyException {
        int value = 0;
        try {
            value = i / j;
        } catch (ArithmeticException ae) {
			throw new MyException("0으로 나눌 수 없습니다.");
        }
        return value;
    }
}

class MyException extends RuntimeException {
    public MyException(String msg) {
        super(msg);
    }

    public MyException(Exception e) {
        super(e);
    }
}