package com.alliswell.beans;

public class ICICI implements IRBI {

	@Override
	public void deposit() {
		System.out.println("ICICI Details");
		System.out.println("=============");
		System.out.println("Deposit start...");

	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw start...");

	}

	@Override
	public void linkAdhaar() {
		System.out.println("Link_Adhaar start...");
		
	}

	@Override
	public void minBalance() {
		System.out.println("Min_Balance maintain start...");
		
	}

}
