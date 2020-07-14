package com.car.fmd.beans;

public class PuneWorkShop extends TataWorkShop {

	@Override
	protected ICar createCar(String model) {
		ICar iCar = null;
		
		if (model.equals("safari")) {
			iCar = new SafariCar();
		}
		return iCar;
	}

}
