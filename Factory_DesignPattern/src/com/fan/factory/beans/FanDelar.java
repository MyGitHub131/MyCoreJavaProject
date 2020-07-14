package com.fan.factory.beans;

public class FanDelar {
	public static void main(String[] args) {
		DelhiNcrShowRoom delhiNcrShowRoom = new DelhiNcrShowRoom();
		IElectricFan iElectricFan = delhiNcrShowRoom.orderFan("sec");
		System.out.println("Now it's time to use the fan...");
	}
}
