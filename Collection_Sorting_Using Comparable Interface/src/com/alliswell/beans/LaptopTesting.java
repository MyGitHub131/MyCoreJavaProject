package com.alliswell.beans;

import java.util.Set;
import java.util.TreeSet;

public class LaptopTesting {
	public static void main(String[] args) {
		Set<Laptop> lap = new TreeSet<Laptop>();
		lap.add(new Laptop(125, "HP"));
		lap.add(new Laptop(102, "DELL"));
		lap.add(new Laptop(10, "LENOVE"));
		lap.add(new Laptop(07, "SAMSUNG"));

		for (Laptop laptop : lap) {
			System.out.println(laptop.name + "<===========>" + laptop.id);
		}
	}
}
