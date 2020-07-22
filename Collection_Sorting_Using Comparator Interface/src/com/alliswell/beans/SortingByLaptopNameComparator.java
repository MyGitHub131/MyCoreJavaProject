package com.alliswell.beans;

import java.util.Comparator;

public class SortingByLaptopNameComparator implements Comparator<Laptop> {

	@Override
	public int compare(Laptop l1, Laptop l2) {
		return l1.name.compareTo(l2.name);
	}

}
