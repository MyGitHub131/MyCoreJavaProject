package com.television.fmd.beans;

public class LGTelevision implements ITelevision {

	@Override
	public void SwitchOn() {
		System.out.println("LG Television SwitchOn !!");
		
	}

	@Override
	public void volume() {
		System.out.println("volume increasing...");
		
	}

	@Override
	public void intetnetConnect() {
		System.out.println("internet Connection activated...");
		
	}

	@Override
	public void SwitchOff() {
		System.out.println("SwitchOff television...");
		
	}
	
}
