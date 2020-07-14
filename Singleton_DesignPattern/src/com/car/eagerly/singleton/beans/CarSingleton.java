package com.car.eagerly.singleton.beans;

//Using eagerly instantiation created singleton class.......
public class CarSingleton {
	private static CarSingleton carSingleton = new CarSingleton();
	public String str;

	private CarSingleton() {
		str = "Hi every one...";
	}

	public static CarSingleton getInstance() {
		return carSingleton;
	}
}
