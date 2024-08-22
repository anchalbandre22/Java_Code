package com.app.arrays;

public class ToSortArray {

	public static void main(String[] args) {
		
		int arr[]= {10,12,15,20,8,5};
		
		int temp ;
		
		for(int i=0;i<arr.length;i++) {
			for(int j= i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

	}

}
