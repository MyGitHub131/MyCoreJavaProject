package com.car.fmd.beans;

public class GurgaonWorkShop extends TataWorkShop {

	@Override
	protected ICar createCar(String model) {
		ICar iCar = null;
		
		if (model.equals("indica")) {
			iCar = new IndicaCar();
		} else if (model.equals("nano")) {
			iCar = new NanoCar();
		}
		return iCar;
	}

}
