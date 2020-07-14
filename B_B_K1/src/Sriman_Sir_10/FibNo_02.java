//FibonacciNumberSeries
package Sriman_Sir_10;

public class FibNo_02 {
	public static void main(String[] args) {
		int a=0, b=1, c;
		
		System.out.println(a);
		System.out.println(b);
		
		c=a+b;
		
		System.out.println(c);
		
		do{
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}
		while(c<89);
	}

}
