package day05;

public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person("김철수", 25);

        person.displayAll();

        // 메서드 체이닝
        person.setAddress("서울").setAge(26).displayAll();

    }
}
