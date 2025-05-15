//move all the odd integers at the beginning of the array followed by all the even integers.
//input=1,2,4,6,8,3,7
//output=1,3,7,2,4,6,8
package com.pkg.ag2.arr;

import java.util.Arrays;

public class MoveAllOddEven {

	static int[] segregate(int[] arr) {
		
		int left=0;
		int right= arr.length-1;
		
		while (left<right) {
			
			while(arr[left]%2 !=0 && left<right) {		//Move left pointer until an even number is found
				left++;
			}
			
			while(arr[right]%2 ==0 && left<right){	//Move right pointer until an odd number is found
				right--;
			}
			
			if (left<right) {				//Swap odd (right) and even (left) 
				int temp = arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
		}
		
		//for presenting odd and even parts in a sorted manner
		
		int partition =0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%2 !=0)
				partition++;
		}
		
		Arrays.sort(arr, 0, partition);
		Arrays.sort(arr, partition, arr.length);
		
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4, 5, 6};
		int res[]= segregate(arr);
		
		for (int k=0; k<res.length; k++)
		{
			System.out.print(res[k]+ " ");
		}

	}



}
