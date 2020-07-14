package Sriman_Sir_18;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTesting03 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		for(int i=0; i<10; i++)
		{
			al.add(i);
			System.out.println(al);
		}
		
		ListIterator lit = al.listIterator();

		do
		{
			int i = (Integer)lit.next();
			System.out.println(i+"");
			
			if(i % 2==0)
			{
				lit.set(i);
				lit.add(i);
			}
		}while(lit.hasNext());
		System.out.println("***********************************");
		System.out.println(al);
	}
}
