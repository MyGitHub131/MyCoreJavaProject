package com.alliswell.testings;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Joker implements Serializable {

	private static final long serialVersionUID = 1L;

	int joker_id;
	String name;
	String address;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Joker sapa = new Joker();
		sapa.joker_id = 107;
		sapa.name = "Bibhuti";
		sapa.address = "Puri";

	/*	FileOutputStream fos = new FileOutputStream("abc.text");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(sapa);

		oos.close();
*/
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("xyz.ser"));
		
		oos.writeObject(sapa);
		
		/*FileInputStream fis = new FileInputStream("abc.text");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Joker j1 = (Joker) ois.readObject();*/
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("xyz.ser"));
		
		Joker j2 = (Joker) ois.readObject();

		System.out.println("Joker_Id : " + j2.joker_id + "..." + " Name : " + j2.name + "..." + " Address : " + j2.address);
	}
}
