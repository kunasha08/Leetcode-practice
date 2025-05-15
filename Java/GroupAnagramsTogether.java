//Given an array of strings strs, group the anagrams together.
package com.pkg.ag2.str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagramsTogether {

	static ArrayList<List<String>> groupAnagrams(String strs[]) {
		
		HashMap<String, List<String>> countmap= new HashMap<>();
				
		//keys are sorted strings and values are all anagrams of the sorted string.
		//output will be all values of the hashmap.
		
		
		for (String s: strs) {
			char word[]= s.toCharArray();
			Arrays.sort(word);
			String sortedString = new String(word);
			if (!countmap.containsKey(sortedString)) 
			{
				countmap.put(sortedString, new ArrayList<>()); //if key doesn't exist in map- make new entry in map with new sorted string and an empty ;ist	
				
			}
			
			countmap.get(sortedString).add(s);            //else, in the values, add the string
		
		}
		
//		System.out.println(countmap);                     //this also works, printing as arraylist is the desirable output
		
		return new ArrayList<>(countmap.values());
		
	}
	public static void main(String[] args) {
		String strs[]  = {"eat","tea","tan","ate","nat","bat"};
		System.out.print(groupAnagrams(strs));
	}

}
