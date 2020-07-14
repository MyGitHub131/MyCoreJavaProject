package com.alliswell.beans;

import java.util.Set;
import java.util.TreeSet;

public class StudentTesting05 {
	public static void main(String[] args) {
		Set<Student> s = new TreeSet<Student>();
		
		s.add(new Student(307, "Mitu Mallick"));
		s.add(new Student(108, "Bibhuti Bhusan Khalapaika"));
		s.add(new Student(507, "Abinash Pradhan"));
		
		 for (Student student : s) {
			System.out.println(student.name + "-------" + student.id);
		}
	}
}
