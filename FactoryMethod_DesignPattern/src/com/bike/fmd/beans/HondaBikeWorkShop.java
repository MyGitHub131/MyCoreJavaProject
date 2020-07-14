package com.bike.fmd.beans;

abstract public class HondaBikeWorkShop {
	public IBike orderBike(String model) {
		IBike iBike = null;
		
		iBike = manufactureBike(model);
		System.out.println("assemble...");
		System.out.println("paint...");
		System.out.println("quality checking...");
		
		iBike.start();
		iBike.clause();
		iBike.accelerate();
		iBike.move();
		iBike.horn();
		iBike.breake();
		iBike.stop();
		
		return iBike;
	}

	protected abstract IBike manufactureBike(String model);
}
