package day06;

class Parent1 {
    int i = 10;
    int j = 20;
}

class Child1 extends Parent1 {

}

public class Exam01 {

    public static void main(String[] args) {
        Parent1 p = new Parent1();
        System.out.println(p.i);
        Child1 c = new Child1();
        System.out.println(c.i);
        System.out.println(c.j);
    }
}
