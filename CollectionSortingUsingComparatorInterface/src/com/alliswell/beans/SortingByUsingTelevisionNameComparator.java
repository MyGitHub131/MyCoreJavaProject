package com.alliswell.beans;

import java.util.Comparator;

public class SortingByUsingTelevisionNameComparator implements Comparator<Television> {

	@Override
	public int compare(Television tv1, Television tv2) {
		return tv1.name.compareTo(tv2.name);
	}

}
