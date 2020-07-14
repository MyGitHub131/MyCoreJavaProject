package EachCharCountInString;

import java.util.HashMap;

public class EachCharCount {
	public static void CharacterCount(String inputString)
	{
		//Creating a HashMap containing char as a key and occurrences as  a value
		
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		
		 //Converting given string to char array
		 
		char[] strArray = inputString.toCharArray();
		
		//checking each char of strArray
		
		for(char ch : strArray)
		{
			if(charCountMap.containsKey(ch))
			{
				//If char is present in charCountMap, incrementing it's count by 1
				
				charCountMap.put(ch, charCountMap.get(ch)+1);
			}
			else
			{
				 //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
				
				charCountMap.put(ch, 1);
			}
		}
		//Printing the charCountMap
		
		System.out.println(charCountMap);
	}
	
	public static void main(String[] args) {
		CharacterCount("Java Jsp Java Jsp JavaScript");
		CharacterCount("All Is Well");
		CharacterCount("Well Done Buddy");
	}
}
