package com.alliswell.beans;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTesting {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee employee = new Employee(107, "Abhilash", "Puri", "8658966807", "abhilash197@gmail.com");

		FileOutputStream fos = new FileOutputStream("Abhilash.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(employee);
		oos.close();

		FileInputStream fis = new FileInputStream("Abhilash.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee employee2 = (Employee) ois.readObject();
		ois.close();

		System.out.println("EmpId : " + employee2.empId + "-------" + "EmpName : " + employee2.empName + "-------"
				+ "EmpAddress : " + employee2.empAddress + "-------" + "EmpNo : " + employee2.empNo + "-------"
				+ "EmpEmail : " + employee2.empEmail);
	}
}
