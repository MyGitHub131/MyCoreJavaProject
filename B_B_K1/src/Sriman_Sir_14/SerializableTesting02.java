package Sriman_Sir_14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTesting02 {
	public static void main(String[] args) throws Exception {
		Save obj = new Save();
			obj.i = 5;
		File f = new File("Obj.txt");
		
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Save  obj1 = (Save) ois.readObject();
		
		System.out.println("Vale of obj1 :"+obj1.i);
	}

}
