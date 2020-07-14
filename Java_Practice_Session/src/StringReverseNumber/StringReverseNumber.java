package StringReverseNumber;

import java.util.Scanner;

public class StringReverseNumber {
	public static void main(String[] args) {
		String str ="";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number :");
		str = sc.nextLine();
		
		char[] input = str.toCharArray();
		for(int i = input.length-1; i>=0; i--)
		{
			System.out.println(input[i]);
		}
	}

}