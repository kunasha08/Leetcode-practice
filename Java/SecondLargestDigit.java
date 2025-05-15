package com.pkg.ag2.str;

public class SecondLargestDigit {

	static int findSecondLargestDigit(String str) {
		
		int max1=0;
		int max2=0;
		int num=0;
		char arr[]= new char[str.length()];
		
		for (int i=0; i<str.length(); i++) {
			char ch= str.charAt(i);
			
			if (Character.isDigit(ch)==true) {
				 num= Character.getNumericValue(ch);
				if (num>max1) {
					max2=max1;
					max1=num;
				}
				
				else if (num>max2  && num!=max1) {
					max2=num;
				}
			}
		}
		return max2;
	}
	public static void main(String[] args) {
		String str = "dfa1234261afd";
		int k =findSecondLargestDigit(str);
		System.out.println(k);

	}

}
