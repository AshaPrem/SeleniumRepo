package week3.Assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {


		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
		
		
		String text1 = "stops";
		String text2 = "potss"; 
		
		
		    
		   

		    // check if length is same
		    if(text1.length() == text2.length()) {

		      // convert strings to char array
		      char[] charArray1 = text1.toCharArray();
		      char[] charArray2 = text2.toCharArray();

		      // sort the char array
		      Arrays.sort(charArray1);
		      Arrays.sort(charArray2);

		      // if sorted char arrays are same
		      // then the string is anagram
		      boolean result = Arrays.equals(charArray1, charArray2);

		      if(result) {
		        System.out.println(text1 + " and " + text2 + " are anagram.");
		      }
		      else {
		        System.out.println(text1 + " and " + text2 + " are not anagram.");
		      }
		    }
		    
		  }
		}
		
		

