package com.bike.fmd.beans;

public class HondaShineBike implements IBike {

	@Override
	public void start() {
		System.out.println("HondaShineBike started !!");

	}

	@Override
	public void clause() {
		System.out.println("clause applied...");

	}

	@Override
	public void accelerate() {
		System.out.println("accelerate applied...");

	}

	@Override
	public void move() {
		System.out.println("moved bike...");

	}

	@Override
	public void horn() {
		System.out.println("horn applied...");

	}

	@Override
	public void breake() {
		System.out.println("break applied...");

	}

	@Override
	public void stop() {
		System.out.println("stopped bike...");

	}

}
