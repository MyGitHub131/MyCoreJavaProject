package com.pizza.factory.beans;

public class PizzaTesting {
	public static void main(String[] args) {
		PizzaStore pStore = new PizzaStore();
		IPizza iPizza = pStore.orderPizza("chicken");
		System.out.println("Now it's time to eat chicken pizza");
		//System.out.println("Now it's time to eat cheese pizza");
	}
}
