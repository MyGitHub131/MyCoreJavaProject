package com.watch.factory.beans;

public class SonyWatch implements ISmartWatch {

	@Override
	public void start() {
		System.out.println("@@***SonyWatch Details***@@");
		System.out.println("---------------------------");
		System.out.println("SonyWatch is started !!");
		
	}

	@Override
	public void move() {
		System.out.println("Watch has been moveing...");
		
	}

	@Override
	public void heartbeat() {
		System.out.println("Heartbeat checking...");
		
	}

	@Override
	public void alaram() {
		System.out.println("Alaram ringing...");
		
	}

	@Override
	public void stopWatch() {
		System.out.println("StopWatch started...");
		
	}

	@Override
	public void date() {
		System.out.println("Current date is showing...");
		
	}

	@Override
	public void weather() {
		System.out.println("Weather is showing...");
		
	}

	@Override
	public void worldClock() {
		System.out.println("WorldClock is showing...");
		
	}

	@Override
	public void message() {
		System.out.println("Message has sending...");
		
	}

	@Override
	public void stop() {
		System.out.println("SonyWatch has stopped !!");
		
	}
	
}
