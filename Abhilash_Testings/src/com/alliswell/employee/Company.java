package com.alliswell.employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Company {
	public static void main(String[] args) throws IOException {

		// Create bufferReader object to accept data from keyboard

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Employee emp = null;
		emp = new Employee();

		System.out.println(".......Employee details.......");
		System.out.println("==============================");

		System.out.print("Enter Employee_id : ");
		emp.eid = sc.nextInt();

		System.out.print("Enter Emp_name : ");
		emp.ename = sc.next();

		System.out.print("Enter Emp_dept : ");
		emp.dept = sc.next();

		System.out.print("Enter Emp_salary : ");
		emp.salary = sc.nextDouble();

		System.out.print("Enter Emp_mobile : ");
		emp.mobile = sc.nextLong();

		System.out.print("Enter Emp_email : ");
		emp.e_mail = sc.next();

		System.out.print("Enter Sex (M/F) : ");
		emp.gender = (char) br.read();

		System.out.println(".......Employee data are given as.......");
		System.out.println("========================================");

		System.out.println("Name : " + emp.ename);
		System.out.println("Dept : " + emp.dept);
		System.out.println("Salary : " + emp.salary);
		System.out.println("Mobile : " + emp.mobile);
		System.out.println("E_mail : " + emp.e_mail);
		System.out.println("Gender : " + emp.gender);
		System.out.println("WorkingStatus : " + emp.workingStatus);
	}
}
