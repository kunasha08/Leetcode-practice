//program to find longest word in a string and print its length
package com.pkg.ag2.str;

public class LongestWord {
	
	static void findLongestWordLength(String str) {
		
		str +=" ";
		int n = str.length();
		int wordlen=0;
		int maxlen=0;
		
		for (int i=0; i<n; i++) 
		{	
			char ch= str.charAt(i);
			
			if (ch!=' ') 
			{
				wordlen++;
			}
			
			else
			{
				maxlen=Math.max(maxlen,wordlen);
				wordlen=0;
			}
			
		}

		System.out.println("Length of longest word is " +maxlen);
	}
	
	public static void main(String[] args) {
		String str= "Anushka hates programming stuff";
		findLongestWordLength(str);

	}

}
