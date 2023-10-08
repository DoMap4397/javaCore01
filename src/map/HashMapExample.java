package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void initHashMap() {
//        HashMap<Integer, String> persons = new HashMap<>();
        Map<Integer, String> students = new HashMap<>();
//        Insert element
        students.put(1, "Hai");
        students.put(1, "Hai");
        students.put(1, "Hai");
        students.put(1, "Hai");
        students.put(2, "Phong");
        students.put(3, "Thanh");
        students.put(4, "Minh");
        System.out.println(students);

        students.put(2, "Ngoc");
        System.out.println("After insert: " + students);

//        Show keySet() or entrySet()
        for (Map.Entry<Integer, String> entry:students.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "_" + value);
        }
    }

    public static void main(String[] args) {
        initHashMap();
    }
}
