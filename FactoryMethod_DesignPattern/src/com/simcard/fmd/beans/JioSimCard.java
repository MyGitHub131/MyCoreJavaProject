package com.simcard.fmd.beans;

public class JioSimCard implements ISimCard {

	@Override
	public void activate() {
		System.out.println("JioSimCard activated !!");

	}

	@Override
	public void call() {
		System.out.println("calling is started...");

	}

	@Override
	public void browsedata() {
		System.out.println("internet browing data on...");

	}

	@Override
	public void textMessage() {
		System.out.println("textMessage forworded...");

	}

	@Override
	public void deactivate() {
		System.out.println("deactivated showing...");

	}

}
