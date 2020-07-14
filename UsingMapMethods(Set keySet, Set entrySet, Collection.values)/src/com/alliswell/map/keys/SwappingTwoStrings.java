package com.alliswell.map.keys;

public class SwappingTwoStrings {
	public static void main(String[] args) {
		String s1 = "Good";
		String s2 = "Morning";
		/*String temp;
		
		temp = s1;
		s1 = s2;
		s2 = temp;*/
		
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println("Value of s1 is : " + s1);
		System.out.println("Value of s2 is : " + s2);

	}
}
