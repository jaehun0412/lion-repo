package day10;

import java.util.*;

public class Exam10 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);
        Collections.shuffle(numbers);
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("kang", 30));
        persons.add(new Person("kim", 20));
        persons.add(new Person("hong", 25));
        persons.add(new Person("lee", 37));
        persons.add(new Person("park", 22));

        System.out.println(persons);

        Collections.sort(persons);
        System.out.println(persons);

        // PersonComparator - Person의 정렬 기준을 가진 객체
        Collections.sort(persons, new PersonComparator());

        Comparator<Person> personCom = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Collections.sort(persons, personCom);

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        // 람다식
        // 자바는 매개변수에 객체가 아닌 것이 들어올 수 없다.
        Collections.sort(persons, (o1, o2) -> o1.getAge() - o2.getAge());

        System.out.println("나이 기준");
        System.out.println(persons);

        System.out.println("이름기준");
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(persons);

        System.out.println("kang".compareTo("kim"));

    }
}
