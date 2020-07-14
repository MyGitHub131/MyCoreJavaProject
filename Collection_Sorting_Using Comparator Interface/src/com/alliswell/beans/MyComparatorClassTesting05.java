package com.alliswell.beans;

import java.util.TreeSet;

public class MyComparatorClassTesting05 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparatorClass());

		ts.add(17);
		ts.add(06);
		ts.add(03);
		ts.add(44);
		ts.add(01);

		System.out.println(ts);
	}
}
