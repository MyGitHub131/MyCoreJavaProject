
package com.alliswell.beans;

import java.util.HashMap;
import java.util.Iterator;

public class FindDuplicateCharacters {
	public static void findDuplicateCharacters(String input) {
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (hashMap.get(ch) != null) {
				hashMap.put(ch, hashMap.get(ch) + 1);
			} else {
				hashMap.put(ch, 1);
			}
		}
		Iterator<Character> iterator = hashMap.keySet().iterator();
		while (iterator.hasNext()) {
			Character character = iterator.next();
			if (hashMap.get(character) > 1) {
				System.out.println(character + " : " + hashMap.get(character));
			}
		}
	}

	public static void main(String[] args) {
		findDuplicateCharacters("I am am the the best in in the world");
	}
}
