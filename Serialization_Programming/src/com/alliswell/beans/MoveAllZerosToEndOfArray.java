package com.alliswell.beans;

public class MoveAllZerosToEndOfArray {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 7, 0, 12, 0, 35, 0, 45 };
		int length = arr.length;
		int count = 0;

		for (int i = 0; i < length; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while (count < length) {
			arr[count++] = 0;
		}
		for (int j = 0; j < length; j++) {
			System.out.println("After traversing the elements is : " + arr[j]);
		}
	}
}
