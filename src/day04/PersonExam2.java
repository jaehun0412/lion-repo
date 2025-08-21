package day04;

public class PersonExam2 {

    public static void main(String[] args) {
        Person person = new Person();

        person.name = "Kim";
        person.age = 20;
        person.address = "Korea";
//        person.phoneNumber = ""; // private 하므로 접근 불가

        person.printPhoneNumber();
    }
}
