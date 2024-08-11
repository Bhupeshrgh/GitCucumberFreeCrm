package com.stepdefinition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
	              Integer[] arrInt = {1,4,0,6,4,0,0,3};
	              
	              List<Integer> m1 = Arrays.asList(arrInt);  
	           //   Arrays.asList(1,4,0,6,4,0,0,3)
	         	 ArrayList<Integer> m = new ArrayList<>(m1);
	         	 
	         	 int count =0;
	         	 
	         	 for(int i=0;i<m.size();i++) {
	         		 if (m.get(i)==0) {
	         			 count++;
	         			 
	         			 m.remove(i);
	         			 i--;
	         		 }		 
	         	 }
	         	 for(int i=0;i<=count;i++) {
	         		 m.add(0);
	         	 }
	         	 System.out.println("After Moving zeros to the right");
	         	 
	         	 for(int i=0;i<m.size();i++) {
	         		 System.out.print(m.get(i)+ " ");
	         	 }      

// Max and Min of array using loop
	         	 
	             int[] values = {5, 3, 10 ,15, 20 ,25};
	             
	         	 int largest = values[0];
	             int smallest = values[0];

	             for(Integer var : values ){
	                 
                     if(var > largest){
                    	 largest = var;
                     }                
                     if(var < largest){
                    	 smallest = var;   
                     }
             }
          System.out.println(largest + " " + smallest );       	 
	          
 //  max of two product of integer in a array          
	          
	          int[] arryInt = {5, 3, 10 ,15, 56, 20 ,25};
	          
	          int largestA = arryInt[0];
	           int largestB = arryInt[0];
	           
	           for (Integer indx : arryInt){
	             // indx = 10
	             if (indx > largestA){
	               
	               largestB = largestA;
	               largestA = indx;
	               
	             }else 
	             if (indx > largestB){
	               
	               largestB = indx;
	             }
	           }

	       System.out.println(largestA + " " + largestB );     
	          
// Frequency of array elements 
	       int[] arre = {1, 2, 8, 3, 2, 2, 2, 5, 1};  
	        //Array fr will store frequencies of element  
	        int [] fr = new int [arre.length];  
	        
	        int visited = -1;  
	        for(int i = 0; i < arre.length; i++){  
	            int count1 = 1;  
	            for(int j = i+1; j < arre.length; j++){  
	                if(arre[i] == arre[j]){  
	                    count1++;  
	                    //To avoid counting same element again  
	                    fr[j] = visited;  
	                }  
	            }  
	            if(fr[i] != visited)  
	                fr[i] = count1;  
	        }  
	  
	        for(int i = 0; i < fr.length; i++){  
	            if(fr[i] != visited)  
	                System.out.println("    " + arre[i] + "    |    " + fr[i]);  
	        }
	          
// Pair with given Sum (Two Sum)
	        int A[] = {6, 8 ,1, 3, 4 };
	        int x = 16;
	        int flag = 0;
	    
	       for (int i = 0; i < A.length - 1; i++) {
	            for (int j = (i + 1); j < A.length; j++) {
	                if (A[i] + A[j] == x) {
	                    System.out.println(i+ " " + j);
	                    flag = 1;
	                }
	            }        }
	            
	      if(flag==0){
	         System.out.println("Not found");
	      } 
	          
// Print odd/even elements
	      Integer[] arryy = {10, 14, 5, 6, 9};  
	      
	      for(int currIndex = 0;
	            currIndex < arryy.length; 
	            currIndex++)
	    {
	         
	        // If currIndex stores even index
	        // or odd position
	        if (currIndex % 2 != 0)
	        {
	            System.out.print(arryy[currIndex] + " ");
	        }
	    }
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	}
}
