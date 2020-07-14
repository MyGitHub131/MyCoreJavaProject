package ArmstrongNumber;

import java.util.Scanner;

public class ArmstrongNB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Please enter the no :");
		int no = sc.nextInt();
		
		int temp = no, r, sum = 0;
		do
		{
			r = no%10;
			no = no/10;
			sum = sum+r*r*r;
		}while(no>0);
		
		if(temp==sum)
		{
			System.out.println("Given no is armstrong.....");
		}
		else
		{
			System.out.println("Given no is not armstrong.....");
		}
	}
}

