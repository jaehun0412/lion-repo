package day07;

class Parent {
    Parent() {
        System.out.println("Parent 생성자 실행");
    }

    int i = 5;

    public int getI() {
        return i;
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child 생성자 실행");
    }

    int i = 10; // i가 오버라이딩 된 상태

    @Override
    public int getI() {
        return i;
    }

    public void print() {
        System.out.println(i);
    }
}

public class Exam01 {

    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.i);
        System.out.println(parent.getI());

        Child child = new Child();
        System.out.println(child.i);
        System.out.println(child.getI());

        Parent poly = new Child();
        System.out.println(poly.i);
        System.out.println(poly.getI());

        System.out.println("==========");
        test(parent);

        System.out.println("==========");
        test(child);
    }

    public static void test(Parent p) {
        System.out.println(p.i);
        System.out.println(p.getI());

        if (p instanceof Child) {
            ((Child) p).print();
        }
    }
}
