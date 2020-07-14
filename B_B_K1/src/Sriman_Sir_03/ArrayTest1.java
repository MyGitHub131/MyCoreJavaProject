package Sriman_Sir_03;

import java.util.ArrayList;

public class ArrayTest1 {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		
			al1.add("a");
			al1.add("n");
			al1.add(5);
			
		ArrayList al2 = new ArrayList(al1);
			al2.add("t");
			al2.add(3);
			al2.add(2);
			
			System.out.println("al1 array elements :" + al1);
			System.out.println("al2 array elements :" + al2);
			
	}

}
