package programspractice;

import java.util.*;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetProg {

	public static void main(String[] args) {
		// TreeSet maintained the alphabetic order and LinkedHashSet maintain the insertion order
		
//1. FInd common from two strings		
		 String s1 = "thin sticks";
	     String s2 = "Thick Bricks";
	       	
	       	char[] c1 = s1.toLowerCase().replaceAll(" ", "").toCharArray();
	       	char[] c2 = s2.toLowerCase().replaceAll(" ", "").toCharArray();
	       		
	       		Set<Character> setChar1 = new TreeSet<Character>();
	       		
	       		Set<Character> setChar2 = new TreeSet<Character>();
	       		
	       			for(char i : c1) {
	       				setChar1.add(i);
	       		}	       		
	       			for(char j: c2) {
	       				setChar2.add(j);
	       		}	       		       		
	       	setChar1.retainAll(setChar2);        // TreeSet maintained the alphabetic order and LinkedHashSet maintain the insertion order
	       		
	       		System.out.println(setChar1);	

	}

}
