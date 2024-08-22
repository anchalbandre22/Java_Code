package com.app.arrays;

public class TofindSmallestElementInArray {
	
	public static void main(String args[]) {
		
	int arr[] = {10,5,40,15,52};
	int min = arr[0];
	for(int i =0;i<arr.length;i++){
		if(min >  arr[i]) {
			min= arr[i];
		}
	}
	
	System.out.println("Minimum element is "+ min);
	int n = arr.length;
	System.out.println("Using recursion "+getMin(arr,n));
	}	
	
	
	// uing recursion 
	
	
	public static int getMin(int arr[], int n) {
		
		if(n==1) {
			return arr[0];
		}
		return Math.min(arr[n-1],getMin(arr,n-1) );
		
	}
	

}
