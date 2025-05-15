package com.pkg.ag2.arr;

public class MergeArraysLC {

    static void merge(int[] arr1, int m, int[] arr2, int n) {
        int i= m-1;							//If we start merging from the beginning, we might overwrite elements in arr1 before we've processed them.
        int j= n-1;

        while (i>=0 && j>=0){
            if (arr1[i]>arr2[j]){			//We compare arr1[i] and arr2[j] and make sure that the larger element is placed at position i + j + 1 in arr1
                arr1[i+j+1]=arr1[i];
                i--;						//Pointer i is decremented as we started from last index
            }
            else{
                arr1[i+j+1]= arr2[j];
                j--;						//Pointer i is decremented as we started from last index
            }
        }

//        while(j>=0){
//            arr1[j]= arr2[j];  //for edge cases like arr1 =[0] arr2 =[1]
//            j--;
//        }
        
        for (int k=0; k<arr1.length; k++)
		{
			System.out.print(arr1[k]+ " ");
		}
    }
    
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 5, 7, 0, 0, 0, 0};
        int[] arr2 = {2, 4, 6, 8};
        merge(arr1, 4, arr2, 4);
        

	}

}
