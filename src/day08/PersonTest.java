package day08;

public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Kim");
        person.setAge(30);
        person.setAddress("Seoul");

        System.out.println(person);

        Person park = new Person("Park", 25, "Daegu");
        System.out.println(park);
    }
}
