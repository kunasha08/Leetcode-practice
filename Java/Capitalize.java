package com.pkg.ag2.str;

public class Capitalize {

	static void capitalize(String str) {
		
		String word="";
		str += " ";//for last word
		String result="";
		for (int i= 0; i<str.length(); i++) 
		{
			char ch= str.charAt(i);
			if (ch!=' ') 
			{
				word= word+ch;
			}
			else 
			{
				char first = word.charAt(0);
				first = Character.toUpperCase(first);
				result= result +first + word.substring(1)+" ";
				word="";
			}
			
		}
		
		System.out.print(result);
	}
	
	public static void main(String[] args) 
	{
		String str= "getsuga tensho";
		capitalize(str);

	}

}
