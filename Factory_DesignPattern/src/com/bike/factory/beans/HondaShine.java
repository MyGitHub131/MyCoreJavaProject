package com.bike.factory.beans;

public class HondaShine implements IBike {

	@Override
	public void start() {
		System.out.println("@@***HondaShine Bike Functionailty Details***@@");
		System.out.println("-----------------------------------------------");
		System.out.println("HondaShine bike is started !!");

	}

	@Override
	public void applyGear() {
		System.out.println("Gear has been applied...");

	}

	@Override
	public void applyClause() {
		System.out.println("Clause has been applied...");

	}

	@Override
	public void applyBreak() {
		System.out.println("Break has been applied...");

	}

	@Override
	public void stop() {
		System.out.println("HondaShine Bike has stopped !!");

	}

}
