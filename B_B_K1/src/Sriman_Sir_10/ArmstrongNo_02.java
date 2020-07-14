//ArmstrongNumber
package Sriman_Sir_10;

import java.util.Scanner;

public class ArmstrongNo_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value...");
		int n = sc.nextInt();
		
		int temp = n;
		int r, sum = 0;
		
		do
		{
			r = n%10;
			n = n/10;
			sum = sum + r*r*r;
			
		}while(n>0);
		
		if(temp==sum){
			System.out.println("Given number is Armstrong");
		}
		else
		{
			System.out.println("Given number is not Armstrong");
		}
	}

}
