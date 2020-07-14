package com.television.fmd.beans;

public class MicromaxTelevision implements ITelevision {

	@Override
	public void SwitchOn() {
		System.out.println("Micromax Television SwitchOn !!");

	}

	@Override
	public void volume() {
		System.out.println("volume increasing...");

	}

	@Override
	public void intetnetConnect() {
		System.out.println("intetnet Connection activated...");

	}

	@Override
	public void SwitchOff() {
		System.out.println("SwitchOff television...");

	}

}
