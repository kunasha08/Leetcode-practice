//Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.

package com.pkg.ag2.arr;

public class checkSort {

	static boolean checkSortedorNot(int[] arr) {
		
		for (int i=1; i<arr.length; i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		int [] arr= {14, 3, 7, 62, 33, -90, 1};
		checkSortedorNot(arr);
		
		if (checkSortedorNot(arr)==true)
		{
			System.out.println("Yes the array is sorted");
		}
		else
		{
			System.out.println("No the array is not sorted");
		}

	}

}
