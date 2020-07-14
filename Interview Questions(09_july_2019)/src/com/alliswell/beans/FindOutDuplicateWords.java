package com.alliswell.beans;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindOutDuplicateWords {
	public static void duplicateWords(String input) {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		String[] string = input.split(",");
		for (String temp : string) {
			if (hm.containsKey(temp)) {
				hm.put(temp, hm.get(temp) + 1);
			} else {
				hm.put(temp, 1);
			}

		}
		System.out.println("Duplicate words occurrences is  : " + hm);
		Iterator<String> iterator = hm.keySet().iterator();
		while (iterator.hasNext()) {
			String temp = iterator.next();
			if (hm.get(temp) > 1) {
				System.out.println(temp + " : " +hm.get(temp));
			}
		}
	}

	public static void main(String[] args) {
		duplicateWords(" Java, J2ee, Spring, Java, Hibernate ");
	}
}
