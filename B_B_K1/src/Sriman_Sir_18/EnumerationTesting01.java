package Sriman_Sir_18;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTesting01 {
public static void main(String[] args) {
	
	Vector v = new Vector();
	
	for(int i=0; i<10; i++)
	{
		v.addElement(i);
		System.out.println(v);
	}
	
	Enumeration e = v.elements();
	
	do
	{
		int i = (Integer)e.nextElement();
		System.out.println(i+"");
	}while(e.hasMoreElements());
}
}
