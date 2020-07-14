/*
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */
/*
 * 	  1
 *   12
 *  123
 * 1234
 *12345
 */
package Sriman_Sir_19;

public class Pattern {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) 
		{
			for(int k=4; k>=i; k--)
			{
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}
}


