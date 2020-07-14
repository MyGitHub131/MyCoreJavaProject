package com.alliswell.beans;

import java.util.HashMap;

public class FindWordsOccurrences {
	public static void findWordsOccurances(String str) {
		HashMap<String, Integer> hm = new HashMap<>();
		String[] string = str.split(" ");
		for (String string2 : string) {
			if (hm.get(string2) != null) {
				hm.put(string2, hm.get(string2) + 1);
			} else {
				hm.put(string2, 1);
			}
		}
		System.out.println(hm);
	}

	public static void main(String[] args) {
		findWordsOccurances("I am am learning in in java java");
	}
}
