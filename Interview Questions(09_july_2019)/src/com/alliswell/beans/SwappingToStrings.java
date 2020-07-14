package com.alliswell.beans;

public class SwappingToStrings {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "India";
		String temp = "";

		System.out.println("Before swapping string is s1 : " + s1);
		System.out.println("Before swapping string is s2 : " + s2);
		
		System.out.println("---------------------------------------------");
		temp = s1;
		s1 = s2;
		s2 = temp;

		System.out.println("After swapping string is s1 : " + s1);
		System.out.println("After swapping string is s2 : " + s2);
	}
}
