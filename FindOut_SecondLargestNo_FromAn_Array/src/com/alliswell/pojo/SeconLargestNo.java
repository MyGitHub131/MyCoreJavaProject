package com.alliswell.pojo;

public class SeconLargestNo {
	public static void main(String[] args) {
		int temp;
		int[] a = { 1, 4, 6, 3, 7, 9, 2 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}
		//System.out.println("Second largest number is : " + a[1]);
		System.out.println("Second smallest number is : " + a[1]);
	}
}
