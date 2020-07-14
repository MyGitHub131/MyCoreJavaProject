package EvenOrOddNumber;

import java.util.Scanner;

public class EvenOrOddN {
	public static void main(String[] args) {
		
		/*//With out taking value from the keyboard..........
		int num =10;
		//if(num%2==0)
		if((num/2)*2==num)
		{
			System.out.println("Given number is even...");
		}
		else
		{
			System.out.println("Given number is odd...");
		}*/
		
		//With taking value from the keyboard..........
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the value :");
		int num = in.nextInt();
		
		if((num/2)*2==num)
		{
			System.out.println("Given number is even.......");
		}
		else
		{
			System.out.println("Given number is odd.......");
		}
		
	}
}
