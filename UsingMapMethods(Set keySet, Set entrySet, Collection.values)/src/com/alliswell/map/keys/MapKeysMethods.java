package com.alliswell.map.keys;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapKeysMethods {
	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("Mitu", 101);
		hm.put("Kshirod", 102);
		hm.put("Partha", 103);
		hm.put("Bibhuti", 104);
		hm.put("Abinash", 105);

		System.out.println("value : " + hm.get("Bibhuti"));

		System.out.println("value : " + hm.get("Mitu"));

		System.out.println("Size : " + hm.size());

		Set<String> keys1 = hm.keySet();

		Set<Entry<String, Integer>> entries = hm.entrySet();

		Collection<Integer> values = hm.values();

		System.out.println("Collected all keys and values from map : " + hm);

		System.out.println("COllected keys from map : " + keys1);

		System.out.println("Collected entries from map : " + entries);

		System.out.println("The values of map is : " + values);
		
	}
}
