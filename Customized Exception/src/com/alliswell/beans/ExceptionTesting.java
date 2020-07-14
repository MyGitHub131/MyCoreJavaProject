package com.alliswell.beans;

import java.util.Scanner;

public class ExceptionTesting {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Please enter the voter age : ");
			int i = sc.nextInt();

			Voter v = null;
			v = new Voter();
			v.voterageValidChecked(i);
		} catch (VoterAgeInvalidException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
