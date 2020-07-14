package DuplicateCharCountInString;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharCountInString {
	public static void duplicatecharCount(String inputString)
	{
		HashMap<Character, Integer> duplicatecharCountMap = new HashMap<>();
		
		char[] strArray = inputString.toCharArray();
		
		for(char ch : strArray)
		{
			if(duplicatecharCountMap.containsKey(ch))
			{
				duplicatecharCountMap.put(ch, duplicatecharCountMap.get(ch)+1);
			}
			else
			{
				duplicatecharCountMap.put(ch, 1);
			}
		}
		Set<Character> charsInString = duplicatecharCountMap.keySet();
		System.out.println("Duplicate Characters In:::"+inputString);
		
		for(Character ch : charsInString)
		{
			if(duplicatecharCountMap.get(ch)>1)
			{
				System.out.println(ch+" : "+duplicatecharCountMap.get(ch));
			}
		}
	}
	public static void main(String[] args) {
		duplicatecharCount("Java J2ee Jsp Java JavaScript");
		duplicatecharCount("All Is Well");
		duplicatecharCount("Well Done Buddy");
	}
}
