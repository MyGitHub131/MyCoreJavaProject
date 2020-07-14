package com.bat.factory.bean;

public class SG implements IBat {

	@Override
	public void size() {
		System.out.println("SG Bat Information");
		System.out.println("------------------");
		System.out.println("Size : Small Size...");

	}

	@Override
	public void weight() {
		System.out.println("Weight : 1.o2 GM...");

	}

	@Override
	public void length() {
		System.out.println("Length : 2.07 CM...");

	}

}
