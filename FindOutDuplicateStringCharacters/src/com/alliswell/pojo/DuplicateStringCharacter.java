
package com.alliswell.pojo;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateStringCharacter {
	public static void findOutDuplicateStringCharacter(String str) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (hm.get(ch) != null) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);

			}
		}
		System.out.println("Duplicate characters : " + hm);
	}

	public static void findOutDuplicateStringWord(String str) {
		HashMap<String, Integer> hm = new HashMap<>();
		String[] s = str.split(" ");
		for (String tempString : s) {

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

	public static void main(String[] args) {
		findOutDuplicateStringCharacter("java java j2ee spring j2ee spring");
		findOutDuplicateStringCharacter("all the best buddy");
		findOutDuplicateStringCharacter("all is well well");
		findOutDuplicateStringWord("java concept of the day day concept java");
	}
}
