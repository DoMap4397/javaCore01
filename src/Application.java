public class Application {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Abc");
        p1.setAge(18);
        p1.setAddress("HaNoi");
        System.out.println(p1.getName());

        String name = p1.getName();

        Person p2 = new Person("Test", 10, "HaNoi");

        p2.study("Java");

        p1.inputData();
        p1.outputData();

        Student student = new Student("A", 19, "Bac Ninh", "IT");
        student.study();
        student.speak();

        Teacher teacher = new Teacher("B", 25, "Ho Chi Minh", "Software");
        teacher.teach();
        teacher.speak();
    }
}
