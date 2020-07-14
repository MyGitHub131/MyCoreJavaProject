package com.alliswell.hashcode;

public class Human {
	String name;
	int adharano;

	public Human(String name, int adharano) {
		this.name = name;
		this.adharano = adharano;
	}

	@Override
	public int hashCode() {
		return adharano;
	}
}
