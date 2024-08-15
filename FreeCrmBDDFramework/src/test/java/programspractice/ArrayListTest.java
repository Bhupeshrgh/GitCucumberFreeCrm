package programspractice;

import java.util.*;

public class ArrayListTest {
	
	 public static void main(String args[]){  
	  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
	  
	  ArrayList<Integer> intList = new ArrayList<Integer>();
	  
	  intList.add(12);
	  System.out.println("Getting 0nd index value: " + intList.get(0));
	  
	  list.add("Mango");//Adding object in arraylist    
	  list.add("Apple");   
	  list.add("Banana");    
	  
	  list.add("Grapes");   
	  list.add("Apple");
	  list.add("Guava");
	  
	  //Traversing list through Iterator  
	  
	  list.get(2);
	  
	  System.out.println("Getting 2nd index value: " + list.get(2));
	  
	  list.set(5, "Orange");
	  //list.set(0, null);
	  
	  Collections.sort(list);
	  

//	Iterator itr = list.iterator();
//	while(itr.hasNext()){
//		System.out.println(itr.next());
//	  }  
	
	  //Another way to iterate..
	  for(String fruits:list) {
		  System.out.println(fruits);
	  }
	
	  
	//lambda expression used in traversing forEach() method
	//The forEach() method is a new feature, introduced in Java 8.  
	
	 list.forEach(a->{
		 System.out.println(a);
		 });
	 
//2. Move Zeroes to the End of an Array
	 
	Integer[] arrInt = {1,4,0,6,4,0,0,3};
     
     List<Integer> lst = Arrays.asList(arrInt);  
	
	// ArrayList<Integer> m = new ArrayList<>(Arrays.asList(1,4,0,6,4,0,0,3));
	 ArrayList<Integer> m = new ArrayList<>(lst);
	 
	 System.out.print(m);
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

		 System.out.print(m);
	
	 
//3.  Convert string[] into collections
	 
	 String[] strArr = {"Pen","book","copy"};

	 List<String> coll = Arrays.asList(strArr);
	 
	 for(String lstt:coll){
	 System.out.println(lstt);
	 }  

	 
//4. Convert Integer array to collections
	 
	 Integer[] intArray = {1, 2, 3, 4, 5};  
     
     List<Integer> integerList = Arrays.asList(intArray);  

     for (Integer numb : integerList) {  
         System.out.println(numb);  
     }  

//
     ArrayList<String> arrList = new ArrayList<>();
     
		// Adding elements to the array list ONLY STRING TYPES
		arrList.add("987654321");
		arrList.add("ASTM");
		arrList.add("CSTM");
		arrList.add("99.99");
		//arrList.add(null);
		
		arrList.add(3, "99.88");
		
			arrList.set(1, "99");
			
			if (arrList.contains("CSTM")) {
				
			    System.out.println("Found the element");
			    }

    System.out.println(arrList);
    
 arrList.remove(1);
 
   Collections.sort(arrList);
   
    System.out.println(arrList);
     
// copy arrayList
    
    List<String> List1 = new ArrayList<String>();
    List1.add("1");
    List1.add("2");
    List1.add("3");
    List1.add("4");
    //System.out.println("List1: " + List1);
    List<String> List2 = new ArrayList<String>();
    List2.add("A");
    List2.add("B");
    List2.add("C");
    List2.add("D");
   // System.out.println("List2: " + List2);
//Adding two ArrayList
   // List1.addAll(List2);
   // System.out.println("List3: " + List1);
    
    // Copy List2 to List1
   // Collections.copy(List2, List1);
    
    System.out.println("Copy List to List2,\nAfter copy:");
    System.out.println("List1: " + List1);
    System.out.println("List2: " + List2);

    Collections.shuffle(List2);
    System.out.println("List after shuffling:\n" + List2); 
    
    Collections.reverse(List2);
    System.out.println("List after reversing :\n" + List2);
    
// Compare two array lists -- Ternary operator 
       
    ArrayList<String> c3 = new ArrayList<String>();
    for (String e : List1)
       c3.add(List2.contains(e) ? "Yes" : "No");
    System.out.println(c3);
    
//Swapping 1st(index 0) element with the 3rd(index 2) element
    Collections.swap(List1, 0, 2);    
    System.out.println(List1);
    
// Let join above two list
    ArrayList<String> a = new ArrayList<String>();
    a.addAll(List1);
    a.addAll(List2);
  
    System.out.println("New array: " + a);    
// Empty an array
//    List1.removeAll(List1);
//    System.out.println("Array list after remove all elements "+List1);
// Clone an array    
//    ArrayList<String> newc1 = (ArrayList<String>)List2.clone();
//    System.out.println("Cloned array list: " + newc1);          
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	 }  
	}  



