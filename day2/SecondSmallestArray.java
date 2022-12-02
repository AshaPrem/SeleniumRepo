package week1.day2;

import java.util.Arrays;

public class SecondSmallestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find the Second smallest number in the array {23,45,67,32,89,22 }
		
	
		int num[] = {23, 45, 67, 32, 89, 22};
		Arrays.sort(num);
	
		System.out.println(Arrays.toString(num));
		
	System.out.println("The second smallest value is " +num[1]);
	
} 
	}

