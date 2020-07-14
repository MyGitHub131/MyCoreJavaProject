package com.bat.factory.bean;

public class CEAT implements IBat {

	@Override
	public void size() {
		System.out.println("CEAT Bat Information");
		System.out.println("--------------------");
		System.out.println("Size : Large Size...");

	}

	@Override
	public void weight() {
		System.out.println("Weight : 1.05 GM...");

	}

	@Override
	public void length() {
		System.out.println("Length : 3.05 CM...");

	}

}
