package com.watch.factory.beans;

public class WatchFactory {
	public static ISmartWatch manufactureWatch(String watch) {
		ISmartWatch iSmartWatch = null;
		if (watch.equals("Fastrack")) {
			iSmartWatch = new FastrackWatch();
		} else if (watch.equals("Titanic")) {
			iSmartWatch = new TitanicWatch();
		} else if (watch.equals("Rolex")) {
			iSmartWatch = new RolexWatch();
		} else if (watch.equals("Sony")) {
			iSmartWatch = new SonyWatch();
		} else if (watch.equals("Zebronic")) {
			iSmartWatch = new ZebronicWatch();
		} 
		return iSmartWatch;
	}
}
