package com.alliswell.testings;

public class RecursionP {
	public void parent() {
		System.out.println("Hi...");
		parent();
	}

	public static void main(String[] args) {
		RecursionP r1 = new RecursionP();
		r1.parent();
	}
}
