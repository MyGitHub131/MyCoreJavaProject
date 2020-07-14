package com.bike.factory.beans;

public class HeroSplender implements IBike {

	@Override
	public void start() {
		System.out.println("@@***HeroSplender Bike Functionailty Details***@@");
		System.out.println("-------------------------------------------------");
		System.out.println("HeroSplender Bike is started !!");
		
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
		System.out.println("HeroSplender Bike has stopped !!");
		
	}
	
}
