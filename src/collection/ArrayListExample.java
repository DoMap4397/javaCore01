package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void initArrayList() {
        //Để tạo ArrayList có 2 cách
        //Cách 1: Thông qua instance của ArrayList
        ArrayList<String> animals = new ArrayList<>();
        //Cách 2: Thông qua in List Interface
        List<String> students = new ArrayList<>();

//        Thêm phần tử cho Arraylist
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Pig");
//        Chèn vào index được xác định
        animals.add(1, "Duck");
//        size
        System.out.println("Kích thước ArrayList: " + animals.size());
//        println
        System.out.println(animals);
//        Sử dụng foreach
        for (String ary: animals)
            System.out.println(ary);
//        Lấy dữ liệu từ 1 phần tử
        animals.set(3, "Tiger");
        System.out.println(animals);
//        Xóa phần tử trong ArrayList
        animals.remove("Cat");
        animals.remove(1);
        System.out.println(animals);
//        Xóa toàn bộ ArrayList
        animals.clear();
        System.out.println("After clear() " + animals);
    }

    public static void main(String[] args) {
        initArrayList();
    }
}
