package com.alliswell.testings;

import java.util.Scanner;

public class Voter {
	public void voterAgeValidCheked(int age) throws VoterAgeInvalidException {
		if (age < 18) {
			throw new VoterAgeInvalidException("Voter age is invalid : " + age);
		} else {
			System.out.println("Congrats... !!!");
			System.out.println("You are elgible to give a vote...");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the voter age : ");
		Integer temp = sc.nextInt();
		sc.close();

		try {
			Voter v = null;
			v = new Voter();
			v.voterAgeValidCheked(temp);
		} catch (VoterAgeInvalidException e) {
			e.printStackTrace();
		}
	}
}
