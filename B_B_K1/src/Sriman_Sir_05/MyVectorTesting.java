package Sriman_Sir_05;

import java.util.Enumeration;
import java.util.Vector;

public class MyVectorTesting {
	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i=0; i<=10; i++){
			v.addElement(i);
		}
		System.out.println(v);
		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			Integer I = (Integer)e.nextElement();
			System.out.println(I);
		}
		System.out.println(v);
	}

}
