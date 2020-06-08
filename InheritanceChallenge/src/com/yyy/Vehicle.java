package com.yyy;

public class Vehicle {
    private String name;
    private String fuel;
    private int maxSpeed;

    public Vehicle(String name, String fuel, int maxSpeed) {
        this.name = name;
        this.fuel = fuel;
        this.maxSpeed = maxSpeed;
    }

    public void steering() {
        System.out.println("Steering for unspecified vehicle defined");
    }

    public void changingGears() {
        System.out.println("Changing gears for unspecified vehicle defined");
    }
}
