package day10;

import java.util.*;

public class CollectionsExam {

    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("kim");
        arrayList1.add("lee");
        arrayList1.add("hong");

        String str1 = (String) arrayList1.get(0);
        String str2 = (String) arrayList1.get(1);
        String str3 = (String) arrayList1.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("kim");
        arrayList2.add("lee");
        arrayList2.add("hong");

        String str4 =  arrayList2.get(0);
        String str5 =  arrayList2.get(1);
        String str6 =  arrayList2.get(2);

        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);

        System.out.println("\n===Iterator===");
        Collection<String> collection = new ArrayList<>();
        collection.add("kim");
        collection.add("lee");
        collection.add("hong");

        System.out.println(collection.size());

        Iterator<String> iterator1 = collection.iterator();
        while (iterator1.hasNext()) {
            String str = iterator1.next();
            System.out.println(str);
        }

        System.out.println("\n===HashSet===");
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("hi");
        set.add("hong");

        Iterator<String> iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            String str = iterator2.next();
            System.out.println(str);
        }

        System.out.println("\n===HashMap===");
        Map<String, String> map = new HashMap<>();
        map.put("k1", "hello");
        map.put("k2", "hi");
        map.put("k3", "안녕");

        System.out.println(map.get("k1"));
        System.out.println(map.get("k2"));
        System.out.println(map.get("k3"));

        Set<String> keySet = map.keySet();
        Iterator<String> iterator3 = keySet.iterator();
        while (iterator3.hasNext()) {
            String key = iterator3.next();
            String value = map.get(key);

            System.out.println(key + " : " + value);
        }

        System.out.println("\n===Collection Util===");
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Collections.shuffle(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\n===TreeSet===");
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("hello");
        treeSet.add("a!!");
        treeSet.add("bcd");

        Iterator<String> iterator4 = treeSet.iterator();
        while (iterator4.hasNext()) {
            String str = iterator4.next();
            System.out.println(str);
        }
    }
}
