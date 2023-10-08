public class Student extends Person{
    private String major;
    public Student(String name, int age, String address, String major) {
        super(name, age, address);
        this.major = major;
    }
    public void study() {

    }
}
