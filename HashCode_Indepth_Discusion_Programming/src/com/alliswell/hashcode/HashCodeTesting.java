package com.alliswell.hashcode;

public class HashCodeTesting {
	public static void main(String[] args) {

		Human Mitu = new Human("Mitu Mallick", 21234561);
		Integer hashcodeValueOfMituObject = Mitu.hashCode();
		System.out.println("hashcode Of Mitu is : " + hashcodeValueOfMituObject);

		Human Kshirod = new Human("Kshirod Pradhan", 11234562);
		Integer hashcodeValueOfKshirodObject = Kshirod.hashCode();
		System.out.println("hashcode Of Kshirod is : " + hashcodeValueOfKshirodObject);

		Human Pritam = new Human("Pritam Kumar Behera", 21234563);
		Integer hashcodeValueOfPritamObject = Pritam.hashCode();
		System.out.println("hashcode Of Pritam is : " + hashcodeValueOfPritamObject);

		Human Bibhuti = new Human("Bibhuti Bhusan Khalapaika", 31234564);
		
		Integer hashcodeValueOfBibhutiObject = Bibhuti.hashCode();
		System.out.println("hashcode Of Bibhuti is : " + hashcodeValueOfBibhutiObject);

		Human Abinash = new Human("Abinash Pradhan", 41234565);
		Integer hashcodeValueOfAbinashObject = Abinash.hashCode();
		System.out.println("hashcode Of Abinash is : " + hashcodeValueOfAbinashObject);

		String mitu = new String("Mitu Mallick");
		String kshirod = new String("Kshirod Pradhan");

		Integer hashcodeValueOfMituObject1 = mitu.hashCode();
		System.out.println("hashcode Of Mitu is : " + hashcodeValueOfMituObject1);

		Integer hashcodeValueOfKshirod1Object = kshirod.hashCode();
		System.out.println("hashcode Of Kshirod is : " + hashcodeValueOfKshirod1Object);

		String s1 = "Bibhu";
		String s2 = "Bibhu";
		String s3 = "Bibhu";

		System.out.println("hashcode Of S1 is : " + s1.hashCode() + " hashcode Of S2 is : " + s2.hashCode()
				+ " hashcode Of s3 is : " + s3.hashCode());

		String mitu1 = "FB";
		String mitu2 = "WB";

		System.out.println("hashcode Of Mitu1 is : " + mitu1.hashCode() + " hashcode Of Mitu2 is : " + mitu2.hashCode());
	}
}
