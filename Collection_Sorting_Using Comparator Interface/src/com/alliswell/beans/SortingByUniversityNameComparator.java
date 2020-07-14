package com.alliswell.beans;

import java.util.Comparator;

public class SortingByUniversityNameComparator implements Comparator<University> {

	@Override
	public int compare(University u1, University u2) {
		return u1.name.compareTo(u2.name);
	}

}
