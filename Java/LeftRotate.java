//this program rotates the array to the left by 1 step 
//1 2 3 4 5   2 3 4 5 
package com.pkg.ag2.arr;

public class LeftRotate {

	static void rotateLeft(int arr[]) {
		
		int temp = arr[0];
		int n= arr.length;
		for (int i=1; i<n; i++) {
			arr[i-1]=arr[i];
		}
		arr[n-1]=temp;				//for the first element that needs to go to the last index
		System.out.println("Rotated array is: ");
		for (int a: arr) {
			System.out.print(" " + a);
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		rotateLeft(arr);
	}

}
