package com.television.fmd.beans;

public class VideoconTelevision implements ITelevision {

	@Override
	public void SwitchOn() {
		System.out.println("Videocon Television SwitchOn !!");
	}

	@Override
	public void volume() {
		System.out.println("volume increasing...");

	}

	@Override
	public void intetnetConnect() {
		System.out.println("internet connection activated...");

	}

	@Override
	public void SwitchOff() {
		System.out.println("SwitchOff television...");

	}

}
