package Sriman_Sir_10;

public class Telusko_01 {
	public static void main(String[] args) {
		
		for(int i=1; i<=8; i++)
		{
			for(int k=7; k>=i; k--)
			{
				System.out.print("* ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}