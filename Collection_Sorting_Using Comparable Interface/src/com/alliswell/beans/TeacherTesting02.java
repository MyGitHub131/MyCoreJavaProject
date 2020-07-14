package com.alliswell.beans;

import java.util.Set;
import java.util.TreeSet;

public class TeacherTesting02 {
	public static void main(String[] args) {
		Set<Teacher> te = new TreeSet<Teacher>();
		
		te.add(new Teacher(10, "Mitu Mallick"));
		te.add(new Teacher(07, "Kshirod Senapati"));
		te.add(new Teacher(05, "Sunil Moharana"));
		te.add(new Teacher(03, "Partha Sarathi Nanda"));
		te.add(new Teacher(06, "Bibhuti Bhusan Kahalapaika"));
		
		for (Teacher teacher : te) {
			System.out.println(teacher.id + "<=======>" + teacher.name);
		}
	}
}
