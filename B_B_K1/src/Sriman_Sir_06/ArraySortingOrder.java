package Sriman_Sir_06;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortingOrder {
	public static void main(String[] args) {
		System.out.println("...............................................................................................................................................");
		List<String> listStrings = Arrays.asList("Orange", "Lemon", "Mango", "Pineapple", "Apple", "Guva", "Banana", "Grapes", "Jackfruit");
		System.out.println("Before Sorting :"+listStrings);
		Collections.sort(listStrings);
		System.out.println("After Sorting :"+listStrings);
		Collections.reverse(listStrings);
		System.out.println("After Sorting Reverse :"+listStrings);
		System.out.println("...............................................................................................................................................");
		
		System.out.println("...............................................................................................................................................");
		List<Character> listCharacters = Arrays.asList('F', 'G', 'H', 'J', 'T', 'S', 'W', 'Y');
		System.out.println("Before Sorting :"+listCharacters);
		Collections.sort(listCharacters);
		System.out.println("After Sorting :"+listCharacters);
		Collections.reverse(listCharacters);
		System.out.println("After Sorting Reverse :"+listCharacters);
		System.out.println("...............................................................................................................................................");
		
		System.out.println("...............................................................................................................................................");
		List<Integer> listIntegers = Arrays.asList(45, 56, 23, 87, 98, 5, 15, 77, 66, 43);
		System.out.println("Before Sorting :"+listIntegers);
		Collections.sort(listIntegers);
		System.out.println("After Sorting :"+listIntegers);
		Collections.reverse(listIntegers);
		System.out.println("After Sorting Reverse :"+listIntegers);
		System.out.println("...............................................................................................................................................");
		
	}

}
