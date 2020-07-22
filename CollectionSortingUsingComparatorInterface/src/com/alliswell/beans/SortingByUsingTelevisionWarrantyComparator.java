package com.alliswell.beans;

import java.util.Comparator;

public class SortingByUsingTelevisionWarrantyComparator implements Comparator<Television> {

	@Override
	public int compare(Television tv1, Television tv2) {
		return tv1.warranty.compareTo(tv2.warranty);
	}

}
