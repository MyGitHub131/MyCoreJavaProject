package com.alliswell.beans;

import java.util.HashMap;
import java.util.Iterator;

public class FindNewCharactersOccurrences {
	public static void findCharacters(String input) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (hm.get(ch) != null) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}
		System.out.println("Character Occurrences : " + hm);
	}

	public static void findDuplicateCharacters(String str) {
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
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

				System.out.println("Duplicate Characters : " + character + "-------" + hashMap.get(character));
			}
		}
	}

	public static void main(String[] args) {
		findCharacters("I am am the best best in the the world");
		findCharacters("Today is my my day day");
		findDuplicateCharacters("God always with with me me");
		findDuplicateCharacters("I am am the best in the the world");
	}
}
