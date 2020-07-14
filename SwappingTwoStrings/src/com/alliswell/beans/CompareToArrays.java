
package com.alliswell.beans;

import java.util.Arrays;

public class CompareToArrays {
	public static void main(String[] args) {
		int[] a = { 0, 1, 5, 6};
		int[] b = { 0, 1, 5 };
		if (Arrays.equals(a, b)) {
			System.out.println("Same");
		} else {
			System.out.println("Not same");
		}
	}
}



