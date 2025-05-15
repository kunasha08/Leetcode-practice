package com.pkg.ag2.str;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacters {
	static void countOccurenceofCharacters(String str) {
		HashMap<Character, Integer> countmap= new HashMap<>();
		
		for (char ch: str.toCharArray()) {
			if (countmap.containsKey(ch)) {
				countmap.put(ch, countmap.get(ch)+1);
			}
			
			else {
				countmap.put(ch, 1);
			}	
		}
		
		System.out.print(countmap);

	}
	
	public static void main(String[] args) {
		String str = "Pneumonoultramicroscopicsilicovolcanoconiosis";
		countOccurenceofCharacters(str);
		

	}
}
