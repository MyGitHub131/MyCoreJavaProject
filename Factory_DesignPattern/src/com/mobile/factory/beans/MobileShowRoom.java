package com.mobile.factory.beans;

public class MobileShowRoom {
	public static IMobile orderMobile(String type) {
		IMobile iMobile = null;

		iMobile = MobileFactory.manufactureMobile(type);
		iMobile.call();
		iMobile.interNet();
		iMobile.text();
		iMobile.game();
		iMobile.camera();
		
		return iMobile;
	}
}
