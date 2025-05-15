package com.pkg.ag2.str;

import java.util.HashMap;

public class CountOccurencesOfWords {

	static void countWordOccurences(String s) {
		HashMap <String, Integer> countmap= new HashMap<String, Integer>();
		
		s+=" ";
		
		String arr[]= s.split(" ");
		
		for (String str: arr) {
			String word= str.toLowerCase();
			if (countmap.containsKey(word)) {
				countmap.put(word, countmap.get(word)+1);
			}
			else {
				countmap.put(word, 1);
			}
		}
		
		System.out.println(countmap);
	}
	
	public static void main(String[] args) {
		String s= "The quick brown fox jumps over the lazy dog the fox";
		countWordOccurences(s);
	}

}
