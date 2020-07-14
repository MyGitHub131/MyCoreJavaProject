package com.alliswell.beans;

import java.util.Comparator;

public class SortingByCarNameComparator implements Comparator<Car> {

	@Override
	public int compare(Car c1, Car c2) {
		return c1.name.compareTo(c2.name);
	}

}
