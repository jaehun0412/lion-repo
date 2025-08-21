package day04;

public class PersonExam {

    public static void main(String[] args) {

        // static 필드는 인스턴스화 하지 않고 사용 가능하다.
        Person.count++;

        System.out.println(Person.MAX_AGE);
        System.out.println(Person.count);

        Person person1 = new Person();
        person1.name = "Kim";

        Person person2 = new Person();
        person2.name = "Park";

        person1.count++;
        System.out.println(person1.count);

        System.out.println(person2.count);
        System.out.println(person1.name);
        System.out.println(person2.name);
    }
}
