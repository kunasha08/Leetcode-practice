//
package com.pkg.ag2.arr;

public class LeftRotateK {

	static void rotateArr(int[] arr, int d) {
		int n =arr.length;
		d=d%n;
		
		int[] res= new int[n];
		
		for (int i=0; i<n-d; i++) {  //move last n-d elements into front of temp arr
			res[i]= arr[d+i];			//arr[d + i] means we start at index d and move forward.
		}
		
		for (int i=0; i<d; i++) {		//move first d elements into back of temp
			res[n-d+i]=arr[i];			//res[n-d + i] means we store at index after d and move forward
		}
		
        for (int k = 0; k < res.length; k++)
            System.out.print(res[k] + " ");
    }
		
		
	
	public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 4;

        rotateArr(arr, d);
        


	}	

}
