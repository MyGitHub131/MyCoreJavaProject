package com.alliswell.beans;

import java.util.Comparator;

public class SortingByUniversityBranchesComparator implements Comparator<University> {

	@Override
	public int compare(University u1, University u2) {
		return u1.branches.compareTo(u2.branches);
	}

}
