package com.bat.factory.bean;

public class BatTesting {
	public static void main(String[] args) {
		BatShowRoom batShowRoom = new BatShowRoom();
		IBat iBat = batShowRoom.orderBat("mrf");
	}
}