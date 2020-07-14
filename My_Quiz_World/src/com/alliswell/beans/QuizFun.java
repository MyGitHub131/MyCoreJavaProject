package com.alliswell.beans;

import java.util.Scanner;

public class QuizFun {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		sc.nextLine();

		System.out.println("WelCome To My Quiz World !!!");
		System.out.println("----------------------------");

		System.out.println("Q1.) What is 2+2.....??");
		System.out.println("Options");
		System.out.println("_______");

		System.out.println("a : 6");
		System.out.println("b : 4");
		System.out.println("c : 8");

		
		System.out.println("d : 10");
		System.out.println("------");

		String str = sc.nextLine();
		if (str.equalsIgnoreCase("b")) {
			System.out.println("Correct Answer...");
			count++;
		} else {
			System.out.println("Wrong Answer...");
		}

		System.out.println("Q2.) Who is the prime minister of india.....??");
		System.out.println("Options");
		System.out.println("_______");

		System.out.println("a : Manmohan Sing");
		System.out.println("b : APJ Kalam");
		System.out.println("c : Narendra Modi");
		System.out.println("d : Amit Saha");
		System.out.println("------");

		String str1 = sc.nextLine();
		if (str1.equalsIgnoreCase("c")) {
			System.out.println("Correct Answer...");
			count++;
		} else {
			System.out.println("Wrong Answer...");
		}

		System.out.println("Q3.) Who is the home minister of india.....??");
		System.out.println("Options");
		System.out.println("_______");

		System.out.println("a : Rajnath Sing");
		System.out.println("b : Nirmala Sitaraman");
		System.out.println("c : Pyush Goyal");
		System.out.println("d : Amit Saha");
		System.out.println("------");

		String str2 = sc.nextLine();
		if (str2.equalsIgnoreCase("d")) {
			System.out.println("Correct Answer...");
			count++;
		} else {
			System.out.println("Wrong Answer...");
		}

		System.out.println("Q4.) Who is the railway minister of india.....??");
		System.out.println("Options");
		System.out.println("_______");

		System.out.println("a : Pyush Goyal");
		System.out.println("b : Amit Saha");
		System.out.println("c : Nirmala Sitaraman");
		System.out.println("d : Dharmendra Pradhan");
		System.out.println("------");

		String str3 = sc.nextLine();
		if (str3.equalsIgnoreCase("a")) {
			System.out.println("Correct Answer...");
			count++;
		} else {
			System.out.println("Wrong Answer...");
		}

		System.out.println("Q5.) Who is the defense minister of india.....??");
		System.out.println("Options");
		System.out.println("_______");

		System.out.println("a : Nirmala Sitaraman");
		System.out.println("b : Rajnath Sing");
		System.out.println("c : Amit Saha");
		System.out.println("d : Manmohan Sing");
		System.out.println("------");

		String str4 = sc.nextLine();
		if (str4.equalsIgnoreCase("b")) {
			System.out.println("Correct Answer...");
			count++;
		} else {
			System.out.println("Wrong Answer...");
		}
		System.out.println(count + " Correct Out Of 5");
		System.out.println("ALL The BEST !!!");
	}
}                                                              
                                          