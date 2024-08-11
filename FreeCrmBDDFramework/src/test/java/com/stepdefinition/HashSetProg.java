package com.stepdefinition;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetProg {
	
	public static void main(String[] args) {
		
// sum of all unique values of 2 arrays 
		
		int[] list1 = {2, 4, 6, 8};
		int[] list2 = {4, 8, 10, 10, 20};
		
		HashSet<Integer> set = new HashSet<Integer>();
		int sum = 0;
		
			for(int i : list1) {
			set.add(i);
		}
		
			for(int j: list2) {
			set.add(j);
		}
		
		for(int k: set) {
			sum += k;
		}
		
		System.out.println(sum);
		
//Remove Duplicate characters from string
		
		 String st = "javaTpoint is the best learning website";
		 
			char[] stt =  st.toLowerCase().toCharArray();
	        
	      //  HashSet<Character> set1 = new HashSet<Character>();        // Insertion order is not maintained
	         LinkedHashSet<Character> set1 = new LinkedHashSet<>(); 	//Insertion order is maintained
	         for(int i=0;i<stt.length;i++){
		            set1.add(stt[i]);
		        }	        
	         System.out.println(set1); 
	         
	// OR print alternate way by loop
	         for(Character c: set1){
	            System.out.print(c);
	        }
//Remove duplicate string from string array
	        
	        String[] name = {"aim","rajesh","raju","aim"};
	        
	        for (int i = 0; i < name.length; i++) {
	        	name[i] = name[i].toLowerCase();
            }   

	        HashSet<String> myset  = new HashSet<String>();
	        
	           Collections.addAll(myset,name);

	           System.out.println(myset);
// all unique char of 2 string
	           
	           String s1 = "thin sticks";
	       		String s2 = "Thick Bricks";
	       	
	       	char[] c1 = s1.toLowerCase().toCharArray();
	       	char[] c2 = s2.toLowerCase().toCharArray();
	       		
	       		HashSet<Character> setChar = new HashSet<Character>();
	       		
	       			for(char i : c1) {
	       				setChar.add(i);
	       		}
	       		
	       			for(char j: c2) {
	       				setChar.add(j);
	       		}
	       		
	       		for(char k: setChar) {
	       			System.out.print(k);	
	       		}	       		
	       		
//6. Pangram
		         String strr = "The quick brown fox jumps over the lazy dog";
		         
		         char[] chr = strr.toLowerCase().toCharArray();
		         
		         HashSet<Character> sett = new HashSet<>();
		         
		         for (char ch : chr){
		         
		         if (ch >= 'a' && ch <= 'z'){
		            sett.add(ch);
		         }
		         }
		        if(sett.size() == 26){
		          System.out.println("Panagram");
		        }else {
		          System.out.println("Not Panagram");
		        }	     		
// Convert HashSet into Array	       
		        Character[] new_array = new Character[sett.size()];
		        sett.toArray(new_array);
		        
		        for(int i=0;i<new_array.length;i++) {                
		            System.out.print("  " + new_array[i]);		                           
		          }  
		       
	}
}
