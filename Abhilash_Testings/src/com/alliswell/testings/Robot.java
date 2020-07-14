package com.alliswell.testings;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Robot implements Serializable {

	private static final long serialVersionUID = 1L;

	int robot_id;
	String name;
	String origin;

	public Robot(int robot_id, String name, String origin) {
		this.robot_id = robot_id;
		this.name = name;
		this.origin = origin;
	}

	public void robotDisplay() {
		System.out.println("Read from file...");
		System.out.println("Robot_Id : " + robot_id + "..." + ", Name : " + name + "..." + ", Origin : " + origin);
	}

	public static void main(String[] args) {
		Robot bibhu = new Robot(107, "Bibhuti", "America");
		writeToFile(bibhu);
		readFromFile();
	}

	public static void writeToFile(Robot r1) {
		String f1 = "Bibhuti.text";
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f1));
			oos.writeObject(r1);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readFromFile() {
		String f1 = "Bibhuti.text";
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f1));
			Robot r2 = (Robot) ois.readObject();
			r2.robotDisplay();
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
