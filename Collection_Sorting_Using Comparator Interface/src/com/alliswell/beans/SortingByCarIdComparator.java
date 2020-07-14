
package com.alliswell.beans;

import java.util.Comparator;

public class SortingByCarIdComparator implements Comparator<Car> {

	@Override
	public int compare(Car c1, Car c2) {
		if (c1.id > c2.id) {
			return +1;
		} else if (c1.id < c2.id) {
			return -1;
		} else {
			return 0;

		}
	}

}
