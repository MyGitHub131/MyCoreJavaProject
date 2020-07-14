package com.alliswell.testings;

public class HumanBeing {
	int id;
	String name;
	String address;
	String phone;
	String e_mail;

	public HumanBeing(int id, String name, String address, String phone, String e_mail) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.e_mail = e_mail;
	}

	/*
	 * public void displayHumanBeing() { System.out.println("HumanBeing_Id : " +
	 * id + "..." + ", Name : " + name + "..." + ", Address : " + address +
	 * "..." + ", Phone : " + phone + "..." + ", E_mail : " + e_mail); }
	 */

	public static void main(String[] args) {
		HumanBeing hb = null;
		hb = new HumanBeing(105, "Pranati Sahoo", "Puri", "9937525132", "pranati107@gmail.com");
		// hb.displayHumanBeing();
		System.out.println("HumanBeing : " + hb.id + "..." + ", Name : " + hb.name + "..." + ", Address : " + hb.address
				+ "..." + ", Phone : " + hb.phone + "..." + ", E_mail : " + hb.e_mail);
	}
}
