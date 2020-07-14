package com.alliswell.beans;

import java.util.HashMap;

public class FindCharactersOccurrences {
	public static void findCharactersOccurances(String input) {
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (hashMap.get(ch) != null) {
				hashMap.put(ch, hashMap.get(ch) + 1);
			} else {
				hashMap.put(ch, 1);
			}
		}
		System.out.println(hashMap);

	}

	public static void main(String[] args) {
		findCharactersOccurances("I am am the the best in in the world");
		findCharactersOccurances("Oneday i will be work in microsoft it's my promise");
		findCharactersOccurances("Tomorrow i will be celebrate my birthday in my room with my friends");
	}
}