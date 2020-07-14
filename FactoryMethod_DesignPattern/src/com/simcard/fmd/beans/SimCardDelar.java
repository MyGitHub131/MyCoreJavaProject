package com.simcard.fmd.beans;

public class SimCardDelar {
	public static void main(String[] args) {
		GurgaonSimCardWorkShop gurgaonSimCardWorkShop = new PuneSimCardWorkShop();
		ISimCard iSimCard = gurgaonSimCardWorkShop.orderSimCard("reliance");
	
	}
}
