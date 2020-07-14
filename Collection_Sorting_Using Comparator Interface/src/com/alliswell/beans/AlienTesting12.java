package com.alliswell.beans;

import java.util.Set;
import java.util.TreeSet;

public class AlienTesting12 {
	public static void main(String[] args) {
		Set<Alien> a = new TreeSet<Alien>(new SortingByAlienNameComparator());
		
		a.add(new Alien(507, "Mitu Mallick"));
		a.add(new Alien(107, "Bibhuti Bhusan Khalapaika"));
		a.add(new Alien(805, "Soumya Patra"));
		
		for (Alien alien : a) {
			System.out.println(alien.name + "=======" + alien.id);
		}
	}
}


