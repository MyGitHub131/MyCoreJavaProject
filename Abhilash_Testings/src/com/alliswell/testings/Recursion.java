package com.alliswell.testings;

public class Recursion {
	public void m1() {
		System.out.println("Hello");
		m2();
	}

	public void m2() {
		System.out.println("World");
		m1();
	}

	public static void main(String[] args) {
		Recursion r1 = new Recursion();
		r1.m1();
	}
}
