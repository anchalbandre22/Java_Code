package com.app.arrays;




public class TofindlargestElementinArray {
	
	public static void main(String args[]) {
		
		// using iteration 
		
		int arr[] = {10,5,40,15,52};
		int max = arr[0];
		for(int i =0;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Maximum element is "+ max);
		
		int n = arr.length;
		
		System.out.println(" Using Recursion "+ getMax(arr,n));
		
	}

	
	
	// using recursion 
	
	
	public static int getMax(int arr[],int n) {
		
		if(n==1) {
			return arr[0];
		}
		return Math.max(arr[n-1],getMax(arr,n-1) );
		
	}
	
	
	
}
