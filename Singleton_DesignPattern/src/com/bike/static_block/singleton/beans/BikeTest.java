package com.bike.static_block.singleton.beans;

public class BikeTest {
	private static BikeSingleton bs2;

	public static void main(String[] args) {

		BikeSingleton bs1 = BikeSingleton.getInstance();

		System.out.println("bs==bs1 :" + (bs1 == bs1));
		System.out.println("bs1==bs2 :" + (bs1 == bs2));

		System.out.println("**************************************************************************************");

		BikeSingleton x = BikeSingleton.getInstance();
		BikeSingleton y = BikeSingleton.getInstance();

		x.str = (x.str).toUpperCase();
		y.str = (y.str).toLowerCase();

		System.out.println(x.str);
		System.out.println(y.str);

		System.out.println("***************************************************************************************");

		x.str = (x.str).toLowerCase();
		y.str = (y.str).toLowerCase();

		System.out.println(x.str);
		System.out.println(y.str);
	}
}
