package com.car.factory.beans;

public class CarShowRoom {
	public static IVehicle orderCar(String msg) {
		IVehicle iVehicle = null;

		iVehicle = CarFactory.manufactureCar(msg);
		iVehicle.start();
		iVehicle.fuel();
		iVehicle.stop();

		return iVehicle;
	}
}
