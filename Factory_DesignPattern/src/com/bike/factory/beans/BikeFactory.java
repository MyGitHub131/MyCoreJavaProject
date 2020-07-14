package com.bike.factory.beans;

public class BikeFactory {
	public static IBike manufactureBike(String type) {
		IBike iBike = null;
		if (type.equals("Shine")) {
			iBike = new HondaShine();
		} else if (type.equals("Pulsure")) {
			iBike = new BajajPulsure();
		} else if (type.equals("Duke")) {
			iBike = new SuzukiDuke();
		} else if (type.equals("Hornet")) {
			iBike = new HondaHornet();
		} else if (type.equals("Splender")) {
			iBike = new HeroSplender();
		}
		return iBike;
	}
}
