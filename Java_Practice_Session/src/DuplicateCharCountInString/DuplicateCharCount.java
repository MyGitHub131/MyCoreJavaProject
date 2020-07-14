package DuplicateCharCountInString;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharCount {
	public static void duplicatecharCount(String inputString)
	{
		//Creating a HashMap containing char as key and it's occurrences as value
		
		HashMap<Character, Integer> duplicatecharCountMap = new HashMap<>();
		
		//Converting given string to char array
		
		char[] strArray = inputString.toCharArray();
		
		//checking each char of strArra
		
		for(char ch : strArray)
		{
			if(duplicatecharCountMap.containsKey(ch))
			{
				//If char is present in charCountMap, incrementing it's count by 1
				
				duplicatecharCountMap.put(ch, duplicatecharCountMap.get(ch)+1);
			}
			else
			{
				//If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
				
				duplicatecharCountMap.put(ch, 1);
			}
		}
		 //Getting a Set containing all keys of charCountMap
		
		Set<Character> charsInString = duplicatecharCountMap.keySet();
		System.out.println("Duplicate Characters In :::"+inputString);
		
		 //Iterating through Set 'charsInString'
		
		for(Character ch : charsInString)
		{
			if(duplicatecharCountMap.get(ch)>1)
			{
				 //If any char has a count of more than 1, printing it's count
				
				System.out.println(ch+":"+duplicatecharCountMap.get(ch));
			}
		}
	}
	
	public static void main(String[] args) {
		duplicatecharCount("Java Jsp Java J2ee JavaScript");
		duplicatecharCount("All Is Well");
		duplicatecharCount("Well Done Buddy");
		duplicatecharCount("No Pain No Gain");
		duplicatecharCount("Do Or Die");
		duplicatecharCount("Never Give Up");
	}
}
