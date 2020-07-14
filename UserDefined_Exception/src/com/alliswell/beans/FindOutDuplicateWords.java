package com.alliswell.beans;

import java.util.HashMap;
import java.util.Iterator;

public class FindOutDuplicateWords {
	public static void duplicateWords(String input) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		String[] string = input.split(" ");
		for (String temp : string) {
			if (hashMap.get(temp) != null) {
				hashMap.put(temp, hashMap.get(temp) + 1);
			} else {
				hashMap.put(temp, 1);
			}
		}
		Iterator<String> iterator = hashMap.keySet().iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			if (hashMap.get(str) > 1) {
				System.out.println("Duplicate Words : " + str + "-------" + hashMap.get(str));
			}
		}
	}

	public static void wordOccurrences(String msg) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String[] str = msg.split(" ");
		for (String temp : str) {
			if (hm.get(temp) != null) {
				hm.put(temp, hm.get(temp) + 1);
			} else {
				hm.put(temp, 1);
			}
		}
		System.out.println("Word Occurrences : " + hm);
	}

	public static void main(String[] args) {
		duplicateWords("I love love my my india india");
		wordOccurrences("I am am the best best in in the world world");
	}
}