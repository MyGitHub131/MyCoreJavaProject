
//Swapping two strings without using third variables...
package com.alliswell.beans;

public class SwappingToStrings {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";

		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		System.out.println("The value of A : " + a);
		System.out.println("The value of B : " + b);
	}
}

