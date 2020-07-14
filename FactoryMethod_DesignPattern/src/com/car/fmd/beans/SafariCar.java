package com.car.fmd.beans;

public class SafariCar implements ICar {

	@Override
	public void start() {
		System.out.println("SafariCar started...");

	}

	@Override
	public void accelerate() {
		System.out.println("accelerate has been applied...");

	}

}
