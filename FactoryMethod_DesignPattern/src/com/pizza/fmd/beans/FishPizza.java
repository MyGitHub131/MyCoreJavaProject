package com.pizza.fmd.beans;

public class FishPizza implements IPizza {

	@Override
	public void prepare() {
		System.out.println("FishPizza prepared !!");

	}

	@Override
	public void bake() {
		System.out.println("bakin pizza...");

	}

	@Override
	public void cut() {
		System.out.println("cutting pizza...");

	}

	@Override
	public void box() {
		System.out.println("boxing pizza...");

	}

}
