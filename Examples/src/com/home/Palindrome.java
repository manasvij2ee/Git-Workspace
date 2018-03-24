package com.home;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter a Number");
		
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		palindromeFunc(str);

	}

	private static void palindromeFunc(String str) {
		int size = str.length();
		String reverse = "";
		for (int i = size - 1; i >= 0; i--)
			reverse = reverse + str.charAt(i);
		if (str.equals(reverse)) {
			System.out.println("Given number is a palindrome");
		} else {
			System.out.println("Given number is not a palindrome");
		}
	}

}
