package com.pizza.factory.beans;

public class ChickenPizza implements IPizza {

	@Override
	public void prepare() {
		System.out.println("@@***Chicken Pizza Details***@@");
		System.out.println("-------------------------------");
		System.out.println("Preparing chicken pizza !!");

	}

	@Override
	public void bake() {
		System.out.println("Baking chicken pizza...");

	}

	@Override
	public void cut() {
		System.out.println("Cutting chicken pizza...");

	}

	@Override
	public void box() {
		System.out.println("Boxing chicken pizza...");
		
	}
	

}
