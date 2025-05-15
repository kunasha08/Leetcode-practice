//The problem is to arrange the numbers in such a way that all the even numbers get the even index and odd numbers get the odd index.
package com.pkg.ag2.arr;

public class OddandEvenIndices {

	static void moveElementsToOddandEven(int arr[]) {
		
		int res[]= new int [arr.length];
		int odd=1;
		int even =0;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%2==0) {
				res[even]=arr[i];
				even += 2;
			}
			
			else {
				res[odd]=arr[i];
				odd += 2;
			}
		}
	
		
	for (int k=0; k<res.length; k++)
	{
		System.out.print(res[k]+ " ");
	}
	
	}
	public static void main(String[] args) {
		int arr[]= {10, 9, 7, 18, 13, 19, 4, 20, 21, 14};
		moveElementsToOddandEven(arr);

	}

}
