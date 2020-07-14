package com.alliswell.testings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Alien implements Serializable {

	private static final long serialVersionUID = 1L;

	int alienNo;
	String name;
	String address;

	public Alien(int alienNo, String name, String address) {
		this.alienNo = alienNo;
		this.name = name;
		this.address = address;
	}

	public void alienDisplay() {

		System.out.println("Alien_No : " + alienNo + "....." + " Name : " + name + "....." + " Address : " + address);
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Alien alien = new Alien(715, "Bibhuti", "Canada");
		writeToFile(alien);
		readFromFile();
	}

	public static void writeToFile(Alien a1) throws FileNotFoundException, IOException {
		String f1 = "Abhilash.text";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f1));
		oos.writeObject(a1);
		oos.close();
	}

	public static void readFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		String f1 = "Abhilash.text";
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f1));
		Alien alien = (Alien) ois.readObject();
		alien.alienDisplay();
		ois.close();

	}
}
