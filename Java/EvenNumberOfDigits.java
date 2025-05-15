//Given an array nums of integers, return how many of them contain an even number of digits.
//Input: nums = [12,345,2,6,7896]
//Output: 2
//12 contains 2 digits (even number of digits). 345 contains 3 digits (odd number of digits). 2 contains 1 digit (odd number of digits). 
//6 contains 1 digit (odd number of digits). 7896 contains 4 digits (even number of digits). 
//Therefore only 12 and 7896 contain an even number of digits.
package com.pkg.ag2.arr;

public class EvenNumberOfDigits {

	static int findEven(int arr[]) {
		
		int count=0;
//		for (int i=0; i<arr.length; i++) {
//			
//			String s=Integer.toString(arr[i]);			//convert element to string and get its length
//			
//			if (s.length()%2==0)
//				count++;
//		}
		
		for (int num:arr) {
			if(String.valueOf(num).length()%2==0) {
				count++;
			}
		}
		
		return count;
		
	}
	public static void main(String[] args) {
		
		int arr[]= {12, 44, 213, 232, 3433};
		int k= findEven(arr);
		System.out.println(k);
	}

}
