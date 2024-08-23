package com.app.string;

public class CountOfNumberOfVowels {

	public static void main(String[] args) {
		String s = "anchal";
		int count = 0;
		// convert to char array 
		
		
		for(int i=0 ; i<s.length();i++){
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| 
					s.charAt(i)=='o'|| s.charAt(i)=='u') {
				    count++;
				
		}
	}
		
		System.out.println("VowelCount:"+count);

	}

}
