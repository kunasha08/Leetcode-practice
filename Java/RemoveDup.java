//program to remove duplicates from a sorted array and return number of unique elements 
//we are using two pointer approach here. (2 pointers for one array) 
//1st pointer i will be for all elements of array and 2nd pointer j will be for all unique elements against which comparisons are being done

package com.pkg.ag2.arr;

public class RemoveDup {
	
	static int removeDuplicates(int []arr) {
		
		int j=0;
		for (int i=1; i<arr.length; i++) {
			if(arr[j]!=arr[i]) {					//if current element is not equal to previous element, that means element is unique
				j++;								//counter will increase as we have found a unique element
				arr[j]=arr[i];						// replace current element with unique element 
			
			}
		}
		return j+1;									//return total number of unique elements 
	}
	
	
	public static void main(String[] args) {

		int arr[]= {1,1,2,2,2,3,3};
		int k= removeDuplicates(arr);
		System.out.println("The array after removing duplicate elements:");
		for (int i=0; i<k; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		

	}

}
