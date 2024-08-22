package com.app.arrays;

public class NonRepeatingElement {

	public static void main(String[] args) {
	
		int arr[] = {10, 20, 30, 40, 40, 40, 50, 50};
		
		findNonRepeatingElements(arr);

	}

	static void findNonRepeatingElements(int[] arr) {
		int count =0;
        System.out.print("Non-repeating elements: ");

        for (int i = 0; i < arr.length; i++) {
        	
            boolean isRepeating = false;
            

            // Check if the current element repeats in the array
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeating = true;
                    break;
                }
            }

            // If the element is not repeating, print it
            if (!isRepeating) {
                System.out.print(arr[i] + " ");
                count++;
             }
		}
		
       System.out.println(count); 
	}

}
