package com.alliswell.beans;

import java.util.Comparator;

public class SortingByUsingTelevisionIdComparator implements Comparator<Television> {

	@Override
	public int compare(Television t1, Television t2) {
		if (t1.id > t2.id) {
			return -1;
		} else if (t1.id < t2.id) {
			return 1;
		} else {
			return 0;
		}
	}

}
