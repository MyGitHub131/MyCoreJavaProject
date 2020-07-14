package com.car.factory.beans;

public class WagonrCar implements IVehicle {

	@Override
	public void start() {
		System.out.println("WagonrCar Functionailty Details !!!");
		System.out.println("-----------------------------------");
		System.out.println("WagonrCar is started...");

	}

	@Override
	public void stop() {
		System.out.println("WagonrCar already is stopted...");

	}

	@Override
	public void fuel() {
		System.out.println("Fuel has been loaded...");

	}

}
