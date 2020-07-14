package FactorialNumber;

import java.util.Scanner;

public class FactorialNO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the no :");
		int n = sc.nextInt();
		
		int fact = 1;
		for(int i=1; i<=10; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial no is :"+fact);
	}

}
