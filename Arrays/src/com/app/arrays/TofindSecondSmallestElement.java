package com.app.arrays;

public class TofindSecondSmallestElement {

	public static void main(String[] args) {
		
		// to find smallest element 
		
		int arr[] ={10,20,5,14,18};
		
		int smallest = arr[0];
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
			
		}
		
		
		
		// to find secondSmallest 
		
		int sec_small = Integer.MAX_VALUE;
		
		for( int i = 0; i<arr.length;i++ ) {
			if(arr[i]!= smallest && arr[i]< sec_small) {
				sec_small= arr[i];
			}
		}

		
		System.out.println("Second_Smallest"+sec_small);
	}

}
