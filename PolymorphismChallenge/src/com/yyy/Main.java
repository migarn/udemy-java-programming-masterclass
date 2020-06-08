package com.yyy;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int engineCapacity;
    private boolean manualGearbox;
    private int doorNumber;

    public Car(String name, int cylinders,int engineCapacity, boolean manualGearbox, int doorNumber) {
        this.name = name;
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.engineCapacity = engineCapacity;
        this.manualGearbox = manualGearbox;
        this.doorNumber = doorNumber;
    }

    public void startEngine() {
        System.out.println(name + "'s engine has been started.");
    }

    public void accelerate() {
        System.out.println(name + " is accelerating.");
    }

    public void brake() {
        System.out.println(name + " is braking.");
    }

    public void changeGear() {
        if (manualGearbox)
            System.out.println(name + "'s gear has been changed manually.");
        else
            System.out.println(name + "'s gear has been changed automatically.");
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public boolean isManualGearbox() {
        return manualGearbox;
    }

    public int getDoorNumber() {
        return doorNumber;
    }
}

class Saxo extends Car {
    private int engineCapacity;
    private boolean manualGearbox;
    private int doorNumber;
    private String colour;

    public Saxo(int engineCapacity, boolean manualGearbox, int doorNumber, String colour) {
        super("Saxo",4, engineCapacity, manualGearbox, doorNumber);
        this.colour = colour;
    }

    @Override
    public void accelerate() {
        System.out.println("Saxo is accelerating quickly.");
    }

    @Override
    public void brake() {
        System.out.println("Saxo is braking tenderly.");
    }

    @Override
    public void changeGear() {
        super.changeGear();
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public boolean isManualGearbox() {
        return manualGearbox;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}

class MójYaris extends Car {

    public MójYaris() {
        super("Mój Yaris",4,1300,true,5);
    }
}

class DużyFiat extends Car {
    private int wheels;

    public DużyFiat(int wheels) {
        super("Duży Fiat",2,1500,false,4);
        this.wheels = wheels;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }

    @Override
    public void changeGear() {
        System.out.println("Duży Fiat has only manual gearbox.");;
    }
}

public class Main {

    public static void main(String[] args) {
	Car car1 = new Car("Car1",4,1300,true,5);
	car1.changeGear();

	Car car2 = new Car("Car2",6,2500,false,3);
	car2.changeGear();

	Saxo saxo = new Saxo(1100,false,3, "blue");
	saxo.startEngine();
	saxo.changeGear();

	MójYaris yaris = new MójYaris();
	yaris.changeGear();
	yaris.accelerate();
	yaris.brake();
	yaris.startEngine();
	yaris.isManualGearbox();

	DużyFiat fiat = new DużyFiat(6);
	fiat.changeGear();
	fiat.accelerate();
	fiat.getEngineCapacity();
    }
}
