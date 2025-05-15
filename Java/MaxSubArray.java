//Given an integer array arr, find the subarray (containing at least one number) which has the largest sum
//a subarray is a contiguous set of elements within an array
package com.pkg.ag2.arr;

public class MaxSubArray {

	static int maxSubArraySum(int[] arr) {
		int currSum=0;
		int maxSum= Integer.MIN_VALUE;
		
		for (int i=0; i<arr.length; i++) {
			currSum= currSum +arr[i];
			
			if (currSum>maxSum) {
				maxSum=currSum;						//once we reach a high sum, we assign the currsum that value
			}
			
			if (currSum <0) {
				currSum=0;							//adding to a negative sum is meaningless as it keeps reducing value of sum. hence we reset it to 0
			}
		}
		
		return maxSum;
	}
	
	public static void main(String[] args) {
		int[] arr= {2, 3, -8, 7, -1, 2, 3};
		System.out.println(maxSubArraySum(arr));

	}

}
