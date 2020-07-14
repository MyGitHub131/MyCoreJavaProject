
package com.alliswell.pojo;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateString {
	public static void findOutDuplicateStringWords(String str) {
		HashMap<String, Integer> hm = new HashMap<>();
		String[] sp = str.split(" ");

		for (String tempString : sp) {
			if (hm.get(tempString) != null) {
				hm.put(tempString, hm.get(tempString) + 1);
			} else {
				hm.put(tempString, 1);
			}
		}
		Iterator<String> iterator = hm.keySet().iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			if (hm.get(string) > 1) {
				System.out.println(string + " : " + hm.get(string));
			}

		}
	}

	public static void findOutDuplicateStringCharacter(String str) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (hm.get(c) != null) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
	}

	public static void main(String[] args) {
		findOutDuplicateStringWords("I am am am the best best");
		findOutDuplicateStringWords("java j2ee java spring j2ee spring");
		findOutDuplicateStringCharacter("Java J2ee Java Spring Hibernate Spring");
	}
}
