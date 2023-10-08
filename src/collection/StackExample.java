package collection;

import modifier.Student;

import java.util.Stack;

public class StackExample {
    public static void initStack() {
        Stack<Student> students = new Stack<>();
        Stack<String> employees = new Stack<>();
        employees.add("Test");
        employees.add("123");
        System.out.println(employees);
//        push
        employees.push("Vinh");
        System.out.println("\nSau khi push: " + employees);

//        get Elements
        System.out.println("pop(): " + employees.pop());
        System.out.println("peek(): " + employees.peek());
        System.out.println("List final: " + employees);

//        Search
        System.out.println("Search on the Stack: " + employees.search("Test"));

//         Delete
        System.out.println("Delete: " + employees.remove(1));
    }

    public static void main(String[] args) {
        initStack();
    }
}
