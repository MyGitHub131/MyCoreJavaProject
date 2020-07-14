package com.alliswell.testings;

public class MyThreadDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		MyThread t = new MyThread();

		System.out.println(t.getName());

		Thread.currentThread().setName("Bhaskar Pradhan");
		System.out.println(Thread.currentThread().getName());

		Thread.currentThread().setName("Abinash Pradhan");
		System.out.println(Thread.currentThread().getName());
	}
}
