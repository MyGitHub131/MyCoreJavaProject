package com.alliswell.beans;

public class SwappingToString {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "India";

		System.out.println("Before swapping string is s1 : " + s1);
		System.out.println("Before swapping string is s2 : " + s2);

		System.out.println("------------------------------------------");
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println("After swapping string is s1 : " + s1);
		System.out.println("After swapping string is s2 : " + s2);
	}
}