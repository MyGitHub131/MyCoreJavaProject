package com.fan.factory.beans;

public class CromptonFan implements IElectricFan {

	@Override
	public void SwitchOn() {
		System.out.println("CromptonFan SwitchOn !!");

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
