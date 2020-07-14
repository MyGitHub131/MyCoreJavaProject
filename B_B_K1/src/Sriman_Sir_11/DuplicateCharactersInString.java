//Java Program To Find Duplicate Characters In A String :
package Sriman_Sir_11;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersInString {
	static void duplicateCharCount(String inputString)
	{
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		char[] strArray = inputString.toCharArray();
		
		for(char c : strArray)
		{
			if(charCountMap.containsKey(c))
			{
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else
			{
				charCountMap.put(c, 1);
			}
		}
		Set<Character> characterInString = charCountMap.keySet();
		System.out.println("Duplicate characters in :"+inputString);
		
		for(Character ch : characterInString)
		{
			if(charCountMap.get(ch)>1)
			{
				System.out.println(ch +" : "+ charCountMap.get(ch));
			}
		}
	}
	public static void main(String[] args) {
		duplicateCharCount("Java J2EE Jsp Srevlet Jdbc");
		duplicateCharCount("Good Morning Good Afternoon Good Evening");
		duplicateCharCount("All is Well");
	}
}
