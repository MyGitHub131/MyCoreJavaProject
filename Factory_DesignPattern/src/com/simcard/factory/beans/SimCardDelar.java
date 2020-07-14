package com.simcard.factory.beans;

public class SimCardDelar {
	public static void main(String[] args) {
		SimCardShopVender shopVender = new SimCardShopVender();
		ISimCard iSimCard = shopVender.orderSimCard("airtel");
		System.out.println("Now it's time to use the simcard in your mobilephone...");
	}
}
