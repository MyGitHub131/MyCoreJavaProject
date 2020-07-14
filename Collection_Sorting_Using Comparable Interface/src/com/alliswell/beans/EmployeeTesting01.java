package com.alliswell.beans;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeTesting01 {
	public static void main(String[] args) {
		Set<Employee> emp = new TreeSet<Employee>();

		emp.add(new Employee("7", "Riva", "8658966807"));
		emp.add(new Employee("9", "Sanju", "7259365014"));
		emp.add(new Employee("4", "Bala", "9556612589"));
		emp.add(new Employee("2", "Hara", "6555985748"));
		emp.add(new Employee("1", "Mira", "99375251321"));
		
		for (Employee e : emp) {
			System.out.println(e.eName + "<=======>" + e.eId + "<=======>" + e.ePhone);
		}
	}
}
