package com.pkg.ag2.arr;

public class SortArray {

	public static void main(String[] args) {
		
		int arr[]= {2, 1,8,4,5};
		
		for (int i=0; i<arr.length; i++) {
			
			for (int j=i+1; j<arr.length; j++) {
				
				int temp=0;
				if (arr[i]>arr[j]) { //ascending order
//				if (arr[i]<arr[j]) { descending order
					temp=arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
			
			System.out.println(arr[i]+" ");
		}

	}

}
