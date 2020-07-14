package com.alliswell.beans;

import java.util.Comparator;

public class SortingByUniversityIdComparator implements Comparator<University> {

	@Override
	public int compare(University u1, University u2) {
		if(u1.id > u2.id){
			return -1;
		}else if (u1.id < u2.id) {
			return 1;
		}else {
			return 0;
		}
	}

}
