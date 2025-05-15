//Two strings s1 and s2 are called isomorphic if there is a one-to-one mapping possible for every character of s1 to every character of s2
//Input: s = "egg", t = "add" Output: true
//Input: s= "abbcdd" t = "qwwcrr" Output: true
//Input: s = "paper", t = "title" Output: true
//Input: s = "foo", t = "bar" Output: false

package com.pkg.ag2.str;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

	public static boolean checkIsomorphicOrNot(String s, String t) {
	       if (s.length()!=t.length()) {
				return false;
			}
			
			HashMap<Character, Character> charMap= new HashMap<>();
			
			for (int i=0; i<s.length(); i++) 
			{
				if (charMap.containsKey(s.charAt(i))) 
				{
					if(charMap.get(s.charAt(i))!= t.charAt(i)) {
						return false;
					}
				}
					
				else if (charMap.containsValue(t.charAt(i))) {   //if value already exists that means it is already mapped to a key, so not isomorphic
					return false;
				}
					
				else { 
						charMap.put(s.charAt(i), t.charAt(i));
				}
					
				
			}
			
			return true; 


		
	}

	public static void main(String[] args) {
		String s1="ego";
		String s2= "add";
		
		if (checkIsomorphicOrNot(s1, s2)==true) {
			System.out.println("The given strings are isomorphic!");
		}
		
		else {
			System.out.println("The given strings are not isomorphic!");
		}
	}


}
