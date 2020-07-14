package com.alliswell.pojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Demonstrations {
	public static void main(String[] args) {

		Employee e1 = new Employee(1);
		Employee e2 = new Employee(1);

		HashMap<Employee, String> hm = new HashMap<Employee, String>();
		hm.put(e1, "One");
		hm.put(e2, "One");
		System.out.println(hm.size());

		Integer i1 = new Integer(2);
		Integer i2 = new Integer(2);

		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(i1, "Two");
		hm1.put(i2, "Two");
		System.out.println(hm1.size());

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			al.add(i);
		}
		System.out.println(al);

		Iterator<Integer> it = al.iterator();

		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			if (i % 2 == 0) {
				System.out.println(i);
			} else {
				it.remove();
			}
		}
		System.out.println(al);

		Vector<Integer> v = new Vector<Integer>();
		for (int i = 0; i <= 15; i++) {
			v.addElement(i);
		}
		System.out.println(v);
		Enumeration<Integer> en = v.elements();
		while (en.hasMoreElements()) {
			Integer integer = (Integer) en.nextElement();
			if (integer % 2 == 0) {
				System.out.println(integer);
			}
		}
		System.out.println(v);

		LinkedList<String> l = new LinkedList<String>();
		l.add("Mitu");
		l.add("Bibhu");
		l.add("Krishna");
		l.add("Pritam");
		l.add("Subhransu");
		System.out.println(l);
		ListIterator<String> list = l.listIterator();
		while (list.hasNext()) {
			String s = (String) list.next();
			if (s.equalsIgnoreCase("Pritam")) {
				list.remove();
			}
			if (s.equalsIgnoreCase("Subhransu")) {
				list.add("Abinash");
			}
			if (s.equalsIgnoreCase("Bibhu")) {
				list.add("Kirti");
			}

		}
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
	}
}

class Employee {
	int id;

	public Employee(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
