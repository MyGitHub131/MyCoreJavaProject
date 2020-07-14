package com.mobile.factory.beans;

public class SamsungMobile implements IMobile {

	@Override
	public void call() {
		System.out.println("@@***Samsung Mobile Function Details***@@");
		System.out.println("*****************************************");
		System.out.println("Call activated through samsung mobile !!");

	}

	@Override
	public void text() {
		System.out.println("Text is going on");

	}

	@Override
	public void camera() {
		System.out.println("Camera activated");

	}

	@Override
	public void interNet() {
		System.out.println("Internet browising going on");

	}

	@Override
	public void game() {
		System.out.println("Gaming started");

	}

}
