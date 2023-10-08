package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void initLinkedList() {
//        Có 2 cách
//        Cách 1:
        LinkedList<String> cars = new  LinkedList<>();
//        Cách 2:
        List<String> students = new LinkedList<>();
//Thêm các phần tử
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Ford");
        System.out.println(cars);
//        Thêm vào vị trí xác định
        cars.add(2, "BMW");
//        Size
        System.out.println("Kích thước LinkedList: " + cars.size());
//        Lấy phần tử xác định
        System.out.println("Phần tử có index = 1: " + cars.get(1));
//        Lấy ra phần tử đầu tiên và cuối cùng
        System.out.println("Phần tử đầu tiên: " + cars.getFirst());
        System.out.println("Phần tử cuối cùng: " + cars.getLast());
// Update
        cars.set(1, "Huyndai");
        System.out.println(cars);
//        Trả về pt đầu tiên, cuối cùng rồi xóa
        cars.pollFirst();
        cars.pollLast();
        System.out.println("Danh sách Update: " + cars);
//        Xóa  phần tử xác định
        cars.remove(1);
        cars.remove("Huyndai");
        System.out.println(cars);
//        Xóa phần tử cuối cùng
        cars.removeFirst();
        cars.removeLast();
        System.out.println(cars);
        //    Xóa toàn bộ
        cars.clear();
        System.out.println(cars);
    }
    public static void main(String[] args) {
        initLinkedList();
    }
}
