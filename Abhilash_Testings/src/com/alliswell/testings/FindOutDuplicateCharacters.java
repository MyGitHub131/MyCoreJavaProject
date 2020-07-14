package com.alliswell.testings;

import java.util.HashMap;
import java.util.Iterator;

public class FindOutDuplicateCharacters {
	public static void duplicateCharacters(String input) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < input.length(); i++) {
			Character temp = input.charAt(i);
			if (hashMap.get(temp) != null) {
				hashMap.put(temp, hashMap.get(temp) + 1);
			} else {
				hashMap.put(temp, 1);
			}
		}
		Iterator<Character> iterator = hashMap.keySet().iterator();
		while (iterator.hasNext()) {
			Character character = iterator.next();
			if (hashMap.get(character) > 1) {
				System.out.println(character + " : Duplicate Characters : " + hashMap.get(character));
			} 
		}
	}

	public static void main(String[] args) {
		duplicateCharacters("Java concept of the day");
	}
}
