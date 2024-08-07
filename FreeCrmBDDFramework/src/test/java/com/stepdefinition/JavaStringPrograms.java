package com.stepdefinition;

public class JavaStringPrograms {

	public static void main(String[] args) {
		
// Check whether one string is rotation of another string
		 String s1 = "JavaJ2eeStrutsHibernate";
	        String s2 = "StrutsHibernateJavaJ2ee";
	 
	        //Step 1	 
	        if(s1.length() != s2.length())
	        {
	            System.out.println("s2 is not rotated version of s1");
	        }
	        else
	        {
	            //Step 2	 
	            String s3 = s1 + s1;
	 
	            //Step 3	 
	            if(s3.contains(s2))
	            {
	                System.out.println("s2 is a rotated version of s1");
	            }
	            else
	            {
	                System.out.println("s2 is not rotated version of s1");
	            }
	        }

// Reverse Each Word Of A String and then reverse the full string
 String inputString = "Java Concept Of The Day";
	        
	        String[] words = inputString.split(" ");
	         
	        String reverseString = "";
	         
	        for (int i = 0; i < words.length; i++) 
	        {
	            String word = words[i];
	             
	            String reverseWord = "";
	             
	            for (int j = word.length()-1; j >= 0; j--) 
	            {
	                reverseWord = reverseWord + word.charAt(j);
	            }	             
	            reverseString = reverseString + reverseWord + " ";
	        }	         
	        System.out.println(reverseString);
	        
	       String[] arrSt = reverseString.split(" ");
	       
	       String reversalFinal = "";
	       
	       for (int j = arrSt.length-1; j >= 0; j--) {
	         reversalFinal = reversalFinal + arrSt[j] + " ";
	         
	       }       
	        System.out.println(reversalFinal);
	        
	        
	        
	        
	        
	}
}
