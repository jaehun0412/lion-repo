package day08;

import java.util.ArrayList;
import java.util.List;

// final 변수 - 값 변경 불가
public class FinalExample {

    private final int MAX_SIZE = 100; // 선언과 동시에 초기화
    private final String name;
    private final List<String> items; // 참조는 불변, 내용은 변경 가능

    public FinalExample(String name) {
        this.name = name; // 생성자에서 초기화
        items = new ArrayList<>();
    }

    // final 메서드 - 오버라이딩 불가
    public final void display() {
        System.out.println("name = " + name);
    }

    public void addItem(String item) {
        items.add(item); // 내용 변경 가능
//        items = new ArrayList<>(); // 참조 변경 불가능
    }

    public static void main(String[] args) {
        FinalExample finalExample = new FinalExample("Kim");

//        finalExample.MAX_SIZE = 200; // 상수
    }
}
