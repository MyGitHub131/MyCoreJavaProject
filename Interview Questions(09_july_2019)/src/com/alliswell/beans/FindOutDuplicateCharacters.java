package com.alliswell.beans;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindOutDuplicateCharacters {
	public static void duplicateCharacters(String input) {
		Map<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}
		System.out.println("Duplicate characters is : " + hm);
		Iterator<Character> iterator = hm.keySet().iterator();
		while (iterator.hasNext()) {
			Character character = iterator.next();
			if (hm.get(character) > 1) {
				System.out.println(character + " : " + hm.get(character));
			}
		}

	}

	public static void main(String[] args) {
		duplicateCharacters("a b c d a c d g h ");
	}
}
