package StringReverseNumber;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int num, rev = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number :");
		num = sc.nextInt();
		
		while(num!=0)
		{
			rev = rev*10;
			rev = rev+num%10;
			num = num/10;
		}
		System.out.println("Given number is reverse :"+rev);
	}

}
