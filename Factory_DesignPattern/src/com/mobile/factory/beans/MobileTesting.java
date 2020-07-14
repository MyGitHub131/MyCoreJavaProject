package com.mobile.factory.beans;

public class MobileTesting {
	public static void main(String[] args) {
		MobileShowRoom mobileShowRoom = new MobileShowRoom();
		IMobile iMobile = mobileShowRoom.orderMobile("Nokia");
		System.out.println("Now mobile is ready to use");
	}
}
