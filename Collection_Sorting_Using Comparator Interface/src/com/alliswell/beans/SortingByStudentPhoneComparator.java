package com.alliswell.beans;

import java.util.Comparator;

public class SortingByStudentPhoneComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.sPhone.compareTo(s2.sPhone);
	}

}
