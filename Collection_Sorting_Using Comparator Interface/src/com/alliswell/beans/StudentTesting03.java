package com.alliswell.beans;

import java.util.Set;
import java.util.TreeSet;

public class StudentTesting03 {
	public static void main(String[] args) {
		Set<Student> stu = new TreeSet<Student>(new SortingByStudentPhoneComparator());

		stu.add(new Student("5", "Riva", "7259365014"));
		stu.add(new Student("2", "Sanjukta", "8658966807"));
		stu.add(new Student("9", "Bala", "9556636904"));
		stu.add(new Student("4", "Hara", "9938382613"));
		stu.add(new Student("8", "Mira", "4555256910"));

		for (Student s : stu) {
			System.out.println(s.sPhone + "<=======>" + s.sName + "<=======>" + s.sId);
		}
	}
}
