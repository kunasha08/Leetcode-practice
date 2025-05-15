package com.pkg.ag2.str;

import java.util.Arrays;

public class Anagram {

	static boolean checkAnagram(String str1, String str2) {
		
		int n= str1.length();
		int m= str2.length();
		
		if (n!=m) 
			return false;
		
		char arr1[]= str1.toCharArray();
		char arr2[]= str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for (int i=0; i<n; i++) { 
			if (arr1[i]!=arr2[i]) { 
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		String str1= "abc";
		String str2= "cbad";
		checkAnagram(str1, str2);
		
		if (checkAnagram(str1, str2)==true){
			System.out.println("Strings are anagram");
		}
		else
			System.out.println("Strings are not anagram");

	}

}
