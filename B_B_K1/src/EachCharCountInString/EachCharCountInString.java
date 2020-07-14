package EachCharCountInString;

import java.util.HashMap;

public class EachCharCountInString {
	public static void charCount(String inputString)
	{
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		
		char[] strArray = inputString.toCharArray();
		
		for(char ch : strArray)
		{
			if(charCountMap.containsKey(ch))
			{
				charCountMap.put(ch, charCountMap.get(ch)+1);
			}
			else
			{
				charCountMap.put(ch, 1);
			}
		}
		System.out.println(charCountMap);
	}
	public static void main(String[] args) {
		charCount("Java J2ee Jsp Java JavaScript");
		charCount("All Is Well");
		charCount("Well Done Buddy");
	}
}
