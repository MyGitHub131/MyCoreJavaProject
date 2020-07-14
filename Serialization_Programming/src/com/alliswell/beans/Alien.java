package com.alliswell.beans;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Alien implements Serializable {

	private static final long serialVersionUID = 1L;

	int alienId;
	String alienName;
	String alienAddress;

	public Alien(int alienId, String alienName, String alienAddress) {
		this.alienId = alienId;
		this.alienName = alienName;
		this.alienAddress = alienAddress;
	}

	public void alienDiaplay() {
		System.out.println("Read From File.......");
		System.out.println("AlienId : " + alienId + "-------" + "AlienName : " + alienName + "-------"
				+ "AlienAddress : " + alienAddress);
	}

	public static void main(String[] args) {
		Alien alien = new Alien(103, "Subhransu", "Sonpur");
		writeToFile(alien);
		readFromFile();
	}

	public static void writeToFile(Alien a1) {
		String f1 = "Alien.html";
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f1));
			oos.writeObject(a1);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readFromFile() {
		String f1 = "Alien.html";
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f1));
			Alien alien2 = (Alien) ois.readObject();
			alien2.alienDiaplay();
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
