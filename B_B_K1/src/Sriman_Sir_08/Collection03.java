package Sriman_Sir_08;

import java.util.ArrayList;
import java.util.ListIterator;

public class Collection03 {
	public static void main(String[] args) {
		
	//Creating user defined class objects
		
		Student s1 = new Student(101, "Bibhuti", 25);
		Student s2 = new Student(102, "Abinash", 23);
		Student s3 = new Student(103, "Subhransu", 22);
		
	//Creating ArrayList here
		
		ArrayList al = new ArrayList();
			al.add(s1);//Adding student class objects
			al.add(s2);
			al.add(s3);
			
	//Getting iterator
			
			ListIterator iterator = al.listIterator();
		
	//Traversing iterator
			System.out.println("*******************************************************************************************************************************************");
			System.out.println("Display message in forward direction :");
			while(iterator.hasNext()){
				Student st = (Student)iterator.next();
			System.out.println(st.roll_No+" "+st.name+" "+st.age);
			}
			
			System.out.println("*******************************************************************************************************************************************");
			System.out.println("Display message in backward direction :");
			while(iterator.hasPrevious()){
				Student st = (Student)iterator.previous();
			System.out.println(st.roll_No+" "+st.name+" "+st.age);
			}
			System.out.println("********************************************************************************************************************************************");
	}
}
