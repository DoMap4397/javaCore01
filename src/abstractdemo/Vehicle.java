package abstractdemo;

public abstract class Vehicle {
    private int year;
    private String brand;

    public Vehicle(int year, String brand) {
        this.year = year;
        this.brand = brand;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    abstract void start();
}
class MotoCycle extends Vehicle{
    public  MotoCycle(int year, String brand) {
        super(year, brand);
    }

    void start() {
        System.out.println("Starting the " + getBrand() + " MotoCycle");
    }
}

class Car extends Vehicle{
    public  Car(int year, String brand) {
        super(year, brand);
    }

    void start() {
        System.out.println("Starting the " + getBrand() + " Car");
    }
}