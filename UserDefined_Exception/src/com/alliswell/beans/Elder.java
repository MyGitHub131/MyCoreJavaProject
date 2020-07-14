package com.alliswell.beans;

import java.util.Scanner;

public class Elder {
	public void elderAgeInvalidChecked(int age) throws TooElderAgeInvalidException, TooYoungerAgeInvalidException {
		if (age < 18) {
			throw new TooElderAgeInvalidException("Too elder age invalid exception : " + age);
		} else if (age > 25) {
			throw new TooYoungerAgeInvalidException("Too younger age invalid exception : " + age);

		} else {
			System.out.println("Congrat's !!! You are eligible to give a vote...");
			System.out.println("Please just wait some time you will get mail as soon as posible...");
		}

	}

	public static void main(String[] args) throws TooYoungerAgeInvalidException {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Please enter the age : ");
			int temp = sc.nextInt();
			/*    
			 * Elder e = null; //Code changed by Bibhuti Bhusan Khalapaika.
			 * new Elder();
			 */
			Elder elder = new Elder();
			elder.elderAgeInvalidChecked(temp);
			sc.close();

		} catch (TooElderAgeInvalidException e) {
			e.printStackTrace();
		}
	}
}