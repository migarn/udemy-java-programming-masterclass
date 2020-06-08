package com.yyy;

public class Sportowy extends Car {
    private int numberOfPipes;
    private int engine;

    public Sportowy(String name, String fuel, int maxSpeed, String color, int numberOfDoors, int numberOfPipes, int engine) {
        super(name, fuel, maxSpeed, color, numberOfDoors);
        this.numberOfPipes = numberOfPipes;
        this.engine = engine;
    }

    @Override
    public void steering() {
        super.steering();
    }

    @Override
    public void changingGears() {
        System.out.println("Automatic gearbox");
    }

    @Override
    public void service() {
        super.service();
    }
}
