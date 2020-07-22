package com.alliswell.beans;

public class Television implements Comparable<Television> {
	int id;
	String name;
	String warranty;

	public Television(int id, String name, String warranty) {
		this.id = id;
		this.name = name;
		this.warranty = warranty;
	}

	@Override
	public int compareTo(Television tv) {
		/*if (tv.id > id) {
			return 1;
		} else if (tv.id < id) {
			return -1;
		} else {
			return 0;
		}*/
		return name.compareTo(tv.name);
		//return warranty.compareTo(tv.warranty);
	}

}
