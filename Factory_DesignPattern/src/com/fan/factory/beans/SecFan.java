package com.fan.factory.beans;

public class SecFan implements IElectricFan{

	@Override
	public void SwitchOn() {
		System.out.println("SecFan SwitchOn !!");
		
	}

	@Override
	public void move() {
		System.out.println("moving fan...");
		
	}

	@Override
	public void SwitchOff() {
		System.out.println("SwitchOff fan...");
		
	}

}
