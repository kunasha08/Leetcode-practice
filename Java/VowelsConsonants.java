package com.pkg.ag2.str;

public class VowelsConsonants {
	
	static void countVowelsAndConsonants(String str) {
		
		String vowels="";
		String consonants="";
		
		for (int i=0; i<str.length(); i++) {
			char ch= str.charAt(i);
			
			if (ch=='a'| ch=='e'|ch=='i'|ch=='o'|ch=='u') {
				vowels= vowels+ch;
			}
			
			else
				consonants= consonants+ch;
		}
		
		System.out.println("The vowels are: "+ vowels+ " and the consonants are: "+ consonants);
	}

	public static void main(String[] args) {
		String str = "Pneumonoultramicroscopicsilicovolcanoconiosis";
		countVowelsAndConsonants(str);

	}

}
