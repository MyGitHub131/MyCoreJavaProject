package com.alliswell.beans;

import java.util.Set;
import java.util.TreeSet;

public class UniversityTesting14 {
	public static void main(String[] args) {
		Set<University> u = new TreeSet<University>(new SortingByUniversityNameComparator());
		
		u.add(new University(507, "Biju Pattnaik University", "Computer Science"));
		u.add(new University(708, "Utkal University", "Electrical Branches"));
		u.add(new University(405, "Brula university", "Sivil Branches"));
		
		for (University university : u) {
			System.out.println(university.name + "=======" + university.id +"=======" + university.branches);
		}
	}
}
