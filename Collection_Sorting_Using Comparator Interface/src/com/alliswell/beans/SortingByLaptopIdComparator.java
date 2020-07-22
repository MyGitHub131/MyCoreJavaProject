package com.alliswell.beans;

import java.util.Comparator;

public class SortingByLaptopIdComparator implements Comparator<Laptop> {

	@Override
	public int compare(Laptop l1, Laptop l2) {
		if (l1.id > l2.id) {
			return -1;
		} else if (l1.id < l2.id) {
			return 1;
		} else {
			return 0;
		}
	}

}