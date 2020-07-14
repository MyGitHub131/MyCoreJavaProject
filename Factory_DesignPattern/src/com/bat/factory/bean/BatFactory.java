package com.bat.factory.bean;

public class BatFactory {
	public static IBat manufactureBat(String type) {
		IBat iBat = null;
		if (type.equalsIgnoreCase("MRF")) {
			iBat = new MRF();
		} else if (type.equalsIgnoreCase("CEAT")) {
			iBat = new CEAT();
		} else if (type.equalsIgnoreCase("SG")) {
			iBat = new SG();
		}
		return iBat;
	}
}

