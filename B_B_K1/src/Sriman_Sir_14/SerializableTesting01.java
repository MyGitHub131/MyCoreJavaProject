package Sriman_Sir_14;

import java.io.*;

public class SerializableTesting01 {
	public static void main(String[] args)throws Exception {
		Dog d1 = new Dog();
		System.out.println("Serialization started...");
		
		FileOutputStream fos = new FileOutputStream("abs.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		System.out.println("Serialization ended...");
		
		System.out.println("Deserialization started...");
		
		FileInputStream fis = new FileInputStream("abs.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		
		System.out.println("Deserialization ended...");
		
		System.out.println(d2.a+".............."+d2.b);
	}

}
