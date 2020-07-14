package com.alliswell.beans;

public class MoveAllZerosToAnArray {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 5, 0, 12, 0, 7, 3, 0, 2 };
		int len = arr.length;
		int coun = 0;

		// Move all zeros to end of an array
		// Logic is goes to here

		for (int i = 0; i < len; i++) {
			if (arr[i] != 0) {
				arr[coun++] = arr[i];
			}
		}
		while (coun < len) {
			arr[coun++] = 0;
		}
		for (int j = 0; j < len; j++) {
			System.out.println(arr[j]);
		}
	}
}
