package com.alliswell.beans;

import java.util.Comparator;

public class SortingByStudentIdComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.sId.compareTo(s2.sId);
	}

}
