package ArraylistValueRetrieving;

import java.util.ArrayList;

public class ArrayListTesting {
	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();
			al1.add("A");
			al1.add("B");
			al1.add("C");
			
		ArrayList<String> al2 = new ArrayList<>(al1);
			al2.add("D");
			al2.add("E");
			al2.add("5");
			
			System.out.println("al1 elements :"+al1);
			System.out.println("al2 elements :"+al2);
			
			//Getting array elements randomly from an array
			Object obj;
				obj = al1.get(1);
				System.out.println("Randomly getting array elements :"+obj);
				
			//Getting array elements sequentially from an array0
			for(int i=0; i<al1.size(); i++)
			{
				Object obj1;
					obj1 = al1.get(i);
					System.out.println("Sequentially getting array elements :"+obj1);
				
			}
	}
}
