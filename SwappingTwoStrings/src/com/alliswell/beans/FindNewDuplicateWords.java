package com.alliswell.beans;

import java.util.HashMap;
import java.util.Iterator;

public class FindNewDuplicateWords {
	public static void duplicateWords(String input) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		String[] str = input.split(" ");
		for (String temp : str) {
			if (hashMap.get(temp) != null) {
				hashMap.put(temp, hashMap.get(temp) + 1);
			} else {
				hashMap.put(temp, 1);
			}
		}
		Iterator<String> iterator = hashMap.keySet().iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			if (hashMap.get(string) > 1) {
				System.out.println("Duplicate Words : " + string + "---" + hashMap.get(string));
			}
		}
	}

	public static void main(String[] args) {
		duplicateWords("I am am learning learning java java");
		duplicateWords("God always with with me me");
	}
}
