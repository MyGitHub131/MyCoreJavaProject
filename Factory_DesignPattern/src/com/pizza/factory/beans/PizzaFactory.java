package com.pizza.factory.beans;

public class PizzaFactory {
	public static IPizza createPizza(String type) {
		IPizza iPizza = null;
		if (type.equalsIgnoreCase("Cheese")) {
			iPizza = new CheesePizza();
		} else if (type.equalsIgnoreCase("Chicken")) {
			iPizza = new ChickenPizza();
		}
		return iPizza;
	}
}
