package com.mobile.factory.beans;

public class MobileFactory {
	public static IMobile manufactureMobile(String type) {
		IMobile iMobile = null;
		if (type.equals("Samsung")) {
			iMobile = new SamsungMobile();
		} else if (type.equals("Nokia")) {
			iMobile = new NokiaMobile();
		} else if (type.equals("Oppo")) {
			iMobile = new OppoMobile();
		} else if (type.equals("Vivo")) {
			iMobile = new VivoMobile();
		} else if (type.equals("Lenovo")) {
			iMobile = new LenovoMobile();
		}
		return iMobile;
	}
}
