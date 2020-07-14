package Sriman_Sir_11;

import java.util.HashMap;

public class CharacterCountInString {
	static void characterCount(String inputString)
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
		System.out.println(charCountMap);
	}
	public static void main(String[] args) {
		characterCount("Java J2EE Jsp Servlet");
		characterCount("All is Well");
		characterCount("Good Better Best");
	}

}
