package com.alliswell.beans;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeTesting06 {
	public static void main(String[] args) {
		Set<Employee> t = new TreeSet<Employee>(new SortingByEmployeeIdComparator());
		
		t.add(new Employee(3, "Sanju Apa", "8658966807"));
		t.add(new Employee(2, "Riva Apa", "9938382613"));
		t.add(new Employee(1, "Hara Apa", "7259365014"));

		for (Employee em : t) {
			System.out.println(em.id + "=======" + em.name + "=======" + em.phone);
		}
	}
}
