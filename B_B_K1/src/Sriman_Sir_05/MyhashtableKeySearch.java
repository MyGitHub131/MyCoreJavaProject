package Sriman_Sir_05;

import java.util.Hashtable;

public class MyhashtableKeySearch {
	public static void main(String[] args) {
		Hashtable <String, String> hm = new Hashtable <String, String>();
		
		hm.put("Mitu", "101 INSERTED");
		hm.put("Bibhu", "102 INSERTED");
		hm.put("Partha", "103 INSERTED");
		hm.put("Forman", "104 INSERTED");
		hm.put("Kshirod", "105 INSERTED");
		
		System.out.println(hm);
		
		if(hm.containsKey("Partha")){
			System.out.println("The hashtable contains key is : partha");
		}
		else{
			System.out.println("The hashtable does not contains any key is : partha");
		}
		if(hm.containsKey("Forman")){
			System.out.println("The hashtable contains key is : forman");
		}
		else{
			System.out.println("The hashtable does not contains any key is : forman");
		}
		if(hm.containsKey("Bibhu")){
			System.out.println("The hashtable contains key is : bibhu");
		}
		else{
			System.out.println("The hashtable does not contains key is : bibhu");
		}
		if(hm.containsKey("Mitu")){
			System.out.println("The hashtable contains key is : mitu");
		}
		else{
			System.out.println("The hashtable does not contains key is : mitu");
		}
		if(hm.containsKey("Kshirod")){
			System.out.println("The hashtable contains key is : kshirod");
		}
		else{
			System.out.println("The hashtable does not contains key is : kshirod");
		}
		if(hm.containsKey("Abinash")){
			System.out.println("The hashtable contains key is : abinash");
		}
		else{
			System.out.println("The hashtable does not contains any key is : abinash");
		}
	}

}
