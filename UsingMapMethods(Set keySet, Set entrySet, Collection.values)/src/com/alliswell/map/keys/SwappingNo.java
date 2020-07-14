package com.alliswell.map.keys;

public class SwappingNo {
	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		/*
		 * int temp;
		 * 
		 * temp = a; a = b; b = temp;
		 */

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
}
