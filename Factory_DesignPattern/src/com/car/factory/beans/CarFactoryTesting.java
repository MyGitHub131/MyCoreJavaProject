package com.car.factory.beans;

public class CarFactoryTesting {
	public static void main(String[] args) {
		CarShowRoom carShowRoom = new CarShowRoom();
		IVehicle iVehicle = carShowRoom.orderCar("Wagonr");
		System.out.println("Now it's time to drive the car...");
	}

}
