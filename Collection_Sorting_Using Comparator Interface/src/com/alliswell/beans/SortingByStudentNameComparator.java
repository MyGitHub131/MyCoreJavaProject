package com.alliswell.beans;

import java.util.Comparator;

public class SortingByStudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.sName.compareTo(s2.sName);
	}

}
