package PalindromeNumber;

import java.util.Scanner;

public class PalindromeN {
	public static void main(String[] args) {
		
		String original, reverse = "";
		
	      Scanner in = new Scanner(System.in);
	      System.out.print("Please enetre the number :");
	      original = in.nextLine();
	      
	      int length = original.length();
	 
	      for (int i = length - 1; i >= 0; i--)
	      {
	         reverse = reverse + original.charAt(i);
	      }
	      if (original.equals(reverse))
	      {
	         System.out.println(original+":Given number is palindrome...");
	      }
	      else
	      {
	         System.out.println(original+":Given number is not a palindrome...");
	      }
	   }
	}	