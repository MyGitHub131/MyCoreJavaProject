package com.alliswell.beans;

import java.util.Comparator;

public class SortingByEmployeePhoneComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.phone.compareTo(e2.phone);
	}

}
