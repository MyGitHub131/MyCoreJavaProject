package com.mobile.fmd.beans;

public class MobilePhoneDelar {
	public static void main(String[] args) {
		SaiMobileWorkShop saiMobileWorkShop = new GohatiMobileWorkShop();
		IMobile mobile = saiMobileWorkShop.orderMobile("vivo");
	}
}
