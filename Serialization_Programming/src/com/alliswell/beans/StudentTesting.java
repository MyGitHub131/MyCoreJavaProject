package com.alliswell.beans;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentTesting {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student student = new Student();
		student.stuId = 105;
		student.stuName = "Abinash Biswal";
		student.stuAddress = "Balugaon";
		student.stuNo = "7259365014";
		student.stuEmail = "abinash195@gmail.com";

		FileOutputStream fos = new FileOutputStream("Abinash.text");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(student);
		oos.close();

		FileInputStream fis = new FileInputStream("Abinash.text");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Student student2 = (Student) ois.readObject();
		ois.close();

		System.out.println("StuId : " + student2.stuId + "-------" + "StuName : " + student2.stuName + "-------"
				+ "StuAddress : " + student2.stuAddress + "-------" + "StuNo : " + student2.stuNo + "-------"
				+ "StuEmail : " + student2.stuEmail);

	}
}
