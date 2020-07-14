package com.bike.factory.beans;

public class HondaHornet implements IBike {

	@Override
	public void start() {
		System.out.println("@@***HondaHornet Bike Functionailty Details***@@");
		System.out.println("------------------------------------------------");
		System.out.println("HondaHornet Bike is started !!");
		
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
		System.out.println("HondaHornet Bike has stopped !!");
		
	}
	
}
