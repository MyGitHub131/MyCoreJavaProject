package com.mobile.fmd.beans;

public class VivoMobile implements IMobile {

	@Override
	public void call() {
		System.out.println("VivoMobile calling started !!");

	}

	@Override
	public void dataPack() {
		System.out.println("dataPack is activated...");
	}

	@Override
	public void textMessage() {
		System.out.println("textMessage has been going on...");

	}

	@Override
	public void camera() {
		System.out.println("camera is on mode...");

	}

	@Override
	public void video() {
		System.out.println("video is going on...");

	}

}
