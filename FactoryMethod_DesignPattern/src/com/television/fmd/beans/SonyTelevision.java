package com.television.fmd.beans;

public class SonyTelevision implements ITelevision {

	@Override
	public void SwitchOn() {
		System.out.println("Sony Television SwitchOn !!");

	}

	@Override
	public void volume() {
		System.out.println("Volume increasing...");

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
