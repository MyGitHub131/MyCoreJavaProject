package com.alliswell.beans;

import java.util.Set;
import java.util.TreeSet;

public class MyComparatorTesting04 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparator());

		ts.add(10);
		ts.add(07);
		ts.add(03);
		ts.add(15);
		ts.add(20);

		System.out.println(ts);
	}
}
