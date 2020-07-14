package com.alliswell.beans;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Mobile implements Serializable {

	private static final long serialVersionUID = 1L;

	int mobileId = 1075;
	String mobileName = "Samsung";
	String mobileBrand = "Samsung Eseries";

	public void mobileDisplay() {
		System.out.println("Read From File.......");
		System.out.println("MobileId : " + mobileId + "-------" + "MobileName : " + mobileName + "-------"
				+ "MobileBrand : " + mobileBrand);
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Mobile mobile = new Mobile();
		writeToFile(mobile);
		readFromFile();
	}

	public static void writeToFile(Mobile m1) throws FileNotFoundException, IOException {
		String f1 = "Mobile.ser";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f1));
		oos.writeObject(m1);
		oos.close();
	}

	public static void readFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		String f1 = "Mobile.ser";
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f1));
		Mobile mobile = (Mobile) ois.readObject();
		mobile.mobileDisplay();
		ois.close();
	}
}
 
