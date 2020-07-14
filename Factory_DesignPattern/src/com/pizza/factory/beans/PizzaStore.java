package com.pizza.factory.beans;

public class PizzaStore {
	public IPizza orderPizza(String type) {
		IPizza iPizza = null;
		iPizza = PizzaFactory.createPizza(type);
		iPizza.prepare();
		iPizza.bake();
		iPizza.cut();
		iPizza.box();

		return iPizza;
	}
}
