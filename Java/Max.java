//this program returns the maximum value, 2nd max value, and 3rd max value in an array
package com.pkg.ag2.arr;

public class Max {

	public static void main(String[] args) {
		
		int arr[]= {14, 22, 36, 1, 70, -8, 4, 501, 61, 9};
		int max=0;					//arr[0] for arrays with all negative elements
		int secondmax =0;
		int thirdmax = 0;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > max) 
			{ 
                thirdmax = secondmax; 
                secondmax = max; 
                max = arr[i]; 
            } 								
            else if (arr[i] > secondmax) 		//If arr[i] is in between first and second
            { 
                thirdmax = secondmax; 
                secondmax = arr[i]; 
            } 								
//            else if (arr[i] > thirdmax) 		//If arr[i] is in between second and third
//            { 
//                thirdmax = arr[i]; 
//            } 
		}
		System.out.println("The highest value of the array is: " +max);
		System.out.println("The 2nd highest value of the array is: " +secondmax);
		System.out.println("The 3rd highest value of the array is: " +thirdmax);
	}

}
