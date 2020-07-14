
package com.alliswell.beans;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FindDuplicateArrays {
	public static void main(String[] args) {

		// Worst case using this approaches.
		// Time complexity is : o(n)2.

		String[] arr = { "abc", "abcd", "java", "java", "DataStructure", "DataStructure"};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					System.out.println("Duplicate elements is : " + arr[j]);
				}

			}

		}
		System.out.println("*********************************************************");

		// It is the best approaches using HashSet to solve this problems.
		// Time complexity is o(n).
		

		Set<String> temp = new HashSet<String>();
		for (String tempString : arr) {
			if (temp.add(tempString) == false) {
				System.out.println("Duplicate element is : " + tempString);
			}
		}

		System.out.println("*********************************************************");

		// Using HashMap to solve this problems.

		Map<String, Integer> hm = new HashMap<>();
		for (String str : arr) {
			if (hm.get(str) != null) {

				hm.put(str, hm.get(str) + 1);
			} else {
				hm.put(str, 1);
			}
		}
		Iterator<String> iterator = hm.keySet().iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();

			if (hm.get(string) > 1) {
				System.out.println("Duplicate element is : " + string);
			}
		}

	}
}