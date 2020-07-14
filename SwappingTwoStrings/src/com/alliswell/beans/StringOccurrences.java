package com.alliswell.beans;

import java.util.HashMap;
import java.util.Iterator;

public class StringOccurrences {
	public static void findDuplicateOccurrences(String input) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String[] str = input.split(",");
		for (String temp : str) {
			if (hm.containsKey(temp)) {
				hm.put(temp, hm.get(temp) + 1);
			} else {
				hm.put(temp, 1);
			}
		}
		System.out.println(hm);
		// Here showing only Duplicate elements
		Iterator<String> iterator = hm.keySet().iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			if (hm.get(string) > 1) {
				System.out.println(string + " : " + hm.get(string));
			}
		}
	}

	public static void main(String[] args) {
		findDuplicateOccurrences(" a, b, c, d, e, e, b, a, c ");

	}
}


