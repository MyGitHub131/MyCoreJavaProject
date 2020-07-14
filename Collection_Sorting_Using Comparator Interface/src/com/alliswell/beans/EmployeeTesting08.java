package com.alliswell.beans;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeTesting08 {
	public static void main(String[] args) {
		Set<Employee> t = new TreeSet<Employee>(new SortingByEmployeePhoneComparator());
		
		t.add(new Employee(3, "Sanju Apa", "8658966807"));
		t.add(new Employee(2, "Riva Apa", "9938382613"));
		t.add(new Employee(1, "Hara Apa", "7259365014"));

		for (Employee e : t) {
			System.out.println(e.phone + "=======" + e.id + "=======" + e.name);
		}
	}
}
