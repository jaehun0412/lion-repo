package day04;

public class Exam {

    public static void main(String[] args) {

//        인스턴스화 - 클래스(설계도를 이용해서) 를 객체 (물건) 로 만들어 내는 것
//        new - 인스턴스화 할 수 있는 예약어

        new Pen(); // 변수 없이 Pen이 생성되면 나중에 사용할 수 없다.

//        Pen을 담을 변수가 필요하다.
        Pen pen = new Pen();
        pen.write("안녕!");

        pen.m4(10,20);

    }


}
