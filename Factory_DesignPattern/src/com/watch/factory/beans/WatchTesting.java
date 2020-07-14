package com.watch.factory.beans;

public class WatchTesting {
	public static void main(String[] args) {
		WatchShowRoom watchShowRoom = new WatchShowRoom();
		ISmartWatch iSmartWatch = watchShowRoom.orderWatch("Fastrack");
		System.out.println("Now it's time to waire the watch");
	}
}
