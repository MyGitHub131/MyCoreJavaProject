package com.alliswell.beans;

public class Alien implements Comparable<Alien> {
	int id;
	String name;

	public Alien(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Alien a) {
		/*if (id > a.id) {
			return 1;
		} else if (id < a.id) {
			return -1;
		} else {
			return 0;
		}*/
		 return name.compareTo(a.name);
	}

}
