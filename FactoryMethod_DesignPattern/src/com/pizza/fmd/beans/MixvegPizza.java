package com.pizza.fmd.beans;

public class MixvegPizza implements IPizza {

	@Override
	public void prepare() {
		System.out.println("MixvegPizza prepared !!");
		
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
