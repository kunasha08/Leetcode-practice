//2 ways to reverse a string
package com.pkg.ag2.str;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		String reverse = " ";
		
		for (int i=original.length()-1; i>=0; i--)
			reverse = reverse + original.charAt(i);
		System.out.println("The reversed string is: "+reverse);
		
		
		//second method we use Stringbuffer
		
		StringBuffer sb = new StringBuffer(original);
		reverse = sb.reverse().toString();
		
		System.out.println("The reversed string is: "+reverse);
		
	}

}
