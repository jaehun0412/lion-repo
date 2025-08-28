package day09;

import java.util.*;

public class PersonDemo {

    public static void main(String[] args) {
        // Person 객체 5개
        Person person1 = new Person("Kim", "1", "Seoul", "010-1234-5678");
        Person person2 = new Person("Park", "2", "Daegu", "010-9876-5432");
        Person person3 = new Person("Lee", "3", "Busan", "010-5566-7788");
        Person person4 = new Person("Hong", "4", "Daejeon", "010-2233-4455");
        Person person5 = new Person("Kang", "5", "Jeonju", "010-9988-8877");

        // List에 Person 객체 담기
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        // Set에 Person 객체 담기
        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);

        // Map에 Person 객체 담기
        Map<String, Person> personMap = new HashMap<>();
        personMap.put(person1.getIdNumber(), person1);
        personMap.put(person2.getIdNumber(), person2);
        personMap.put(person3.getIdNumber(), person3);
        personMap.put(person4.getIdNumber(), person4);
        personMap.put(person5.getIdNumber(), person5);

        // 특정 idNumber에 해당하는 Person 객체 찾기
        // List
        for (Person person : personList) {
            if (person != null && person.getIdNumber().equals("1")) {
                System.out.println("findPerson id1: " + person);
            }
        }
        // Set
        for (Person person : personSet) {
            if (person != null && person.getIdNumber().equals("2")) {
                System.out.println("findPerson id2: " + person);
            }
        }
        // Map
        Person findPerson = personMap.get("3");
        System.out.println("findPerson id3: " + findPerson);
    }
}
