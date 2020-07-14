package com.alliswell.testings;

import java.util.HashMap;

public class FindOutWordOccurrences {
	public static void wordOccurrences(String str) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String[] temp = str.split(" ");
		for (String temp1 : temp) {
			if (hm.get(temp1) != null) {
				hm.put(temp1, hm.get(temp1) + 1);
			} else {
				hm.put(temp1, 1);
			}
		}
		System.out.println("Word Occurrences : " + hm);
	}

	public static void main(String[] args) {
		wordOccurrences("I am the best best in the the world world");
	}
}