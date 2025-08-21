package day04;

public class Person {

    public String name; // 전체 공개
    int age; // 패키지 .. 같은 패키지에서만 공개
    protected String address; // 같은 패키지와 상속 관계에 있다면
    private String phoneNumber; // 비공개 객체 내에서 사용 가능

    static int count = 0;

    static final int MAX_AGE = 150;

    public void printPhoneNumber() {
        System.out.println(phoneNumber);
    }
}
