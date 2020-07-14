package com.car.fmd.beans;

public class CarDelar {
	public static void main(String[] args) {
		TataWorkShop tataWorkShop = new GurgaonWorkShop();
		ICar iCar = tataWorkShop.orderCar("nano");
	}
}
