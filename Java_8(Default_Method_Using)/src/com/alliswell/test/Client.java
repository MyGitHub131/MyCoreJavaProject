package com.alliswell.test;

import com.alliswell.beans.HDFC;
import com.alliswell.beans.ICICI;
import com.alliswell.beans.IRBI;
import com.alliswell.beans.SBI;

public class Client {
	public static void main(String[] args) {
		
		IRBI sbiUser = new SBI();
		sbiUser.deposit();
		sbiUser.withdraw();
		sbiUser.linkAdhaar();
		sbiUser.minBalance();
		
		System.out.println("============================================");
		
	
		
		IRBI iciciUser = new ICICI();
		iciciUser.deposit();
		iciciUser.withdraw();
		iciciUser.linkAdhaar();
		iciciUser.minBalance();
		
		System.out.println("============================================");
		
		IRBI hdfcUser = new HDFC();
		hdfcUser.deposit();
		hdfcUser.withdraw();
		hdfcUser.linkAdhaar();
		hdfcUser.minBalance();
	}
}

