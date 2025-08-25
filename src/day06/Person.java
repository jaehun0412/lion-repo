package day06;

public class Person {

    // 필드는 private 선언하는 것이 일반적!
    private int age;
    private String name;

    // 필드가 모두 private 하다면 정보를 사용할 때 어떻게 해야할까?

    // 필드에 직접 접근하기 보다는 메서드를 이용하도록 한다.
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("KIM");
    }
}
