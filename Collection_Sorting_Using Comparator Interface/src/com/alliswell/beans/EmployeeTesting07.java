package com.alliswell.beans;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeTesting07 {
	public static void main(String[] args) {
		Set<Employee> t = new TreeSet<Employee>(new SortingByEmployeeNameComparator());
		
		t.add(new Employee(3, "Sanju Apa", "8658966807"));
		t.add(new Employee(2, "Riva Apa", "9938382613"));
		t.add(new Employee(1, "Hara Apa", "7259365014"));

		for (Employee emp : t) {
			System.out.println(emp.name + "========" + emp.id + "========" + emp.phone);
		}
	}
}
