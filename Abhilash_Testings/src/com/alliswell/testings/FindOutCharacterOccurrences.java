package com.alliswell.testings;

import java.util.HashMap;

public class FindOutCharacterOccurrences {
	public static void charOccurrences(String input) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < input.length(); i++) {
			Character character = input.charAt(i);
			if (hashMap.get(character) != null) {
				hashMap.put(character, hashMap.get(character) + 1);
			} else {
				hashMap.put(character, 1);
			}
		}
		System.out.println("CharacterOccurrences : " + hashMap);
	}

	public static void main(String[] args) {
		charOccurrences("Java concept of the day");
	}

}
