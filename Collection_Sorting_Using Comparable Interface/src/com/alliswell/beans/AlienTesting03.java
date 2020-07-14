
package com.alliswell.beans;

import java.util.Set;
import java.util.TreeSet;

public class AlienTesting03 {
	public static void main(String[] args) {
		Set<Alien> t = new TreeSet<Alien>();
		t.add(new Alien(5, "Riva Apa"));
		t.add(new Alien(4, "Sanju Apa"));
		t.add(new Alien(3, "Bala Apa"));
		t.add(new Alien(2, "Hara Apa"));
		t.add(new Alien(1, "Mira Apa"));
		
		for (Alien alien : t) {
			System.out.println(alien.id + "<===========>" + alien.name);
		}
	}
}
