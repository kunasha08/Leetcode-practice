//this program rotates the array to the left by 1 step 
//1 2 3 4 5   2 3 4 5 
package com.pkg.ag2.arr;

public class RightRotate {

	static void rotateRight(int arr[]) {
		
		
		int n= arr.length;
		int temp = arr[n-1];
		
//		for (int i=0; i<n-1; i++) {				//we can't assign element that has not been traversed to current element
//			arr[i+1]=arr[i];						
//		}
		
		for (int i= n-1; i>0; i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;							//element at first index will get value of last index
		System.out.println("Rotated array is: ");
		for (int a: arr) {
			System.out.print(" " + a);
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		rotateRight(arr);
		

	}

}
