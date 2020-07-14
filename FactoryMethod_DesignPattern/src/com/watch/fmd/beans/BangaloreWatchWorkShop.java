package com.watch.fmd.beans;

abstract public class BangaloreWatchWorkShop {
	public IWatch orderWatch(String model) {
		IWatch watch = null;

		watch = manufactureWatch(model);
		System.out.println("assemble all parts of watch...");
		System.out.println("paint all watches...");
		System.out.println("quality checking all types of watches...");

		watch.start();
		watch.move();
		watch.time();
		watch.date();
		watch.day();
		watch.heartBeat();
		watch.stopWatch();
		watch.textMessage();
		watch.weather();
		watch.worldClock();
		watch.stop();

		return watch;
	}

	protected abstract IWatch manufactureWatch(String model);
}
