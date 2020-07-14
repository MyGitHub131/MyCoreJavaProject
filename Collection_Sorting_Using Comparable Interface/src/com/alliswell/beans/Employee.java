
package com.alliswell.beans;

public class Employee implements Comparable<Employee> {
	String eId;
	String eName;
	String ePhone;

	public Employee(String eId, String eName, String ePhone) {
		this.eId = eId;
		this.eName = eName;
		this.ePhone = ePhone;
	}

	@Override
	public int compareTo(Employee e) {
		return eName.compareTo(e.eName);
	}

}
