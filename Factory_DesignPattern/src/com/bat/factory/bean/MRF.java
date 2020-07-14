package com.bat.factory.bean;

public class MRF implements IBat {

	@Override
	public void size() {
		System.out.println("MRF Bat Information");
		System.out.println("-------------------");
		System.out.println("Size : Medium Size...");

	}

	@Override
	public void weight() {
		System.out.println("Weight : 1.05 GM...");

	}

	@Override
	public void length() {
		System.out.println("Length : 2.05 CM...");

	}

}
