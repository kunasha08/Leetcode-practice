package com.pkg.ag2.str;

public class NonRepeatingCharacter {

	static void findFirstCharacter(String str) {
		
		String s= str.toLowerCase();
		
		for (int i=0; i<s.length(); i++) {
			boolean unique= true;
			
			for (int j=0; j<s.length(); j++) {
				
				if (i!=j && s.charAt(i)==s.charAt(j)) {
					unique=false;
					//System.out.println("repeating character encountered");
					break;//to stop process after a repeating character is found
				}
			}
			
			if (unique) {
				System.out.println(s.charAt(i));
				break;//to stop process after a non repeating character is found
			}
			
		}
		
	}
	public static void main(String[] args) {
		String str = "Swiss";
		findFirstCharacter(str);

	}

}
