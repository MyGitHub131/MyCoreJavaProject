package com.alliswell.beans;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateWords {
	public static void findDuplicateWords(String input) {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		String[] strings = input.split(",");
		for (String temp : strings) {
			if (hm.containsKey(temp)) {
				hm.put(temp, hm.get(temp) + 1);
			} else {
				hm.put(temp, 1);
			}
		}
		Iterator<String> iterator = hm.keySet().iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			if (hm.get(string) > 1) {
				System.out.println(string + " : " + hm.get(string));
			}
		}
	}

	public static void findDuplicateCharacter(String input) {
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (int i = 0; i < input.length(); i++) {
			
			char ch = input.charAt(i);
			if (hm.get(ch) != null) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}
		Iterator<Character> iterator = hm.keySet().iterator();
		while (iterator.hasNext()) {
			Character character = iterator.next();
			if (hm.get(character) > 1) {
				System.out.println(character + " : " + hm.get(character));
			}
		}
	}

	public static void main(String[] args) {

		findDuplicateWords("ABC,abcd,abc,bcd,abcd");
		findDuplicateWords("I,am,am,learning,java,java,on,over,over,here");
		findDuplicateCharacter("Java J2ee Java Jsp Servlet");
		findDuplicateCharacter("Spring Java Angular Jsf Servlet Hibernet");
	}
}
