package com.stepdefinition;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
// keySet() get() values() entrySet() put() contains() containsKey() methods
		
  	HashMap <Integer,String> map = new HashMap<Integer,String>();
		   
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");   
		   
	map.put(1,"Grapes"); //trying duplicate key  
		   
			System.out.println(map);
	
		   for(Map.Entry<Integer, String> m : map.entrySet()){
			   
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		   
		   
// get() & values() Method for getting the values with respective to keys		
		   
		   HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
		   
	        // Mapping string values to int keys 
		   
	        hash_map.put(10, "Geeks"); 
	        hash_map.put(15, "4"); 
	        hash_map.put(20, "Geeks"); 
	        hash_map.put(25, "Welcomes"); 
	        hash_map.put(30, "You"); 
	  
	        // Displaying the HashMap 
	        System.out.println("Initial Mappings are: " + hash_map); 
	  
	        // Getting the value of 25 
	        System.out.println("The Value is: " + hash_map.get(25)); 
	  
	        // Getting the value of 10 
	        System.out.println("The Value is: " + hash_map.get(10)); 
	        System.out.println("The collection is: " + hash_map.values());
	
	        HashMap<String, Integer> hash_map1 = new HashMap<String, Integer>();
	        hash_map1.put("Geeks", 10); 
	        hash_map1.put("Welcomes", 5); 
	        hash_map1.put("You", 4);
	        hash_map1.put("well", 2);
	        
	        System.out.println(hash_map1.get("Welcomes"));
	        System.out.println(hash_map1.get("geeks"));   //gives null value
	        
	        System.out.println("The collection is: " + hash_map1.values()); 
	        
// Find the character each occurrence in string
	        
	        String s = "This is to check occurance";
	        
	        s = s.replaceAll(" ", "").toLowerCase();
	               
	  //      char[] c = s.toCharArray(); We can also convert string  into char array
	        
	       HashMap<Character, Integer> hMap = new HashMap<>();
	       
	       for(int i=0;i<s.length();i++){
	         
	         if ( hMap.containsKey(s.charAt(i)) ){
	           int count = hMap.get(s.charAt(i));
	           
	           hMap.put(s.charAt(i), ++count);
	           
	         }else{
	        	 hMap.put(s.charAt(i), 1);
	         }
	           }
	           System.out.println(hMap);
	           
// Find Maximum Occurring Character In String

	         		String str = "LOOP Fool pull";
	         		  
	         		  char[] c = str.replaceAll(" ", "").toLowerCase().toCharArray();
	         		  
	         		  HashMap<Character, Integer> hm = new HashMap<>();
	         		  
	         		  for (int i=0;i<c.length;i++){
	         		    
	         		    if(hm.containsKey(c[i]) ){
	         		      
	         		      hm.put(c[i], hm.get(c[i])+1);
	         		  }else {
	         		    hm.put(c[i], 1);
	         		  }
	         		  }
	         				System.out.println(hm);
	         			
	         			char maxKey = 0;
	         			int maxValue = 0;
	         			
	         	for(Map.Entry<Character, Integer> entry : hm.entrySet()) {		
	         			
	         	if(entry.getValue() > maxValue ){
	         			  
	         		maxValue = entry.getValue();
	         			  
	         		maxKey = entry.getKey();	         			  
	         			}
	         	}
	         		 System.out.println(maxValue + " " +maxKey );         	
	         		 
// FInd each char occurrence and duplicate occurrence
	         		 
	         		String s1 = "India is my country";
	         	   
	         		  char[] sst = s1.toLowerCase().replaceAll(" ", "").toCharArray();
	         		   
	         		   HashMap<Character, Integer> ham = new HashMap<>();
	         		   
	         		   for (int i=0; i<sst.length;i++){
	         		     if (ham.containsKey(sst[i])){
	         		       
	         		       ham.put(sst[i], ham.get(sst[i]) + 1);
	         		     } else{
	         		       ham.put(sst[i], 1);
	         		     }
	         		   }
	         			         System.out.println(ham);
	         			       
	         	for(Map.Entry<Character, Integer> entry : ham.entrySet())
	     	         			
	         			if ( entry.getValue() > 1) {
	  	         			     
	         					System.out.println(entry.getKey() + " " + entry.getValue());	  	         			     
	  	         			   }
// 	Word occurrence in a string       	
	     String strCapgemini =  "Java is java again java";
	             
	             String[] arr = strCapgemini.toLowerCase().split(" ");
	             
	             HashMap<String, Integer> hmCap = new HashMap<>();
	             
	            for(String ss : arr){                  // For each loop can be used for non primitive data types
	               
	               if(hmCap.containsKey(ss)){
	                 
	            	   hmCap.put(ss, hmCap.get(ss)+1);
	                 
	               }else{
	            	   hmCap.put(ss, 1);
	               }	               
	             }
	             System.out.println(hmCap);
	             
//   {Fruit : Mango, Orange, Apple}, {Vegetable : Carrot, Radish, Onion}, {Flower : Rose, Jasmine, Orchid}
	        
	}

}
