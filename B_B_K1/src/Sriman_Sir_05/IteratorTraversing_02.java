package Sriman_Sir_05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class IteratorTraversing_02 {
	 public static void main(String[] args)
	    {
	        List list = new ArrayList();
	 
	        list.add("ONE");
	 
	        list.add("TWO");
	 
	        list.add("THREE");
	 
	        //Traversing list elements using Iterator
	        Iterator iterator1 = list.iterator();
	        System.out.println("Iterator in forward direction :");
	        while (iterator1.hasNext())
	        {
	            System.out.println(iterator1.next());
	        }
	        System.out.println("...........................................................................................................................................");
	 
	        Queue queue = new PriorityQueue(list);
	        //Traversing queue elements using Iterator
	        Iterator iterator2 = queue.iterator();
	        System.out.println("Queue in forward direction :");
	        while (iterator2.hasNext())
	        {
	            System.out.println(iterator2.next());
	        }
	        System.out.println("...........................................................................................................................................");
	   	 
	        Set set = new HashSet(list);
	 
	        //Traversing set elements using Iterator
	        Iterator iterator3 = set.iterator();
	        System.out.println("Set in forward direction :");
	        while (iterator3.hasNext())
	        {
	            System.out.println(iterator3.next());
	        }
	        System.out.println("...........................................................................................................................................");
	        
	        System.out.println("...........................................................................................................................................");
	        //Traversing list elements using ListIterator
	        ListIterator listIterator = list.listIterator();
	        System.out.println("ListIterator elements in forward direction :");
	        while(listIterator.hasNext()){
	        	System.out.println(listIterator.next());
	        }
	        System.out.println("********************************************************************************************************************************************");
	        System.out.println("ListIterator elements in backward direction :");
	        while(listIterator.hasPrevious()){
	        	System.out.println(listIterator.previous());
	        }
	        
	   	 

      }
}
