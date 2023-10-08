import java.util.Scanner;
public class Person {
    private String name;
    private int age;
    private String address;
    static String school = "fpt-aptech";


    public Person() {
        System.out.println("Constructor default");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool() {
        Person.school = "fpt-aptech";
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

// Biz methods
    public void study(String subject) {
        System.out.println(name + "study" + subject);
    }
    public void speak() {

    }
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name: ");
        name = scanner.nextLine();
        System.out.println("Input age: ");
        age = Integer.valueOf(scanner.nextLine());
        System.out.println("Input address: ");
        address = scanner.nextLine();
    }

    public void outputData() {
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Address: " + address);
//        System.out.println("School: " + school);to
        this.toString();
    }
}
