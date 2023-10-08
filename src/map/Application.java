package map;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Hai", "hai@gmail.com", "0123");
        Student student2 = new Student(2, "Vinh", "vinhai@gmail.com", "0123");
        Student student3 = new Student(3, "Truong", "truong@gmail.com", "0123");
        Student student4 = new Student(4, "Binh", "binh@gmail.com", "0123");
        Student student5 = new Student(5, "Ngoc", "ngoc@gmail.com", "0123");
        Student student6 = new Student(6, "Tung", "tung@gmail.com", "0123");

//        init map
        Map<Integer, Student> map = new HashMap<>();
        Map<String, Student> mapSt = new HashMap<>();
        mapSt.put(student1.getPhone(), student1);

//        map.put(1, student1);
        map.put(student1.getId, student1);
        map.put(student2.getId, student2);
        map.put(student3.getId, student3);
        map.put(student4.getId, student4);
//        show map keySet()
        for (Integer key : map.keySet()) {
            Student value = map.get(key);
            System.out.println(key + "=" + value.getName());
        }

//        entrySet()
        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(key + " " + value.getName() + " " + value.getEmail());
        }
    }
}
