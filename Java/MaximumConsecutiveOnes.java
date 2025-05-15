//Given an array arr[] consisting of only 0’s and 1’s, 
//the task is to find the count of a maximum number of consecutive 1’s present in the array.
package com.pkg.ag2.arr;

public class MaximumConsecutiveOnes {

	static int findMaxConsecutive(int[] arr) {
		
		int count=0;						//to get updated after each element of array
		int maxCount=0;						//to get updated only for element to be counted consecutively 
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i]==1) {
				count++;
			}
			else {
				count=0;					//reset to 0
			}
			
			maxCount= Math.max(count, maxCount);
		}
		
		return maxCount;
	}
	public static void main(String[] args) {
		
		int arr[]= {1,1,1,0,0,1,0,1,0,1,1,1,1,};
		int count= findMaxConsecutive(arr);
		System.out.println(count);

	}

}
