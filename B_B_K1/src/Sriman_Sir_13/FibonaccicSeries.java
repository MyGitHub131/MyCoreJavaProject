package Sriman_Sir_13;

import java.util.Scanner;

public class FibonaccicSeries {
	public static void main(String[] args) throws Exception {
		
		int fibCount;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number...");
		fibCount = sc.nextInt();
		
		int[] fib = new int[fibCount];
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i=2; i<fibCount; i++)
		{
			fib[i] = fib[i-1] + fib[i-2];
		}
		for(int i=0; i<fibCount; i++)
		{
			System.out.println(fib[i]+" ");
		}
	}

}
