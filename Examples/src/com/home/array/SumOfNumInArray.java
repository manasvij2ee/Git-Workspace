package com.home.array;

public class SumOfNumInArray {
	

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };
		int sum = 0;
		System.out.println("Sum of numbers in array using forloop");
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println(sum);
		
		System.out.println("Sum of numbers in array using whileloop");
		int i=0;
		int sum1 = 0;
		while(i <array.length) {
			sum1 = sum1 + array[i];
			i++;			
		}
		System.out.println(sum1);
		
		System.out.println("Sum of numbers in array using Recursion");
		
		
		
		
	}

}
