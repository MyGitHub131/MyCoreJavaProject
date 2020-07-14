package com.alliswell.testings;

public class HumanTesting {
	String name;
	int age;
	String address;
	String qualification;

	public void displayHumanTesting() {
		System.out.println("Human_Name : " + name + "::" + " Age : " + age + "::" + " Address : " + address + "::"
				+ " Qualification : " + qualification);
	}

	public static void main(String[] args) {
		HumanTesting h = new HumanTesting();
		h.name = "Abinash Pradhan";
		h.age = 27;
		h.address = "Balugaon";
		h.qualification = "MCA";

		h.displayHumanTesting();
	}
}
