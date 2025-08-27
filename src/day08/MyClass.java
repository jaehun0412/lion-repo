package day08;

import java.util.Objects;

public class MyClass {

    String name;
//    int value;


    @Override
    public String toString() {
        return "나는 " + name + "입니다.";
    }

    @Override
    public boolean equals(Object object) {

        if (object == null || getClass() != object.getClass()) return false;
        MyClass myClass = (MyClass) object;
        return Objects.equals(name, myClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public static void main(String[] args) {
        MyClass myClass1 = new MyClass();

        myClass1.name = "Kim";

        System.out.println(myClass1);
        System.out.println(myClass1.toString());

        MyClass myClass2 = new MyClass();
        myClass2.name = "Kim";

        System.out.println(myClass1 == myClass2); // 참조값만 비교하므로 다르다.

        // 객체타입과 필드의 값이 같다면 같다고 비교해주는 것이 equals
        System.out.println("========== equals ==========");
        System.out.println(myClass1.equals(myClass2));

        System.out.println(myClass1.equals(myClass1));
        System.out.println(myClass1.getClass());
    }
}
