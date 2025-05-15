//TwoSum- pair with given sum
//Given an array arr[] of n integers and a target value, the task is to find whether there is a pair of elements in the array whose sum is equal to target.
package com.pkg.ag2.arr;

public class TwoSum {

	
	static boolean twoSum(int[] arr, int target) {

		for (int i=0; i<arr.length; i++)				//iterate through each element from the start
		{
			for (int j=i+1; j<arr.length; j++) {		//For each element arr[i], check every other element arr[j] that comes after it
				if(arr[i]+arr[j]==target) {
					System.out.print(arr[i]);
					System.out.print(arr[j]);
					return true;
				}
			}
		}
		
		return false;									//if no pair is found after checking all possibilites
	}
	
	public static void main(String args[]) {
		
		int arr[]= {2,0,-1,-3,-1};
		int target=-2;
		
		if (twoSum(arr, target))
			System.out.print("True");
		
		else
			System.out.print("False");
	}
