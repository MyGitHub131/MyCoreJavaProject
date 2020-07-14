package Sriman_Sir_18;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IteratorTesting02 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		for(int i=0; i<10; i++)
		{
			al.add(i);
			System.out.println(al);
		}
		
		Iterator it = al.iterator();
		
		do
		{
			int i = (Integer)it.next();
			System.out.println(i+"");
			
			if(i % 2!=0)
			{
				it.remove();
			}
		}while(it.hasNext());
		System.out.println("***********************************");
		System.out.println(al);
	}
}
