 package com.bike.static_block.singleton.beans;

//Using static block singleton instantiation created class.......
public class BikeSingleton {
	private static BikeSingleton bikeSingleton = null;
	public String str;

	private BikeSingleton() {
		str = "Hi buddy...";
	}

	static {
		if (bikeSingleton == null) {
			bikeSingleton = new BikeSingleton();
		}
	}

	public static BikeSingleton getInstance() {
		return bikeSingleton;
	}
}
