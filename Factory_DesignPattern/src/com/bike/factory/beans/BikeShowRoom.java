package com.bike.factory.beans;

public class BikeShowRoom {
	public static IBike orderBike(String type)
	{
		IBike iBike = null;
		iBike = BikeFactory.manufactureBike(type);
		iBike.start();
		iBike.applyClause();
		iBike.applyGear();
		iBike.applyBreak();
		iBike.stop();
		
		return iBike;
	}
}
