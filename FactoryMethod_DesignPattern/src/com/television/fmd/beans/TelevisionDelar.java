package com.television.fmd.beans;

public class TelevisionDelar {
	public static void main(String[] args) {
		DelhiNcrTelevisionWorkShop delhiNcrTelevisionWorkShop = new PuneTelevisionWorkShop();
		ITelevision iTelevision = delhiNcrTelevisionWorkShop.orderTelevision("konark");
		System.out.println("Now it's time to switchon television...");
	}
}
