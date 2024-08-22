package com.app.arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};
		int n = arr.length;
		Set set= new HashSet<>();
		 for(int i =0 ; i<arr.length;i++) {
			 set.add(arr[i]);
		 }

		 System.out.println(set);
	}

}
