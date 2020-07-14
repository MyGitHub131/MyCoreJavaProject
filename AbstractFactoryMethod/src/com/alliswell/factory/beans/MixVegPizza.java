package com.alliswell.factory.beans;

public class MixVegPizza implements IPizza {

	@Override
	public void prepare() {
		System.out.println("MixVeg Pizza Details");
		System.out.println("====================");
		System.out.println("MixVeg pizza prepared...");

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
