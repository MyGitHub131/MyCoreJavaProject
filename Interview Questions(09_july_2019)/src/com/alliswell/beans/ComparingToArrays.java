package com.alliswell.beans;

import java.util.Arrays;

public class ComparingToArrays {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 6 };
		int[] array2 = { 1, 2, 3, 4, 5 };
		if (Arrays.equals(array1, array2)) {
			System.out.println("Same...");
		} else {
			System.out.println("Not a same...");
		}
	}
}
