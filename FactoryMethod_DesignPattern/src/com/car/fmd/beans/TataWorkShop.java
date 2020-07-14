package com.car.fmd.beans;

abstract public class TataWorkShop {
	public ICar orderCar(String model) {
		ICar iCar = null;
		
		iCar = createCar(model);
		System.out.println("assemble...");
		System.out.println("paint...");
		System.out.println("quality check...");
		
		iCar.start();
		iCar.accelerate();
		
		return iCar;
	}
	protected abstract ICar createCar(String model);
}
