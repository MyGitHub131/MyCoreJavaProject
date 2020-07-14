package com.alliswell.beans;

public class Student implements Comparable<Student> {
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student s) {
		/*if (id > s.id) {
			return 1;
		} else if (id < s.id) {
			return -1;
		} else {
			return 0;
		}*/
		return name.compareTo(s.name);
	}

}
