package com.pkg.ag2.arr;

public class RightRotateK {

	static void rotateArr(int[] arr, int d) {
		
		int n =arr.length;
		d=d%n;
		
		int[] res= new int[n];
		
		for (int i=0; i<d; i++) {
			res[i]= arr[n-d+i];
		}
		
		for (int i=0; i<n-d; i++) {
			res[d+i]= arr[i];
		}
		
        for (int i = 0; i < n; i++) {         //to make input array the result array
            arr[i] = res[i];
        }
        
        for (int k = 0; k < arr.length; k++)
            System.out.print(arr[k] + " ");			//print result array
		
		
	}
	
	
	public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6,7};
        int d = 2;

        rotateArr(arr, d);	

	}



}
