package Generics;

public class Bike {
    private String brand;
    private int speed;
    private float price;

    public Bike(String brand, int speed, float price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", maxSpeed=" + speed + " Km/H, price=" + price + " Lakhs]";
    }
}
