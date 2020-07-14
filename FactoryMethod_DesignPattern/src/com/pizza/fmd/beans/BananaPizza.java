package com.pizza.fmd.beans;

public class BananaPizza implements IPizza {

	@Override
	public void prepare() {
		System.out.println("BananaPizza prepared !!");

	}

	@Override
	public void bake() {
		System.out.println("baking pizza...");

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
