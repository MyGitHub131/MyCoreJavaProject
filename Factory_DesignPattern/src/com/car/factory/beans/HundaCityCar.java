package com.car.factory.beans;

public class HundaCityCar implements IVehicle {

	@Override
	public void start() {
		System.out.println("HundaCityCar Functionailty Details !!!");
		System.out.println("--------------------------------------");
		System.out.println("HundaCityCar already started...");

	}

	@Override
	public void stop() {
		System.out.println("HundaCityCar has been stopted...");

	}

	@Override
	public void fuel() {
		System.out.println("Fuel is over loaded...");

	}

}
