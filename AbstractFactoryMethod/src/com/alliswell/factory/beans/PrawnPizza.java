package com.alliswell.factory.beans;

public class PrawnPizza implements IPizza {

	@Override
	public void prepare() {
		System.out.println("Prawn Pizza Details");
		System.out.println("===================");
		System.out.println("Prawn pizza prepared...");

	}

	@Override
	public void bake() {
		System.out.println("Baking pizza...");

	}

	@Override
	public void cut() {
		System.out.println("Cutting pizza...");

	}

	@Override
	public void box() {
		System.out.println("Boxing pizza...");

	}

}
