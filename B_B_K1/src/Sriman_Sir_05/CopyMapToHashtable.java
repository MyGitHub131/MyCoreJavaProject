package Sriman_Sir_05;

import java.util.HashMap;
import java.util.Hashtable;

public class CopyMapToHashtable{
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
			ht.put("first", "First Inserted");
			ht.put("second", "Second Inserted");
			ht.put("third", "Third Inserted");
			System.out.println(ht);
		HashMap<String, String> hm = new HashMap<String, String>();
			hm.put("s1", "S1 Value");
			hm.put("s2", "S2 Value");
			ht.putAll(hm);
			System.out.println(ht);
		
	}

}
