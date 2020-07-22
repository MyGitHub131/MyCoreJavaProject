
package com.alliswell.beans;

import java.util.Set;
import java.util.TreeSet;

public class AlienTesting11 {
	public static void main(String[] args) {
		Set<Alien> a = new TreeSet<Alien>(new SortingByAlienIdComparator());

		a.add(new Alien(307, "Mitu Mallick"));
		a.add(new Alien(107, "Bibhuti Bhusan Khalapaika"));
		a.add(new Alien(707, "Subhransu Sekhara Sethy"));

		for (Alien alien : a) {
			System.out.println(alien.id + "=======" + alien.name);
		}
	}
}
