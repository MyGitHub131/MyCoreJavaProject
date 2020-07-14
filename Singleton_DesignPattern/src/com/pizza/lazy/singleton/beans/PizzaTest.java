package com.pizza.lazy.singleton.beans;

public class PizzaTest {
	private static PizzaSingleton ps2;

	public static void main(String[] args) {

		PizzaSingleton ps1 = PizzaSingleton.getInstance();

		System.out.println("ps==ps1 :" + (ps1 == ps1));
		System.out.println("ps1==ps2 :" + (ps1 == ps2));

		System.out.println("***************************************************************************************");

		PizzaSingleton x = PizzaSingleton.getInstance();
		PizzaSingleton y = PizzaSingleton.getInstance();

		x.str = (x.str).toUpperCase();
		y.str = (y.str).toUpperCase();

		System.out.println(x.str);
		System.out.println(y.str);

		System.out.println("***************************************************************************************");

		x.str = (x.str).toLowerCase();
		y.str = (y.str).toLowerCase();

		System.out.println(x.str);
		System.out.println(y.str);

	}
}
