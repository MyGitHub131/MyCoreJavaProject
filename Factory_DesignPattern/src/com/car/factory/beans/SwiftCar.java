package com.car.factory.beans;

public class SwiftCar implements IVehicle {

	@Override
	public void start() {
		System.out.println("SwiftCar Functionailty Details !!!");
		System.out.println("----------------------------------");
		System.out.println("SwiftCar is started...");

	}

	@Override
	public void stop() {
		System.out.println("SwiftCar has been stopted...");

	}

	@Override
	public void fuel() {
		System.out.println("Fuel already is loaded...");

	}

}
