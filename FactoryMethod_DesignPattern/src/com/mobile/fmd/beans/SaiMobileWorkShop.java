package com.mobile.fmd.beans;

abstract public class SaiMobileWorkShop {
	public IMobile orderMobile(String model) {
		IMobile mobile = null;

		mobile = createMobile(model);

		System.out.println("assemble mobile all parts...");
		System.out.println("paint properly on mbile...");
		System.out.println("qulity check all types of mbile...");

		mobile.call();
		mobile.dataPack();
		mobile.textMessage();
		mobile.camera();
		mobile.video();

		return mobile;
	}

	protected abstract IMobile createMobile(String model);
}
