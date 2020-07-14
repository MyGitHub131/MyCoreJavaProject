package Sriman_Sir_05;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.Vector;

public class Testing {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		LinkedList l2 = new LinkedList();
		Vector v = new Vector();
		
		System.out.println(l1 instanceof Serializable);
		System.out.println(l1 instanceof Cloneable);
		System.out.println(l1 instanceof RandomAccess);
		System.out.println(l2 instanceof RandomAccess);
		System.out.println(v instanceof RandomAccess);
	}

}
