package com.simcard.fmd.beans;

public interface ISimCard {
	void activate();

	void call();

	void browsedata();

	void textMessage();

	void deactivate();
}
