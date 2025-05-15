//Move all zeros to end of array
//this program uses two pointer approach
package com.pkg.ag2.arr;

public class MoveZeroes {

	public static int[] pushZeroestoEnd(int[] arr) {
	
		//step1: place j where the first 0 is
		int j=-1;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i]==0) {
				j=i;
				break;
			}
		}
		
		//swap with j when non-zero element is encountered
		for (int i=j+1; i<arr.length; i++) {
			if (arr[i]!=0) {
				int temp= arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
				j++;
			}
		}
		return arr;

	}

	public static void main(String[] args) {
		int[]arr= {1,2,0,4,3,0,5,0};
		pushZeroestoEnd(arr);
		
		for (int num:arr)
		{
			System.out.print(num + " ");					//printing the array elements
		}

	}

}
