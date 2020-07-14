package com.alliswell.factory.beans;

public class PaneerPizza implements IPizza {

	@Override
	public void prepare() {
		System.out.println("Panner Pizza Details");
		System.out.println("====================");
		System.out.println("Panner pizza prepared...");

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
