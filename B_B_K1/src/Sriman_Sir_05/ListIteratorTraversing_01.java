package Sriman_Sir_05;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTraversing_01 {
	
	public static void main(String[] args)
	    {    
	        ArrayList<String> list = new ArrayList<String>();
	         
	        list.add("ONE");
	         
	        list.add("TWO");
	         
	        list.add("THREE");
	        
	        list.add("FOUR");
	         
	        ListIterator iterator = list.listIterator();
	         
	        System.out.println("Elements in forward direction");
	         
	        while (iterator.hasNext())
	        {
	            System.out.println(iterator.next());
	        }
	         
	        System.out.println("Elements in backward direction");
	         
	        while (iterator.hasPrevious())
	        {
	            System.out.println(iterator.previous());
	        }
	    }

}
