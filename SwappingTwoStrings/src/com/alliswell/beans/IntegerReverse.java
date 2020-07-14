package com.alliswell.beans;

import java.util.Scanner;

public class IntegerReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the no...");
		int no = sc.nextInt();
		int rev = 0;

		do {
			rev = rev * 10;
			rev = rev + no % 10;
			no = no / 10;
		} while (no != 0);
		System.out.println("The reverse no is : " + rev);
	}
}
