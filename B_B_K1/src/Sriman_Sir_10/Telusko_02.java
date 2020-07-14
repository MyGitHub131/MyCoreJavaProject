package Sriman_Sir_10;

public class Telusko_02 {
	public static void main(String[] args) {
		int rc=7, max=7, num=1;
		for(int i=1; i<=rc; i++)
		{
			System.out.println("");
			for(int j=1; j<=max; j++)
			{
				System.out.print(num);
				num++;
			}
			num=i+1;
			max--;
		}
	}
}
