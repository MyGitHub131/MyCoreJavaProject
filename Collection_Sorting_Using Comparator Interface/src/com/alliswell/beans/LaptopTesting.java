package com.alliswell.beans;

import java.util.Set;
import java.util.TreeSet;

public class LaptopTesting {
	public static void main(String[] args) {
		Set<Laptop> lap = new TreeSet<Laptop>(new SortingByLaptopNameComparator());
		lap.add(new Laptop(125, "HP"));
		lap.add(new Laptop(107, "SAMSUNG"));
		lap.add(new Laptop(507, "DELL"));
		lap.add(new Laptop(710, "APPLE"));

		for (Laptop laptop : lap) {
			System.out.println(laptop.name + "<--------->" + laptop.id);
		}
	}
}
