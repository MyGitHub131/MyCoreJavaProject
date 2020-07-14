package com.alliswell.beans;

import java.util.Comparator;

public class SortingByAlienIdComparator implements Comparator<Alien> {

	@Override
	public int compare(Alien a1, Alien a2) {
		if (a1.id > a2.id) {
			return -1;
		} else if (a1.id < a2.id) {
			return 1;
		} else {
			return 0;
		}
	}

}
