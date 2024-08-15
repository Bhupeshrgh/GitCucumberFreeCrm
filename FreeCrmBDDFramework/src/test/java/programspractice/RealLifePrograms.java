package programspractice;

import java.util.HashMap;

public class RealLifePrograms {

	public static void main(String[] args) {

//1. Metro travel program with one line of track
				
		 char[] codes = {'A', 'B', 'C', 'D', 'E'};
		  char startCode = 'A';
		  char destCode = 'D';

		  HashMap<Character, Integer> metroCodes = new HashMap<>();
		  int i =1;
		  
		  for(Character c: codes){
		    metroCodes.put(c, i++);
		  }
		   System.out.println(metroCodes); //{A=1, B=2, C=3, D=4, E=5}		  

		        if (metroCodes.containsKey(startCode) && metroCodes.containsKey(destCode)) {
		            int startValue = metroCodes.get(startCode); // 1
		            int destValue = metroCodes.get(destCode); // 4
		            
		            int minCardsNeeded = Math.abs(startValue - destValue);  // Gives positive value
		            System.out.println("Minimum metro cards needed: " + minCardsNeeded);
		        } else {
		            System.out.println("Invalid metro code. Please try again.");
		        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
