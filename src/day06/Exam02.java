package day06;

class Parent2 {
    int i = 10;

    public int getI() {
        return i;
    }
}

class Child2 extends Parent2 {
    // 부모가 가진 것을 자식이 똑같이 다시 정의한 것 (오버라이딩)
    int i = 20;
    int x = 40;

    @Override
    public int getI() {
        return i;
    }

    public void print() {
        System.out.println(i);
    }
}

public class Exam02 {

    public static void main(String[] args) {
        // 1. 부모(조상)는 자식(자손)을 가리킬 수 있다.
        Parent2 p = new Child2();
//        Child2 c = new Parent2(); // 오류 발생
        Object obj1 = new Parent2();
        Object obj2 = new Child2();

        // 2. 필드는 타입을 따른다.
        Parent2 pp = new Parent2();
        System.out.println(pp.i);
        Child2 cc = new Child2();
        System.out.println(cc.i);
        Parent2 pc = new Child2();
        System.out.println(pc.i);

        // 3. 메서드는 오버라이드되면 무조건!! 자식의 것이 사용된다.
        System.out.println(pc.getI());

    }
}
