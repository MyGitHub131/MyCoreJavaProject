package com.alliswell.beans;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Robot implements Serializable {

	private static final long serialVersionUID = 1L;

	int robotId;
	String robotName;
	String robotAddress;

	public void robotDisplay() {
		System.out.println("Read From File.......");
		System.out.println("RobotId : " + robotId + "-------" + "RobotName : " + robotName + "-------"
				+ "RobotAddress : " + robotAddress);
	}

	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.robotId = 107;
		robot.robotName = "Monica";
		robot.robotAddress = "United State Of America";
		writeToFile(robot);
		readFromFile();
	}

	public static void writeToFile(Robot r1) {
		String f1 = "Robot.text";
		try {
			ObjectOutputStream oos = new ObjectOutputStream((new FileOutputStream(f1)));
			oos.writeObject(r1);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readFromFile() {
		String f1 = "Robot.text";
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f1));
			Robot robot2 = (Robot) ois.readObject();
			robot2.robotDisplay();
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
