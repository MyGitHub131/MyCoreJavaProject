package DupliicateWordsCountInString;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsCountInString {
	public static void duplicateWords(String inputString)
	{
		String[] words = inputString.split(" ");
		
		HashMap<String, Integer> duplicateWordsMap = new HashMap<>();
		
		for(String word : words )
		{
			if(duplicateWordsMap.containsKey(word.toLowerCase()))
			{
				duplicateWordsMap.put(word.toLowerCase(), duplicateWordsMap.get(word.toLowerCase())+1);
			}
			else
			{
				duplicateWordsMap.put(word.toLowerCase(), 1);
			}
		}
		
		Set<String> wordsInString = duplicateWordsMap.keySet();
		
		for(String word : wordsInString)
		{
			if(duplicateWordsMap.get(word)>1)
			{
				System.out.println(word+" : "+duplicateWordsMap.get(word));
			}
		}
	}
	public static void main(String[] args) {
		duplicateWords("Bread butter and bread");
		duplicateWords("Java is java again java");
		duplicateWords("Super Man Bat Man Spider Man");
		
		duplicateWords("Java Jsp Java Jsp");
		duplicateWords("J2ee Java J2ee");
		duplicateWords("All Is Well again All Is Well");
		duplicateWords("Well Done Buddy again Well Done Buddy");
	}
}
