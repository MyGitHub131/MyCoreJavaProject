package com.alliswell.beans;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	int empId;
	String empName;
	String empAddress;
	String empNo;
	String empEmail;

	public Employee(int empId, String empName, String empAddress, String empNo, String empEmail) {
		
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empNo = empNo;
		this.empEmail = empEmail;
	}

}
