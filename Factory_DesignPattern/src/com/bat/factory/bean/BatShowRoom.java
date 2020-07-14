package com.bat.factory.bean;

public class BatShowRoom {
	public static IBat orderBat(String type) {
		IBat iBat = null;
		iBat = BatFactory.manufactureBat(type);
		iBat.size();
		iBat.length();
		iBat.weight();

		return iBat;
	}
}
