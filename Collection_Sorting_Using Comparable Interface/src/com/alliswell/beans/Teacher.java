package com.alliswell.beans;

public class Teacher implements Comparable<Teacher> {
	int id;
	String name;

	public Teacher(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Teacher t) {
		if (id > t.id) {
			return 1;
		} else if (id < t.id) {
			return -1;
		} else {
			return 0;
		}
		//return name.compareTo(t.name);
	}

}

