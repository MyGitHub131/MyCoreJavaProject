package com.car.fmd.beans;

public class NanoCar implements ICar {

	@Override
	public void start() {
		System.out.println("NanoCar started...");

	}

	@Override
	public void accelerate() {
		System.out.println("accelerate has been applied...");

	}

}
