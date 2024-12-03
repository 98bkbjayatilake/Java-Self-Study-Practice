package Generics;

public class Car {
    private String model;
    private int speed;
    private float price;

    public Car(String model, int speed, float price) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", maxSpeed=" + speed + " Km/H, price=" + price + " Lakhs]";
    }
}
