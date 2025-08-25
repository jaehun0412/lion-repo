package day05;

public class Person {

    private String name;
    private int age;
    private String address;

    // this를 사용한 필드 접근

    public Person(String name, int age) {
        this.name = name; // this.name은 필드, name은 매개변수
        this.age = age;
    }

    // 메서드에서 this 사용
    public void introduce() {
        System.out.println("안녕하세요, 저는 " + this.name + "입니다.");
        System.out.println("나이는 " + this.age + "입니다.");
    }

    // this를 반환하는 메서드 (메서드 체이닝)

    public Person setAddress(String address) {
        this.address = address;
        return this; // 현재 객체를 반환
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    // 다른 메서드 호출 시 this 사용 (선택적)
    public void displayAll() {
        this.introduce(); // this 생략 가능
        System.out.println("주소: " + address);
    }
}
