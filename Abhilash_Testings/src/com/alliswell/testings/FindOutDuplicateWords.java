package com.alliswell.testings;

import java.util.HashMap;
import java.util.Iterator;

public class FindOutDuplicateWords {
	public static void duplicateWords(String str) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String[] temp = str.split(" ");
		for (String temp1 : temp) {
			if (hm.get(temp1) != null) {
				hm.put(temp1, hm.get(temp1) + 1);
			} else {
				hm.put(temp1, 1);
			}
		}
		Iterator<String> iterator = hm.keySet().iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			if (hm.get(string) > 1) {
				System.out.println("---Duplicate Words---");
				System.out.println("---------------------");
				System.out.println(string + " : Duplicate Words : " + hm.get(string));
			}
		}
	}

	public static void main(String[] args) {
		duplicateWords("I am the the best best in the world world");
		duplicateWords("I can can do it it only");
		duplicateWords("GOd always with with me");
	}
} 