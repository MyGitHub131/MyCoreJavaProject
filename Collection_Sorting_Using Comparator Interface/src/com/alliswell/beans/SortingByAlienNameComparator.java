package com.alliswell.beans;

import java.util.Comparator;

public class SortingByAlienNameComparator implements Comparator<Alien> {

	@Override
	public int compare(Alien a1, Alien a2) {
		return a1.name.compareTo(a2.name);
	}

}
