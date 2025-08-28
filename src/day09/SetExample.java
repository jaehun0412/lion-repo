package day09;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        // HashSet 생성
        Set<String> fruitSet = new HashSet<>();

        // 요소 추가
        fruitSet.add("사과");
        fruitSet.add("바나나");
        fruitSet.add("키위");
        fruitSet.add("바나나"); // 중복 요소 추가 시도

        // 요소 출력
        System.out.println("과일 집합: " + fruitSet);

        // 특정 요소 포함 여부 확인
        if (fruitSet.contains("키위")) {
            System.out.println("키위가 있습니다.");
        }

        // 요소 제거
        fruitSet.remove("바나나");
        System.out.println("바나나 제거 후: " + fruitSet);

        // 집합의 크기
        System.out.println("집합의 크기: " + fruitSet.size());


        Set<Pen> penSet = new HashSet<>();
        penSet.add(new Pen("red"));
        penSet.add(new Pen("black"));
        penSet.add(new Pen("red"));

        System.out.println("\n" + penSet);
    }
}
