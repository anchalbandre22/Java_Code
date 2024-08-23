package com.app.string;

public class CheckVowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char c = 'g';
    	c= Character.toLowerCase(c);
    	    
    	 
    	 if(c=='a'|| c=='e'|| c=='i'||c=='o'||c=='u') {
    		 System.out.println(c+" is a vowel");
    	 }
    	 else {
    		 System.out.println(c+" is a consonant");
    	 }

	}

}
