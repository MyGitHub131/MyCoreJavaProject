package Sriman_Sir_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OddEven{
public static void main(String[] args)throws Exception {
	int num;
	//Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Please enter the value...");
	//num = sc.nextInt();
	num = Integer.parseInt(br.readLine());
	
	if(num % 2==0)
	{
		System.out.println("Given number is Even");
	}
	else
	{
		System.out.println("Given number is Odd");
	}
}
}
