package com.watch.factory.beans;

public class WatchShowRoom {
	public static ISmartWatch orderWatch(String watch)
	{
		ISmartWatch iSmartWatch = null;
		iSmartWatch = WatchFactory.manufactureWatch(watch);
		
		iSmartWatch.start();
		iSmartWatch.move();
		iSmartWatch.alaram();
		iSmartWatch.heartbeat();
		iSmartWatch.message();
		iSmartWatch.date();
		iSmartWatch.stopWatch();
		iSmartWatch.weather();
		iSmartWatch.worldClock();
		iSmartWatch.stop();
		
		return iSmartWatch;
	}
}
