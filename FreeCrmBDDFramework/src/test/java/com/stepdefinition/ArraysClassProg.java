package com.stepdefinition;

import java.util.Arrays;

public class ArraysClassProg {
	
	 static int search(int arr1[], int num){
		    
		    for(int i =0;i<arr1.length;i++){
		      
		      if(arr1[i]== num){
		        return i;
		      }
		     
		    }
		     return -1;
		  }
	

	public static void main(String[] args) {

//1. Find index of a array value
	    
	    int[] ar = {1, 0 ,3, 5, 6, 8};
	    int nom = 6;
	    int index = search(ar, nom );
	    
	    if(index == -1){
	      System.out.println("Num not exist");
	    }else{
	      System.out.println("Index at: " + index );
	    }
		
//2. Sort subArray
		 int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

	        Arrays.sort(arr, 1, 5);
	        
	      //  System.out.println("Modified arr[] : "+ Arrays.toString(arr));
	        
	          for(int i=0;i<arr.length;i++) {                
	            System.out.print("  " + arr[i]);
	                           
	          }   
	          
	          System.out.println("  ");
//3.
	          int[] a = {13, 7, 6, 45, 21, 9, 2, 100 };

	          int temp;
	          
	              for(int i=0;i<a.length;i++) { 
	                
	                for(int j=i+1;j<a.length;j++){
	                  
	                   if(a[i]<a[j]){
	                     
	                     temp = a[i];
	                     
	                     a[i] = a[j];
	                     a[j]= temp;
	                }
	                
	                }
	                
	                System.out.print("  " + a[i]);
	              }
	                               	                        
//4. 	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	}
}
