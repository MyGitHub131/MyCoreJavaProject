package com.car.eagerly.singleton.beans;

public class CarTest {
	private static CarSingleton cs2;

	public static void main(String[] args) {
		CarSingleton cs1 = CarSingleton.getInstance();

		System.out.println("cs==cs1 :" + (cs1 == cs1));
		System.out.println("cs1==cs2 :" + (cs1 == cs2));

		System.out.println(
				"**********************************************************************************************************");

		CarSingleton x = CarSingleton.getInstance();
		CarSingleton y = CarSingleton.getInstance();

		x.str = (x.str).toUpperCase();
		y.str = (y.str).toUpperCase();

		System.out.println(x.str);
		System.out.println(y.str);

		System.out.println(
				"***********************************************************************************************************");

		x.str = (x.str).toLowerCase();
		y.str = (y.str).toLowerCase();

		System.out.println(x.str);
		System.out.println(y.str);
	}
}
