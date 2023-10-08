package modifier;

public class Person {
    public String name;
    private String phone;

    public Person(String phone, String name) {
        this.phone = phone;
    }
    public Person(String name) {
        this.name = name;
    }
    public  void showPhone(){
        System.out.println("Phone: " + this.phone);
    }
    class contact {
        public void show(){
            System.out.println("Phone: " + phone);
            Person person = new Person("Test");
        }
    }

    public void showDefault() {
        MyClass myClass = new MyClass();
    }
}
