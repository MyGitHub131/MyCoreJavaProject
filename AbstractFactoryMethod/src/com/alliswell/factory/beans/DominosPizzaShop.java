package com.alliswell.factory.beans;

abstract public class DominosPizzaShop {
	public IPizza orderPizza(String type) {
		IPizza iPizza = null;
		iPizza = makingPizza(type);

		System.out.println("quantity checking...");
		System.out.println("price...");
		System.out.println("quality checking...");

		iPizza.prepare();
		iPizza.bake();
		iPizza.cut();
		iPizza.box();

		return iPizza;
	}

	abstract protected IPizza makingPizza(String type);
}
