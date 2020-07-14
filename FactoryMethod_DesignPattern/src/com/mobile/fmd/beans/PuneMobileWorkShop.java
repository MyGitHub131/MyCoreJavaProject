package com.mobile.fmd.beans;

public class PuneMobileWorkShop extends SaiMobileWorkShop {

	@Override
	protected IMobile createMobile(String model) {
		IMobile mobile = null;
		
		if (model.equals("nokia")) {
			mobile = new NokiaMobile();
		}
		else if (model.equals("samsung")) {
			mobile = new SamsungMobile();
		}
		else if (model.equals("lenovo")) {
			mobile = new LenovoMobile();
		}
		return mobile;
	}

}
