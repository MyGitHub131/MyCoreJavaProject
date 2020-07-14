package com.pizza.fmd.beans;

public class PizzaCustomer {
	public static void main(String[] args) {
		/*DominasPizzaShop dominasPizzaShop = new PuneVegPizzaShop();
		IPizza iPizza = dominasPizzaShop.orderPizza("banana");*/
		
		DominasPizzaShop dominasPizzaShop = new GurgaonNonvegPizzaShop();
		IPizza iPizza = dominasPizzaShop.orderPizza("mutton");
	}
}
