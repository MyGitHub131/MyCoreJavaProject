package com.pizza.fmd.beans;

abstract public class DominasPizzaShop {
	public IPizza orderPizza(String type) {
		IPizza iPizza = null;

		iPizza = createPizza(type);
		System.out.println("*******************");
		System.out.println("quality checking...");
		System.out.println("mixing all pizza...");
		System.out.println("quantity checking...");

		iPizza.prepare();
		iPizza.bake();
		iPizza.cut();
		iPizza.box();
		
		
		return iPizza;
	}

	protected abstract IPizza createPizza(String type);
}