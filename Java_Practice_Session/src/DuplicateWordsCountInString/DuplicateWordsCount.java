package DuplicateWordsCountInString;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsCount {
	public static void duplicatewordsCount(String inputString)
	{
		//Splitting inputString into words
		
		String[] words = inputString.split(" ");
		
		//Creating one HashMap with words as key and their count as value
		
		HashMap<String, Integer> duplicatewordsCountMap = new HashMap<>();
		
		//Checking each word
		
		for(String word : words)
		{
			 //whether it is present in wordCount
			
			if(duplicatewordsCountMap.containsKey(word.toLowerCase()))
			{
				 //If it is present, incrementing it's count by 1
				
				duplicatewordsCountMap.put(word, duplicatewordsCountMap.get(word.toLowerCase())+1);
			}
			else
			{
				//If it is not present, put that word into wordCount with 1 as it's value
				
				duplicatewordsCountMap.put(word.toLowerCase(), 1);
			}
		}
		 //Extracting all keys of wordCount
		
		Set<String> wordsInString = duplicatewordsCountMap.keySet();
		
		 //Iterating through all words in wordCount
		
		for(String word : wordsInString)
		{
			 //if word count is greater than 1
			
			if(duplicatewordsCountMap.get(word)>1)
			{
				//Printing that word and it's count
				
				System.out.println(word+" : "+duplicatewordsCountMap.get(word));
			}
		}
	}
	
	public static void main(String[] args) {
		duplicatewordsCount("Java Jsp J2ee Java Jsp J2ee");
		duplicatewordsCount("All Is Well Again All Is Well");
		duplicatewordsCount("All The Best Again All The Best");
		duplicatewordsCount("Well Done Bro Again Well Done Bro");
	}
}
