package com.pkg.ag2.arr;

public class NonRepeatingInteger {
	
	static int findNonRepeating(int arr[]) {
		
		int n= arr.length;
		int res=0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) 
			{
				if (i!=j && arr[i]==arr[j]) //repeating integer found
					break;
				
				if (j==n-1) {				//if last index has reached and we haven't found repeating integer
					res=arr[i];	//then we have found non repeating integer
				}
			}	
		}
		return res;
	}

	public static void main(String[] args) {
		int arr[] = { 9, 4, 9, 6, 7, 4 };
		int k= findNonRepeating(arr);
		System.out.println(k);
		
	}

}
