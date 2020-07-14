package com.bike.fmd.beans;

public class BikeDelar {
	public static void main(String[] args) {
		HondaBikeWorkShop hondaBikeWorkShop = new GurgaonBikeWorkShop();
		IBike iBike = hondaBikeWorkShop.orderBike("splender");
	}
}
