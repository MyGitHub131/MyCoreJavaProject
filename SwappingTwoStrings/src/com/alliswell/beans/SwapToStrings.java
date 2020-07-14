//Swapping two strings by using third variables...
package com.alliswell.beans;

public class SwapToStrings {
	public static void main(String[] args) {
		String x = "Mitu";
		String y = "Mallick";
		String temp = "null";

		temp = x;
		x = y;
		y = temp;

		System.out.println("The value of X : " + x);
		System.out.println("The value of Y : " + y);
	}
}
