package com.alliswell.beans;

import java.util.HashMap;
import java.util.Iterator;

public class FindDuplicateWords {
	public static void findDuplicateWords(String input) {
		HashMap<String, Integer> hm = new HashMap<>();
		String[] sp = input.split(" ");
		for (String temp : sp) {
			if (hm.get(temp) != null) {
				hm.put(temp, hm.get(temp) + 1);
			} else {
				hm.put(temp, 1);
			}
		}
		Iterator<String>iterator = hm.keySet().iterator();
		while(iterator.hasNext()){
			String string = iterator.next();
			if(hm.get(string) > 1){
				System.out.println(string + " : " + hm.get(string));
			}
		}
	}

	public static void main(String[] args) {
		findDuplicateWords("I am am learning java java");
	}
}
