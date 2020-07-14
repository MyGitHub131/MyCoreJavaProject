
package FibonacciNumberSeries;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		//With out taking value from the keyboard..........
		/*int a=0, b=1, c;
		
		System.out.println(a);
		System.out.println(b);
		
		c = a+b;
		System.out.println(c);
		
		a=b;
		b=c;
		c = a+b;
		
		while(c<17)
		{
			a=b;
			b=c;
			c = a+b;
			System.out.println(c);
		}*/
		
		//With taking value from the keyboard..........
		
		int fibCount;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the number :");
		fibCount = in.nextInt();
		System.out.println("Fibonacci Number Series Is Here.......");
		
		int[] fib = new int[fibCount];
			fib[0] = 0;
			fib[1] = 1;
			
		for(int i=2; i<fibCount; i++)
		{
			fib[i] = fib[i-1] + fib[i-2];
		}
		for(int i=0; i<fibCount; i++)
		{
			System.out.println(fib[i] +" ");
		}
	}	
}
