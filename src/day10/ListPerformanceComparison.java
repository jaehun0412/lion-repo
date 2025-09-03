package day10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceComparison {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("=== 끝에 추가 ===");
        // 1. 끝에 추가 (둘 다 빠르다.)
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList add Time: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList add Time: " + (endTime - startTime) + "ms");

        System.out.println("=== 중간 삽입 ===");
        // 2. 중간에 삽입 (LinkedList 유리)
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(50000, i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList insert Time: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(50000, i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Linked insert Time: " + (endTime - startTime) + "ms");

        System.out.println("=== 인덱스 접근 ===");
        // 3. 인덱스 접근 (ArrayList 유리)
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList Time: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList Time: " + (endTime - startTime) + "ms");

    }
}
