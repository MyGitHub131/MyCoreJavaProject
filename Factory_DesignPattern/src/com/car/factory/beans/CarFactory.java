package com.car.factory.beans;

public class CarFactory {
	public static IVehicle manufactureCar(String msg) {
		IVehicle iVehicle = null;

		if (msg.equals("Swift")) {
			iVehicle = new SwiftCar();
		} else if (msg.equals("Wagonr")) {
			iVehicle = new WagonrCar();
		} else if (msg.equals("Hunda")) {
			iVehicle = new HundaCityCar();
		}
		return iVehicle;
	}
}
