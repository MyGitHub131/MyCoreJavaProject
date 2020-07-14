package com.car.fmd.beans;

public class IndicaCar implements ICar {

	@Override
	public void start() {
		System.out.println("IndicaCar started...");

	}

	@Override
	public void accelerate() {
		System.out.println("accelerate has been applied...");

	}

}
