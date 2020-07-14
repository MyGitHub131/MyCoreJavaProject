package com.bike.factory.beans;

public class BajajPulsure implements IBike {

	@Override
	public void start() {
		System.out.println("@@***BajajPulsure Bike Functionailty Details***@@");
		System.out.println("-------------------------------------------------");
		System.out.println("BajajPulsure Bike is started !!");
		
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
		System.out.println("BajajPulsure Bike has stopped !!");
		
	}
	
}
