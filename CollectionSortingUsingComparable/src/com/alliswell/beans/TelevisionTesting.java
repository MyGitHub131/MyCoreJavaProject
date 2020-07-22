package com.alliswell.beans;

import java.util.Set;
import java.util.TreeSet;

public class TelevisionTesting {
	public static void main(String[] args) {
		Set<Television> t = new TreeSet<Television>();
		t.add(new Television(1050, "PHILIPS", "3Years"));
		t.add(new Television(1275, "VIDEOCON", "4Years"));
		t.add(new Television(1498, "LG", "5Years"));
		t.add(new Television(1575, "PANASONIC", "2Years"));

		for (Television television : t) {
			System.out.println(" Name : " + television.name + "<------->" + " Id : " + television.id + "<------->"
					+ " Warranty : " + television.warranty);
		}
	}
}
