package com.alliswell.beans;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class KeysMapping {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("Mitu", 107);
		map.put("Bibhu", 108);
		map.put("Kshirod", 109);
		map.put("Pritam", 110);
		map.put("Abinash", 111);

		// System.out.println(map.size());
		// System.out.println(map.get("Kshirod"));
		Collection<Integer> values = map.values();
		System.out.println("All values from map : " + values);
		Set<String> keys = map.keySet();
		System.out.println("All keys from map : " + keys);
		Set<Entry<String, Integer>> entries = map.entrySet();
		System.out.println("All entries from map : " + entries);
	}
}
