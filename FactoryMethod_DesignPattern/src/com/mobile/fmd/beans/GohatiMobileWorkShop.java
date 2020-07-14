package com.mobile.fmd.beans;

public class GohatiMobileWorkShop extends SaiMobileWorkShop {

	@Override
	protected IMobile createMobile(String model) {
		IMobile mobile = null;
		
		if (model.equals("oppo")) {
			mobile = new OppoMobile();
		}
		else if (model.equals("vivo")) {
			mobile = new VivoMobile();
		}
		return mobile;
	}

}
