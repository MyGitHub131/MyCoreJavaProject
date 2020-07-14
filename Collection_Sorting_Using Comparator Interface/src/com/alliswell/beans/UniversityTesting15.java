package com.alliswell.beans;

import java.util.Set;
import java.util.TreeSet;

public class UniversityTesting15 {
		public static void main(String[] args) {
			Set<University> u = new TreeSet<University>(new SortingByUniversityBranchesComparator());
			
			u.add(new University(507, "Biju Pattnaik University", "Computer Science"));
			u.add(new University(708, "Utkal University", "Electrical Branches"));
			u.add(new University(405, "Brula university", "Sivil Branches"));
			
			for (University university : u) {
				System.out.println(university.branches + "=======" + university.id +"=======" + university.name);
			}
		}
}

