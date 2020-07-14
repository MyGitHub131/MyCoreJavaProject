package ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int num, rev = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the number :");
		num = in.nextInt();
		
		/*do{
			rev = rev*10 + num%10;
			num = num/10;
		}while(num!=0);
		System.out.println("Given number is reverse :"+rev);*/
		
		while(num!=0)
		{
			rev = rev*10;
			rev = rev+num%10;
			num = num/10;
		}
		System.out.println("Given number is reverse :"+rev);
	}
}
