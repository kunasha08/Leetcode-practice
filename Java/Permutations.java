package com.pkg.ag2.str;

public class Permutations {

	  public static void permutations(String str, String result) {
		  
				// Base Condition
				if (str.length() == 0) {
					System.out.print(result + " ");
					return;
				}

				for (int i = 0; i < str.length(); i++) {
					char fix = str.charAt(i);		// ith character of str

					String ros = str.substring(0, i) +str.substring(i + 1); // Rest of the string after excluding the ith character

					permutations(ros, result + fix); //recursive call
				}
			}

	public static void main(String[] args) {
	    String str = "ABC";
	    permutations(str, " "); 
	  }

}
