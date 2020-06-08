package com.yyy;

public class Car extends Vehicle {
    private String color;
    private int numberOfDoors;

    public Car(String name, String fuel, int maxSpeed, String color, int numberOfDoors) {
        super(name, fuel, maxSpeed);
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void steering() {
        System.out.println("Steering with steering wheel");
    }

    @Override
    public void changingGears() {
        System.out.println("Manual gearbox");
    }

    public void service() {
        System.out.println("Service in certificated places");
    }
}
