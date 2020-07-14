package com.pizza.lazy.singleton.beans;

//Using lazy loading instantiation created singleton class.......
public class PizzaSingleton {
	private static PizzaSingleton pizzaSingleton = null;
	public String str;

	private PizzaSingleton() {
		str = "Hi every body...";
	}

	public static PizzaSingleton getInstance() {
		if (pizzaSingleton == null) {
			pizzaSingleton = new PizzaSingleton();
		}
		return pizzaSingleton;
	}
}
