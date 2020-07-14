package com.alliswell.map.keys;

public class Demo {
	static int a = 17;
	static String b = "Mitu";

	static void display() {
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
	public void fun(){
		display();
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.fun();
	}
}
