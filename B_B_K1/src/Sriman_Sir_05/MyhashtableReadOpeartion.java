package Sriman_Sir_05;

import java.util.Hashtable;
import java.util.Set;

public class MyhashtableReadOpeartion{
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
			ht.put("first", "First Inserted");
			ht.put("second", "Second Inserted");
			ht.put("third", "Third Inserted");
			System.out.println(ht);
			
			Set<String> keys = ht.keySet();
			for(String key: keys){
				System.out.println("Value of "+key+" is :"+ht.get(key));
			}
	}
}
