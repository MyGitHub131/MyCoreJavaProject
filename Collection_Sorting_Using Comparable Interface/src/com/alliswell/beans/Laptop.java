package com.alliswell.beans;

public class Laptop implements Comparable<Laptop> {
	int id;
	String name;

	public Laptop(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Laptop l) {
		return name.compareTo(l.name);
	}

	/*@Override
	public int compareTo(Laptop l) {
		if (id > l.id) {
			return 1;
		} else if (id < l.id) {
			return -1;
		} else {
			return 0;
		}
	
	}*/
}
