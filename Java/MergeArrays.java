//You have to merge nums1 and nums2 into a single sorted array
//but you must store the final result inside nums1.
//Even though nums1 is of size m + n, only the first m values are meaningful at the start.
//The remaining n values at the end are just placeholders (0s) — these are just empty slots for you to use during the merge.
package com.pkg.ag2.arr;

import java.util.Arrays;

public class MergeArrays {
	
	static int[] mergeGivenArray(int arr1[], int arr2[]) {
		
		int left= arr1.length -1;
		int right=0;
		int n= arr1.length;
		int m=arr2.length;
		
		while (left>=0 && right<m) {
			if (arr1[left]>arr2[right]) {
				int temp= arr1[left];
				arr1[left]=arr2[right];
				arr2[right]=temp;
				left--;
				right++;
			}
			
			else {
				break;
			}
		}
		
		Arrays.sort(arr1);
        Arrays.sort(arr2);
        
		return arr1;
	}
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] res= mergeGivenArray(arr1, arr2);
        
		for (int k=0; k<res.length; k++)
		{
			System.out.print(res[k]+ " ");
		}
	}

}
