package Sriman_Sir_03;

import java.util.ArrayList;

public class ArrayTest2 {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
			al1.add("a");
			al1.add("b");
			al1.add("c");
			al1.add("d");
			
			//randomly retrieving
			
			Object obj;
				obj = al1.get(3);
			System.out.println(obj);
			
			System.out.println("-----------------------------------------------");
			
			//Sequentially retrieving
			
			for(int i=0; i<al1.size(); i++)
			{
				Object obj1;
					obj = al1.get(i);
			System.out.println(obj);
				
			}
	}

}
