package com.alliswell.beans;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the no...");
		int no = sc.nextInt();
		int temp = no;
		int rev = 0;
		int rem;

		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (no == rev) {
			System.out.println("Given no is palindrome : " + rev);
		} else {
			System.out.println("Given no is not a palindrome : " + rev);
		}
	}
}
