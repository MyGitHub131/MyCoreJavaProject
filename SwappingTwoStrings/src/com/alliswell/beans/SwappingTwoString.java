package com.alliswell.beans;

public class SwappingTwoString {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "World";
		String temp = "null";
		
		System.out.println("Before Swapping S1 String is : " + s1);
		System.out.println("Before Swapping S2 String is : " + s2);
		
		System.out.println("------------------------------------");
		 
		 //Swapping two strings to each others using third variables...logic here will go...
		 
		temp = s1;
		s1 = s2;
		s2 = temp;
		
		System.out.println("After Swapping S1 String is : " + s1);
		System.out.println("After Swapping S2 String is : " + s2);
		
		//Swapping two strings to each others without using any third variables...logic here will go...
		
		/*s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		
		System.out.println("After Swapping S1 String is : " + s1);
		System.out.println("After Swapping S2 String is : " + s2);*/
	}
}

