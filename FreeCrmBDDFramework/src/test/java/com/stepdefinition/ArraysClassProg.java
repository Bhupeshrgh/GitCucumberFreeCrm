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
//4.   Moving zeros to the right from an array       	          
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
// Alternate way to move zeros in array
	         	 int[] ar = {1,4,0,6,4,0,0,3,8};
	             int[] arr1 = new int[ar.length];
	             
	            int j = 0;
	           // int count = 0;
	             
	            for (int i=0;i<ar.length;i++){
	               
	              if (ar[i] == 0){
	                //count ++;
	              }else {
	                arr1[j] = ar[i];
	                j++; 
	              }
	            }
	             for(int i : arr1){
	      	  System.out.println(i);
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
	            for (int j = i + 1; j < A.length; j++) {
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
	      
	      for(int i = 0;i < arryy.length;i++)
	    {	         
	        if (i % 2 != 0) 
	        {
	            System.out.print(arryy[i] + " ");
	        }
	    }
// Print alternate elements from two arrays into third array
	   int arr1[] = { 1, 3, -1, 7, 4, 5, 6, 7};
	        int n1 = arr1.length;
	 
	        int arr2[] = { 0, -2, 2, 4, 6, 8 };
	        int n2 = arr2.length;
	 
	        int arr3[] = new int[n1 + n2];
	        
	        int i=0, k=0, j=0;
	    
	    for(int l=0;l<n1+n2;l++){
	      
	    if (i<arr1.length){
	      arr3[k] = arr1[i];
	      i++;
	      k++;
	    }
	      if (j<arr2.length){
	         arr3[k] = arr2[j];
	         k++;
	         j++;
	      }	      
	    } 
	     for (int f = 0; f < n1 + n2; f++)
	            System.out.print(arr3[f] + " ");
	          
// Sum of pair of three     
	     int AA[] = { 1, 4, 45, 6, 10, 8 };
	        int sum = 22;
	        int arr_size = A.length;
	        
	        
	       int l, r;
	 
	        // Fix the first element as A[i]
	        for (int i = 0; i < arr_size - 2; i++) {
	 
	            // Fix the second element as A[j]
	            for (int j = i + 1; j < arr_size - 1; j++) {
	 
	                // Now look for the third number
	                for (int k = j + 1; k < arr_size; k++) {
	                    if (AA[i] + AA[j] + AA[k] == sum) {
	                        System.out.print("Triplet is " + AA[i] + ", " + AA[j] + ", " + AA[k]);
	                        
	                    }
	                }
	            }
	    
	        }
	          
// Split an array into two arrays with alternate elements
	        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	        int[] firstArray = new int[originalArray.length / 2 + originalArray.length % 2];
	        int[] secondArray = new int[originalArray.length / 2];

	        for (int i = 0, j = 0, k = 0; i < originalArray.length; i++) {
	            if (i % 2 == 0) {
	                firstArray[j++] = originalArray[i];
	            } else {
	                secondArray[k++] = originalArray[i];
	            }
	        }

	        System.out.println("First array: " + Arrays.toString(firstArray));
	        System.out.println("Second array: " + Arrays.toString(secondArray));
	          
//	    Convert Integer [] to string      
	        Integer[] arrIntg = {1,4,0,6,4,0,0,3};  // OR int
	       	
	       	String s1 = Arrays.toString(arrIntg);
	       	
	       	System.out.println(s1);       
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	}
}
