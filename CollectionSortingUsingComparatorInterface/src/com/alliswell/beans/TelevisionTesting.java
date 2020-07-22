package com.alliswell.beans;

import java.util.Set;
import java.util.TreeSet;

public class TelevisionTesting {
	public static void main(String[] args) {
		Set<Television> tv = new TreeSet<Television>(new SortingByUsingTelevisionWarrantyComparator());
		tv.add(new Television(705, "PHILIPS", "3Years"));
		tv.add(new Television(1050, "VIDEOCON", "5Years"));
		tv.add(new Television(1215, "LG", "2Years"));
		tv.add(new Television(1378, "SAMSUNG", "1Years"));

		for (Television television : tv) {
			System.out.println("Warranty : " + television.warranty + "<------->" + " Id : " + television.id
					+ "<------->" + " Name : " + television.name);
		}
	}
}
