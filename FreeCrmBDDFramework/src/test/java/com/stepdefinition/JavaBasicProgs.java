package com.stepdefinition;

import java.util.Scanner;

public class JavaBasicProgs {
	
	public static void swapNum(int x, int y) {
	
		int temp;
		
		temp= x;
		x = y;
		y = temp;
		
		System.out.println (x + " " +y );
		
	}	
	
	
	public static void main(String[] args) {
//1. 	
//		int num ;
//		String st;
//		
//		System.out.println("Enter the integer: "  );
//		
//		Scanner s = new Scanner(System.in);
//		//num = s.nextInt();
//		
//		st = s.next();
//		
//		//System.out.println(num);
//		System.out.println(st);
//2.
		int m = 10, n= 15;
		swapNum(m, n);
		
//3.
		
		int a = 18, b = 45, c = 15 ;
		
		if (a>b) {
			
			if(a>c) {
				
				System.out.println("Greatest is A " + a);
			}else {
				System.out.println("Greatest is C " + c);
			}
			
		}else {
			
			if (b>c) {
				System.out.println("Greatest is B " + b);
			}else {
				System.out.println("Greatest is C " + c);
			}
		}
		
//4. Prime or not
		
		int N = 3;
		
		if (N == 0 || N == 1) {
			System.out.println("Neither prime nor composite");
		}
		
		int flag = 0;
		
		for (int i=2;i<=N/2;i++) {
			
			if (N%i == 0) {
				System.out.println("Not a prime number");
				flag = 1;
				break;
				
			}
			
		}
		
		if (flag == 0) {
			
			System.out.println("prime number");
		}
		
//5. All prime numbers 
		 int x, y , flag1;
		 int numberP = 8;
		    
		    for(x=0;x<=numberP;x++){
		      
		      if (x==0 ||x==1) 
		      continue;
		      
		      flag1 =1;
		      
		      for(y=2;y<=x/2;y++){
		        
		        if(x%y==0){
		          flag1 = 0;
		          break;
		        }
		       
		      }
		      
		       if(flag1==1){
		          System.out.print(x+" ");      
		          }     
		    }
// Non-static variable xx cannot be referenced from a static context
		  
//		       private int xx = 10;
//		       static int m1() {
//		           int y = xx;
//		           return y;
//		       }
//		       public static void main(String[] args) {
//		         m1();
//		       }

// Non-static variable xx can be referenced from a static context by creating object of that class		    
//		    public class Myclass 
//		    {
//		       private int x = 10;
//		       static int m1()
//		       {
//		          Myclass obj = new Myclass();
//		          int y = obj.x;
//		          return y;
//		       }
//		       public static void main(String[] args) {
//		          System.out.println(m1());
//		       }
//		    }

	
		
	}
}
