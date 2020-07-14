package com.simcard.factory.beans;

public class JioSimCard implements ISimCard {

	@Override
	public void activate() {
		System.out.println("@@***JioSimCard Details***@@");
		System.out.println("****************************");
		System.out.println("JioSimCard activated !!");

	}

	@Override
	public void call() {
		System.out.println("calling started...");

	}

	@Override
	public void browsedata() {
		System.out.println("internet browsing data is on...");

	}

	@Override
	public void textMessage() {
		System.out.println("textMessage forworded...");

	}

	@Override
	public void deactivate() {
		System.out.println("deactivated sim...");

	}

}
