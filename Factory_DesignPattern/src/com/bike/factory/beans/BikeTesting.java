package com.bike.factory.beans;

public class BikeTesting {
	public static void main(String[] args) {
		BikeShowRoom bikeShowRoom = new BikeShowRoom();
		IBike iBike = bikeShowRoom.orderBike("Shine");
		System.out.println("Now it's time to ride the honda shine bike");
		
	}
}
