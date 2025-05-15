package com.pkg.ag2.arr;

public class ReverseArray {

	static void reverseArray(int arr[], int n) {
		
		int[]rev= new int[n];						//creating a temp array of same size
		int j=n;
		for(int i=0; i<n; i++) {
			rev[j-1]= arr[i];						//storing elements in new array in reverse manner
			j=j-1;
		}
		
//		int j=0;		
//		for (int i=n-1; i>=0; i--)
//        {
//            rev[j]=arr[i];
//            j=j+1;
//        }
		
		for (int i=0; i<n; i++) {
			System.out.print(rev[i] +" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {14, 3, 7, 62, 33, -90, 1};
		int n= 7;
		reverseArray(arr, n);

	}

}
