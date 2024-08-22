package com.app.arrays;

import java.util.Arrays;

public class ToFindAscendingAndDescendingSortArray {
      
	public static void main(String[] args){
		int arr[]= {10,12,15,20,8,5};
		Arrays.sort(arr);
		int n = arr.length;
		for(int i=0 ; i<n/2 ; i++) {
		 System.out.println(arr[i]+" ");
			
		}
		for(int j=n-1 ; j>=n/2 ; j--){
		System.out.println(arr[j]+" ");
		}
		

	}

}
