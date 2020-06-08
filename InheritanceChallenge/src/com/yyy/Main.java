package com.yyy;

public class Main {

    public static void main(String[] args) {
	Vehicle vehicle = new Vehicle("traktor","gazolina",50);
	vehicle.changingGears();
	vehicle.steering();

	Car car = new Car("Osobowy","benzyna",200,"czerwony",4);
	car.changingGears();
	car.steering();
	car.service();

	Sportowy sportowy = new Sportowy("Superszybki","beznyna",300,"żółty",2,2,30000);
	sportowy.changingGears();
	sportowy.steering();
	sportowy.service();
    }
}
