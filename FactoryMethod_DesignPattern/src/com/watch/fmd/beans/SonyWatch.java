package com.watch.fmd.beans;

public class SonyWatch implements IWatch {

	@Override
	public void start() {
		System.out.println("SonyWatch started !!");
		
	}

	@Override
	public void move() {
		System.out.println("moved...");

		
	}

	@Override
	public void time() {
		System.out.println("time started...");
		
	}

	@Override
	public void date() {
		System.out.println("date showing...");
		
	}

	@Override
	public void day() {
		System.out.println("day showing...");
	}

	@Override
	public void worldClock() {
		System.out.println("worldClock showing...");
		
	}

	@Override
	public void stopWatch() {
		System.out.println("stopWatch started...");
		
	}

	@Override
	public void weather() {
		System.out.println("weather showing...");
		
	}

	@Override
	public void heartBeat() {
		System.out.println("heartBeat measured...");
		
	}

	@Override
	public void textMessage() {
		System.out.println("textMessage forworeded...");
		
	}

	@Override
	public void stop() {
		System.out.println("watch stopped...");
		
	}

}
