package day09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
        // HashMap 생성
        Map<String, String> phoneBook = new HashMap<>();

        // 전화번호 추가
        phoneBook.put("Kim", "010-1234-5678");
        phoneBook.put("Park", "010-9876-5432");
        phoneBook.put("Lee", "010-5566-7788");

        // 특정 키를 이용해서 전화번호 검색
        String leeNumber = phoneBook.get("Lee");
        System.out.println("Lee의 전화번호: " + leeNumber);

        // keySet 사용
        System.out.println("\n==== keySet ====");
        Set<String> keySet = phoneBook.keySet();
        System.out.println("keySet = " + keySet);
        for (String key : keySet) {
            System.out.println("key = " + key);
        }

        // values 사용
        System.out.println("\n==== values ====");
        Collection<String> values = phoneBook.values();
        System.out.println("values = " + values);
        for (String value : values) {
            System.out.println("value = " + value);
        }

        // 전체 전화번호 목록 출력
        System.out.println("\n전체 전화번호 목록: ");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
